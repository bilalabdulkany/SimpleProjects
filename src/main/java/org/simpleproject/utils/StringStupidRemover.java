package org.simpleproject.utils;

import java.io.IOException;

import org.simpleproject.IWriter;

public class StringStupidRemover extends IStringDecorator {

	public StringStupidRemover(IWriter writer) {
		super(writer);
	}
	public StringStupidRemover(){

	}

	@Override
	public String writeFunction(String content) throws IOException {
		finalContent = this._writer!=null?_writer.write(content):content;
		finalContent = finalContent.replaceAll("stupid", "s*****");
		return finalContent;
	}

}
