package dip.learningExample.stringProcessorExample.ex4.lowLevel;

import dip.learningExample.stringProcessorExample.ex4.abstraction.StringReader;
import dip.learningExample.stringProcessorExample.ex4.domain.ValueToWrite;

public class StringReaderImpl implements StringReader {
    @Override
    public ValueToWrite getValue() {
        return new ValueToWrite();
    }
}
