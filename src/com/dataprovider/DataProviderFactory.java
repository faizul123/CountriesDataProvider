package com.dataprovider;

import com.dataprovider.handlers.ResourceLoader;
import com.dataprovider.handlers.SharedResource;
import com.dataprovider.inf.DataProvider;

public class DataProviderFactory {

	private SharedResource shared;
	
	private DataProviderConfig config;
	
	private DataProvider provider;
	
	public DataProviderFactory() {
			initialize();
	}
	
	public DataProviderFactory(DataProviderConfig config){
		initialize(config);
	}
	
	public DataProvider getProvider(){
		if(config.isEnableSingleton()){
			return getSingleton();
		}
		else {
			return new DataProviderImpl(shared);
		}
	}
	
	private synchronized void initialize(){
		config = new DataProviderConfig();	
		createSharedResource();
	}
	
	private void createSharedResource(){
		if(shared == null){
			ResourceLoader loader = new ResourceLoader(config.getResourcePath());
			shared = new SharedResource(loader, config);
		}
	}
	
	private synchronized void initialize(DataProviderConfig providerConfig){
		this.config = providerConfig;
		createSharedResource();
	}
	
	private synchronized DataProvider getSingleton() {		
		if(provider == null){
			provider = new DataProviderImpl(shared);
			
		}		
		return provider;
	}

	public static boolean isInitialized(){
		return false;
	}
	
	
}
