<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <title>📘 WEGOne - Sistema de Cadastro e Consulta</title>
  <style>
    body {
      background-color: #0d1117;
      color: #c9d1d9;
      font-family: 'Segoe UI', sans-serif;
      padding: 30px;
      line-height: 1.6;
    }

    h1, h2, h3 {
      color: #58a6ff;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin: 20px 0;
      background-color: #161b22;
    }

    th, td {
      padding: 12px;
      text-align: left;
      border: 1px solid #30363d;
    }

    th {
      background-color: #21262d;
      color: #79c0ff;
    }

    .section {
      margin-bottom: 40px;
    }

    ul {
      list-style: "✅ ";
      padding-left: 20px;
    }

    code {
      background-color: #21262d;
      padding: 2px 6px;
      border-radius: 4px;
      color: #f0f6fc;
    }

    strong.scrum {
      font-weight: bold;
    }
  </style>
</head>
<body>

  <h1>💡 WEGOne - Sistema de Cadastro e Consulta de Orientações WEG</h1>

  <div class="section">
    <h2>🎯 Objetivo</h2>
    <p>O <strong>WEGOne</strong> é o sistema de Cadastro e Consulta de Orientações WEG desenvolvido como projeto final da unidade curricular de Lógica de Programação, em parceria com as demais UCs Metodologias Ágeis e Versionamento, Inglês e Banco de Dados. O sistema foi idealizado para integrar conhecimentos técnicos e práticos adquiridos ao longo do curso, promovendo uma experiência multidisciplinar. Cada UC contribuiu com aspectos essenciais: a lógica estruturou o funcionamento base, metodologias ágeis guiaram o processo organizacional e colaborativo, o inglês garantiu a internacionalização do conteúdo, e o banco de dados irá futuramente sustentar a estrutura de armazenamento das informações. Esse alinhamento permitiu a construção de um sistema robusto, funcional e voltado à realidade empresarial.</p>
  </div>

  <div class="section">
    <h2>🛠️ Funcionalidades</h2>
    <ul>
      <li><strong>Escolha de Idioma</strong>: Português, Inglês ou Alemão</li>
      <li><strong>Cadastro de Orientações</strong> com título, tipo, código e conteúdo multilíngue</li>
      <li><strong>Pesquisa</strong> por título ou código</li>
      <li><strong>Edição</strong> de orientações existentes</li>
      <li><strong>Exclusão</strong> de orientações</li>
      <li><strong>Logout</strong> do sistema</li>
    </ul>
  </div>

  <div class="section">
    <h2>📂 Tipos de Orientações</h2>
    <table>
      <thead>
        <tr>
          <th>Tipo</th>
          <th>Descrição</th>
          <th>Exemplo Detalhado</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>📘 Manual de Operação</td>
          <td>Instruções detalhadas para uso correto de máquinas e sistemas.</td>
          <td>
            <strong>Motor a Vapor MV-200:</strong><br>
            O MV-200 é usado para gerar força mecânica através de vapor. Este manual cobre os procedimentos de inicialização, controle de válvulas, regulagem de temperatura e desligamento seguro, além de diagramas técnicos do sistema.
          </td>
        </tr>
        <tr>
          <td>🛡️ Procedimento de Segurança</td>
          <td>Passo a passo para minimizar riscos durante atividades críticas.</td>
          <td>
            <strong>Trabalhos em Altura:</strong><br>
            Orientações para uso correto de EPIs, checklist diário de cordas e cintos, protocolo de ancoragem, inspeção de escadas e sinalização de áreas elevadas. Acompanham normas NR-35 e fluxograma de resgate.
          </td>
        </tr>
        <tr>
          <td>🛠️ Manutenção e Reparos</td>
          <td>Rotinas técnicas para prevenir falhas e prolongar a vida útil dos equipamentos.</td>
          <td>
            <strong>Ar Condicionado Central:</strong><br>
            Guia completo para limpeza dos dutos, verificação de níveis de fluido refrigerante, calibração do termostato e substituição de componentes desgastados. Inclui plano trimestral de manutenção preventiva.
          </td>
        </tr>
        <tr>
          <td>🧪 Teste Diagnóstico</td>
          <td>Procedimentos para avaliação de desempenho e detecção de falhas.</td>
          <td>
            <strong>Sistema de Freios de Caminhão:</strong><br>
            Instruções para aferição da pressão pneumática, teste prático de frenagem, leitura dos sensores do ABS, medição da espessura de lonas e análise de desgaste nos tambores de freio.
          </td>
        </tr>
        <tr>
          <td>📋 Manual de Conduta Setorial</td>
          <td>Regras internas e boas práticas por setor ou atividade.</td>
          <td>
            <strong>Operadores de Empilhadeiras:</strong><br>
            Procedimentos diários de verificação antes da operação, normas de circulação interna, limites de carga, gestão de velocidade, zonas de segurança, manuseio de pallets e desligamento pós-expediente.
          </td>
        </tr>
      </tbody>
    </table>
  </div>

  <div class="section">
    <h2>📘 Como a UC Metodologias Ágeis e Versionamento Impactou no projeto?</h2>
    <p>
      A UC de Metodologias Ágeis e Versionamento teve um impacto significativo no desenvolvimento do projeto, principalmente pela adoção do <strong class="scrum">Scrum</strong>. A metodologia, embora desafiadora inicialmente, nos proporcionou valiosas oportunidades de aprendizado, permitindo identificar e compreender nossas dificuldades com mais clareza. O <strong class="scrum">Scrum</strong> facilitou nossa organização, proporcionando uma estrutura eficiente e colaborativa para o progresso das atividades.
    </p>
    <p>
      O uso do Jira foi crucial para mantermos o foco e direcionamento, garantindo que nossas tarefas estivessem alinhadas aos objetivos do projeto. Em relação ao versionamento, o GitHub apresentou desafios, mas também foi fundamental para a integração do código e acompanhamento da evolução do projeto.
    </p>
    <p>
      Por fim, as ferramentas de desenvolvimento, como Java, Visual Studio Code e IntelliJ, foram essenciais para a codificação, com o Visual Studio Code e o IntelliJ ampliando nossa capacidade de desenvolvimento e otimizando o processo.
    </p>
  </div>

  <div class="section">
    <h2>⚙️ Especificações Técnicas</h2>
    <table>
      <tr>
        <th>Categoria</th>
        <th>Detalhes</th>
      </tr>
      <tr>
        <td>💻 Linguagem</td>
        <td>Java SE 22</td>
      </tr>
      <tr>
        <td>🧠 Estrutura de Dados</td>
        <td>Arrays Unidimensionais</td>
      </tr>
      <tr>
        <td>🔁 Estruturas de Controle</td>
        <td><code>if-else</code>, <code>do-while</code>, <code>for</code></td>
      </tr>
      <tr>
        <td>🛠️ IDEs Sugeridas</td>
        <td>Eclipse, VS Code, IntelliJ</td>
      </tr>
    </table>

    <p><em>
      Todos os requisitos e funcionalidades implementadas neste sistema partiram das restrições impostas pela disciplina de Lógica de Programação. Durante o desenvolvimento, foi necessário utilizar exclusivamente as estruturas de controle e funções abordadas nas aulas, conforme determinado pelo plano de ensino do curso.
    </em></p>
  </div>

</body>
</html>
