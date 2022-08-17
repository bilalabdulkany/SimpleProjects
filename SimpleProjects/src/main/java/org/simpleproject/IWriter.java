package org.simpleproject;

import java.io.IOException;

public interface IWriter{
		
	public String applyFunction(String content) throws IOException;
	
	public void close();
	
}
