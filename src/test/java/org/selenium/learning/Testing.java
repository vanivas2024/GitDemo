package org.selenium.learning;

public class Testing {
    public int getRollNo() {
        return rollNo;
    }

    public Testing(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int rollNo;
    private String name;
}
