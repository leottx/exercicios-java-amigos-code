package com.leonardotx;

public class Programmer extends Employee{
    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void writeSomeCode() {
        System.out.println("Writing some code");
    }

    @Override
    public void sayHi() {
        String message = """
                Hello my name is %s
                I'm a programmer
                """.formatted(this.name);

        System.out.println(message);
    }
}
