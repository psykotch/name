import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("ceci est un message de bienvenue, maintenant tape du texte :");
        Scanner variable = new Scanner(System.in);
        String text = variable.nextLine();
        while (!text.equals("quit")) {
            System.out.println("unknow command");
            System.out.println("faut que tu mettes quit");
        }

    }
}
