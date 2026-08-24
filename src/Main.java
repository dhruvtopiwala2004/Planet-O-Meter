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

    }
}
