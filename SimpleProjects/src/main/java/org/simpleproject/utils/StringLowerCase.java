package org.simpleproject.utils;

import org.simpleproject.IWriter;

public class StringLowerCase extends IStringDecorator {
	
	public StringLowerCase(IWriter writer) {
		super(writer);		
	}

	public String applyFunction(String content) {
		
		return content.toUpperCase();		
	}

}
