package dip.baeldungExample.stringProcessorExample.ex3.highLevelAndAbstraction;

// HIGH LEVEL MODULE
// StringReader and StringWriter are interfaces placed in the same package together with StringProcessor.
// Now, StringProcessor has the explicit ownership of the abstractions.
// StringProcessor, StringReader, and StringWriter all depend on abstractions.
// We have achieved inversion of dependencies from top to bottom by abstracting the interaction between the components.
// StringProcessor is now reusable in a different context.
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