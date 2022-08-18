package org.simpleproject.utils;

import java.io.IOException;
import java.util.StringTokenizer;

import org.simpleproject.IWriter;

public class StringDuplicateRemover extends IStringDecorator {

	
	public StringDuplicateRemover(IWriter writer) {
	 super(writer);
	}
	public StringDuplicateRemover(){}

	@Override
	public String writeFunction(String content) throws IOException {

		finalContent = this._writer!=null?_writer.write(content):content;
		//remove duplicates
		StringTokenizer token= new StringTokenizer(finalContent);
		String currentElement="",nextElement;
		StringBuilder stringBuilder=new StringBuilder();
		while(token.hasMoreElements()) {
			nextElement= token.nextToken();
			if(!currentElement.equals(nextElement))
			{
				stringBuilder.append(currentElement+" ");
				currentElement=nextElement;
			}
		}
		stringBuilder.append(currentElement);
		finalContent=stringBuilder.toString().trim();
		
		return finalContent;
	}

}
