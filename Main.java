import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Seleção de idioma
        System.out.println("\n=== WegOne ===");
        System.out.println("Selecione o idioma / Select the language / Wählen Sie die Sprache:");
        System.out.println("1. Português");
        System.out.println("2. English");
        System.out.println("3. Deutsch");
        System.out.print("\n> ");
        
        String language = scanner.nextLine();
        
        switch (language) {
            case "1": // Português
                executarEmPortugues(scanner);
                break;
            case "2": // English
                executarEmIngles(scanner);
                break;
            case "3": // Deutsch
                executarEmAlemao(scanner);
                break;
            default:
                executarEmPortugues(scanner);
        }
        
        scanner.close();
    }

    private static void executarEmPortugues(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== WegOne - Sistema de Gerenciamento de Manuais ===");
            System.out.println("1. Cadastrar Manual");
            System.out.println("2. Consultar Manuais");
            System.out.println("3. Editar Manual");
            System.out.println("4. Excluir Manual");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarManualPT(scanner);
                    break;
                case 2:
                    consultarManuaisPT(scanner);
                    break;
                case 3:
                    editarManualPT(scanner);
                    break;
                case 4:
                    excluirManualPT(scanner);
                    break;
                case 5:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\n❌ Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void executarEmIngles(Scanner scanner) {
        int option;
        do {
            System.out.println("\n=== WegOne - Manual Management System ===");
            System.out.println("1. Register Manual");
            System.out.println("2. Search Manuals");
            System.out.println("3. Edit Manual");
            System.out.println("4. Delete Manual");
            System.out.println("5. Exit");
            System.out.print("\nChoose an option: ");
            
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    cadastrarManualEN(scanner);
                    break;
                case 2:
                    consultarManuaisEN(scanner);
                    break;
                case 3:
                    editarManualEN(scanner);
                    break;
                case 4:
                    excluirManualEN(scanner);
                    break;
                case 5:
                    System.out.println("\nExiting the system...");
                    break;
                default:
                    System.out.println("\n❌ Invalid option!");
            }
        } while (option != 5);
    }

    private static void executarEmAlemao(Scanner scanner) {
        int option;
        do {
            System.out.println("\n=== WegOne - Handbuchverwaltungssystem ===");
            System.out.println("1. Handbuch registrieren");
            System.out.println("2. Handbücher suchen");
            System.out.println("3. Handbuch bearbeiten");
            System.out.println("4. Handbuch löschen");
            System.out.println("5. Beenden");
            System.out.print("\nWählen Sie eine Option: ");
            
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    cadastrarManualDE(scanner);
                    break;
                case 2:
                    consultarManuaisDE(scanner);
                    break;
                case 3:
                    editarManualDE(scanner);
                    break;
                case 4:
                    excluirManualDE(scanner);
                    break;
                case 5:
                    System.out.println("\nSystem wird beendet...");
                    break;
                default:
                    System.out.println("\n❌ Ungültige Option!");
            }
        } while (option != 5);
    }

    // Métodos em Português
    private static void cadastrarManualPT(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Cadastro de Manual ===");
            
            System.out.print("Digite o título do manual: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Digite o nome do autor: ");
            String autor = scanner.nextLine();
            
            System.out.print("Digite o texto do manual: ");
            String texto = scanner.nextLine();

            System.out.println("\nSelecione o tipo de manual:");
            System.out.println("1. Manual de conduta operacional");
            System.out.println("2. Manual de diagnósticos");
            System.out.println("3. Manual de manutenção");
            System.out.println("4. Manual de operação");
            System.out.println("5. Manual de segurança");
            System.out.print("Opção: ");
            int tipoOpcao = scanner.nextInt();
            scanner.nextLine();
            
            String tipoManual = getTipoManualPT(tipoOpcao);
            
            String sql = "INSERT INTO manuais (titulo, autor, texto, tipoManual) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setString(3, texto);
                stmt.setString(4, tipoManual);
                stmt.executeUpdate();
                System.out.println("\n✅ Manual cadastrado com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Erro ao cadastrar manual: " + e.getMessage());
        }
    }

    private static void consultarManuaisPT(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Consulta de Manuais ===");
            System.out.println("1. Buscar por título");
            System.out.println("2. Buscar por autor");
            System.out.println("3. Buscar por tipo");
            System.out.println("4. Listar todos");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    buscarPorTituloPT(scanner, conn);
                    break;
                case 2:
                    buscarPorAutorPT(scanner, conn);
                    break;
                case 3:
                    buscarPorTipoPT(scanner, conn);
                    break;
                case 4:
                    listarTodosPT(conn);
                    break;
                default:
                    System.out.println("\n❌ Opção inválida!");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Erro na consulta: " + e.getMessage());
        }
    }

    // Métodos em Inglês
    private static void cadastrarManualEN(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Register Manual ===");
            
            System.out.print("Enter the manual title: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Enter the author name: ");
            String autor = scanner.nextLine();
            
            System.out.print("Enter the manual text: ");
            String texto = scanner.nextLine();

            System.out.println("\nSelect the manual type:");
            System.out.println("1. Operational Conduct Manual");
            System.out.println("2. Diagnostic Manual");
            System.out.println("3. Maintenance Manual");
            System.out.println("4. Operation Manual");
            System.out.println("5. Safety Manual");
            System.out.print("Option: ");
            int tipoOpcao = scanner.nextInt();
            scanner.nextLine();
            
            String tipoManual = getTipoManualEN(tipoOpcao);
            
            String sql = "INSERT INTO manuais (titulo, autor, texto, tipoManual) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setString(3, texto);
                stmt.setString(4, tipoManual);
                stmt.executeUpdate();
                System.out.println("\n✅ Manual registered successfully!");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Error registering manual: " + e.getMessage());
        }
    }

    private static void consultarManuaisEN(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Search Manuals ===");
            System.out.println("1. Search by title");
            System.out.println("2. Search by author");
            System.out.println("3. Search by type");
            System.out.println("4. List all");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    buscarPorTituloEN(scanner, conn);
                    break;
                case 2:
                    buscarPorAutorEN(scanner, conn);
                    break;
                case 3:
                    buscarPorTipoEN(scanner, conn);
                    break;
                case 4:
                    listarTodosEN(conn);
                    break;
                default:
                    System.out.println("\n❌ Invalid option!");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Error in search: " + e.getMessage());
        }
    }

    // Métodos em Alemão
    private static void cadastrarManualDE(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Handbuch registrieren ===");
            
            System.out.print("Geben Sie den Titel des Handbuchs ein: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Geben Sie den Namen des Autors ein: ");
            String autor = scanner.nextLine();
            
            System.out.print("Geben Sie den Text des Handbuchs ein: ");
            String texto = scanner.nextLine();

            System.out.println("\nWählen Sie den Handbuchtyp:");
            System.out.println("1. Betriebsführungshandbuch");
            System.out.println("2. Diagnosehandbuch");
            System.out.println("3. Wartungshandbuch");
            System.out.println("4. Bedienungshandbuch");
            System.out.println("5. Sicherheitshandbuch");
            System.out.print("Option: ");
            int tipoOpcao = scanner.nextInt();
            scanner.nextLine();
            
            String tipoManual = getTipoManualDE(tipoOpcao);
            
            String sql = "INSERT INTO manuais (titulo, autor, texto, tipoManual) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setString(3, texto);
                stmt.setString(4, tipoManual);
                stmt.executeUpdate();
                System.out.println("\n✅ Handbuch erfolgreich registriert!");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Fehler beim Registrieren des Handbuchs: " + e.getMessage());
        }
    }

    private static void consultarManuaisDE(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Handbücher suchen ===");
            System.out.println("1. Nach Titel suchen");
            System.out.println("2. Nach Autor suchen");
            System.out.println("3. Nach Typ suchen");
            System.out.println("4. Alle auflisten");
            System.out.print("Wählen Sie eine Option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    buscarPorTituloDE(scanner, conn);
                    break;
                case 2:
                    buscarPorAutorDE(scanner, conn);
                    break;
                case 3:
                    buscarPorTipoDE(scanner, conn);
                    break;
                case 4:
                    listarTodosDE(conn);
                    break;
                default:
                    System.out.println("\n❌ Ungültige Option!");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Fehler bei der Suche: " + e.getMessage());
        }
    }

    // Métodos auxiliares para cada idioma
    private static String getTipoManualPT(int tipo) {
        switch (tipo) {
            case 1: return "Manual de conduta operacional";
            case 2: return "Manual de diagnósticos";
            case 3: return "Manual de manutenção";
            case 4: return "Manual de operação";
            case 5: return "Manual de segurança";
            default: return "Tipo Desconhecido";
        }
    }

    private static String getTipoManualEN(int tipo) {
        switch (tipo) {
            case 1: return "Operational Conduct Manual";
            case 2: return "Diagnostic Manual";
            case 3: return "Maintenance Manual";
            case 4: return "Operation Manual";
            case 5: return "Safety Manual";
            default: return "Unknown Type";
        }
    }

    private static String getTipoManualDE(int tipo) {
        switch (tipo) {
            case 1: return "Betriebsführungshandbuch";
            case 2: return "Diagnosehandbuch";
            case 3: return "Wartungshandbuch";
            case 4: return "Bedienungshandbuch";
            case 5: return "Sicherheitshandbuch";
            default: return "Unbekannter Typ";
        }
    }

    // Métodos de busca em Português
    private static void buscarPorTituloPT(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("\nDigite o título do manual: ");
        String titulo = scanner.nextLine();
        
        String sql = "SELECT * FROM manuais WHERE titulo LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + titulo + "%");
            ResultSet rs = stmt.executeQuery();
            exibirResultadosPT(rs);
        }
    }

    private static void buscarPorAutorPT(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("\nDigite o nome do autor: ");
        String autor = scanner.nextLine();
        
        String sql = "SELECT * FROM manuais WHERE autor LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + autor + "%");
            ResultSet rs = stmt.executeQuery();
            exibirResultadosPT(rs);
        }
    }

    private static void buscarPorTipoPT(Scanner scanner, Connection conn) throws SQLException {
        System.out.println("\nSelecione o tipo de manual:");
        System.out.println("1. Manual de conduta operacional");
        System.out.println("2. Manual de diagnósticos");
        System.out.println("3. Manual de manutenção");
        System.out.println("4. Manual de operação");
        System.out.println("5. Manual de segurança");
        System.out.print("Opção: ");
        int tipoOpcao = scanner.nextInt();
        
        String tipoManual = getTipoManualPT(tipoOpcao);
        String sql = "SELECT * FROM manuais WHERE tipoManual = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoManual);
            ResultSet rs = stmt.executeQuery();
            exibirResultadosPT(rs);
        }
    }

    private static void listarTodosPT(Connection conn) throws SQLException {
        String sql = "SELECT * FROM manuais ORDER BY titulo";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            exibirResultadosPT(rs);
        }
    }

    private static void exibirResultadosPT(ResultSet rs) throws SQLException {
        boolean encontrou = false;
        while (rs.next()) {
            if (!encontrou) {
                System.out.println("\n=== Manuais Encontrados ===");
                encontrou = true;
            }
            System.out.println("\nTítulo: " + rs.getString("titulo"));
            System.out.println("Autor: " + rs.getString("autor"));
            System.out.println("Tipo: " + rs.getString("tipoManual"));
            System.out.println("Data de Publicação: " + rs.getTimestamp("data_publicacao"));
            System.out.println("Texto: " + rs.getString("texto"));
            System.out.println("------------------------");
        }
        
        if (!encontrou) {
            System.out.println("\n❌ Nenhum manual encontrado.");
        }
    }

    // Métodos de busca em Inglês
    private static void buscarPorTituloEN(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("\nEnter the manual title: ");
        String titulo = scanner.nextLine();
        
        String sql = "SELECT * FROM manuais WHERE titulo LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + titulo + "%");
            ResultSet rs = stmt.executeQuery();
            exibirResultadosEN(rs);
        }
    }

    private static void buscarPorAutorEN(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("\nEnter the author name: ");
        String autor = scanner.nextLine();
        
        String sql = "SELECT * FROM manuais WHERE autor LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + autor + "%");
            ResultSet rs = stmt.executeQuery();
            exibirResultadosEN(rs);
        }
    }

    private static void buscarPorTipoEN(Scanner scanner, Connection conn) throws SQLException {
        System.out.println("\nSelect the manual type:");
        System.out.println("1. Operational Conduct Manual");
        System.out.println("2. Diagnostic Manual");
        System.out.println("3. Maintenance Manual");
        System.out.println("4. Operation Manual");
        System.out.println("5. Safety Manual");
        System.out.print("Option: ");
        int tipoOpcao = scanner.nextInt();
        
        String tipoManual = getTipoManualEN(tipoOpcao);
        String sql = "SELECT * FROM manuais WHERE tipoManual = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoManual);
            ResultSet rs = stmt.executeQuery();
            exibirResultadosEN(rs);
        }
    }

    private static void listarTodosEN(Connection conn) throws SQLException {
        String sql = "SELECT * FROM manuais ORDER BY titulo";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            exibirResultadosEN(rs);
        }
    }

    private static void exibirResultadosEN(ResultSet rs) throws SQLException {
        boolean found = false;
        while (rs.next()) {
            if (!found) {
                System.out.println("\n=== Found Manuals ===");
                found = true;
            }
            System.out.println("\nTitle: " + rs.getString("titulo"));
            System.out.println("Author: " + rs.getString("autor"));
            System.out.println("Type: " + rs.getString("tipoManual"));
            System.out.println("Publication Date: " + rs.getTimestamp("data_publicacao"));
            System.out.println("Text: " + rs.getString("texto"));
            System.out.println("------------------------");
        }
        
        if (!found) {
            System.out.println("\n❌ No manuals found.");
        }
    }

    // Métodos de busca em Alemão
    private static void buscarPorTituloDE(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("\nGeben Sie den Titel des Handbuchs ein: ");
        String titulo = scanner.nextLine();
        
        String sql = "SELECT * FROM manuais WHERE titulo LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + titulo + "%");
            ResultSet rs = stmt.executeQuery();
            exibirResultadosDE(rs);
        }
    }

    private static void buscarPorAutorDE(Scanner scanner, Connection conn) throws SQLException {
        System.out.print("\nGeben Sie den Namen des Autors ein: ");
        String autor = scanner.nextLine();
        
        String sql = "SELECT * FROM manuais WHERE autor LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + autor + "%");
            ResultSet rs = stmt.executeQuery();
            exibirResultadosDE(rs);
        }
    }

    private static void buscarPorTipoDE(Scanner scanner, Connection conn) throws SQLException {
        System.out.println("\nWählen Sie den Handbuchtyp:");
        System.out.println("1. Betriebsführungshandbuch");
        System.out.println("2. Diagnosehandbuch");
        System.out.println("3. Wartungshandbuch");
        System.out.println("4. Bedienungshandbuch");
        System.out.println("5. Sicherheitshandbuch");
        System.out.print("Option: ");
        int tipoOpcao = scanner.nextInt();
        
        String tipoManual = getTipoManualDE(tipoOpcao);
        String sql = "SELECT * FROM manuais WHERE tipoManual = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoManual);
            ResultSet rs = stmt.executeQuery();
            exibirResultadosDE(rs);
        }
    }

    private static void listarTodosDE(Connection conn) throws SQLException {
        String sql = "SELECT * FROM manuais ORDER BY titulo";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            exibirResultadosDE(rs);
        }
    }

    private static void exibirResultadosDE(ResultSet rs) throws SQLException {
        boolean gefunden = false;
        while (rs.next()) {
            if (!gefunden) {
                System.out.println("\n=== Gefundene Handbücher ===");
                gefunden = true;
            }
            System.out.println("\nTitel: " + rs.getString("titulo"));
            System.out.println("Autor: " + rs.getString("autor"));
            System.out.println("Typ: " + rs.getString("tipoManual"));
            System.out.println("Veröffentlichungsdatum: " + rs.getTimestamp("data_publicacao"));
            System.out.println("Text: " + rs.getString("texto"));
            System.out.println("------------------------");
        }
        
        if (!gefunden) {
            System.out.println("\n❌ Keine Handbücher gefunden.");
        }
    }

    // Métodos de edição
    private static void editarManualPT(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Edição de Manual ===");
            System.out.print("Digite o título do manual que deseja editar: ");
            String tituloAntigo = scanner.nextLine();

            String sqlBusca = "SELECT * FROM manuais WHERE titulo = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlBusca)) {
                stmt.setString(1, tituloAntigo);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    System.out.println("\nManual encontrado!");
                    System.out.println("Título atual: " + rs.getString("titulo"));
                    System.out.println("Autor atual: " + rs.getString("autor"));
                    System.out.println("Tipo atual: " + rs.getString("tipoManual"));
                    
                    System.out.print("\nNovo título (ou Enter para manter): ");
                    String novoTitulo = scanner.nextLine();
                    if (novoTitulo.isEmpty()) novoTitulo = rs.getString("titulo");

                    System.out.print("Novo autor (ou Enter para manter): ");
                    String novoAutor = scanner.nextLine();
                    if (novoAutor.isEmpty()) novoAutor = rs.getString("autor");

                    System.out.println("\nNovo tipo de manual:");
                    System.out.println("1. Manual de conduta operacional");
                    System.out.println("2. Manual de diagnósticos");
                    System.out.println("3. Manual de manutenção");
                    System.out.println("4. Manual de operação");
                    System.out.println("5. Manual de segurança");
                    System.out.println("0. Manter o tipo atual");
                    System.out.print("Opção: ");
                    int tipoOpcao = scanner.nextInt();
                    scanner.nextLine();
                    
                    String novoTipo = tipoOpcao == 0 ? rs.getString("tipoManual") : getTipoManualPT(tipoOpcao);

                    System.out.print("\nNovo texto (ou Enter para manter): ");
                    String novoTexto = scanner.nextLine();
                    if (novoTexto.isEmpty()) novoTexto = rs.getString("texto");

                    String sqlUpdate = "UPDATE manuais SET titulo = ?, autor = ?, tipoManual = ?, texto = ? WHERE titulo = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(sqlUpdate)) {
                        updateStmt.setString(1, novoTitulo);
                        updateStmt.setString(2, novoAutor);
                        updateStmt.setString(3, novoTipo);
                        updateStmt.setString(4, novoTexto);
                        updateStmt.setString(5, tituloAntigo);
                        updateStmt.executeUpdate();
                        System.out.println("\n✅ Manual atualizado com sucesso!");
                    }
                } else {
                    System.out.println("\n❌ Manual não encontrado!");
                }
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Erro ao editar manual: " + e.getMessage());
        }
    }

    private static void editarManualEN(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Edit Manual ===");
            System.out.print("Enter the title of the manual you want to edit: ");
            String oldTitle = scanner.nextLine();

            String sqlSearch = "SELECT * FROM manuais WHERE titulo = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlSearch)) {
                stmt.setString(1, oldTitle);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    System.out.println("\nManual found!");
                    System.out.println("Current title: " + rs.getString("titulo"));
                    System.out.println("Current author: " + rs.getString("autor"));
                    System.out.println("Current type: " + rs.getString("tipoManual"));
                    
                    System.out.print("\nNew title (or Enter to keep current): ");
                    String newTitle = scanner.nextLine();
                    if (newTitle.isEmpty()) newTitle = rs.getString("titulo");

                    System.out.print("New author (or Enter to keep current): ");
                    String newAuthor = scanner.nextLine();
                    if (newAuthor.isEmpty()) newAuthor = rs.getString("autor");

                    System.out.println("\nNew manual type:");
                    System.out.println("1. Operational Conduct Manual");
                    System.out.println("2. Diagnostic Manual");
                    System.out.println("3. Maintenance Manual");
                    System.out.println("4. Operation Manual");
                    System.out.println("5. Safety Manual");
                    System.out.println("0. Keep current type");
                    System.out.print("Option: ");
                    int typeOption = scanner.nextInt();
                    scanner.nextLine();
                    
                    String newType = typeOption == 0 ? rs.getString("tipoManual") : getTipoManualEN(typeOption);

                    System.out.print("\nNew text (or Enter to keep current): ");
                    String newText = scanner.nextLine();
                    if (newText.isEmpty()) newText = rs.getString("texto");

                    String sqlUpdate = "UPDATE manuais SET titulo = ?, autor = ?, tipoManual = ?, texto = ? WHERE titulo = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(sqlUpdate)) {
                        updateStmt.setString(1, newTitle);
                        updateStmt.setString(2, newAuthor);
                        updateStmt.setString(3, newType);
                        updateStmt.setString(4, newText);
                        updateStmt.setString(5, oldTitle);
                        updateStmt.executeUpdate();
                        System.out.println("\n✅ Manual updated successfully!");
                    }
                } else {
                    System.out.println("\n❌ Manual not found!");
                }
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Error editing manual: " + e.getMessage());
        }
    }

    private static void editarManualDE(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Handbuch bearbeiten ===");
            System.out.print("Geben Sie den Titel des Handbuchs ein, das Sie bearbeiten möchten: ");
            String alterTitel = scanner.nextLine();

            String sqlSuche = "SELECT * FROM manuais WHERE titulo = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlSuche)) {
                stmt.setString(1, alterTitel);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    System.out.println("\nHandbuch gefunden!");
                    System.out.println("Aktueller Titel: " + rs.getString("titulo"));
                    System.out.println("Aktueller Autor: " + rs.getString("autor"));
                    System.out.println("Aktueller Typ: " + rs.getString("tipoManual"));
                    
                    System.out.print("\nNeuer Titel (oder Enter zum Beibehalten): ");
                    String neuerTitel = scanner.nextLine();
                    if (neuerTitel.isEmpty()) neuerTitel = rs.getString("titulo");

                    System.out.print("Neuer Autor (oder Enter zum Beibehalten): ");
                    String neuerAutor = scanner.nextLine();
                    if (neuerAutor.isEmpty()) neuerAutor = rs.getString("autor");

                    System.out.println("\nNeuer Handbuchtyp:");
                    System.out.println("1. Betriebsführungshandbuch");
                    System.out.println("2. Diagnosehandbuch");
                    System.out.println("3. Wartungshandbuch");
                    System.out.println("4. Bedienungshandbuch");
                    System.out.println("5. Sicherheitshandbuch");
                    System.out.println("0. Aktuellen Typ beibehalten");
                    System.out.print("Option: ");
                    int typOption = scanner.nextInt();
                    scanner.nextLine();
                    
                    String neuerTyp = typOption == 0 ? rs.getString("tipoManual") : getTipoManualDE(typOption);

                    System.out.print("\nNeuer Text (oder Enter zum Beibehalten): ");
                    String neuerText = scanner.nextLine();
                    if (neuerText.isEmpty()) neuerText = rs.getString("texto");

                    String sqlUpdate = "UPDATE manuais SET titulo = ?, autor = ?, tipoManual = ?, texto = ? WHERE titulo = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(sqlUpdate)) {
                        updateStmt.setString(1, neuerTitel);
                        updateStmt.setString(2, neuerAutor);
                        updateStmt.setString(3, neuerTyp);
                        updateStmt.setString(4, neuerText);
                        updateStmt.setString(5, alterTitel);
                        updateStmt.executeUpdate();
                        System.out.println("\n✅ Handbuch erfolgreich aktualisiert!");
                    }
                } else {
                    System.out.println("\n❌ Handbuch nicht gefunden!");
                }
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Fehler beim Bearbeiten des Handbuchs: " + e.getMessage());
        }
    }

    // Métodos de exclusão
    private static void excluirManualPT(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Exclusão de Manual ===");
            System.out.print("Digite o título do manual que deseja excluir: ");
            String titulo = scanner.nextLine();

            System.out.print("\nTem certeza que deseja excluir o manual? (S/N): ");
            String confirmacao = scanner.nextLine();

            if (confirmacao.equalsIgnoreCase("S")) {
                String sql = "DELETE FROM manuais WHERE titulo = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, titulo);
                    int linhasAfetadas = stmt.executeUpdate();
                    
                    if (linhasAfetadas > 0) {
                        System.out.println("\n✅ Manual excluído com sucesso!");
                    } else {
                        System.out.println("\n❌ Manual não encontrado!");
                    }
                }
            } else {
                System.out.println("\nOperação cancelada.");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Erro ao excluir manual: " + e.getMessage());
        }
    }

    private static void excluirManualEN(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Delete Manual ===");
            System.out.print("Enter the title of the manual you want to delete: ");
            String title = scanner.nextLine();

            System.out.print("\nAre you sure you want to delete this manual? (Y/N): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("Y")) {
                String sql = "DELETE FROM manuais WHERE titulo = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, title);
                    int rowsAffected = stmt.executeUpdate();
                    
                    if (rowsAffected > 0) {
                        System.out.println("\n✅ Manual deleted successfully!");
                    } else {
                        System.out.println("\n❌ Manual not found!");
                    }
                }
            } else {
                System.out.println("\nOperation cancelled.");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Error deleting manual: " + e.getMessage());
        }
    }

    private static void excluirManualDE(Scanner scanner) {
        try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Handbuch löschen ===");
            System.out.print("Geben Sie den Titel des Handbuchs ein, das Sie löschen möchten: ");
            String titel = scanner.nextLine();

            System.out.print("\nSind Sie sicher, dass Sie dieses Handbuch löschen möchten? (J/N): ");
            String bestaetigung = scanner.nextLine();

            if (bestaetigung.equalsIgnoreCase("J")) {
                String sql = "DELETE FROM manuais WHERE titulo = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, titel);
                    int betroffeneZeilen = stmt.executeUpdate();
                    
                    if (betroffeneZeilen > 0) {
                        System.out.println("\n✅ Handbuch erfolgreich gelöscht!");
                    } else {
                        System.out.println("\n❌ Handbuch nicht gefunden!");
                    }
                }
            } else {
                System.out.println("\nVorgang abgebrochen.");
            }
        } catch (SQLException e) {
            System.out.println("\n❌ Fehler beim Löschen des Handbuchs: " + e.getMessage());
        }
    }
} 