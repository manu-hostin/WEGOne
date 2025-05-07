import java.util.Scanner;

public class Main {
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

		titulosPt[0] = "Acesso a Regras e Procedimentos";
		titulosEn[0] = "Access to Rules and Procedures";
		titulosDe[0] = "Zugang zu Regeln und Verfahren";
		conteudoPt[0] = "As orientações devem estar facilmente acessíveis aos colaboradores, para garantir o cumprimento adequado das normas.";
		conteudoEn[0] = "Guidelines must be easily accessible to employees to ensure proper compliance with the rules.";
		conteudoDe[0] = "Die Richtlinien müssen für Mitarbeitende leicht zugänglich sein, um die Einhaltung der Vorschriften sicherzustellen.";
		tipoOrientacaoPt[0] = tiposPt[0];
		tipoOrientacaoEn[0] = tiposEn[0];
		tipoOrientacaoDe[0] = tiposDe[0];
		codigo[0] = 100;

		titulosPt[1] = "Uso de Ferramentas de Planejamento";
		titulosEn[1] = "Use of Planning Tools";
		titulosDe[1] = "Verwendung von Planungswerkzeugen";
		conteudoPt[1] = "Ferramentas como SharkPoint e foco semanal são utilizadas para organizar o trabalho de curto prazo.";
		conteudoEn[1] = "Tools such as SharkPoint and weekly focus are used to organize short-term tasks.";
		conteudoDe[1] = "Werkzeuge wie SharkPoint und Wochenfokus werden verwendet, um kurzfristige Aufgaben zu organisieren.";
		tipoOrientacaoPt[1] = tiposPt[0];
		tipoOrientacaoEn[1] = tiposEn[0];
		tipoOrientacaoDe[1] = tiposDe[0];
		codigo[1] = 101;

		titulosPt[2] = "Regras de Segurança Pessoal";
		titulosEn[2] = "Personal Safety Rules";
		titulosDe[2] = "Persönliche Sicherheitsregeln";
		conteudoPt[2] = "O uso de calçados fechados e calças é obrigatório em todas as áreas operacionais.";
		conteudoEn[2] = "The use of closed shoes and pants is mandatory in all operational areas.";
		conteudoDe[2] = "Das Tragen von geschlossenen Schuhen und Hosen ist in allen Betriebsbereichen vorgeschrieben.";
		tipoOrientacaoPt[2] = tiposPt[1];
		tipoOrientacaoEn[2] = tiposEn[1];
		tipoOrientacaoDe[2] = tiposDe[1];
		codigo[2] = 102;

		titulosPt[3] = "Instalações Elétricas Seguras";
		titulosEn[3] = "Safe Electrical Installations";
		titulosDe[3] = "Sichere Elektroinstallationen";
		conteudoPt[3] = "Antes de realizar qualquer manutenção, desligue a alimentação elétrica e utilize EPI.";
		conteudoEn[3] = "Before performing any maintenance, turn off the power supply and wear PPE.";
		conteudoDe[3] = "Vor Wartungsarbeiten muss die Stromversorgung abgeschaltet und persönliche Schutzausrüstung getragen werden.";
		tipoOrientacaoPt[3] = tiposPt[1];
		tipoOrientacaoEn[3] = tiposEn[1];
		tipoOrientacaoDe[3] = tiposDe[1];
		codigo[3] = 103;

		titulosPt[4] = "Manutenção de Rotina";
		titulosEn[4] = "Routine Maintenance";
		titulosDe[4] = "Routine Wartung";
		conteudoPt[4] = "Realize inspeções semanais nos equipamentos para evitar falhas inesperadas.";
		conteudoEn[4] = "Perform weekly inspections on equipment to prevent unexpected failures.";
		conteudoDe[4] = "Führen Sie wöchentliche Inspektionen der Geräte durch, um unerwartete Ausfälle zu vermeiden.";
		tipoOrientacaoPt[4] = tiposPt[2];
		tipoOrientacaoEn[4] = tiposEn[2];
		tipoOrientacaoDe[4] = tiposDe[2];
		codigo[4] = 104;

		titulosPt[5] = "Ajuste de Componentes";
		titulosEn[5] = "Component Adjustment";
		titulosDe[5] = "Komponenten anpassen";
		conteudoPt[5] = "Certifique-se de ajustar peças soltas durante manutenções preventivas.";
		conteudoEn[5] = "Ensure to tighten loose components during preventive maintenance.";
		conteudoDe[5] = "Stellen Sie sicher, dass lose Komponenten bei der vorbeugenden Wartung festgezogen werden.";
		tipoOrientacaoPt[5] = tiposPt[2];
		tipoOrientacaoEn[5] = tiposEn[2];
		tipoOrientacaoDe[5] = tiposDe[2];
		codigo[5] = 105;

		titulosPt[6] = "Teste de Funcionalidade";
		titulosEn[6] = "Functionality Test";
		titulosDe[6] = "Funktionstest";
		conteudoPt[6] = "Após reparos, realize testes de funcionalidade para garantir o pleno funcionamento.";
		conteudoEn[6] = "After repairs, perform functionality tests to ensure proper operation.";
		conteudoDe[6] = "Nach Reparaturen Funktionstests durchführen, um einen ordnungsgemäßen Betrieb sicherzustellen.";
		tipoOrientacaoPt[6] = tiposPt[3];
		tipoOrientacaoEn[6] = tiposEn[3];
		tipoOrientacaoDe[6] = tiposDe[3];
		codigo[6] = 106;

		titulosPt[7] = "Diagnóstico de Falhas";
		titulosEn[7] = "Failure Diagnosis";
		titulosDe[7] = "Fehlerdiagnose";
		conteudoPt[7] = "Utilize ferramentas de diagnóstico para identificar falhas antes de realizar a manutenção.";
		conteudoEn[7] = "Use diagnostic tools to identify failures before performing maintenance.";
		conteudoDe[7] = "Verwenden Sie Diagnosewerkzeuge, um Fehler vor der Wartung zu identifizieren.";
		tipoOrientacaoPt[7] = tiposPt[3];
		tipoOrientacaoEn[7] = tiposEn[3];
		tipoOrientacaoDe[7] = tiposDe[3];
		codigo[7] = 107;

		titulosPt[8] = "Comprometimento com Propósitos";
		titulosEn[8] = "Commitment to Purposes";
		titulosDe[8] = "Engagement für Zwecke";
		conteudoPt[8] = "Todos devem manter disciplina e comprometimento com os valores da empresa.";
		conteudoEn[8] = "Everyone must maintain discipline and commitment to company values.";
		conteudoDe[8] = "Alle sollen Disziplin und Engagement für die Unternehmenswerte zeigen.";
		tipoOrientacaoPt[8] = tiposPt[4];
		tipoOrientacaoEn[8] = tiposEn[4];
		tipoOrientacaoDe[8] = tiposDe[4];
		codigo[8] = 108;

		titulosPt[9] = "Comunicação Interna";
		titulosEn[9] = "Internal Communication";
		titulosDe[9] = "Interne Kommunikation";
		conteudoPt[9] = "Use e-mail, Teams ou telefone conforme o contexto da comunicação.";
		conteudoEn[9] = "Use email, Teams, or phone depending on the communication context.";
		conteudoDe[9] = "Verwenden Sie je nach Kommunikationskontext E-Mail, Teams oder Telefon.";
		tipoOrientacaoPt[9] = tiposPt[4];
		tipoOrientacaoEn[9] = tiposEn[4];
		tipoOrientacaoDe[9] = tiposDe[4];
		codigo[9] = 109;


		posicaoAtual = 9;

		System.out.println("Qual o seu idioma?/ What is your language?/ Was ist Ihre Sprache?");
		System.out.println("1- Português;");
		System.out.println("2- English;");
		System.out.println("3- Deutsch");
		System.out.print(">");
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
				System.out.print("> ");
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
					System.out.print("> ");
					tipo = leia.nextInt();
					tipoOrientacaoPt[posicaoAtual] = tiposPt[tipo - 1];
					leia.nextLine();
					System.out.println("Digite o conteúdo da orientação:");
					System.out.print("> ");

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
					System.out.print(">");
					tipoPesquisa = leia.nextInt();
					leia.nextLine();

					if (tipoPesquisa == 1) {
						System.out.println("Digite o título que você deseja pesquisar:");
						System.out.print("> ");
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
						System.out.print("> ");
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

					System.out.println("");
				System.out.println("=== EDITAR ORIENTAÇÃO ===");

				String tituloBusca = "";
				encontrado = false;

				do {
					
					System.out.println("Digite o título da orientação que deseja editar:");
					System.out.print("> ");
					tituloBusca = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						
						if (titulosPt[i] != null && titulosPt[i].equalsIgnoreCase(tituloBusca)) {
							
							encontrado = true;
							System.out.println("\nTítulo encontrado!");
							char resposta;
							
							do {
								
								System.out.println("\nTítulo atual em português: " + titulosPt[i]);
								System.out.println("Deseja alterar o título em português? (S/N)");
								System.out.print("> ");
								resposta = leia.nextLine().charAt(0);

								if (resposta == 'S' || resposta == 's') {
									
									System.out.println("Novo título em português:");
									System.out.print("> ");
									titulosPt[i] = leia.nextLine();

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Opção inválida. Digite S ou N.");
									
								}

							} while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n');

							do {
								
								System.out.println("Deseja alterar o tipo? (S/N)");
								System.out.print("> ");
								resposta = leia.next().charAt(0);
								leia.nextLine();

								if (resposta == 'S' || resposta == 's') {
									
									int tipoIndex = 0;
									boolean tipoValido = false;
									
									while (!tipoValido) {
										
										System.out.println("\nEscolha o novo tipo:");
										System.out.println("1 - Manual de Operação");
										System.out.println("2 - Procedimento de Segurança");
										System.out.println("3 - Manutenção e Reparo");
										System.out.println("4 - Testes e Diagnóstico");
										System.out.println("5 - Manual de Conduta e Operações Setoriais");
										System.out.print("> ");
										tipoIndex = leia.nextInt();
										leia.nextLine();

										if (tipoIndex >= 1 && tipoIndex <= tiposPt.length) {
											
											tipoOrientacaoPt[i] = tiposPt[tipoIndex - 1];
											tipoValido = true;
											
										} else {
											
											System.out.println("Tipo inválido. Tente novamente.");
											
										}
									}

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Opção inválida. Digite S ou N.");
									
								}

							} while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n');

							do {
								
								System.out.println("\nConteúdo atual em português: " + conteudoPt[i]);
								System.out.println("Deseja alterar o conteúdo em português? (S/N)");
								System.out.print("> ");
								resposta = leia.nextLine().charAt(0);

								if (resposta == 'S' || resposta == 's') {
									
									System.out.println("Novo conteúdo em português:");
									System.out.print("> ");
									conteudoPt[i] = leia.nextLine();

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Opção inválida. Digite S ou N.");
									
								}

							} while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n');

							System.out.println("\n✅ Edição concluída com sucesso!");
							break;
						}
					}

					if (!encontrado) {
						
						System.out.println("\n❌ Título não encontrado!\n");
						
					}

				} while (!encontrado);

				} else if (opcaoMenu == 4) {
					System.out.println("=== Excluir Orientação ===");
					System.out.println("Digite o título que deseja excluir:");
					System.out.print("> ");
					exclusao = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						if (titulosPt[i] != null) {
							if (titulosPt[i].equalsIgnoreCase(exclusao)) {
								System.out.println("Tem certeza que deseja excluir esta orientação?");
								System.out.println("1- Sim");
								System.out.println("2- Não");
								System.out.print("> ");
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
				System.out.print("> ");
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
					System.out.print("> ");
					tipo = leia.nextInt();
					tipoOrientacaoEn[posicaoAtual] = tiposEn[tipo - 1];
					leia.nextLine();
					System.out.println("Enter the content of the guidance:");
					System.out.print("> ");
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
					System.out.print(">");
					tipoPesquisa = leia.nextInt();
					leia.nextLine();

					if (tipoPesquisa == 1) {
						System.out.println("Enter the title you want to search for:");
						System.out.print("> ");
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
						System.out.print("> ");
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

					System.out.println("");
				System.out.println("=== EDIT GUIDELINE ===");

				String tituloBusca = "";
				encontrado = false;

				do {
					
					System.out.println("Enter the title of the guideline you want to edit:");
					System.out.print("> ");
					tituloBusca = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						
						if (titulosEn[i] != null && titulosEn[i].equalsIgnoreCase(tituloBusca)) {
							
							encontrado = true;
							System.out.println("\nTitle found!");
							char resposta;

							do {
								
								System.out.println("\nCurrent English title: " + titulosEn[i]);
								System.out.println("Change English title? (Y/N)");
								System.out.print("> ");
								resposta = leia.nextLine().charAt(0);

								if (resposta == 'Y' || resposta == 'y') {
									
									System.out.println("New English title:");
									System.out.print("> ");
									titulosEn[i] = leia.nextLine();

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Invalid option. Enter Y or N.");
									
								}

							} while (resposta != 'Y' && resposta != 'y' && resposta != 'N' && resposta != 'n');

							do {

								System.out.println("Change type? (Y/N)");
								System.out.print("> ");
								resposta = leia.next().charAt(0);
								leia.nextLine();

								if (resposta == 'Y' || resposta == 'y') {
									
									int tipoIndex = 0;
									boolean tipoValido = false;
									
									while (!tipoValido) {
										
										System.out.println("\nChoose the new type:");
										System.out.println("1 - Operation Manual");
										System.out.println("2 - Safety Procedure");
										System.out.println("3 - Maintenance and Repairs");
										System.out.println("4 - Testing and Diagnostics");
										System.out.println("5 - Conduct and Sectoral Operations Manual");
										System.out.print("> ");
										tipoIndex = leia.nextInt();
										leia.nextLine();

										if (tipoIndex >= 1 && tipoIndex <= tiposEn.length) {
											
											tipoOrientacaoEn[i] = tiposEn[tipoIndex - 1];
											tipoValido = true;

										} else {
											
											System.out.println("Invalid type. Please try again.");
											
										}
									}

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Invalid option. Enter Y or N.");
									
								}

							} while (resposta != 'Y' && resposta != 'y' && resposta != 'N' && resposta != 'n');

							do {
								
								System.out.println("\nCurrent English content: " + conteudoEn[i]);
								System.out.println("Change English content? (Y/N)");
								System.out.print("> ");
								resposta = leia.nextLine().charAt(0);

								if (resposta == 'Y' || resposta == 'y') {
									
									System.out.println("New English content:");
									System.out.print("> ");
									conteudoEn[i] = leia.nextLine();

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Invalid option. Enter Y or N.");
									
								}

							} while (resposta != 'Y' && resposta != 'y' && resposta != 'N' && resposta != 'n');

							System.out.println("\n✅ Edit completed successfully!");
							break;
						}
					}

					if (!encontrado) {
						
						System.out.println("\n❌ Title not found!\n");
						
					}
				} while (!encontrado);

				} else if (opcaoMenu == 4) {
					System.out.println("=== Delete Guidance ===");
					System.out.println("Enter the title you want to delete:");
					System.out.print("> ");
					exclusao = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						if (titulosEn[i] != null) {
							if (titulosEn[i].equalsIgnoreCase(exclusao)) {
								System.out.println("Are you sure you want to delete this guidance?");
								System.out.println("1- Yes");
								System.out.println("2- No");
								System.out.print("> ");
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
				System.out.print("> ");
				opcaoMenu = leia.nextInt();
				leia.nextLine();

				if (opcaoMenu == 1) {
					posicaoAtual = posicaoAtual + 1;

					System.out.println("=== Neue Anleitung Registrierung ===");
					System.out.println("Geben Sie den Titel der Anleitung ein:");
					System.out.print("> ");
					titulosDe[posicaoAtual] = leia.nextLine();
					System.out.println("Geben Sie den Produktcode ein:");
					System.out.print("> ");
					codigo[posicaoAtual] = leia.nextInt();
					System.out.println("Wählen Sie den Typ der Anleitung:");
					System.out.println("1- Betriebsanleitung;");
					System.out.println("2- Sicherheitsverfahren;");
					System.out.println("3- Wartung und Reparaturen;");
					System.out.println("4- Tests und Diagnosen;");
					System.out.println("5- Verhaltenshandbuch und Sektorielle Operationen.");
					System.out.print("> ");
					tipo = leia.nextInt();
					tipoOrientacaoDe[posicaoAtual] = tiposDe[tipo - 1];
					leia.nextLine();
					System.out.println("Geben Sie den Inhalt der Anleitung ein:");
					System.out.print("> ");
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
					System.out.print(">");
					tipoPesquisa = leia.nextInt();
					leia.nextLine();

					if (tipoPesquisa == 1) {
						System.out.println("Geben Sie den Titel ein, nach dem Sie suchen möchten:");
						System.out.print("> ");
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
						System.out.print("> ");
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

				System.out.println("");
				System.out.println("=== RICHTLINIE BEARBEITEN ===");
				
				String tituloBusca = "";
				encontrado = false;

				do {
					
					System.out.println("Geben Sie den Titel der Richtlinie ein, die Sie bearbeiten möchten:");
					System.out.print("> ");
					tituloBusca = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						
						if (titulosDe[i] != null && titulosDe[i].equalsIgnoreCase(tituloBusca)) {
							
							encontrado = true;
							System.out.println("\nTitel gefunden!");
							char resposta;

							do {
								
								System.out.println("\nAktueller deutscher Titel: " + titulosDe[i]);
								System.out.println("Titel auf Deutsch ändern? (J/N)");
								System.out.print("> ");
								resposta = leia.nextLine().charAt(0);

								if (resposta == 'J' || resposta == 'j') {
									
									System.out.println("Neuer deutscher Titel:");
									System.out.print("> ");
									titulosDe[i] = leia.nextLine();

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Ungültige Option. Geben Sie J oder N ein.");
									
								}

							} while (resposta != 'J' && resposta != 'j' && resposta != 'N' && resposta != 'n');

							do {
								
								System.out.println("Typ ändern? (J/N)");
								System.out.print("> ");
								resposta = leia.next().charAt(0);
								leia.nextLine();

								if (resposta == 'J' || resposta == 'j') {
									
									int tipoIndex = 0;
									boolean tipoValido = false;
									
									while (!tipoValido) {
										
										System.out.println("\nWählen Sie den neuen Typ:");
										System.out.println("1 - Bedienungsanleitung");
										System.out.println("2 - Sicherheitsverfahren");
										System.out.println("3 - Wartung und Reparatur");
										System.out.println("4 - Tests und Diagnose");
										System.out.println("5 - Verhaltens- und Betriebsrichtlinien");
										System.out.print("> ");
										tipoIndex = leia.nextInt();
										leia.nextLine();
										
										if (tipoIndex >= 1 && tipoIndex <= tiposEn.length) {
											
											tipoOrientacaoEn[i] = tiposEn[tipoIndex - 1];
											tipoValido = true;
											
										} else {
											
											System.out.println("Ungültiger Typ. Bitte erneut versuchen.");
											
										}
									}

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Ungültige Option. Geben Sie J oder N ein.");
									
								}

							} while (resposta != 'J' && resposta != 'j' && resposta != 'N' && resposta != 'n');

							do {
								
								System.out.println("\nAktueller deutscher Inhalt: " + conteudoDe[i]);
								System.out.println("Inhalt auf Deutsch ändern? (J/N)");
								System.out.print("> ");
								resposta = leia.nextLine().charAt(0);

								if (resposta == 'J' || resposta == 'j') {
									
									System.out.println("Neuer deutscher Inhalt:");
									System.out.print("> ");
									conteudoDe[i] = leia.nextLine();

								} else if (resposta != 'N' && resposta != 'n') {
									
									System.out.println("Ungültige Option. Geben Sie J oder N ein.");
									
								}

							} while (resposta != 'J' && resposta != 'j' && resposta != 'N' && resposta != 'n');

							System.out.println("\n✅ Bearbeitung erfolgreich abgeschlossen!");
							break;
						}
					}

					if (!encontrado) {
						
						System.out.println("\n❌ Titel nicht gefunden!\n");
						
					}

				} while (!encontrado);

				} else if (opcaoMenu == 4) {
					System.out.println("=== Anleitung Löschen ===");
					System.out.println("Geben Sie den Titel ein, den Sie löschen möchten:");
					System.out.print("> ");
					exclusao = leia.nextLine();

					for (int i = 0; i < 15; i++) {
						if (titulosDe[i] != null) {
							if (titulosDe[i].equalsIgnoreCase(exclusao)) {
								System.out.println("Sind Sie sicher, dass Sie diese Anleitung löschen möchten?");
								System.out.println("1- Ja");
								System.out.println("2- Nein");
								System.out.print("> ");
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
									System.out.println("Anleitung entfernt.");
									break;
								} else {
									System.out.println("Führung nicht ausgeschlossen.");
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
