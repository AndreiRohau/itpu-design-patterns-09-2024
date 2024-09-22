package dip.learningExample.stringProcessorExample.ex2.highLevel;

import dip.learningExample.stringProcessorExample.ex2.lowLevel.StringReader;
import dip.learningExample.stringProcessorExample.ex2.lowLevel.StringWriter;

// HIGH LEVEL MODULE
// StringReader and StringWriter are interfaces placed in the same package along with the implementations.
// StringProcessor now depends on abstractions, but the low-level components don’t.
// We have not achieved inversion of dependencies yet.
public class StringProcessor {

    private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void printString() {
        stringWriter.write(stringReader.getValue()); // calling abstract methods
    }
}
