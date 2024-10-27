package com.arohau.immutableObject;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

//final class
public final class ImmutableClass {

    // final and private fields
    private final String name;
    private final int age;
    private final List<Object> objects;
    private final HashMap<String, Character> subjectGrade;

    // Values are assigned in constructor
    public ImmutableClass(String name, int age, List<Object> objects, HashMap<String, Character> subjectGrade){
        this.name = name;
        this.age = age;
        // store a deep copy of provided list with deep copy of elements
        this.objects = deepCopyOfList(objects);
        // deep copy of map
        HashMap<String, Character> temp = new HashMap<>();
        for(String k : subjectGrade.keySet()){
            temp.put(k, subjectGrade.get(k));
        }
        this.subjectGrade = temp;
    }

    private List<Object> deepCopyOfList(List<Object> objects) {
        return objects.stream()
                .map(this::deepCloneOfElement)
                .collect(Collectors.toUnmodifiableList());
    }
    private Object deepCloneOfElement(Object element) {
        Object clone = new Object();
        // element.getDeepCloneAllValues() to clone.set(allValues)
        return clone;
    }

    // All getters and return deep clones
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    // return a deep copy of List, returning a copy of list with copy of objects
    public List<Object> getObjects() {
        return deepCopyOfList(objects);
    }

    public HashMap<String, Character> getSubjectGrade(){
        // As clone return object you have to typecast
        return (HashMap<String, Character>)subjectGrade.clone();
    }
//no setter
}
