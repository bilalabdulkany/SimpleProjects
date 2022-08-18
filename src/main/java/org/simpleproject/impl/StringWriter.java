package org.simpleproject.impl;

import java.io.IOException;

import org.simpleproject.IWriter;

public class StringWriter implements IWriter {

	
	private boolean isClosed=false;
	private IWriter _writer;
	private String finalContent="";
	public StringWriter(IWriter writer) {
	this._writer=writer;
	}

	public String write(String content) throws IOException {
		if(!isClosed){
			finalContent=_writer.write(content);
			this.setContent(finalContent);
			return finalContent;
		}
		return "";
	}

	public void close() {
		this.isClosed=true;
		
	}

	@Override
	public String getContent() {
		return this.finalContent;
	}

	@Override
	public void setContent(String content) {
	this.finalContent=content;
	}


}
