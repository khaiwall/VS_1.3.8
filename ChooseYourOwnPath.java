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

        System.out.print("\n");
        System.out.println("Now You're at the store, you first think about getting drinks. You have two options: ");
        System.out.println("(1) Sodas");
        System.out.println("(2) Fruit punch");
        String whichDrink = sc.nextLine();
        path.check2(whichDrink);

        System.out.print("\n");
        System.out.println("You need some Snacks! You have a few choices here: ");
        System.out.println("(1) Nacho Chips");
        System.out.println("(2) Candy");
        System.out.println("(3) Popcorn");
        String whichSnack = sc.nextLine();
        path.check3(whichSnack);

        System.out.print("\n");
        System.out.println("You need to pick a theme for your party, you consider a few ideas: ");
        System.out.println("(1) Animal Party! Dress like your favorite animal");
        System.out.println("(2) Space Party! Bring your Astronaut and Alien Costumes");
        System.out.println("(3) Color Party! Wear your best color combo!");
        String whichParty = sc.nextLine();
        path.check4(whichParty);
        
        System.out.print("\n");
        System.out.println("You now have the choice to check out... or to run away." +"\n" + "You remember your taxes are due soon, and you've been scrambling to save money lately...");
        System.out.println("Do you steal? ");
        System.out.println("(1) Yes!");
        System.out.println("(2) No");
        String stealString = sc.nextLine();
        path.check5(stealString);
        
        if (stealString.equals("1")) {
            System.out.println("After stealing, you return home");
        } else {
            
            
            System.out.println("After checking out, you return home");
            
        }
        
        System.out.print("\n");

        path.partyTime();
        path.ending();
        path.wasItCool();
        

      

    }

}