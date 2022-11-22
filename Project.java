package example.com;
import java.util.*;

public class Project {
    public static void main (String[] args){
        //Greet & Plan
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name:");
        String name = sc.nextLine();
        System.out.print ("Welcome to the TripsTide " + name + ", where are you planning to travel to?");
        String destination = sc.nextLine();
        System.out.print("Great! " + destination + " is a wonderful place to travel!");
        //Travel time & budget
        timeBudget();

    }
    public static void timeBudget(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days are you planning to travel?:");
        int days = sc.nextInt();
        System.out.print("What is your budget for this trip in USD?:");
        int budget = sc.nextInt();
        System.out.println ("What is the three letter currency symbol for your travel destination?:");
        String curr = sc.nextLine();
        Currency c2 = Currency.getInstance(curr);
        System.out.println();
        System.out.print("How many " + curr + " are there in 1 USD ?:");
        double rate = sc.nextDouble();
        //Travel time calculation
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("if you are travelling for " + days + "that is the same as " + hours
        + "or" + minutes + "or" + seconds + " seconds");
        //Budget calculation
        Currency c1 = Currency.getInstance("USD");
        String code1 = c1.getCurrencyCode();
        double b = budget;
        double d = days;
        double daily = b/d;
        double exchange = budget/rate;
        System.out.println ("If you are going to spend " + c1.getSymbol() + budget + " USD that means per " +
                "day you can spend up to " + c1.getSymbol() + daily + " USD");
        System.out.println ("Your total budget in " + exchange + rate + c2.getSymbol() + ", which per day is " +
                rate/d + c2.getSymbol());
    }
}
