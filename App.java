import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Your name contains how many characters ???");

        int name_length = s.nextInt();
        char tex[] = new char[name_length];

        for (int i = 0; i < name_length; i++) {
            System.out.println("enter " + (i + 1) + " char");
            tex[i] = s.next().charAt(0);

        }

        System.out.print("your name is   ");
        for (int i = 0; i < name_length; i++) {

            System.out.print(tex[i]);

        }
        System.out.println("    ");
    }
}
