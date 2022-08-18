package org.simpleproject.utils;

import java.io.IOException;

import org.simpleproject.IWriter;

public abstract class IStringDecorator implements IWriter {
	
	final IWriter _writer;
	String finalContent="";
	private boolean IsClosed;

	public IStringDecorator(IWriter writer) {
		this._writer=writer;

	}
	public IStringDecorator() {
		this._writer=null;
	}


	public boolean isClosed() {
		return IsClosed;
	}

	public void setClosed(boolean closed) {
		IsClosed = closed;
	}
	@Override
	public String getContent() {
		return finalContent;
	}

	@Override
	public void setContent(String content) {
		this.finalContent = content;
	}

	public String write(String content) throws IOException {
		return this.writeFunction(content);
	}

	public abstract String writeFunction(String content) throws IOException;
	
	public void close() {
	 this._writer.close();		
	}
}
