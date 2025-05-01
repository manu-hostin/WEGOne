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

		if (idioma == 1) {
			System.out.println("=== Cadastro de Nova Orientação ===");
			System.out.println("Digite o código do produto:");
			int codigoProduto = leia.nextInt();
			System.out.println("Informe o título da orientação:");
			String titulo = leia.nextLine();
			System.out.println("Selecione o tipo de orientação:");
			String[] tiposOrientacao = {
				"Manual de Operação",
				"Procedimento de Segurança",
				"Manutenção e Reparos",
				"Testes e Diagnóstico",
				"Manual de Conduta e Operações Setoriais"
			};
			for (int i = 0; i < tiposOrientacao.length; i++) {
				System.out.println((i + 1) + " - " + tiposOrientacao[i]);
			}
			int tipo = leia.nextInt();
			leia.nextLine();
			System.out.println("Digite o conteúdo em Português:");
			String conteudoPT = leia.nextLine();
			System.out.println("\nCadastro realizado com sucesso!");
			System.out.println("Título: " + titulo);
			System.out.println("Código: " + codigoProduto);
			System.out.println("Tipo: " + tiposOrientacao[tipo - 1]);
			System.out.println("Conteúdo: " + conteudoPT);
		
		 } else if (idioma == 2) {
				System.out.println("=== New Guidance Registration ===");
				System.out.println("Enter the product code:");
				int codigoProduto = leia.nextInt();
				leia.nextLine();
				System.out.println("Enter the title of the guideline ");
				String titulo = leia.nextLine();
				System.out.println("");
				String[] tiposOrientacao = {
					"Operation Manual",
					"Safety Procedure",
					"Maintenance and Repairs",
					"Testing and Diagnostics",
					"Code of Conduct and Sectorial Operations Manual"
				};
				for (int i = 0; i < tiposOrientacao.length; i++) {
					System.out.println((i + 1) + " - " + tiposOrientacao[i]);
				}
				int tipo = leia.nextInt();
				leia.nextLine();
				System.out.println("Type the content in Portuguese");
				String conteudoPT = leia.nextLine();
				System.out.println("\nRegistration successful!");
				System.out.println("Title: " + titulo);
				System.out.println("Code: " + codigoProduto);
				System.out.println("Type: " + tiposOrientacao[tipo - 1]);
				System.out.println("Content: " + conteudoPT);
				
		 } else if (idioma == 3) {
				System.out.println("=== Neue Anleitung Registrierung ===");
				System.out.println("Geben Sie den Produktcode ein");
				int codigoProduto = leia.nextInt();
				leia.nextLine();
				System.out.println("Geben Sie den Titel der Richtlinie ein ");
				String titulo = leia.nextLine();
				System.out.println("");
				String[] tiposOrientacao = {
					"Betriebsanleitung",
					"Sicherheitsverfahren",
					"Wartung und Reparaturen",
					"Tests und Diagnosen",
					"Verhaltenskodex und Sektorielle Betriebsanleitung"
				};
				for (int i = 0; i < tiposOrientacao.length; i++) {
					System.out.println((i + 1) + " - " + tiposOrientacao[i]);
				}
				int tipo = leia.nextInt();
				leia.nextLine();
				System.out.println("Geben Sie den Inhalt auf Portugiesisch ein.");
				String conteudoPT = leia.nextLine();
				System.out.println("\nRegistrierung erfolgreich!");
				System.out.println("Titel: " + titulo);
				System.out.println("Code: " + codigoProduto);
				System.out.println("Typ: " + tiposOrientacao[tipo - 1]);
				System.out.println("Inhalt: " + conteudoPT);
		}
	}
}
