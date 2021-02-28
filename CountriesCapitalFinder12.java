import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 27/02/21
 * A program to enter 10 countries and their capitals into two
 * single dimensional arrays. It inputs the country name then prints
 * its corresponding capital
 */

public class CountriesCapitalFinder12 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] countries = new String[10];
        String[] capitals = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of country " + (i+1) + ": ");
            countries[i] = sc.nextLine();
            System.out.print("Enter capital of " + countries[i] + ": ");
            capitals[i] = sc.nextLine();
        }
        System.out.print("Enter name of the country whose capital is to be found: ");
        String enteredCountry = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (countries[i].equals(enteredCountry)) {
                found = true;
                System.out.println("The capital of " + enteredCountry + " is " + capitals[i]);
                break;
            }
        }
        if (!found) {
            System.out.println("I do not know the capital of " + enteredCountry);
        }
    }
}