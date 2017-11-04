package com.dataprovider;

public class DataProviderConfig {

	
	private boolean lazyLoad = true;
	
	private boolean useMinimulMemory = true;
	
	private boolean enableSingleton = false;
	
	private String resourcePath = "resource/countries.json";

	public boolean isLazyLoad() {
		return lazyLoad;
	}

	public void setLazyLoad(boolean lazyLoad) {
		this.lazyLoad = lazyLoad;
	}

	public boolean isUseMinimulMemory() {
		return useMinimulMemory;
	}

	public void setUseMinimulMemory(boolean useMinimulMemory) {
		this.useMinimulMemory = useMinimulMemory;
	}

	public boolean isEnableSingleton() {
		return enableSingleton;
	}

	public void setEnableSingleton(boolean enableSingleton) {
		this.enableSingleton = enableSingleton;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}
	
	
	
}
