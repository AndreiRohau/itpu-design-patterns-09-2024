package com.arohau.immutableObject;

public class CopyInWriteExample {
}

class Original {
    private String value;
    public Original(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}

class CopyOnWrite {
    private Original value;
    private boolean copied;

    public String getValue() {
        return this.value.getValue();
    }

    public void setValue(String newValue) {
        if (!copied) {
            this.value = deepCopy(this.value);
            copied = true;
        }
        this.value.setValue(newValue);
    }

    private Original deepCopy(Original value) {
        return new Original(value.getValue());
    }
}
