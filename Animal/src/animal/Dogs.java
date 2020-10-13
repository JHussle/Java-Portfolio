/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Joey
 */
public class Dogs {
    private String name;
    private String breed;
    private String sex;
    private int age;

    public Dogs(String name, String breed, String sex) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        System.out.println("Contructor is running");
    }

    public Dogs(int age) {
        this.age = age;
        System.out.println("Contructor is running");
    }
    
    public Dogs() {
        System.out.println("Contructor is running");
    }
    // Getters and Setters for the contructors

    public String getName() {
        System.out.println("\n Hello! My name is " + name + " .");
        return name;
    }

    public void setName(String name) {
        System.out.println("\n" + name + " has been stored.");
        this.name = name;
    }

    public String getBreed() {
        System.out.println("I am a " + breed);
        return breed;
    }

    public void setBreed(String breed) {
        System.out.println("Your pet is a " + breed);
        this.breed = breed;
    }

    public String getSex() {
        System.out.println("My owner says that I am a " + sex);
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("Your pet is a " + sex);
        this.sex = sex;
    }

    public int getAge() {
        System.out.println("I am " + age + " years old.");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Your pets is " + age + "years old");
        this.age = age;
    }
    
    
}
