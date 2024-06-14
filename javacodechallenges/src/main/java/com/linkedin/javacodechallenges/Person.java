package com.linkedin.javacodechallenges;

public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
      this.setFirstName(firstName);
      this.setLastName(lastName);
      this.setAge(age);
  }

  public void introduction() {
      System.out.println("Hi, i am " + getFirstName() + " " + getLastName() + ",and i am " + getAge() + " years old.");
  }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      if (age < 0)
          System.out.println("Age must be a positive integer.");
      else
        this.age = age;
    }
}