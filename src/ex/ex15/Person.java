package ex.ex15;


import objectSample.exceptionSample.original.Gender;

class Person {
    private Integer no;
    private String name;
    private Gender gender;
    private int age;

    public Person(Integer no, String name, Gender gender, int age) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Integer getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d",
                no,name,gender.getName(),age);
    }
}
