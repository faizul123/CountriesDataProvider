package com.dataprovider.inf;

import java.util.List;

public interface Country {

	public String getFullName();
	
	public String getShortCode();
	
	public String getPhoneCode();
	
	public List<String> getStates();

	public List<String> getStateShortCodes();
	
	public State getState(String name);
	
}
