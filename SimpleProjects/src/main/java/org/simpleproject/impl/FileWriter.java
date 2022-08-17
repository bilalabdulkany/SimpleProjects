package org.simpleproject.impl;

import java.io.IOException;

import org.simpleproject.IWriter;

public class FileWriter implements IWriter {

	java.io.FileWriter writer=null;
	private boolean isClosed=false;
	
	public FileWriter(String filePath) throws IOException {
		writer=new java.io.FileWriter(filePath);
		
	}
	public String applyFunction(String content) throws IOException {
			if(!isClosed) {
		writer.write(content);
		writer.flush();
		}		
		return content+"Written to File!";
	}

	public void close() {
		this.isClosed=true;
		
	}
	
	
}
