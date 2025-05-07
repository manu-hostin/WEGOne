import java.util.Scanner;

public class projeto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcaoMenu = 0;
		int tipoPesquisa = 0;
		int posicaoAtual = 0;
		String pesquisa = "";
		boolean encontrado = false;
		int pesquisaCod = 0;
		String exclusao = "";
		int respostaExclusao = 0;
		boolean removido = false;
		int tipo = 0;
		int sair = 0;

		String[] titulosPt = new String[15];
		String[] titulosEn = new String[15];
		String[] titulosDe = new String[15];

		int[] codigo = new int[15];

		String[] conteudoPt = new String[15];
		String[] conteudoEn = new String[15];
		String[] conteudoDe = new String[15];

		String[] tiposPt = { "Manual de Operação;", "Procedimento de Segurança;", "Manutenção e Reparos;",
				"Testes e Diagnósticos;", "Manual de Conduta e Operações Setoriais." };
		String[] tiposEn = { "Operation Manual;", "Safety procedure;", "Maintenance and repairs;",
				"Tests and Diagnostics;", "Sectoral Conduct and Operations Manual." };
		String[] tiposDe = { "Bedienungsanleitung;", "Sicherheitsverfahren;", "Wartung und Reparaturen;",
				"Tests und Diagnose;", "Branchenhandbuch für Verhalten und Betrieb." };

		String[] tipoOrientacaoPt = new String[15];
		String[] tipoOrientacaoEn = new String[15];
		String[] tipoOrientacaoDe = new String[15];

		posicaoAtual = 9;

		System.out.println("Qual o seu idioma?/ What is your language?/ Was ist Ihre Sprache?");
		System.out.println("1- Português;");
		System.out.println("2- English;");
		System.out.println("3- Deutsch");
		System.out.println(">");
		int idioma = leia.nextInt();

		if (idioma == 1) {
			do {
				System.out.println("");
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

				if (opcaoMenu == 1) {
					posicaoAtual = posicaoAtual + 1;

					System.out.println("=== Cadastro de Nova Orientação ===");
					System.out.println("Informe o título da orientação:");
					titulosPt[posicaoAtual] = leia.nextLine();
					System.out.println("Digite o código do produto:");
					codigo[posicaoAtual] = leia.nextInt();
					System.out.println("Selecione o tipo de orientação:");
					System.out.println("1- Manual de Operação;");
					System.out.println("2- Procedimento de segurança;");
					System.out.println("3- Manutenção e reparos;");
					System.out.println("4- Testes e Diagnósticos;");
					System.out.println("5- Manual de conduta e Operações Setoriais.");
					System.out.println("> ");
					tipo = leia.nextInt();
					tipoOrientacaoPt[posicaoAtual] = tiposPt[tipo - 1];
					leia.nextLine();
					System.out.println("Digite o conteúdo da orientação:");
					conteudoPt[posicaoAtual] = leia.nextLine();
					System.out.println("\nCadastro realizado com sucesso!");
					System.out.println("Título: " + titulosPt[posicaoAtual]);
					System.out.println("Código: " + codigo[posicaoAtual]);
					System.out.println("Tipo: " + tipoOrientacaoPt[posicaoAtual]);
					System.out.println("Conteúdo: " + conteudoPt[posicaoAtual]);

				} else if (opcaoMenu == 2) {
					encontrado = false;
					System.out.println("=== Pesquisar Orientação ===");
					System.out.println("Como você vai querer pesquisar?");
					System.out.println("1- Título;");
					System.out.println("2- Código.");
					System.out.println(">");
					tipoPesquisa = leia.nextInt();
					leia.nextLine();

					if (tipoPesquisa == 1) {
						System.out.println("Digite o título que você deseja pesquisar:");
						pesquisa = leia.nextLine();

						for (int i = 0; i < 15; i++) {
							if (titulosPt[i] != null) {
								if (titulosPt[i].equalsIgnoreCase(pesquisa)) {
									System.out.println("Título: " + titulosPt[i]);
									System.out.println("Código: " + codigo[i]);
									System.out.println("Tipo: " + tipoOrientacaoPt[i]);
									System.out.println("Conteúdo: " + conteudoPt[i]);
									encontrado = true;
									break;
								}
							}
						}
						if (encontrado != true) {
							System.out.println("Título não encontrado.");
						}
					} else if (tipoPesquisa == 2) {
						System.out.println("Digite o código que você deseja pesquisar:");
						pesquisaCod = leia.nextInt();

						for (int i = 0; i < 15; i++) {
							if (codigo[i] == pesquisaCod) {
								System.out.println("Título: " + titulosPt[i]);
								System.out.println("Código: " + codigo[i]);
								System.out.println("Tipo: " + tipoOrientacaoPt[i]);
								System.out.println("Conteúdo: " + conteudoPt[i]);
								encontrado = true;
								break;
							}
						}
						if (encontrado != true) {
							System.out.println("Código não encontrado.");
						}
					} else {
						System.out.println("Tipo de pesquisa inexistente.");
					}
				} else if (opcaoMenu == 3) {

				} else if (opcaoMenu == 4) {
					System.out.println("=== Excluir Orientação ===");
					System.out.println("Digite o título que deseja excluir:");
					exclusao = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						if (titulosPt[i] != null) {
							if (titulosPt[i].equalsIgnoreCase(exclusao)) {
								System.out.println("Tem certeza que deseja excluir esta orientação?");
								System.out.println("1- Sim");
								System.out.println("2- Não");
								respostaExclusao = leia.nextInt();

								if (respostaExclusao == 1) {
									for (int j = i; j < 14 - 1; j++) {
										titulosPt[j] = titulosPt[j + 1];
										codigo[j] = codigo[j + 1];
										tipoOrientacaoPt[j] = tipoOrientacaoPt[j + 1];
										conteudoPt[j] = conteudoPt[j + 1];
									}

									titulosPt[15 - 1] = null;
									removido = true;
									System.out.println("Orientação removida");
									break;
								} else {
									System.out.println("Orientação não excluida.");
								}
							}

						}

					}
				}
			} while (opcaoMenu != 5);
			
			if (opcaoMenu == 5) {
				System.out.println("Saindo...");
			}

		}
		if (idioma == 2) {
			do {
				System.out.println("");
				System.out.println("Welcome to WegOne:");
				System.out.println("");
				System.out.println("=== MENU ===");
				System.out.println("1. Register;");
				System.out.println("2. Search;");
				System.out.println("3. Edit;");
				System.out.println("4. Delete;");
				System.out.println("5. Exit.");
				System.out.println("What would you like to access?");
				System.out.println("> ");
				opcaoMenu = leia.nextInt();
				leia.nextLine();

				if (opcaoMenu == 1) {
					posicaoAtual = posicaoAtual + 1;

					System.out.println("=== New Guidance Registration ===");
					System.out.println("Enter the title of the guidance:");
					titulosEn[posicaoAtual] = leia.nextLine();
					System.out.println("Enter the product code:");
					codigo[posicaoAtual] = leia.nextInt();
					System.out.println("Select the type of guidance:");
					System.out.println("1- Operation Manual;");
					System.out.println("2- Safety Procedure;");
					System.out.println("3- Maintenance and Repairs;");
					System.out.println("4- Tests and Diagnostics;");
					System.out.println("5- Conduct Manual and Sectorial Operations.");
					System.out.println("> ");
					tipo = leia.nextInt();
					tipoOrientacaoEn[posicaoAtual] = tiposEn[tipo - 1];
					leia.nextLine();
					System.out.println("Enter the content of the guidance:");
					conteudoEn[posicaoAtual] = leia.nextLine();
					System.out.println("\nRegistration successful!");
					System.out.println("Title:" + titulosEn[posicaoAtual]);
					System.out.println("Code: " + codigo[posicaoAtual]);
					System.out.println("Type: " + tipoOrientacaoEn[posicaoAtual]);
					System.out.println("Content: " + conteudoEn[posicaoAtual]);

				} else if (opcaoMenu == 2) {
					encontrado = false;
					System.out.println("=== Search Guidance ===");
					System.out.println("How would you like to search?");
					System.out.println("1- Title;");
					System.out.println("2- Code.");
					System.out.println(">");
					tipoPesquisa = leia.nextInt();
					leia.nextLine();

					if (tipoPesquisa == 1) {
						System.out.println("Enter the title you want to search for:");
						pesquisa = leia.nextLine();

						for (int i = 0; i < 15; i++) {
							if (titulosEn[i] != null) {
								if (titulosEn[i].equalsIgnoreCase(pesquisa)) {
									System.out.println("Title: " + titulosEn[i]);
									System.out.println("Code: " + codigo[i]);
									System.out.println("Type: " + tipoOrientacaoEn[i]);
									System.out.println("Content: " + conteudoEn[i]);
									encontrado = true;
									break;
								}
							}
						}
						if (encontrado != true) {
							System.out.println("Title not found.");
						}
					} else if (tipoPesquisa == 2) {
						System.out.println("Enter the code you want to search for:");
						pesquisaCod = leia.nextInt();

						for (int i = 0; i < 15; i++) {
							if (codigo[i] == pesquisaCod) {
								System.out.println("Title: " + titulosEn[i]);
								System.out.println("Code: " + codigo[i]);
								System.out.println("Type: " + tipoOrientacaoEn[i]);
								System.out.println("Content: " + conteudoEn[i]);
								encontrado = true;
								break;
							}
						}
						if (encontrado != true) {
							System.out.println("Code not found.");
						}
					} else {
						System.out.println("Invalid search type.");
					}
				} else if (opcaoMenu == 3) {

				} else if (opcaoMenu == 4) {
					System.out.println("=== Delete Guidance ===");
					System.out.println("Enter the title you want to delete:");
					exclusao = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						if (titulosEn[i] != null) {
							if (titulosEn[i].equalsIgnoreCase(exclusao)) {
								System.out.println("Are you sure you want to delete this guidance?");
								System.out.println("1- Yes");
								System.out.println("2- No");
								respostaExclusao = leia.nextInt();

								if (respostaExclusao == 1) {
									for (int j = i; j < 14 - 1; j++) {
										titulosEn[j] = titulosEn[j + 1];
										codigo[j] = codigo[j + 1];
										tipoOrientacaoEn[j] = tipoOrientacaoEn[j + 1];
										conteudoEn[j] = conteudoEn[j + 1];
									}

									titulosEn[15 - 1] = null;
									removido = true;
									System.out.println("Guidance removed");
									break;
								} else {
									System.out.println("Guidance not deleted.");
								}
							}

						}

					}
				} 
			} while (opcaoMenu < 5);
			
			if (opcaoMenu == 5) {
				System.out.println("Leaving...");
			}

		}
		if (idioma == 3) {
			do {
				System.out.println("");
				System.out.println("Willkommen bei WegOne:");
				System.out.println("");
				System.out.println("=== MENÜ ===");
				System.out.println("1. Registrieren;");
				System.out.println("2. Suchen;");
				System.out.println("3. Bearbeiten;");
				System.out.println("4. Löschen;");
				System.out.println("5. Beenden.");
				System.out.println("Was möchten Sie zugreifen?");
				System.out.println("> ");
				opcaoMenu = leia.nextInt();
				leia.nextLine();

				if (opcaoMenu == 1) {
					posicaoAtual = posicaoAtual + 1;

					System.out.println("=== Neue Anleitung Registrierung ===");
					System.out.println("Geben Sie den Titel der Anleitung ein:");
					titulosDe[posicaoAtual] = leia.nextLine();
					System.out.println("Geben Sie den Produktcode ein:");
					codigo[posicaoAtual] = leia.nextInt();
					System.out.println("Wählen Sie den Typ der Anleitung:");
					System.out.println("1- Betriebsanleitung;");
					System.out.println("2- Sicherheitsverfahren;");
					System.out.println("3- Wartung und Reparaturen;");
					System.out.println("4- Tests und Diagnosen;");
					System.out.println("5- Verhaltenshandbuch und Sektorielle Operationen.");
					System.out.println("> ");
					tipo = leia.nextInt();
					tipoOrientacaoDe[posicaoAtual] = tiposDe[tipo - 1];
					leia.nextLine();
					System.out.println("Geben Sie den Inhalt der Anleitung ein:");
					conteudoDe[posicaoAtual] = leia.nextLine();
					System.out.println("\nRegistrierung erfolgreich!");
					System.out.println("Titel: " + titulosDe[posicaoAtual]);
					System.out.println("Code: " + codigo[posicaoAtual]);
					System.out.println("Typ: " + tipoOrientacaoDe[posicaoAtual]);
					System.out.println("Inhalt: " + conteudoDe[posicaoAtual]);

				} else if (opcaoMenu == 2) {
					encontrado = false;
					System.out.println("=== Anleitung Suchen ===");
					System.out.println("Wie möchten Sie suchen?");
					System.out.println("1- Titel;");
					System.out.println("2- Code.");
					System.out.println(">");
					tipoPesquisa = leia.nextInt();
					leia.nextLine();

					if (tipoPesquisa == 1) {
						System.out.println("Geben Sie den Titel ein, nach dem Sie suchen möchten:");
						pesquisa = leia.nextLine();

						for (int i = 0; i < 15; i++) {
							if (titulosDe[i] != null) {
								if (titulosDe[i].equalsIgnoreCase(pesquisa)) {
									System.out.println("Titel: " + titulosDe[i]);
									System.out.println("Code: " + codigo[i]);
									System.out.println("Typ: " + tipoOrientacaoDe[i]);
									System.out.println("Inhalt: " + conteudoDe[i]);
									encontrado = true;
									break;
								}
							}
						}
						if (encontrado != true) {
							System.out.println("Titel nicht gefunden.");
						}
					} else if (tipoPesquisa == 2) {
						System.out.println("Geben Sie den Code ein, nach dem Sie suchen möchten:");
						pesquisaCod = leia.nextInt();

						for (int i = 0; i < 15; i++) {
							if (codigo[i] == pesquisaCod) {
								System.out.println("Titel: " + titulosDe[i]);
								System.out.println("Code: " + codigo[i]);
								System.out.println("Typ: " + tipoOrientacaoDe[i]);
								System.out.println("Inhalt: " + conteudoDe[i]);
								encontrado = true;
								break;
							}
						}
						if (encontrado != true) {
							System.out.println("Code nicht gefunden.");
						}
					} else {
						System.out.println("Ungültiger Suchtyp.");
					}
				} else if (opcaoMenu == 3) {

				} else if (opcaoMenu == 4) {
					System.out.println("=== Anleitung Löschen ===");
					System.out.println("Geben Sie den Titel ein, den Sie löschen möchten:");
					exclusao = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						if (titulosDe[i] != null) {
							if (titulosDe[i].equalsIgnoreCase(exclusao)) {
								System.out.println("Sind Sie sicher, dass Sie diese Anleitung löschen möchten?");
								System.out.println("1- Ja");
								System.out.println("2- Nein");
								respostaExclusao = leia.nextInt();

								if (respostaExclusao == 1) {
									for (int j = i; j < 14 - 1; j++) {
										titulosDe[j] = titulosDe[j + 1];
										codigo[j] = codigo[j + 1];
										tipoOrientacaoDe[j] = tipoOrientacaoDe[j + 1];
										conteudoDe[j] = conteudoDe[j + 1];
									}

									titulosDe[15 - 1] = null;
									removido = true;
									System.out.println("Orientação removida");
									break;
								} else {
									System.out.println("Orientação não excluida.");
								}
							}

						}

					}
				}
			} while (opcaoMenu != 5);

			if (opcaoMenu == 5) {
				System.out.println("Verlassen...");
			}
		}
	}
}
