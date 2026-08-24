import java.util.Scanner;
public class Main {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What planet do you want to visit?");
        String planet = input.nextLine();

        System.out.println("Welcome " + name + "!");
        System.out.println("You are looking at visiting " + planet + ".");

        System.out.println("What is the average temperature of the planet in Celsius?");
        int temperature = input.nextInt();

        if (temperature > 100 || temperature < -50){
            System.out.println("This planet is too extreme for human tourists.");
        }
        else{
            System.out.println("The temperature is acceptable.");

        }

        System.out.println("Enter the luxury rating of the planet (1-5):");
        int luxuryRating = input.nextInt();

        switch (luxuryRating) {
            case 5:
                System.out.println("Absolute Paradise!");
                break;

            case 4:
            case 3:
                System.out.println("Quite Comfortable.");
                break;

            case 2:
            case 1:
                System.out.println("Roughing it in the cosmos.");
                break;

            default:
                System.out.println("Invalid Luxury rating.");
                break;
        }

    }
}
