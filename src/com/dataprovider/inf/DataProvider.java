package com.dataprovider.inf;

import java.util.List;

public interface DataProvider {

	/**
	 * 
	 * @return
	 */
	public List<String> getCountries();
	
	public List<String> getCountryCodes();
	
	public Country getCountry(String shortCode);
	
	public void clear();
	
}
