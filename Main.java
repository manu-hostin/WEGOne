import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String English;
        String Português;
        String Dutesch;


        System.out.println(" selecione o idioma / Select language / Sprache auswählen:");
        System.out.println(" 1 - Português");
        System.out.println(" 2 - English");
        System.out.println(" 3 - Dutesch");


        int escolha1 = scanner.nextInt();
        System.out.println(" 1 - Português");


        System.out.println(" 2 - English");
        int escolha2 = scanner.nextInt();

        System.out.println(" 3 - Dutesch");
        int escolha3 = scanner.nextInt();


        if (escolha1 == 1) {
            System.out.println(" __        __   _                            _         ");
            System.out.println(" \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___   ");
            System.out.println("  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | ");
            System.out.println("   \\ V  V /  __/ | (_| (_) | | | | | |  __/ | ||  ");
            System.out.println("    \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  ");
        } else if (escolha2 == 2) {

            System.out.println(" __     ______  _    _   _      ____   _____ ______ ");

        } else if (escolha3 == 3) {
            System.out.println("alemao.");
        } else {
            System.out.println("You selected a different language. / Você selecionou um idioma diferente.");
        }

    }}