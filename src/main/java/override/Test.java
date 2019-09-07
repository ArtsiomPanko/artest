package main.java.override;

import java.util.HashMap;
import java.util.Objects;

public class Test {

    private int id;
    private String name;
    private double length;

    public Test(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id == test.id &&
                Double.compare(test.length, length) == 0 &&
                Objects.equals(name, test.name);
    }


    public static void main(String[] args) {

    }

}
