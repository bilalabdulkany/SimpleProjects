package org.simpleproject.utils;

import java.io.IOException;
import java.util.StringTokenizer;

import org.simpleproject.IWriter;

public class StringStupidRemover extends IStringDecorator {

		
	public StringStupidRemover(IWriter writer) {
		super(writer);
		
	}

	public String applyFunction(String content) throws IOException {
		//only lower case
		return super.applyFunction(content).replaceAll("stupid", "s*****");				
	}

}
