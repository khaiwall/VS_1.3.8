import java.util.Scanner;

public class ChooseYourOwnPath {

    public static void main(String[] args) {

        // Paths paths = new Paths();
        Scanner sc = new Scanner(System.in);

        System.out.println("You need to go to the store, to get some stuff for a party you are throwing tonight" + "\n"
                + "Do you go to the store? ");
        String firstAnswer = sc.nextLine();

        PathChecker path = new PathChecker();
        path.check1(firstAnswer);

        System.out.println("Now You're at the store, you first think about getting drinks. You have two options: ");
        System.out.println("(1) Sodas");
        System.out.println("(2) Fruit punch");
        String whichDrink = sc.nextLine();
        path.check2(whichDrink);

        System.out.println("You need some Snacks! You have a few choices here: ");
        System.out.println("(1) Nacho Chips");
        System.out.println("(2) Candy");
        System.out.println("(3) Popcorn");
        String whichSnack = sc.nextLine();
        path.check3(whichSnack);


        System.out.println("You need to pick a theme for your party, you consider a few ideas: ");
        System.out.println((1) );

    }

}