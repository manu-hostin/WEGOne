import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

        String titulo;
        String tipo;
        String conteudo;

        public Cadastro(String titulo, String tipo, String conteudo) {
            this.titulo = titulo;
            this.tipo = tipo;
            this.conteudo = conteudo;

        Scanner scanner = new Scanner(System.in);
        int idioma = 0;

        System.out.println("Selecione o idioma / Select language / Sprache auswählen:");
        System.out.println("1 - Português");
        System.out.println("2 - English");
        System.out.println("3 - Deutsch");
        System.out.print("> ");
        idioma = scanner.nextInt();
        scanner.nextLine();

        String tituloMensagem, tipoMensagem, conteudoMensagem, opcaoMenuMensagem;
        String cadastroMensagem, sucessoMensagem;
        String[] tiposOrientacao;
        String menuCadastrar, menuPesquisar, menuEditar, menuExcluir, menuSair, menuPrincipal;

        if (idioma == 1) {
            tituloMensagem = "Informe o título da orientação:";
            tipoMensagem = "Selecione o tipo de orientação:";
            conteudoMensagem = "Digite o conteúdo em ";
            opcaoMenuMensagem = "Escolha uma opção:";
            cadastroMensagem = "=== Cadastro de Nova Orientação ===";
            sucessoMensagem = "Cadastro realizado com sucesso!";
            tiposOrientacao = new String[]{
                    "Manual de Operação",
                    "Procedimento de Segurança",
                    "Manutenção e Reparos",
                    "Testes e Diagnóstico",
                    "Manual de Conduta e Operações Setoriais"
            };
            menuPrincipal = "======== MENU PRINCIPAL ========";
            menuCadastrar = "Cadastrar Orientação";
            menuPesquisar = "Pesquisar Orientação";
            menuEditar = "Editar Orientação";
            menuExcluir = "Excluir Orientação";
            menuSair = "Sair";
        } else if (idioma == 2) {
            tituloMensagem = "Enter the title of the guidance:";
            tipoMensagem = "Select the type of guidance:";
            conteudoMensagem = "Enter the content in ";
            opcaoMenuMensagem = "Choose an option:";
            cadastroMensagem = "=== New Guidance Registration ===";
            sucessoMensagem = "Registration successful!";
            tiposOrientacao = new String[]{
                    "Operation Manual",
                    "Safety Procedure",
                    "Maintenance and Repairs",
                    "Testing and Diagnosis",
                    "Conduct and Sector Operations Manual"
            };
            menuPrincipal = "======== MAIN MENU ========";
            menuCadastrar = "Register Guidance";
            menuPesquisar = "Search Guidance";
            menuEditar = "Edit Guidance";
            menuExcluir = "Delete Guidance";
            menuSair = "Exit";
        } else if (idioma == 3) {
            tituloMensagem = "Geben Sie den Titel der Anleitung ein:";
            tipoMensagem = "Wählen Sie den Anweisungs-Typ:";
            conteudoMensagem = "Geben Sie den Inhalt in ";
            opcaoMenuMensagem = "Wählen Sie eine Option:";
            cadastroMensagem = "=== Neue Anleitung Registrieren ===";
            sucessoMensagem = "Registrierung erfolgreich!";
            tiposOrientacao = new String[]{
                    "Betriebsanleitung",
                    "Sicherheitsverfahren",
                    "Wartung und Reparaturen",
                    "Tests und Diagnose",
                    "Verhaltens- und Sektorhandbuch"
            };
            menuPrincipal = "======== HAUPTMENÜ ========";
            menuCadastrar = "Anleitung Registrieren";
            menuPesquisar = "Anleitung Suchen";
            menuEditar = "Anleitung Bearbeiten";
            menuExcluir = "Anleitung Löschen";
            menuSair = "Beenden";
        } else {
            System.out.println("Opção de idioma inválida.");
            return;
        }

        ArrayList<Cadastro> orientacoes = new ArrayList<>();

        int opcaoMenu = 0;
        while (true) {
            System.out.println(menuPrincipal);
            System.out.println("1. " + menuCadastrar);
            System.out.println("2. " + menuPesquisar);
            System.out.println("3. " + menuEditar);
            System.out.println("4. " + menuExcluir);
            System.out.println("5. " + menuSair);
            System.out.print(opcaoMenuMensagem);
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            if (opcaoMenu == 1) {
                System.out.println("\n" + cadastroMensagem);

                System.out.print(tituloMensagem + "\n> ");
                titulo = scanner.nextLine();

                System.out.println("\n" + tipoMensagem);
                for (int i = 0; i < tiposOrientacao.length; i++) {
                    System.out.println((i + 1) + " - " + tiposOrientacao[i]);
                }
                System.out.print("> ");
                tipo = scanner.nextLine();
                scanner.nextLine();

                String conteudoPT = "", conteudoEN = "", conteudoDE = "";
                String conteudoFinal = "";

                if (idioma == 1) {
                    System.out.print("\n" + conteudoMensagem + "Português:\n> ");
                    conteudoPT = scanner.nextLine();
                    conteudoFinal = conteudoPT;
                } else if (idioma == 2) {
                    System.out.print("\n" + conteudoMensagem + "English:\n> ");
                    conteudoEN = scanner.nextLine();
                    conteudoFinal = conteudoEN;
                } else if (idioma == 3) {
                    System.out.print("\n" + conteudoMensagem + "Deutsch:\n> ");
                    conteudoDE = scanner.nextLine();
                    conteudoFinal = conteudoDE;
                }

               
             /*    Cadastro novaOrientacao = new Cadastro(titulo, tiposOrientacao[tipo - 1], conteudoFinal);
                orientacoes.add(novaOrientacao);*/

                System.out.println("\n" + sucessoMensagem);
                System.out.println((idioma == 1 ? "Título: " : idioma == 2 ? "Title: " : "Titel: ") + titulo);
                System.out.println((idioma == 1 ? "Tipo: " : idioma == 2 ? "Type: " : "Typ: ") + tiposOrientacao[1]);
                System.out.println((idioma == 1 ? "Conteúdo: " : idioma == 2 ? "Content: " : "Inhalt: ") + conteudoFinal);
            } else if (opcaoMenu == 5) {
                System.out.println("\nSaindo...");
                break;
            } else {
                System.out.println("\nFunção ainda não implementada ou opção inválida.");
            }
        }
        //*comentário teste */

        scanner.close();
}}


