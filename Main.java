import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcaoMenu = 0;

		System.out.println("Qual o seu idioma?/ What is your language?/ Was ist Ihre Sprache?");
		System.out.println("1- Português;");
		System.out.println("2- English;");
		System.out.println("3- Deutsch");
		System.out.println(">");
		int idioma = leia.nextInt();

		if (idioma == 1) {
			System.out.println("Bem-vindo(a) ao WegOne:");
			System.out.println("");
			System.out.println("=== MENU ===");
			System.out.println("1. Cadastrar;");
			System.out.println("2. Pesquisar;");
			System.out.println("3. Editar;");
			System.out.println("4. Excluir;");
			System.out.println("5. Sair.");
			System.out.println("Oque você deseja acessar?");
			System.out.println("> ");
			opcaoMenu = leia.nextInt();
			leia.nextLine();
		} else if (idioma == 2) {
			System.out.println("Welcome to WegOne:");
			System.out.println("");
			System.out.println("=== MENU ===");
			System.out.println("1. Register;");
			System.out.println("2. Search;");
			System.out.println("3. Edit;");
			System.out.println("4. Delete;");
			System.out.println("5. Exit.");
			System.out.println("What do you want to access?");
			System.out.println("> ");
			opcaoMenu = leia.nextInt();
			leia.nextLine();
		} else if (idioma == 3) {
			System.out.println("Willkommen bei WegOne:");
			System.out.println("");
			System.out.println("=== MENÜ ===");
			System.out.println("1. Registrieren;");
			System.out.println("2. Suche;");
			System.out.println("3. Bearbeiten");
			System.out.println("4. Löschen;");
			System.out.println("5. Beenden.");
			System.out.println("Worauf möchten Sie zugreifen?");
			System.out.println("> ");
			opcaoMenu = leia.nextInt();
			leia.nextLine();

		}
	}
}
