GCC198 - PLP - Projeto Prático
Sistema de Gerenciamento de Informação

Observações Iniciais

O objetivo deste trabalho é implementar um sistema de cadastro (com recursos para busca e alteração de dados) usando conceitos dos diversos paradigmas de programação abordados na disciplina. O projeto representa um total de 20 pontos e deverá ser realizado em equipe com três a quatro alunos. A avaliação do projeto não será feita apenas sobre o código entregue mas através de uma entrevista a ser feita com todos os membros do grupo. A entrevista é obrigatória e deverá contar com todos os membros do grupo. Aqueles que não apresentarem terão a nota do trabalho zerada. O projeto está dividido em etapas, cada uma com avaliação independente. As etapas e suas respectivas pontuações são:

Definição dos grupos e tema ( 5% )
Identificação e modelagem inicial das informações a serem gerenciadas ( 10% )
Entrega de um protótipo funcional e do diagrama de classes ( 15% )
Entrevista com os membros do grupo ( 35% )
Análise do código entregue ( 35% )

Os temas disponíveis para cadastro são apresentados na Seção 4 e, na sequência, tem-se a descrição de cada etapa. 

Características do Trabalho 

O sistema deve permitir, no mínimo, as seguintes operações: 

Cadastrar dados: cadastra os atributos necessários dos objetos.
Listar dados cadastrados: exibe pelo menos dois atributos mais representativos do objeto principal cadastrado.
Remover dados: a partir de uma chave (valor de um atributo), remove um objeto.
Buscar dados: a partir de uma chave (valor de um atributo), exibe os demais atributos de um objeto.
Salvar os dados em um arquivo informado pelo usuário*
Recuperar os dados salvos em um arquivo informado pelo usuário*



Para atender a essas operações o sistema deve possuir:

A classe principal que terá toda a interação com o usuário responsável pela exibição de menus, leitura e escrita de dados na tela. Nenhuma outra classe pode ler dados na entrada padrão ou escrever na saída padrão. Aqueles que optarem por uma interface via terminal, devem agrupar todas operações em uma única classe. Os que optarem por interfaces gráficas, podem fazer uso de mais de uma única classe.
Uma classe responsável pela gestão de cadastro dos dados a serem tratados. Obedecendo a separação de interesses entre interface gráfica e controladores.
Classes que representam os objetos que são cadastrados pelo sistema.
Pelo menos uma classe cujos objetos representam um dos atributos dos objetos cadastrados.


*As operações de salvar e recuperar devem ser executadas somente quando solicitadas pelo usuário, i.e., as operações devem ser feitas em memória principal e salvas quando solicitado. Preferencialmente em arquivo de texto em formato definido pelos membros do grupo.

Instruções gerais para desenvolvimento e entrega do projeto:

Seguem as instruções e recomendações gerais para o desenvolvimento do projeto prático: 

O projeto final deve ser implementado em Java, usando técnicas e conceitos de programação orientada a objetos. Além disso, cada grupo deverá aplicar um estilo de programação funcional em parte do projeto (e.g., em uma classe utilitária).
A aplicação dos conceitos principais serão pontos a serem considerados para a avaliação (e.g., uso de herança, polimorfismo, sobrecarga, etc).
Boa organização e indentação do arquivo contam pontos na nota final. Má organização e indentação retiram pontos. Vocês tem liberdade para escolherem o estilo de indentação que julgarem mais adequado, mas respeitem o estilo escolhido. Recomendamos o uso de espaços para indentação, mas você pode usar tabulações, desde que não misture os dois tipos.  
Uma implementação incluem fatores como:
Boa interface, que seja prática e intuitiva;
Boa organização do código, com uso adequado de comentários;
Uso de recursos de programação, como controle de exceção, estruturas de dados adequadas, etc. 
Implementação de recursos não solicitados, que mostrem esforço da equipe;
Etc. 

Temas disponíveis

A seguir segue a lista de temas disponíveis para escolha. Tais temas se referem à contextos onde o sistema será inserido e responsável pelo cadastro das principais entidades. Dentro do tema escolhido, os grupos devem focar nas principais entidades envolvidas no problema, mas também podem incluir entidades de suporte e/ou adicionais. Por exemplo, o propósito principal de uma instituição de ensino é a formação adequada de seus alunos. Assim, um projeto prático neste tema, deve primeiro contextualizar o trabalho (e.g., universidade, escola de ensino médio, escola de línguas, etc.) e em seguida identificar as principais entidades presentes no contexto definido (e.g., em uma universidade destacam-se professor, aluno, cursos, departamentos e disciplinas). Outras entidades também podem ser incluídas desde que as mesmas possuam um papel bem definido no trabalho (e.g., chefias, secretários, prédios, etc.).

Lista de temas disponíveis:

Museu
Zoologico
Série de TV
Cinema
Mecânica Automotiva
Concessionária de Veículos
Salão de Beleza
Banca de Jornal
Serviços de Transporte
Tabacaria
Agência de Turismo
Empresa de Telemarketing
Floricultura
Galeria de Arte
Restaurante
Instituição Financeira
Seguradora
Casa Lotérica

Da definição dos grupos e temas (Etapa 1)

Nesta etapa todos os alunos regularmente matriculados na disciplina devem obrigatoriamente formar grupos, ou equipes, de no mínimo três alunos e no máximo quatro alunos que irão, em grupo, desenvolver o projeto prático da disciplina. Além da formação dos grupos, os membros devem selecionar um dos temas listados na seção anterior que estejam disponíveis. Para ajudar na escolha e acompanhamento dos temas e grupos, o professor da disciplina disponibilizará uma página na sala da disciplina do Campus Virtual.

Observações: Os alunos que não definirem os grupos e temas dentro do prazo não terão a nota desta etapa atribuída à nota final do trabalho. Além disso, alterações nos temas e membros dos grupos após essa etapa serão permitidas somente após consulta e anuência do professor.

Data de Entrega: 31 de Março de 2019


Da identificação e modelagem das informações (Etapa 2)

Esta etapa tem por objetivo a identificação dos principais elementos e comportamentos que serão considerados no sistema a ser desenvolvido. Nesta etapa cada grupo deverá submeter um documento de texto de no mínimo 2 (duas) páginas e máximo de 5 (cinco) páginas detalhando a proposta do projeto e contendo uma modelagem inicial das informações a serem gerenciadas pelo sistema. Para tanto, é sugerida a seguinte estrutura a ser utilizada no documento:

Introdução do trabalho, focando principalmente no contexto onde o sistema está inserido. Além disso, deve-se deixar claro quais serão os principais usuários e o ambiente onde o sistema estará disponível;
Entidades cujas informações serão gerenciadas, descrevendo brevemente o propósito, características, comportamentos e relacionamentos com outras entidades do problema;
Outras possíveis classes de suporte que serão utilizadas (e.g., controladores e utilitários);
Conclusão do documento contendo os próximos passos e desafios do projeto

Observações: A simples entrega do documento não garante a totalidade dos pontos atribuídos a esta etapa. O mesmo será analisado pelo professor que irá analisar as decisões tomadas, plausibilidade e profundidade da proposta do sistema.


Data de Entrega: 14 de Abril de 2019


Da entrega do protótipo do sistema (Etapa 3)

Nesta etapa, os grupos deverão enviar um protótipo funcional do sistema para validação da proposta. Entende-se como funcional, um sistema que já contenha as bases necessárias para o desenvolvimento do sistema por completo. Especificamente, serão avaliados os seguintes aspectos:

Modelagem e implementação das entidades a serem gerenciadas no sistema
Implementação inicial do controlador principal
Interface de comunicação básica com o usuário

Adicionalmente, cada grupo deverá encaminhar um simples relatório, em formato livre, contendo: (i) que já foi feito feito, (ii) limitações e bugs atuais, e (iii) próximos passos até a entrega final.



Observações: Trabalhos que forem entregues com problemas de compilação serão considerados como não entregue. Contudo, a presença de bugs ou funções com problemas serão desconsiderados desde que estes sejam reportados no documento que acompanha a entrega.

Data de Entrega: 05 de Maio de 2019 (Adiado)
Data de Entrega: 12 de Maio de 2019

Da entrega do sistema e entrevista (Etapas 4 e 5)

A entrega final do projeto prático será feita no Campus Virtual da disciplina em uma atividade criada para tal propósito. Após a entrega, o professor da disciplina avaliará a implementação entregue seguindo critérios claros e definidos anteriormente. A entrega e a entrevista com os membros dos grupos serão realizadas nas datas previstas abaixo. Seguem observações importantes quanto à participação na apresentação do trabalho:

A participação na entrevista é obrigatória para todos os grupos, aqueles que não a fizerem terão a nota do trabalho prático zerada!
Se algum dos membros do grupo não estiver presente no dia da entrevista, a nota do mesmo também será zerada. Em caso de aprovação de recuperação de trabalhos escolares junto à PRG, será agendada uma nova data para apresentação individual.

Em relação à entrega dos arquivos do sistema, seguem algumas observações:

O arquivo entregue deve conter todos os arquivos fonte do sistema. Se desejar, você pode entregar um arquivo contendo o projeto completo da IDE utilizada durante o desenvolvimento e também um arquivo .jar gerado a partir do código;
Todos os projetos serão compilados e executados manualmente em um ambiente Unix com JDK 1.8 instalado. Portanto, antes da entrega verifiquem, se possível, em um dos computadores disponíveis no departamento, se você consegue compilar e executar o sistema com os seguintes comandos no diretório raiz do projeto:

> rm -rf bin && mkdir bin && find . -name "*.java" | xargs javac -d bin
> java -cp bin <classe_principal>

Se o projeto necessitar de comandos de compilação ou execução adicionais (e.g., cópia de imagens ou bibliotecas externas) vocês devem indicar claramente os comandos necessários para compilação e execução correta do sistema no relatório de entrega;



Data da Entrega: 26 de Maio de 2019
Data da Entrevista: Entre os dias 3 e 7 de Junho de 2019
Data da Entrega: 16 de Junho de 2019
Data da Entrevista: Entre os dias 20 e 28 de Junho de 2019






