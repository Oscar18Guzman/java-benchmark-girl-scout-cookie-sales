
import java.util.Arrays;
import java.util.Scanner;

class GirlScoutCookies {

    public static void main(String[] args) {
        int price = 5;
        String[] cookieMenu = { "Thanks-A-lot", "Girl Scout Smores", "Lemonades", "Shortbread", "Thin Mints",
                "Peanut Butter patties", "Caramel Delites", "Peanut Butter Sandwich" };
        System.out.println("Welcome to the Girl Scout cookies Here are our cookies.");
        for (int i = 0; i < cookieMenu.length; i++) {
            System.out.println(cookieMenu[i]);
        }

        Scanner choose = new Scanner(System.in);
        System.out.println("What type would you like: ");
        String cookieKind = choose.next();

        Scanner name = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = name.next();

        Scanner addy = new Scanner(System.in);
        System.out.println("Address: ");
        String address = addy.next();

        Scanner num = new Scanner(System.in);
        System.out.println("Phone Number: ");
        String phoneNumber = num.next();
        if (Arrays.asList(cookieMenu).contains(cookieKind)) {
            Scanner packages = new Scanner(System.in);
            System.out.println("How many Packages you want: ");
            int numberOfPackages = packages.nextInt();
            packages.close();
            System.out.println(firstName + " |" + address + " |" + phoneNumber + " |" + cookieKind + " amount: "
                    + numberOfPackages + " |" + "Price: $" + price * numberOfPackages);
            name.close();
            addy.close();
            num.close();
            choose.close();

        }

    }

}