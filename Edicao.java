import java.util.Scanner;
public class Edicao {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);

			String[] titulos = new String[15];
			String[] tipos = new String[7];
			String[] conteudosPortugues = new String[15];
			String[] conteudosIngles = new String[15];
			String[] conteudosAlemao = new String[15];

			int respostaMenu = 3;
			int buscaEdicao;


			titulos[0] = "Motor Elétrico";
			tipos[0] = "Manual de Operação";
			conteudosPortugues[0] = "Conteúdo em português do motor";
			conteudosIngles[0] = "Motor content in English";
			conteudosAlemao[0] = "Motorinhalt auf Deutsch";

			if (respostaMenu == 3) {

				System.out.println("Digite o título da pesquisa:");
				System.out.println("> ");
				String tituloBusca = leia.nextLine();

				boolean encontrado = false;

				for (int i = 0; i < 15; i++) {
					if (titulos[i].equalsIgnoreCase(tituloBusca)) {
						System.out.println("Título encontrado!");
						System.out.println("Título atual: " + titulos[i]);

						System.out.println("Deseja alterar o titulo?");
						System.out.println("> ");
						char resposta = leia.nextLine().charAt(0);
						System.out.println("");

						if (resposta == 'S' || resposta == 's') {
							System.out.println("Digite o novo titulo: ");
							System.out.println("> ");
							titulos[i] = leia.nextLine();

						} else if (resposta == 'n' || resposta == 'N') {
							System.out.println("Sem editar o título: " + titulos[i]);

						} else {

							System.out.println("Erro!");
						}

						System.out.println("Deseja editar o tipo?");
						System.out.println("> ");
						resposta = leia.next().charAt(0);

						if (resposta == 'S' || resposta == 's') {
							System.out.println("Escolha o tipo para qual deseja alterar:");
							System.out.println("1 - Manual de Operação");
							System.out.println("2 - Procedimento de Segurança");
							System.out.println("3 - Manutenção e Reparos");
							System.out.println("4 - Testes e Diagnóstico");
							System.out.println("5 - Manual de Conduta e Operações Setoriais");
							System.out.println("> ");
							tipos[i] = leia.next();
							leia.nextLine();

						} else if (resposta == 'n' || resposta == 'N') {
							System.out.println("Tipo atual: " + tipos[i]);

						} else {
							System.out.println("Erro, tente novamente.");
						}

						System.out.println("Deseja editar o conteúdo em português? ");
						System.out.println("> ");
						resposta = leia.next().charAt(0);
						leia.nextLine();

						if (resposta == 's' || resposta == 'S') {
							System.out.println("Digite o conteúdo em português: ");
							System.out.println("> ");
							conteudosPortugues[i] = leia.next();
							leia.nextLine();

						} else if (resposta == 'n' || resposta == 'N') {
							System.out.println("Conteúdo não será editado!");

						} else {
							System.out.println("Erro! Tente novamente.");
						}

						System.out.println("Deseja editar o conteúdo em inglês?");
						System.out.println("> ");
						resposta = leia.next().charAt(0);
						leia.nextLine();

						if (resposta == 's' || resposta == 'S') {
							System.out.println("Digite o conteúdo em inglês:");
							System.out.println("> ");
							conteudosIngles[i] = leia.next();
							leia.nextLine();

						} else if (resposta == 'n' || resposta == 'N') {
							System.out.println("Conteúdo não será editado!");

						} else {
							System.out.println("Erro! Tente novamente.");
						}

						System.out.println("Deseja editar o conteúdo em alemão?");
						System.out.println("> ");
						resposta = leia.next().charAt(0);
						leia.nextLine();

						if (resposta == 's' || resposta == 'S') {
							System.out.println("Digite o conteúdo em alemão:");
							System.out.println("> ");
							conteudosAlemao[i] = leia.next();
							leia.nextLine();

						} else if (resposta == 'n' || resposta == 'N') {
							System.out.println("Conteúdo não será editado!");

						} else {
							System.out.println("Erro! Tente novamente.");
						}

						System.out.println("Edição realizada com sucesso!");
						encontrado = true;
						break;

					}

				}
				if (!encontrado) {
					System.out.println("Título não encontrado!");
				}
			}
		}
	}

