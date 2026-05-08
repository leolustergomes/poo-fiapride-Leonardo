#Projeto FiapRide - Leonardo Luster Gomes

##Informações do aluno

-Nome: Leonardo Luster Gomes

-RM: 564448

-Turma: 2CCPG

-Curso: Ciências da Computação 

-GitHub: @leolustergomes

🎯 Descrição do Projeto
Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, 
onde desenvolvemos o sistema "FiapRide" (aplicativo de mobilidade urbana).

✅ Checklist de Implementação
[OK] Aula 1 - Classes e Objetos

[OK] Aula 2 - Métodos

[OK] Aula 3 - Encapsulamento

[OK] Aula 4 - Construtores

[OK] Aula 5 - Associação

[OK] Aula 6 - Herança

[OK] Aula 7 - Polimorfismo

[OK] Aula 8 - Classes Abstratas

[OK] Aula 9 - Interfaces

💡 Perguntas de Reflexão
### Aula 1 - Classes e Objetos
Pergunta: Por que precisamos criar uma classe 'Passageiro'? Não seria mais fácil apenas criar variáveis soltas no main, como String nomeAna = "Ana" e double saldoAna = 50.0?

Pense: E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

Sua Resposta:
[A utilização da classe Passageiro funciona como um molde que 
permite agrupar atributos e comportamentos em uma única estrutura,
Isso garante a escalabilidade do sistema, 
permitindo gerenciar milhões de usuários de forma organizada,
o que ajuda na manutenção do código]

### Aula 2 - Métodos
Pergunta: Se nós podemos simplesmente fazer passageiro.saldo = passageiro.saldo + 100 diretamente no código principal, por que dá tanto trabalho criar um método específico chamado adicionarSaldo(valor) para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

Sua Resposta:
[Usar um método como adicionarSaldo serve para criar uma regra de segurança na hora de mexer no dinheiro. 
Se todo programador pudesse mudar esta variavél, alguém poderia colocar um valor negativo o que acabaria atrapalhando na hora da conta. 
Este método centraliza essa ação, permitindo que a gente valide se o valor está correto antes de aceitar. 
Isso protege o sistema de falhas e deixa o código muito mais organizado e seguro.]

### Aula 3 - Encapsulamento
Pergunta: No nosso código, os atributos são private, mas os métodos getSaldo() e getNome() são public. Por que é seguro deixar o 'get' público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?

Sua Resposta:
[Deixar o atributo público é perigoso porque qualquer um pode alterar o dado original sem autorização,
como se alguém rasurasse seu documento, podendo adicionar por exemplo saldo na própria conta. 
O método get funciona como uma cópia: você mostra a informação, mas ninguém consegue mexer no que está guardado lá dentro. 
Isso garante que os dados internos da classe fiquem protegidos contra mudanças indevidas. 
É uma camada de segurança essencial para manter a integridade das informações dos usuários do app.]

### Aula 4 - Construtores
Pergunta: Na nossa classe 'Veiculo', nós tomamos duas decisões arquitetónicas muito importantes:

Nós não criamos o método setModelo().

O setPlaca() foi criado como privado, e criamos um método público chamado atualizarPlaca() para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran".

Sua Resposta:
[Gerar getters e setters para tudo é um erro porque algumas coisas no mundo real não mudam, 
como o modelo de um carro depois de fabricado ou mesmo um modelo de uma moto. Não ter o setModelo impede que o sistema altere dados que deveriam ser fixos, 
evitando fraudes. Já a placa privada com um método de atualizar simula um processo controlado já que cada placa é única. 
Essas decisões protegem o sistema de erros de lógica e mantêm o código mais próximo da realidade.]

### Aula 5 - Associação
Pergunta: No construtor da 'Viagem', nós exigimos o objeto inteiro (Passageiro solicitante). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (String nomeAna Silva)? Ela consegue mexer no dinheiro dela?

Sua Resposta:
[Passar o objeto Passageiro inteiro é melhor porque assim a Viagem consegue interagir com o mesmo, como por exemplo cobrar o valor da corrida. 
Se fossemos passar apenas o nome em texto, seria impossível mexer no saldo ou acessar outras funções importantes do usuário. 
Com o objeto completo, as classes se comunicam e o sistema consegue realizar ações reais em vez de apenas mostrar nomes. 
Isso deixa o aplicativo funcional e pronto para processar as viagens corretamente.]

### Aula 6 - Herança
Pergunta: No nosso código, a mãe 'Veiculo' possui os atributos 'placa' e 'modelo' como private. Quando o 'Carro' herda de 'Veiculo', ele recebe esses atributos, mas o código dentro de 'Carro' NÃO consegue fazer this.placa = "ABC". Ele é obrigado a usar o super() ou o setPlaca().

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

Sua Resposta:
[O Java não deixa a classe filha mexer direto no que é privado da mãe para respeitar o encapsulamento e a segurança. 
Isso obriga a classe filha a usar os caminhos oficiais, como os métodos da mãe, 
garantindo que nenhuma regra de validação seja pulada. 
Se a filha pudesse alterar tudo livremente, a proteção nas quais criamos não serviria de nada. 
Assim, mantemos a hierarquia organizada e evitamos que erros em uma classe nova estraguem o que já funciona.]

### Aula 7 - Polimorfismo
Pergunta: No nosso loop for (Veiculo veiculo : frota), a variável veiculo é do tipo genérico 'Veiculo'. Se esquecêssemos de criar o método calcularAutonomia() lá na classe mãe 'Veiculo', nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do 'Carro' e da 'Moto'? Por que o contrato precisa existir na base da hierarquia?

Sua Resposta:
[O contrato (método) precisa estar na classe mãe para que o sistema saiba que qualquer veículo sabe realizar aquela ação. 
Sem isso, na hora de fazer um loop, o computador não iria conseguir "enxergar" a função dentro de um carro ou de uma moto de forma genérica. 
Ter essa base na hierarquia permite tratar tipos diferentes do mesmo jeito, o que facilita muito o trabalho. 
Isso deixa o código flexível para aceitar novos tipos de veículos no futuro sem complicações, o que ajuda na manutenção e ajuda no trabalho dos programadores.]

### Aula 8 - Classes Abstratas
Pergunta: Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veiculo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou 'um veículo' genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que 'Veiculo' é abstract? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar abstract, qual o risco que corremos? Alguém pode criar new Veiculo() e quebrar a lógica do nosso sistema?

Sua Resposta:
[Usar abstract é importante porque, na vida real, ninguém compra um "veículo" genérico, mas sim um carro ou uma moto específica. 
No código, isso impede que alguém crie um objeto "fantasma" que não deveria existir e acabe quebrando a lógica do programa. 
Forçar o uso de tipos específicos garante que o sistema sempre tenha as informações necessárias para funcionar. 
É um jeito de avisar ao Java que aquela classe serve apenas como um molde e nunca deve ser usada sozinha.]

### Aula 9 - Interfaces
Pergunta: Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se 'CarroEletrico' pudesse herdar de 'Veiculo' E de 'Bateria' ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado ligar()? Como as interfaces resolvem esse problema?

Sua Resposta:
[O Java proíbe a herança múltipla para evitar confusão caso duas classes mães tenham métodos iguais, 
o que deixaria o sistema sem saber qual usar. As interfaces resolvem isso porque elas não trazem a lógica pronta, 
apenas dizem o que deve ser feito através de contratos. Assim, a classe filha pode assinar vários desses contratos e decidir ela mesma como executar cada função, 
sem conflitos de código. Isso permite que um carro seja, ao mesmo tempo, um veículo e um item eletrônico de forma segura e muito bem organizada.]

🚀 Desafios Técnicos Implementados
### Desafio Pessoal (Seu Projeto)
"Qual foi o domínio que você escolheu para seu projeto pessoal?"
[O dominio no qual eu escolhi foi o do PS5.]

"Quais classes você criou?"
[Criei as classes:
-Playstation_5
-PS5Digital
-PS5MidiaFisica
-Controle
-Interface]

"Qual foi o maior desafio técnico que você enfrentou?"
[O maior desafio técnico durante o desenvolvimento do projeto foi entender e aplicar os novos conceitos que foram apresentados ao longo das aulas. 
No começo, foi bem difícil compreender como cada conceito, ainda mais por conta que nunca tive aulas de java;
Tive dificuldades nas primeiras aulas na interação com o github, por conta que estava acompanhando as aulas porém não conseguia subir os arquivos no jeito solicitado;
Porém nas ultimas aulas aprendi pelo YT como subir os arquivos pro github pelo GitBash e depois pelo CMD
A parte mais complicada foi fazer a interação entre as classes dentro do projeto, especialmente quando novas classes eram criadas. 
Muitas vezes eu precisava pensar em como elas se conectavam e qual era a melhor forma de organizar os relacionamentos entre elas. 
Também tive dificuldade para entender quando usar herança, associação ou interfaces em determinadas situações. 
Outro desafio foi adaptar os construtores e métodos para que tudo funcionasse corretamente entre as subclasses e a classe principal. 
Com o tempo e a prática, fui conseguindo entender melhor a lógica da programação e percebi como esses conceitos ajudam a deixar o sistema mais organizado e mais próximo de situações do mundo real.

"O que você aprendeu nestas 9 aulas?"
[Aprendi os Conceitos de :
-Classes e Objetos: Aprendi a criar classes para representar objetos do mundo real e instanciar objetos a partir delas
-Atributos e Métodos: Entendi como utilizar atributos para armazenar informações de um objeto e métodos para representar ações e funcionalidades.
-Encapsulamento: Aprendi a proteger os dados utilizando modificadores de acesso como private e controlando o acesso através de getters e setters.
-Validação de Dados: Compreendi a importância de validar informações dentro dos setters e métodos para evitar estados inválidos no sistema.
-Construtores: Aprendi a utilizar construtores para obrigar que objetos sejam criados já com informações essenciais.
-Associação entre Classes: Entendi como relacionar objetos diferentes dentro do sistema, como o Playstation_5 possuindo um Controle.
-Herança: Aprendi a reutilizar atributos e métodos através de subclasses utilizando extends, criando especializações de uma classe principal.
-Polimorfismo: Compreendi como diferentes classes podem responder de formas diferentes ao mesmo método através de sobrescrita (@Override).
-Classes Abstratas: Aprendi a criar classes que servem apenas como base para outras classes, impedindo a criação de objetos genéricos.
-Interfaces: Entendi como criar contratos de comportamento utilizando interfaces e implementá-las em diferentes classes.
-Sobrescrita de Métodos: Aprendi a redefinir métodos herdados para adaptar comportamentos específicos em subclasses.
-Organização em Pacotes: Compreendi a importância de organizar o projeto em packages para manter o código mais estruturado e organizado.]

"Qual conceito foi mais difícil de entender?"
[Para mim o conceito mais difícil de aprender ao longo das aulas foi o conceito de classes abstratas,
por conta que para mim este conceito não fazia sentido nenhum, porém na hora que eu estava fazendo meu projeto, 
e dando uma olhada em suas aulas consegui entender este conceito ex: um veículo pode ser qualquer um como um carro ou moto,
além disso mesmo sendo um carro ou moto ainda é um modelo específico tendo marca e modelo; Essa classe serve principalmete,
para que as classes filhas sigam as mesmas regras e implementem os mesmos métodos obrigatórios

"O que você melhoraria no seu projeto se pudesse refazer?"
[Se eu fosse refazer meu projeto, eu iria melhorar a organização das classes e adicionaria funcionalidades mais complexas,
como por exemplo verificar armazenamento disponível, mostrar a lista de jogos instalados e cadastrar novos jogos.]
