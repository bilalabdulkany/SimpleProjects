package org.simpleproject.utils;

import org.simpleproject.IWriter;

import java.io.IOException;

public class StringLowerCase extends IStringDecorator {

    public StringLowerCase(IWriter writer) {
        super(writer);
    }

    public StringLowerCase() {
        super();
    }

    @Override
    public String writeFunction(String content) throws IOException {
        finalContent = this._writer!=null?_writer.write(content):content;
        finalContent = finalContent.toLowerCase();
        return finalContent;
    }

}
