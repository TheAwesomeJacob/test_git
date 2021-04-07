package ZapisOdczyt;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 381201717708828439L;
    String name;
    String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSureName(String sureName) {
        this.surName = sureName;
    }

    Person(String name, String sureName){
        this.name = name;
        this.surName = sureName;
    }

}
