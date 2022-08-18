package org.simpleproject;

import java.io.IOException;

public interface IWriter{
		
	String write(String content) throws IOException;
	void close();

	String getContent();
	void setContent(String content);
	
}
