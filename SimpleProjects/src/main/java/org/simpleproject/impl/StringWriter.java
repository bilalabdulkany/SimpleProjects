package org.simpleproject.impl;

import java.io.IOException;

import org.simpleproject.IWriter;

public class StringWriter implements IWriter {

	
	private boolean isClosed=false;
	
	public StringWriter(String filePath) {
	
	}
	public String applyFunction(String content) throws IOException {
	
		if(!isClosed) {
		return content;
		}		
		return content+"Written as String!";
	}

	public void close() {
		this.isClosed=true;
		
	}
	
	
}
