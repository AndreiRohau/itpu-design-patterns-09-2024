package com.arohau.immutableObject;

public class CopyInWriteExample {
    public static void main(String[] args) {
        Original nested = new Original("some text v1");

        CopyOnWrite o1 = new CopyOnWrite(nested);

        CopyOnWrite o2 = new CopyOnWrite(nested);

        o1.setValue("some txt v2");

        System.out.println(o1.getValue());

        System.out.println(o2.getValue());
    }
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
    private Original nested;
    private boolean copied;

    public CopyOnWrite(Original value) {
        this.nested = value;
    }

    public String getValue() {
        return this.nested.getValue();
    }

    public void setValue(String newValue) {
        if (!copied) {
            this.nested = deepCopy(this.nested);
            copied = true;
        }
        this.nested.setValue(newValue);
    }

    private Original deepCopy(Original value) {
        return new Original(value.getValue());
    }
}
