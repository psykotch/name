import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("ceci est un message de bienvenue, maintenant tape du texte :");
        Scanner variable = new Scanner(System.in);
        String text = variable.nextLine();
        System.out.println("ton texte :" + text);
    }
}
