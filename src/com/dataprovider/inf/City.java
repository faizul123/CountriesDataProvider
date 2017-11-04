package com.dataprovider.inf;

import java.util.List;

public interface City {

	public List<String> getCities();
	
	public List<String> getCityCodes();
	
	public String getCityName(String shortCode);
	
	public String getShortCode(String fullName);
	
	
}
