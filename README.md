# 💡 WEGOne - Sistema de Cadastro e Consulta de Orientações WEG

## 🎯 Objetivo

O **WEGOne** é o sistema de Cadastro e Consulta de Orientações WEG desenvolvido como projeto final da unidade curricular de Lógica de Programação, em parceria com as demais UCs Metodologias Ágeis e Versionamento, Inglês e Banco de Dados. O sistema foi idealizado para integrar conhecimentos técnicos e práticos adquiridos ao longo do curso, promovendo uma experiência multidisciplinar. Cada UC contribuiu com aspectos essenciais: a lógica estruturou o funcionamento base, metodologias ágeis guiaram o processo organizacional e colaborativo, o inglês garantiu a internacionalização do conteúdo, e o banco de dados irá futuramente sustentar a estrutura de armazenamento das informações. Esse alinhamento permitiu a construção de um sistema robusto, funcional e voltado à realidade empresarial.

## 🛠️ Funcionalidades

- **Escolha de Idioma**: Português, Inglês ou Alemão
- **Cadastro de Orientações** com título, tipo, código e conteúdo multilíngue
- **Pesquisa** por título ou código
- **Edição** de orientações existentes
- **Exclusão** de orientações
- **Logout** do sistema

## 📂 Tipos de Orientações

| Tipo | Descrição | Exemplo Detalhado |
|------|-----------|-------------------|
| 📘 Manual de Operação | Instruções detalhadas para uso correto de máquinas e sistemas. | **Motor a Vapor MV-200:** O MV-200 é usado para gerar força mecânica através de vapor. Este manual cobre os procedimentos de inicialização, controle de válvulas, regulagem de temperatura e desligamento seguro, além de diagramas técnicos do sistema. |
| 🛡️ Procedimento de Segurança | Passo a passo para minimizar riscos durante atividades críticas. | **Trabalhos em Altura:** Orientações para uso correto de EPIs, checklist diário de cordas e cintos, protocolo de ancoragem, inspeção de escadas e sinalização de áreas elevadas. Acompanham normas NR-35 e fluxograma de resgate. |
| 🛠️ Manutenção e Reparos | Rotinas técnicas para prevenir falhas e prolongar a vida útil dos equipamentos. | **Ar Condicionado Central:** Guia completo para limpeza dos dutos, verificação de níveis de fluido refrigerante, calibração do termostato e substituição de componentes desgastados. Inclui plano trimestral de manutenção preventiva. |
| 🧪 Teste Diagnóstico | Procedimentos para avaliação de desempenho e detecção de falhas. | **Sistema de Freios de Caminhão:** Instruções para aferição da pressão pneumática, teste prático de frenagem, leitura dos sensores do ABS, medição da espessura de lonas e análise de desgaste nos tambores de freio. |
| 📋 Manual de Conduta Setorial | Regras internas e boas práticas por setor ou atividade. | **Operadores de Empilhadeiras:** Procedimentos diários de verificação antes da operação, normas de circulação interna, limites de carga, gestão de velocidade, zonas de segurança, manuseio de pallets e desligamento pós-expediente. |

## 📘 Como a UC Metodologias Ágeis e Versionamento Impactou no projeto?

A UC de Metodologias Ágeis e Versionamento teve um impacto significativo no desenvolvimento do projeto, principalmente pela adoção do **Scrum**. A metodologia, embora desafiadora inicialmente, nos proporcionou valiosas oportunidades de aprendizado, permitindo identificar e compreender nossas dificuldades com mais clareza. O **Scrum** facilitou nossa organização, proporcionando uma estrutura eficiente e colaborativa para o progresso das atividades.

O uso do Jira foi crucial para mantermos o foco e direcionamento, garantindo que nossas tarefas estivessem alinhadas aos objetivos do projeto. Em relação ao versionamento, o GitHub apresentou desafios, mas também foi fundamental para a integração do código e acompanhamento da evolução do projeto.

Por fim, as ferramentas de desenvolvimento, como Java, Visual Studio Code e IntelliJ, foram essenciais para a codificação, com o Visual Studio Code e o IntelliJ ampliando nossa capacidade de desenvolvimento e otimizando o processo.

## ⚙️ Especificações Técnicas

| Categoria | Detalhes |
|-----------|----------|
| 💻 Linguagem | Java SE 22 |
| 🗄️ Banco de Dados | MySQL (hospedado na Railway) |
| 🔁 Estruturas de Controle | `if-else`, `do-while`, `for` |
| 🛠️ IDEs Sugeridas | Eclipse, VS Code, IntelliJ |

Todos os requisitos e funcionalidades implementadas neste sistema partiram das restrições impostas pela disciplina de Lógica de Programação. Durante o desenvolvimento inicial, foi utilizado arrays unidimensionais conforme o plano de ensino do curso. Posteriormente, essa estrutura foi substituída por um banco de dados MySQL hospedado na plataforma Railway, permitindo um armazenamento mais robusto e escalável das informações. 