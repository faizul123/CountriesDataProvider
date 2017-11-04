package com.dataprovider.handlers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourceLoader {

	private String path;
	
	public ResourceLoader(String path) {
		this.path = path;
	}
	
	public String getFileData() throws IOException{
		File file = new File(""+path);
		System.out.println(file.toPath());
		if(!file.exists()){
			System.out.println("file doesn't exist");
		}else if(!file.isFile()){
			System.out.println("file name is invalid");
		}else if(!file.canRead()){
			System.out.println("File is not readable. Permission denied");
		}
		return new String(Files.readAllBytes(Paths.get(path)));
	}
	
}
