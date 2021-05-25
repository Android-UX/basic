package objectSample.fileSample;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;

class Person {
    private String name;
    private Gender gender;
    private LocalDate birth;

    public Person(String name, Gender gender, LocalDate birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirth() {
        return birth;
    }
}
