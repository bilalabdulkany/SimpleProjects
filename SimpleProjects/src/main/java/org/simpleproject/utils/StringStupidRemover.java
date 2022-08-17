package org.simpleproject.utils;

import java.util.StringTokenizer;

import org.simpleproject.IWriter;

public class StringStupidRemover extends IStringDecorator {

		
	public StringStupidRemover(IWriter writer) {
		super(writer);
		
	}

	public String applyFunction(String content) {
		//only lower case
		return content.replaceAll("stupid", "s*****");				
	}

}
