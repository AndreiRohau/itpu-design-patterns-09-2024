package dip.learningExample.stringProcessorExample.ex1.highLevel;

import dip.learningExample.stringProcessorExample.ex1.lowLevel.StringReader;
import dip.learningExample.stringProcessorExample.ex1.lowLevel.StringWriter;

// HIGH LEVEL MODULE
// StringReader and StringWriter, the low-level components,
// are concrete classes placed in the same package.
// StringProcessor, the high-level component is placed in a different package.
// StringProcessor depends on StringReader and StringWriter.
// There is no inversion of dependencies, hence StringProcessor is not reusable in a different context.
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


