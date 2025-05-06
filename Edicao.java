import java.util.Scanner;

public class Edicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String[] titulosPt = new String[15];
		String[] titulosEn = new String[15];
		String[] titulosDe = new String[15];

		String[] conteudoPt = new String[15];
		String[] conteudoEn = new String[15];
		String[] conteudoDe = new String[15];

		int[] codigo = new int[15];

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

		System.out.println("Qual o seu idioma? /What is your language? /Was ist Ihre Sprache? ");
		System.out.println("1- Português;");
		System.out.println("2- English;");
		System.out.println("3- Deutsch.");
		System.out.print("> ");
		int idioma = leia.nextInt();

		if (idioma == 1) {
			
			System.out.println("");
			System.out.println("Bem-vindo ao WegOne:");
			System.out.println("");
			System.out.println("=== MENU ===");
			System.out.println("1. Cadastrar;");
			System.out.println("2. Pesquisar;");
			System.out.println("3. Editar;");
			System.out.println("4. Excluir;");
			System.out.println("5. Sair.");
			System.out.println("O que deseja acessar?");
			System.out.print("> ");
			int respostaMenu = leia.nextInt();
			leia.nextLine();

			if (respostaMenu == 3) {
				
				System.out.println("");
				System.out.println("=== EDITAR ORIENTAÇÃO ===");

				String tituloBusca = "";
				boolean encontrado = false;

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
			}
		}

		if (idioma == 2) {

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
			int respostaMenu = leia.nextInt();
			leia.nextLine();

			if (respostaMenu == 3) {
				
				System.out.println("");
				System.out.println("=== EDIT GUIDELINE ===");

				String tituloBusca = "";
				boolean encontrado = false;

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
			}
		}

		if (idioma == 3) {

			System.out.println("");
			System.out.println("Willkommen bei WegOne:");
			System.out.println("");
			System.out.println("=== MENÜ ===");
			System.out.println("1. Registrieren;");
			System.out.println("2. Suchen;");
			System.out.println("3. Bearbeiten;");
			System.out.println("4. Löschen;");
			System.out.println("5. Beenden.");
			System.out.println("Was möchten Sie tun?");
			System.out.print("> ");
			int respostaMenu = leia.nextInt();
			leia.nextLine();

			if (respostaMenu == 3) {
				
				System.out.println("");
				System.out.println("=== RICHTLINIE BEARBEITEN ===");
				
				String tituloBusca = "";
				boolean encontrado = false;

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
			}
		}
	}
}