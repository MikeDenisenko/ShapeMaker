package com.mike.Shapes;

/**
 *
 */
public enum Color {
    BLUE("синий"), YELLOW("желтый"), RED("красный"), GREEN("зеленый");

    private String name;
    Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
