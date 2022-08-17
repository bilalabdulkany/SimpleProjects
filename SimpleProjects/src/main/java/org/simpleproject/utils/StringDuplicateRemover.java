package org.simpleproject.utils;

import java.io.IOException;
import java.util.StringTokenizer;

import org.simpleproject.IWriter;

public class StringDuplicateRemover extends IStringDecorator {

	
	public StringDuplicateRemover(IWriter writer) {
	 super(writer);
	}

	public String applyFunction(String content) throws IOException {
		//remove duplicates
		StringTokenizer token= new StringTokenizer(content);
		String currentElement="",nextElement;
		StringBuilder finalContent=new StringBuilder();
		while(token.hasMoreElements()) {
			if(!currentElement.equals(nextElement=token.nextElement().toString()))
			{
				finalContent.append(currentElement+nextElement);
			}
			
		}
		return super.applyFunction(finalContent.toString()).toString();				
	}

	public void write() {
				
	}

}
