package OOP.java;

import OOP.java.Main_Person;

public class Person {

    private String name;
    private String middleName;
    private String familyName;

    public static final int MIN_AGE = 15;

    public Person(String name, String middleName, String familyName) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    public static int getMinAge() {
        return MIN_AGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
        System.out.println("Имя было изменено");
    }

    public String getMiddleName(){
        return middleName;
    }


}

