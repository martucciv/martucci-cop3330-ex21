package ex21;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        int num = app.inputNum();
        String month = app.findMonth(num);
        String output = app.generateOutput(month, num);
        System.out.println(output);
    }

    public int inputNum(){
       System.out.print("Please enter the number of the month: ");
       String str = input.nextLine();
       return Integer.parseInt(str);
    }

    public String findMonth(int num){
        String month = switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
        return month;
    }

    public String generateOutput(String month, int num){
        if(num >= 1 && num <= 12){
            return "The name of the month is " +month+ ".";
        }
        else
            return "Invalid input.";
    }
}
