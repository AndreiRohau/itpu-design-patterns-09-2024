package dip.learningExample.stringProcessorExample.ex4.highLevel;

import dip.learningExample.stringProcessorExample.ex4.abstraction.StringReader;
import dip.learningExample.stringProcessorExample.ex4.abstraction.StringWriter;

// HIGH LEVEL MODULE
// StringReader and StringWriter are interfaces placed in a separate package from StringProcessor.
// We achieved inversion of dependencies, and it’s also easier to replace StringReader and StringWriter implementations.
// StringProcessor is also reusable in a different context.
public class StringProcessor {

    private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void printString() {
        stringWriter.write(stringReader.getValue());
    }
}