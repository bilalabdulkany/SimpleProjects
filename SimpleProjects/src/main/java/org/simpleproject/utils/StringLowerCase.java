package org.simpleproject.utils;

import java.io.IOException;

import org.simpleproject.IWriter;

public class StringLowerCase extends IStringDecorator {
	
	public StringLowerCase(IWriter writer) {
		super(writer);		
	}

	public String applyFunction(String content) throws IOException {
		return super.applyFunction(content).toUpperCase();			
	}

}
