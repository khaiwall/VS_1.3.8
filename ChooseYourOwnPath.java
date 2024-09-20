import java.util.Scanner;

public class ChooseYourOwnPath {

    public static void main(String[] args) {
        
        // Paths paths = new Paths();
        Scanner sc = new Scanner(System.in);

        System.out.println("You need to go to the store, to get some stuff for a party you are throwing tonight\nKeep in mind your taxes are due soon, so try to save as much as you can!\nDo you go to the store? ");
           
        String firstAnswer = sc.nextLine();

        PathChecker path = new PathChecker();
        path.check1(firstAnswer);

        System.out.print("\n");
        System.out.println("Now You're at the store, you first think about getting drinks. You have two options: ");
        System.out.println("(1) Sodas [$15.99]");
        System.out.println("(2) Fruit Punch [$7.99]");
        System.out.println("(3) Nothing [$0.00]");
        String whichDrink = sc.nextLine();
        path.check2(whichDrink);

        System.out.print("\n");
        System.out.println("You need some Snacks! You have a few choices here: ");
        System.out.println("(1) Nacho Chips [$13.99]");
        System.out.println("(2) Candy [$20.99]");
        System.out.println("(3) Popcorn [$10.99]");
        System.out.println("(4) Nothing [$0.00]");

        String whichSnack = sc.nextLine();
        path.check3(whichSnack);

        System.out.print("\n");
        System.out.println("You need to pick themed decorations for your party. You see a few different themes and consider a few ideas: ");
        System.out.println("(1) Animal Party! Dress like your favorite animal [$8.99]");
        System.out.println("(2) Space Party! Bring your Astronaut and Alien Costumes [$17.99]");
        System.out.println("(3) Color Party! Wear your best color combo! [$12.99]");
        System.out.println("(4) No theme [$0.00]");

        String whichParty = sc.nextLine();
        path.check4(whichParty);

        path.checkout();
        
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
        path.wasItCool();
        path.ending();
        

      

    }

}