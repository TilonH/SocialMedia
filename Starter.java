import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {


    public static void main(String[] args) {

        System.out.println("Willkommen zu dem Socialmedia!");
        System.out.println("Was willst du machen?");
        System.out.println("1: Anmelden");
        System.out.println("2: Registrieren");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<String> user = new ArrayList<>();

        if (input == "2") {

            System.out.println("Was wollen sie das ihr Nutzername ist?");
            Scanner sc1 = new Scanner(System.in);
            String username = sc1.nextLine();


            if (user.contains(username)) {
                System.out.println("Dieser Benutzername ist bereits vergeben");
            } else {
                user.add(username);
            }

        }

        if (input == "1") {

            System.out.println("Benutzername:");
            Scanner sc2 = new Scanner(System.in);
            String username = sc2.nextLine();

            if (user.contains(username)) {

            } else {
                System.out.println("Dieser Benutzername existiert nicht");
            }

        }

        System.out.println("Sie haben sich erfolgreich angemeldet!");
        System.out.println("Was wollen sie jetzt tun?");
        System.out.println("1: Post erstellen");
        Scanner sc3 = new Scanner(System.in);
        String input2 = sc3.nextLine();

        List<String> posts = new ArrayList<String>();

        if (input2 == "1") {
            System.out.println("Was wollen sie im Post schreiben?");
            String post = sc.nextLine();

            posts.add(post);

            System.out.println("Glückwunsch sie haben einen Post erstellt!");

        }

        System.out.println("Wollen sie alle Posts sehen? (Y / N)");

        Scanner sc4 = new Scanner(System.in);
        String yn = sc4.nextLine();

        if (yn == "Y") {

            for (int i = 0; i < 100; i++) {
                System.out.println(posts.get(i));
            }


        }


    }
}