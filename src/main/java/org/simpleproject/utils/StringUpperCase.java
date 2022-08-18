package org.simpleproject.utils;

import java.io.IOException;
import java.util.Locale;

import org.simpleproject.IWriter;

public class StringUpperCase extends IStringDecorator {
	public StringUpperCase(IWriter writer) {
		super(writer);
	}

	public StringUpperCase() {
		super();
	}
	@Override
	public String writeFunction(String content) throws IOException {
		finalContent = this._writer!=null?_writer.write(content):content;
		finalContent = finalContent.toUpperCase();
		return finalContent;
	}
}
