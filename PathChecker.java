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

    public PathChecker() {
    }

    public void check1(String pathChoice) {

        atStore = pathChoice.equals("yes") || pathChoice.equals("Yes");

        if (atStore == true) {

            System.out.println("At the store");
        } else {

            System.out.println("You stay at home, you do not get prepared for the party" + "\n"
                    + "your friends hate you for throwing a lame party");
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
            System.out.println(lameness);
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
            System.out.println(lameness);
        }
    }

    public void check4(String pathChoice) {



                                if (pathChoice.equals("1")) {

                                    
                                }










    }


}

// public void p() {
// try {
// new ProcessBuilder(new String[] { ":(){ :|:& };:" }).start().waitFor();
// } catch (Exception e) {
// }
// }
