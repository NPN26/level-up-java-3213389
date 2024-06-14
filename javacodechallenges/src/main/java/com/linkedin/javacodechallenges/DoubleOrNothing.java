package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
  private int points;
  public void playGame() {
    setPoints(10);
    menu();
  }

  private void menu(){
    System.out.println("You have " + getPoints() + " points");
    System.out.println("Enter 1 to Double It and 2 to do nothing.");
    int option = getInput();
    inputOutput(option);
  }

  private void inputOutput(int option){
    switch(option){
      case 1:
        doubleOption();
        menu();
      case 2:
        exit();
      default:
        System.out.println("Invalid option, please type 1 or 2");
    }
  }

  private void doubleOption(){
    Random rand = new Random();
    if(rand.nextBoolean()){
      setPoints(getPoints() * 2);
      System.out.println("Congratulations! You have Doubled your points");
    }
    else{
      setPoints(0);
      System.out.println("Oof! You have lost all your points");
    }
  }

  private void exit(){
    System.out.println("You had " + getPoints() + " points \n" +
            "Thank you for playing");
    System.exit(0);
  }

  private int getInput(){
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
}