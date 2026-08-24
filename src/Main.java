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

    }
}
