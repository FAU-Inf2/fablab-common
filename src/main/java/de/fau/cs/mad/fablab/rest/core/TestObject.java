package de.fau.cs.mad.fablab.rest.core;


public class TestObject {

    private int first;

    private String second;

    public TestObject(){
        // Default
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {

        return "TestObject: " + first + " " + second;
    }
}


