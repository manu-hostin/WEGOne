import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o idioma / Select language / Sprache auswählen:");
        System.out.println("1 - Português");
        System.out.println("2 - English");
        System.out.println("3 - Dutesch");

        int escolha = scanner.nextInt();

        if (escolha == 1) {

            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            System.out.println("a ");
        } else if (escolha == 2) {

            System.out.println(" __        __   _                            _         ");
            System.out.println(" \\ \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___   ");
            System.out.println("  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\ ");
            System.out.println("   \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) | ");
            System.out.println("    \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/ ");
        } else if (escolha == 3) {
            System.out.println("Willkommen!");
        } else {
            System.out.println("Opção inválida / Invalid option / Ungültige Option.");
        }

        scanner.close();
    }}
