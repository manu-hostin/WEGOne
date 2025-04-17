import java.util.Scanner;
public class InicioCodigoEdicao {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			String titulo1 = "kk";
			String tipo1;
			int respostaMenu = 3;
			int buscaEdicao;
			String conteudoPortugues1;
			String conteudoIngles1;
			String conteudoAlemao1;

			if (respostaMenu == 3) {

				System.out.println("==== Edição de Orientação ====");
				System.out.println("Buscar por: ");
				System.out.println("1 - Código");
				System.out.println("2 - Título");
				System.out.println("> ");
				buscaEdicao = leia.nextInt();

				if (buscaEdicao == 1) { // Se a pesquisa for feita por codigo
					System.out.println("Digite o título da pesquisa:");
					titulo1 = leia.next();
				}
				if (titulo1 == "kk") {
					System.out.println(titulo1);
					System.out.println("Deseja alterar o titulo?");
					System.out.println("> ");
					char respostaAlteracao = leia.next().charAt(0);
					System.out.println("");

					if (respostaAlteracao == 'S' || respostaAlteracao == 's') {
						System.out.println("Digite o novo titulo: ");
						System.out.println("> ");
						String novoTitulo1 = leia.next();

					} else {
						System.out.println("Titulo: " + titulo1);
					}
					System.out.println("Deseja editar o tipo?");
					System.out.println("> ");
					char editarTipo = leia.next().charAt(0);

					if (editarTipo == 'S' || editarTipo == 's') {
						System.out.println("Escolha o tipo para qual deseja alterar:");
						System.out.println("1 - Manual de Operação");
						System.out.println("2 - Procedimento de Segurança");
						System.out.println("3 - Manutenção e Reparos");
						System.out.println("4 - Testes e Diagnóstico");
						System.out.println("5 - Manual de Conduta e Operações Setoriais");
						System.out.println("> ");
						tipo1 = leia.next(); // Vai armazenar o tipo do titulo 1

					} else if (editarTipo == 'n' || editarTipo == 'N') {
						System.out.println("");
					} else {
						System.out.println("Erro, tente novamente.");
					}
					System.out.println("Deseja editar o conteúdo em português? ");
					System.out.println("> ");
					char respostaEditarConteudo = leia.next().charAt(0);

					if (respostaEditarConteudo == 's' || respostaEditarConteudo == 'S') {
						System.out.println("Digite o conteúdo em português: ");
						System.out.println("> ");
						conteudoPortugues1 = leia.next();
					} else if (respostaEditarConteudo == 'n' || respostaEditarConteudo == 'N') {
						System.out.println("Conteúdo não será editado!");
					} else {
						System.out.println("Erro! Tente novamente.");
					}
					System.out.println("Deseja editar o conteúdo em inglês?");

				}
			 else if (buscaEdicao == 2) { // Se a pesquisa for feita por titulo
				System.out.println("Digite o código da pesquisa:");
				System.out.println("> ");
				int codigoPesquisa = leia.nextInt();

			} else { // Se não escolheu o tipo da pesquisa
				System.out.println("Erro! Escolha uma opção válida: ");
			}
			}
		}
}


