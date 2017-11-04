package com.dataprovider.handlers;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import com.dataprovider.DataProviderConfig;

public class SharedResource {

	private ResourceLoader loader;
	
	private DataProviderConfig config;
	
	Map<String,String> countries;
	
	Map<String,String> phoneCodes;
	
	Map<String,Set<String>> states;
	
	public SharedResource(ResourceLoader loader,DataProviderConfig config){
		this.loader = loader;
		this.config = config;
		try {
			System.out.println(this.loader.getFileData());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResourceLoader getResourceLoader(){
		return loader;
	}
	
	public DataProviderConfig getConfig(){
		return config;
	}
	
	public Collection<String> getCountries(){
		return Collections.unmodifiableCollection(countries.values());
	}
	
	public Collection<String> getStates(String countryCode){
		Set<String> states = this.states.get(countryCode);
		return Collections.unmodifiableCollection(states);
	}
	
	public Collection<String> getCountryPhoneCodes(){
		return Collections.unmodifiableCollection(phoneCodes.values());
	}
	
}
