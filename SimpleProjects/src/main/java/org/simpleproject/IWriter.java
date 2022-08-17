package org.simpleproject;

import java.io.IOException;

public interface IWriter{
		
	public abstract String applyFunction(String content) throws IOException;
	
	public abstract void close();
	
}
