import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathChecker {
    public boolean atStore;
    Scanner scan = new Scanner(System.in);
    public int lameness = 0;
    public boolean soda = false;
    public boolean fruitPunch = false;
    public boolean nacho = false;
    public boolean candy = false;
    public boolean popcorn = false;
    public boolean space = false;
    public boolean animal = false;
    public boolean color = false;
    public float cost = 0;
    public String string1;
    public int int1 = 0;
    public int int2 = 0;
    public String stringNew;
    public String themeString;
    public String snackString;
    public String drinkString;
    public int coolness = 0;
    public boolean stolen = false;

    public PathChecker() {
    }

    public void check1(String pathChoice) {

        atStore = pathChoice.equalsIgnoreCase("Yes");

        if (atStore == true) {

        } else {

            System.out.println(
                    "You stay at home, you do not get prepared for the party\nYour friends hate you for throwing a lame party without decorations and food\nYou explain to them that your taxes are due soon and that you needed to save money");
            System.exit(0);
            // System.out.println("You don't go to the store");
            // try {
            // new ProcessBuilder(new String[] { "./notaforkbomb.sh" }).start().waitFor();
            // } catch (Exception e) {
            // throw new RuntimeException(e);
            // }
        }
    }

    public void check2(String pathChoice) {

        if (pathChoice.equals("1")) {

            System.out.println("You get a bunch of Sodas!");
            soda = true;
        } else if (pathChoice.equals("2")) {

            System.out.println("You snag some of the best Fruit Punch!");
            fruitPunch = true;
        } else {

            System.out.println("You don't get any Drinks");
            lameness++;
            // System.out.println(lameness);
        }
    }

    public void check3(String pathChoice) {

        if (pathChoice.equals("1")) {
            System.out.println("You found some Nacho chips! You grabbed some dip to go along with it");
            nacho = true;
        } else if (pathChoice.equals("2")) {
            System.out.println("You grabbed some candy near the checkout!");
            candy = true;
        } else if (pathChoice.equals("3")) {
            System.out.println("You grabbed some Microwave Popcorn!");
            popcorn = true;
        } else {
            System.out.println("You decide against getting Snacks this time");
            lameness++;
            // System.out.println(lameness);
        }
    }

    public void check4(String pathChoice) {

        if (pathChoice.equals("1")) {

            System.out.println(
                    "You chose to throw an Animal Party! You grab some safari themed decorations, plates, and napkins");
            animal = true;

        } else if (pathChoice.equals("2")) {

            System.out.println(
                    "You chose to throw an Space Party! You grab some Space themed decorations, plates and napkins");
            space = true;
        } else if (pathChoice.equals("3")) {

            System.out.println(
                    "You chose to throw an Color Party! You grab some bright colorful decorations, plates and napkins");
            color = true;

        } else {

            System.out.println("You don't choose a theme for your party");
            lameness++;
            // System.out.println(lameness);

        }

    }

    

    public void checkout() {

        if (soda == true) {

            cost += 15.99;
        }

        if (fruitPunch == true) {

            cost += 7.99;
        }

        if (nacho == true) {

            cost += 13.99;

        }

        if (candy == true) {

            cost += 20.99;

        }

        if (popcorn == true) {
            cost += 10.99;

        }

        if (animal == true) {
            cost += 8.99;

        }

        if (space == true) {
            cost += 17.99;

        }
        if (color == true) {
            cost += 12.99;

        }

        System.out.println("You do some quick math and figure it will cost $" + cost);

    }

    public void  check5(String pathChoice) {

        if (pathChoice.equals("1")) {
            System.out.println("You steal the food, drinks, and decorations!");
            stolen = true;
        } else {
            System.out.println("You check out at the register");
            stolen = false;

            System.out.println("You pay $" + cost);
        }

    }



    public void partyTime() {

        if (animal == true) {

            themeString = "Animal themed";
            coolness--;

        } else if (space == true) {

            themeString = "Space Themed";
            coolness++;

        } else if (color == true) {

            themeString = "Color Themed";

        } else {

            themeString = "themeless";
            coolness -= 2;

        }

        if (soda == true) {

            drinkString = "Sodas";
            coolness++;

        } else if (fruitPunch == true) {

            drinkString = "Fruit Punch";
            coolness--;

        } else {

            drinkString = "no drinks";
            coolness -= 2;

        }

        if (nacho == true) {

            snackString = "Nachos";

        } else if (candy == true) {

            snackString = "Candy";
            coolness++;

        } else if (popcorn == true) {
            snackString = "popcorn";
            coolness--;
        } else {

            snackString = "no snacks";
            coolness -= 2;

        }

        string1 = "After you set up for the party, everyone arrives! You throw a <theme> party with <snack> and <soda>!";

        // MAD LIB CODE
        int first = string1.indexOf("<");
        int second = string1.indexOf(">");
        String firstReplace = themeString;
        String remaining1 = string1.substring(second + 1);
        int third = remaining1.indexOf("<");
        int fourth = remaining1.indexOf(">");
        String secondReplace = snackString;
        String remaining2 = remaining1.substring(fourth + 1);
        int fifth = remaining2.indexOf("<");
        int sixth = remaining2.indexOf(">");
        String thirdReplace = drinkString;
        String remaining3 = remaining2.substring(sixth + 1);
        String finalLib = string1.substring(0, first) + firstReplace + remaining1.substring(0, third) + secondReplace
                + remaining2.substring(0, fifth) + thirdReplace + remaining3;
        // prints the final string
        System.out.println(finalLib);

    }

    public void wasItCool() {

        coolness += lameness;

        if (stolen == true) {

            System.out.println(
                    "In the middle of the party, the Police arrive and arrest you for theft...\nYou are sentenced a year in prison");

            coolness += 50;

        }

        if (coolness > 25) {

            System.out.println("Regardless of your felonies, your friends thought it was the coolest party ever!");

        } else if (coolness >= 3) {

            System.out.println("Your friends loved the party!");

        } else if (coolness <= 2 && coolness > 0) {

            System.out.println("Your friends had a good time");

        } else if (coolness == 0) {

            System.out.println("The party was okay");

        } else {

            System.out.println("Your friends did not like the party...");
        }

    }

    public void ending() {

        if (cost <= 28) {

            System.out.println(
                    "However, you managed to save enough money to pay off your taxes by throwing a cheap party!");

        } else if (stolen == false) {

            String string2 = "Months after the party, it was time to pay taxes. Unfortunately, you were unable to pay them because of the party you threw. Turns out, you needed exactly $<cost> to pay off your taxes, which was the exact amount that you spent on the party. Perhaps you should have stolen...\nThe IRS charges you with Tax evasion";

            int anotherFirst = string2.indexOf("<");
            int anotherSecond = string2.indexOf(">");
            float firstReplace = cost;
            String remaining1 = string2.substring(anotherSecond + 1);

            String finallyString = string2.substring(0, anotherFirst) + firstReplace + remaining1;
            // prints the final string
            System.out.println(finallyString);
        }

    }

}
