package org.simpleproject.utils;

import java.io.IOException;

import org.simpleproject.IWriter;

public abstract class IStringDecorator implements IWriter {
	
	public final IWriter _writer;
	public boolean IsClosed;
	
	
	public IStringDecorator(IWriter writer) {
		this._writer=writer;
		
	}

	public String applyFunction(String content) throws IOException {
		return _writer.applyFunction(content);
	}
	
	public void close() {
	 this._writer.close();		
	}
}
