import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



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
        String[] menuOpcoes;
        String menuPrincipal;

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
            menuOpcoes = new String[] {
                    "Cadastrar Orientação",
                    "Pesquisar Orientação",
                    "Editar Orientação",
                    "Excluir Orientação",
                    "Sair"
            };
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
            menuOpcoes = new String[] {
                    "Register Guidance",
                    "Search Guidance",
                    "Edit Guidance",
                    "Delete Guidance",
                    "Exit"
            };
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
            menuOpcoes = new String[] {
                    "Anleitung Registrieren",
                    "Anleitung Suchen",
                    "Anleitung Bearbeiten",
                    "Anleitung Löschen",
                    "Beenden"
            };
        } else {
            System.out.println("Opção de idioma inválida.");
            return;
        }


        int opcaoMenu = 0;
        System.out.println(menuPrincipal);
        for (int i = 0; i < menuOpcoes.length; i++) {
            System.out.println((i + 1) + ". " + menuOpcoes[i]);
        }
        System.out.print(opcaoMenuMensagem);
        opcaoMenu = scanner.nextInt();
        scanner.nextLine();

        switch (opcaoMenu) {
            case 1:
                System.out.println("Cadastrar Orientação");

                break;
            case 2:
                System.out.println("Pesquisar Orientação");

                break;
            case 3:
                System.out.println("Editar Orientação");

                break;
            case 4:
                System.out.println("Excluir Orientação");

                break;
            case 5:
                System.out.println("Saindo...");

                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();



        if (opcaoMenu == 1) {

            System.out.println("\n" + cadastroMensagem);

            System.out.print(tituloMensagem + "\n> ");
            String titulo = scanner.nextLine();

            System.out.println("\n" + tipoMensagem);

            for (int i = 0; i < tiposOrientacao.length; i++) {
                System.out.println((i + 1) + " - " + tiposOrientacao[i]);
            }
            System.out.print("> ");
            int tipo = scanner.nextInt();
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



            System.out.println("\n" + sucessoMensagem);
            System.out.println((idioma == 1 ? "Título: " : idioma == 2 ? "Title: " : "Titel: ") + titulo);
            System.out.println((idioma == 1 ? "Tipo: " : idioma == 2 ? "Type: " : "Typ: ") + tiposOrientacao[tipo - 1]);

            conteudoFinal = (idioma == 1) ? conteudoPT : (idioma == 2) ? conteudoEN : conteudoDE;
            System.out.println((idioma == 1 ? "Conteúdo: " : idioma == 2 ? "Content: " : "Inhalt: ") + conteudoFinal);





        } else {
            System.out.println("\nFunção ainda não implementada ou opção inválida.");
        }

        scanner.close();
    }
}