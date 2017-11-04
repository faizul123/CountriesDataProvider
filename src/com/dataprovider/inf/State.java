package com.dataprovider.inf;

import java.util.List;

public interface State {

	public String getStateFullName();
	
	public String getStateShortCode();
	
	public List<String> getStates();
	
	public City getCity(String name);
	
}
