package com.dataprovider;

import java.util.List;

import com.dataprovider.handlers.SharedResource;
import com.dataprovider.inf.City;
import com.dataprovider.inf.Country;
import com.dataprovider.inf.DataProvider;
import com.dataprovider.inf.State;

public class DataProviderImpl implements DataProvider,Country,State, City {

	
	private String countryCode = "";
	
	private String countryName = "";
	
	private String stateName = "";
	
	private String stateCode = "";
	
	private SharedResource shared;
	
	public DataProviderImpl(SharedResource shared) {
		this.shared = shared;
	}

	public SharedResource getShared(){
		return shared;
	}
	
	@Override
	public List<String> getCities() {
		
		return null;
	}

	@Override
	public List<String> getCityCodes() {
		
		return null;
	}

	@Override
	public String getCityName(String shortCode) {
		
		return null;
	}

	@Override
	public String getShortCode(String fullName) {
		
		return null;
	}

	@Override
	public String getStateFullName() {
		
		return null;
	}

	@Override
	public String getStateShortCode() {
		
		return null;
	}

	@Override
	public City getCity(String name) {
		
		return null;
	}

	@Override
	public String getFullName() {
		
		return null;
	}

	@Override
	public String getShortCode() {
		
		return null;
	}

	@Override
	public String getPhoneCode() {
		
		return null;
	}

	@Override
	public List<String> getStates() {
		
		return null;
	}

	@Override
	public List<String> getStateShortCodes() {
		
		return null;
	}

	@Override
	public State getState(String name) {
		
		return null;
	}

	@Override
	public List<String> getCountries() {
		
		return null;
	}

	@Override
	public List<String> getCountryCodes() {
		
		return null;
	}

	@Override
	public Country getCountry(String shortCode) {
		
		return null;
	}
	
	public void clear(){
		countryCode = "";
		countryName = "";
		stateCode = "";
		stateName = "";
	}
	
	public String toString(){
		return countryName + " " + countryCode + ""
				+ " " + stateName + " "
						+ "" + stateCode;
	}
	

}
