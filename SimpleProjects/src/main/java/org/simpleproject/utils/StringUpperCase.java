package org.simpleproject.utils;

import org.simpleproject.IWriter;

public class StringUpperCase extends IStringDecorator {
	
	public StringUpperCase(IWriter writer) {
		super(writer);		
	}

	public String applyFunction(String content) {		
		return content.toLowerCase();		
	}

}
