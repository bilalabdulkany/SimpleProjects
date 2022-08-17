package org.simpleproject.utils;

import java.io.IOException;

import org.simpleproject.IWriter;

public class StringUpperCase extends IStringDecorator {
	
	public StringUpperCase(IWriter writer) {
		super(writer);		
	}

	public String applyFunction(String content) throws IOException {		
		return super.applyFunction(content).toLowerCase();		
	}

}
