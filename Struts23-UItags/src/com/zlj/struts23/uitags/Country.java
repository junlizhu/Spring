package com.zlj.struts23.uitags;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Country {
	private int countryId;

	private String countryName;

	public Country(int countryId, String countryName) {
		this.countryId = countryId;
		this.countryName = countryName;
	}

}
