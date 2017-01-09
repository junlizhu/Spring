package service.impl;

import dao.UserDao;
import entity.User;
import lombok.Setter;
import service.UserService;

public class UserServiceImpl implements UserService {
	@Setter
	private UserDao dao;

	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
