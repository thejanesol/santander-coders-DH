# Java - Write Once, run anywhere 

## Fundamentos da programação, Loops e Arrays
* Variáveis e operadores
* Estruturas de condição, operadores lógicos
* Vetores e arrays
* Estruturas de repetição
* Funções
* Testes e debugs

A diferença entre as linguagens de baixo nível e alto nível é o seu nível de abstração. As de baixo nível possuem menor nível de abstração, sendo abstração a "habilidade de concentrar nos aspectos essenciais de um contexto qualquer, ignorando características menos importantes ou acidentais."

### Padrão de programa em Java:
public class Main {
    public static void main (String args[]) {
    }
}

Static = existe antes mesmo de ser instanciado e existe durante toda a execução do programa. (o método main precisa ser necessariamente estático)

Convenções: https://www.devmedia.com.br/convencoes-de-codigo-java/23871

### Variáveis e tipos de dados
Tipos primitivos
* int - números inteiros
* long - números inteiros grandes
* boolean - true or false
* float - números decimais, ocupa somente 32 bits 
* double - números decimais, pega o dobro da memória do float (ocupa 2 casas decimais e 64 bits)
* char - caracteres

Tipos nativos (classes)
* Integer
* Float
* Double
* Long
* BigInteger
* Boolean
* String - cadeia de caracteres, não existe como tipo primitivo. 

### Arrays e vetores
São conjunto de valores de **mesmo tipo** que possuem nomes e posições que podem ser acessados através de um índice.\
Exemplo: 
+ int conjunto[] = {2, 3, 3, 4};
Aqui os valores são definidos logo na criação do array do tipo inteiro.

+ int conjunto[] = new int [6]; 
Nesse caso, é criado um espaço na memória com **6 posições** e valores aleatórios, pois os valores não foram passados.

O array é estático e não pode ter seu tamanho ou valores modificados.

Arrays.sort(array, inicio, final) - ordena array em ordem crescente.

O list é dinâmico e nele podem ser adicionados ou removidos elementos.
+ List <String(classe)> lista = new ArrayList<>();
+ lista.add("e");
+ lista.remove(1); -remoção de um elemento pelo seu índice.

### Array list
ArrayList <*String || Classe*> *nomeDaLista* = new ArrayList <> ();\
nomeDaLista.add(*Classe*);\
nomeDaLista.add(*Classe*);\
System.out.println(nomeDaLista); - imprime elementos da lista

#### Input de valores
+ Scanner scan = new Scanner(System.in);\
usado com o import java.util.Scanner;
+ String nome = scan.nextLine();
+ int idade = scan.nextInt();

### Random
Random r = new Random();\
r.nextInt(limite)

### Funções - MÉTODOS EM JAVA (OO)
São Blocos de código que permitem estruturar e reutilizar o código. Organizam o código e permitem que
um bloco de comandos seja executado em qualquer momento da linha de execução.
* **void** - permite fazer funções que não retornam nada e funções que não têm parâmetros!

### Testes e debugs
Serve para verificar funcionamento do código e identificar erros a serem corrigidos. 
* Breakpoint - quebra o código em linhas e para a execução em determinado ponto para análise. 
* System.out.println()
* Teste de mesa - verificação do valor das variáveis a cada instrução.

### Programação orientada a objetos
- Surgiu nos anos 60 através da linguagem Simula
- Alan Kay considerado um dos criadores do termo
- Objetivo: facilitar o desenvolvimento de software e representar o mundo real.

### Pilates do POO
* Encapsulamento - capacidade de esconder detalhes da implementação do objeto. (atributos privados/escondidos - caixa preta)

* Herança - possibilidade de replicar caracteristicas de um objeto para outro (reutilização dos códigos). Os métodos (funções) e atributos (propriedades) podem ser extendidos de um objeto pai para um objeto filho.

* Polimorfismo - capacidade de um objeto se passar por outro em determinada circunstância.

* Abstração - representar um objeto de forma abstrada que seja obrigatoriamente herdado de outras classes. 

## Principios SOLID
Principio da programação orientada a objetos visando a alta coesão. 

* Single responsability principle - Princípio da Responsabilidade Única
Uma classe deve ter uma única resposabilidade/método/processo.

* Open closed principle - Princípio Aberto Fechado
Você deve estender um comportamento de classe sem modificá-lo.

* Liskov substitution principle
Classes derivadas devem ser substituíveis por suas classes base.

* Interface segregation principle - Princípio da Segregação da Interface
É melhor criar interfaces mais específicas ao invés de termos uma única genérica.

* Dependency inversion principle - Principio da inversão de dependencias
Dependa da abstração e não de implementações.

## Código fonte =/= código executado 

Java (código fonte) -> compilador (JavaC) -> byteCode (pode ser lido de qualquer sistema/wora) -> JVM

JDK: ambiente desenvolvedor (Java Developpment KIT)\
JRE: usuário (Java Runtime Environnement)

JVM - JRE
* Loader e verificador - carrega código bytecode e verifica
* Interpretador (bytecode -> executável)
* Gerenciador de memória da JVM (que é como um computador)
* Compilador Jit (Just in time)

JVM - JDK (para desenvolvedor)
* Java lang (linguagem)
* Java tools (ferramentas)
* JavaC (compilador)
* Debugger (verificação, testes...)
* Apis
* JRE

Ides para codificação em JAVA - NetBeans(distribuido pela oracle, oficial) e Eclipse

Compilador -> código fonte -> código objeto\
Linker -> código objeto -> código executável


Interpretador -> código fonte -> código interpretado (executável)

Compilador - mais memória, menos tempo
Interpretador - menos memória, mais tempo

### Processo de compilação
* Código fonte - compilador
* Código relocável - montador ou assembler
* Código objeto, linguagem de máquina (executável)

JDK -> SE(janelas), EE(sistemas complexos), ME(portáteis)

### Preparação do ambiente
JDK com netbeans ou eclipse\
JavaFX Scene Builder\
Documentação da linguagem

### Sintaxe básica de um programa - método, classe e pacote
package 'pacote'\
public class 'classe publica' {\
public static void main 'metodo principal' (String args[]) {\
}
}

Padrão camelCase: primeira letra maiúscula: classe ou interface, primeira letra minuscula: variável, método, atributo, parâmetro...

* O Java funciona por pacotes

Biblioteca swing\
Permite criar interfaces gráficas de janelas.

Biblioteca JavaFX\
Permite criar interfaces gráficas para tudo... (celular, video game...)

### Termos
Private: encapsulamento\
Extends: herança\
Evento: método em resposta a uma ação.		

### Extra 
* [X] [Vídeo Programação Orientada a Objetos (POO) - Canal Código Fonte TV](https://www.youtube.com/watch?v=QY0Kdg83orY)
* [X] Instalação JDK - Kit desenvolvimento JAVA

#

## Programação orientada a objetos

Classes: modelos de objetos, possuindo caracteristicas e comportamentos. É o molde da criação de objetos.\
Atributos: caracteristicas da classe.\
Métodos: comportamentos das classes.

Objetos = estrutura **viva** criada a partir de classes (são instâncias de uma classe).

Constructor: nome da classe e sem retorno. 

Super() - construtor da classe pai que tem atributos.

### Os 4 pilares da programação orientada a objetos
* Abstração - capacidade de trazer elementos da vida real para o digital (computação).
* Herança - algo que é passado de pai para filho, serve para evitar repetição do código. Caracteristicas e comportamentos herdados de uma classe para outra.
* Polimorfismo - capacidade de um elemento tomar várias formas. Conceito ligado a herança.(**Sobreescrita** = sobrescrever método da classe pai na classe filho e **sobrecarga**)
* Encapsulamento - forma de proteger parte dos dados independente do restante do sistema. Protege informações de classes que não precisam ter acesso a certas informações. (ex. almoxarifado)\
**Dados acessívels**: Métodos publicos e atributos públicos.\
**Dados inacessíveis**: atributos privados e métodos privados.

A classe filho tem acesso aos atributos da classe pai, mas a classe pai não tem acesso aos atributos da classe filho.

* Instancia = criar um objeto com o construtor de uma classe.

* instanceOf - verifica a classe 

* Todo projeto tem que ter uma classe (ex. Programa.java) contendo o método main (classe principal que roda o programa).

Ps. um objeto pode ter mais de um construtor, contanto que a assinatura de cada construtor seja diferente.

É possível importar pacotes para outros pacotes.

**Boa prática**: colocar todos os atributos privados, e só torná-los públicos a partir de métodos.

- Getters(visualização) e setters(atribuição de valores).

- Super: para acessar elementos do pai (no caso de método).

### Método toString - retorna uma representação de string do objeto
public String toString () {\
     return this.atributo, ...\
}

O método toString retorna uma representação string do objeto. Em geral, o toString retorna uma string que "textualmente representa" esse objeto. O resultado deve ser uma representação concisa, mas informativa que é fácil para uma pessoa ler. Recomenda-se que todas as subclasses substituir esse método.

Quando não há a presença desse método, a impressao dos atributos de um objeto resultara no seu endereço de memória..

### Encontrar pastas de projetos:
1) Clique em File/Import\
2) Procure e abra a pasta General\
3) Escolha a opção Existing Projects in Workspace e clique no botão Next\
4) Na opção Select root directory, clique no botão browse e escolha o seu diretorio de workspace\
5) Selecione os projetos desejados e clique em Finish

# 

## Controle de visibilidade, modificadores de acesso e classes abstratas

* Classes abstratas servem como modelo de suas classes derivadas (chamadas classes concretas) e não podem ser instanciadas.
* Elas deverão sobrescrever os métodos para realizar a implementação desses métodos.
* Se houver alguma declaração de um método como abstract (abstrato), a classe também deve ser marcada como abstract.
* Métodos abstratos estão presentes somente nas classes abstratas e não possuem implementação.\
Exemplo: public abstratic void nomeMetodo;\
public override void nomeMetodo;
* Um método abstrato é implicitamente virtual - não possui corpo.

## Tipos de classes

* Public: Todas as demais enxergam.

* Private: somente classes no mesmo arquivo fonte enxergam. Use isso quando a implementação serve para algum algoritmo interno da classe principal. - **cada arquivo .java pode ter apenas uma classe pública.**

* Default: Somente classes no mesmo arquivo fonte ou no mesmo pacote (package) enxergam. Use quando a implementação serve apenas para sua biblioteca ou para uma determinada parte do seu programa.

## Tipos de métodos

* Public: Todas as classes o enxergam, desde que enxerguem a classe também.

* Private: Somente classes no mesmo arquivo fonte enxergam. Use isso quando o método é feito apenas para uso dos outros métodos públicos da classe. - **Métodos privados não podem ser sobrescritos.**

* Protected: Métodos protegidos podem ser vistos pelas classes do mesmo pacote ou por subclasses. Use isso se for fazer algum tipo de biblioteca que permita a outro desenvolvedor estender suas classes e então usar esses métodos especiais, os quais não devem ser chamados por outras classes que usam a sua biblioteca.

* Default: Métodos sem modificador podem ser vistos apenas pelas classes do mesmo pacote. Use isso quando um método é usado apenas pelas classes que compõe uma parte do seu programa. 

## Tipos de atributos

* Public: Todas as classes o enxergam, desde que enxerguem a classe também.

* Private: Somente classes no mesmo arquivo fonte enxergam. Procure deixar todos os seus atributos privados e dar o acesso encasulado a eles através de getters e setters.

* Protected: Atributos protegidos podem ser vistos pelas classes do mesmo pacote ou por subclasses.

* Default: Atributos sem modificador podem ser vistos apenas pelas classes do mesmo pacote.

### Modificador final
É usado em vários contextos: classes, métodos, atributos e variáveis.

* Classe final
Uma classe com este modificador não pode ser estendida, isto é, não pode ter classes que herdam dela.

Isso é importante para garantir que uma determinada implementação não tenha seu comportamento modificado. Isso tem muito a ver com a imutabilidade.

Tipos básicos do Java como String e Integer são final porque se espera que o conteúdo não possa ser modificado. O problema é que seu alguém pudesse criar uma subclasses de String, esta implementação poderia passar a ser mutável. Uma String mutável seria o caos na terra para implementações, pois vários pressupostos que os desenvolvedores usam no dia-a-dia seriam simplesmente desfeitos.

* Método final
É um método que não pode ser sobrescrito nas subclasses.

Use para garantir que um determinado algoritmo não possa ser modificado pelas subclasses.

* Atributo final
Um atributo final de uma classe pode ter seu valor atribuído uma única vez, seja na própria declaração ou no construtor. Use isso para garantir que um valor ou referência de objeto não vai mudar. Voltamos à imutabilidade.

Se você tem um algoritmo que usa esse variável, você pode armazenar valores calculados sem a preocupação do valor mudar.

* Variáveis final 
Use para garantir que você não está modificando o valor indevidamente.

## Modificador static

Ele muda o escopo de um método ou atributo. Com o static, ao invés deles pertencerem à instância do objeto, eles pertencem à classe.

O modificador também pode ser aplicado para classes, como veremos a seguir.

* Métodos static
Os métodos static podem ser chamados sem uma instância. São ótimos como utilitários.\
Métodos estáticos não podem acessar variáveis de instância.

* Atributos static
Os atributos static possuem o mesmo valor para todas as instâncias de um objeto (dentro de uma mesma JVM, dentro de um mesmo ClassLoader).

* Classes static
Classes static são classes declaradas dentro de outra classe que podem ser usadas sem a necessidade de uma instância.

* https://pt.stackoverflow.com/questions/17015/qual-o-uso-de-uma-vari%C3%A1vel-est%C3%A1tica-ou-final-em-java

##  Interfaces, equals, override, overload

Interface: são usadas para criar um contrato com as classes que as implementam de forma que essas devem fazer a implementação dos métodos abstratos declarados na interface.

Ex. public interface NomeDaInterface

public class NomeDaClasse implements NomeDaInerface {} - podem ser implementadas mais de uma inferface usando virgula! ≠ de extends, que só pode extender de uma classe...

Métodos que tem default precisam de corpo! 

### Overload
A sobercarga (overload) ocorre quando, em uma mesma classe, utilizamos de um mesmo nome para atribuir métodos, assinaturas e comportamentos diferentes.

### Override
A sobrescrita (Override) ocorre quando, em uma classe filha nos utilizamos de uma mesma assinatura da classe pai para modificar o método em questão.

### Equals
Método herdado da superclasse Object que verifica pela referência de um objeto e retorna true caso dois objetos refereciem o mesmo endereço de memória.\
As classes wrappers sobrescrevem o método equals para fazer comparação de valor.

Equals tem diferentes papéis com String e com objetos.

TODA CLASSE EM JAVA HERDAM A SUPERCLASE OBJECT (extends Object).

#

## Collections
* https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450

### HashSet
Classe de conjunto

Conjunto é uma lista de dados do mesmo tipo, em que a ordem dos itens nao importa e não pode haver repetições.
Ex. conjunto de amigos de uma rede social. Não importa a ordem, todos do mesmo tipo e não é possível adicionar duas vezes o mesmo amigo.
Set<String> conjunto = new HashSet<>();

Caracteristicas
* todos os valores sao do mesmo tipo (boa prática, mas não proíbe de colocar outros tipos...)

### Array list
Uma lista é uma coleção de dados onde pode haver repetições e a ordem é importante.
Ex. uma lista de clientes que fizeram login no seu sistema. Vai manter a ordem, todos são do mesmo tipo  e um mesmo cliente pode logar mais de uma vez no seu sistema ao longo do tempo.

List <tipoValor> lista = new ArrayList<>();

lista.add();\
lista.remove(); - pode remover por indice.\
String valor = lista.get(indice); - consula por indice\
Percorrer todos os valores:
* for (string valor : lista) {\
    syso(valor)
}

### HashMap
* As chaves são únicas
* Os valores são acessados por meio de chaves
* Conceito de chave e valor

Map <TipoChave, TipoValor> map = new HashMap<>();

Collection.size(); - para saber o tamanho.

### Queue - fila
É uma estrutura de dados que permite ordenar a saída dos elementos por ordem de chegada (FIFO - first in, first out).\
Ex. fila de clientes esperando a ser atendidos pela caixa.

Queue<TipoValor> variavel = new LinkedList<>();

Adicionar e remover (sempre remove o primeiro elemento da vida, nunca do final)
* fila.add("");
* fila.offer("");
* fila.poll(); - retorna null se não tiver nenhum elemento para remover
* fila.remove(); - dá erro quando não tiver elemento para remover (excessao)

### Stack - pilha
A pila é uma estrutura de dados que permite ordenar a saida dos elementos por ondem de chegada (LIFO - last in, first out). Exemplo: pilha de livros.

Stack<TipoValor> pilha = new Stack<>();

# 

## Exceções e funções lambda

### Exceções

Em Java, as exceções diferem de erros. Os erros são críticos, quando por exemplo o programa não tem mais memória para executar (estou de memória - stackOverflow).

Já a excessão pode ser TRATADA, como por exemplo com blocos de try/catch (embrulha o código problemático). - O finally é optional de se colocar no código, é um bloco executado tanto se houver, quanto se não houver falha.

* É preciso colocar a exception que está ocorrendo no catch (tipo da exceção)
* variavel.printStacktrace(); - imprime o stack vermelho com os erros que ocorreram.

As exceções são classes, por isso é possível criar classes que extendam dessas exceções e façam a verificação. 

### Funções lambda

Nesse tópico, falamos de funções mas é preciso lembrar que em Java, elas são chamadas de métodos!

**Interface funcional**\
São interfaces que em geral possuem apenas um método abstrato e funcionam como um template para a implementação de funções lambda. (@funcionalInterface)

Funções lambda são funções anônimas que precisam ser atribuidas a uma variável do tipo da interface que elas implementam. 

* Interfaces funcionais nativas

Exemplo: binaryOperator(apply), syply, consumer<T>, bitFunction... 

# Passagem rápida sobre programação funcional.

#

## Stream API
A API de stream de Java é uma coleção de recursos poderosos desenvolvidos para lidar com sequências de elementos de forma simples e eficiente.

Stream = fluxo de dados.

É possível criar uma stream através de uma variável, vetor ou lista.

* Stream<T> nomeVariavel = Stream.of(item1, item2, item3, .... itemN);

* Tipo[] nomeVariavel = {item1, item2...}\
Stream<T> fluxoNomeVariavel = STream.of(nomeVaravel);

* List<T> nomeVariavel = new ArrayList<>();\
nomeVariavel.add()\
Stream<T> fluxo = nomeVariavel.stream();


### Manipulando streams
Através de streams, é possível manipular dados facilmente com alguns métodos pré-definidos.
* Foreach (consome uma stream, mas não devolve nada, utilizado para iterar em streams de objetos e não possui retorno)
* Map (é utilizada utilizado para iterar em streams de objetos e retorna uma stream do mesmo tamanho da passada. Pode receber uma função que implemente a interface UnaryOperator)
* Filter - utilizado para iterar em streams de objetos e retorna uma stream menor ou igual àquela que foi passada. Pode receber uma função que implemente a interface Predicate.
* Reduce (não devolve uma stream, apenas um valor, não é possível fazer nenhum processamento na stream depois nele)

Existem três operações básicas:
* Build (construção) - exemplo: converter uma lista para uma stream
* Intermediate (intermediarias)
* Terminal (finais) - podem ou não devolver uma stream

Match: categoria de métodos que ao percorrer uma stream retorna verdadeiro ou falso, dada uma determinada verificação. O mesmo pode ter sua verificação implementada em uma interface Predicate. (allMatch, noneMatch, anyMatch...)

Min e max: feita para verificar os maiores e menores valores dentro de uma stream. (precisam ser implementados numa interface do tipo comparator)

## Introdução à engenharia de software
* Abordagem sistematica, economica e quantificável para o desenvolvimento, operação e manutenção de um software.
* Controle sobre o desenvolvimento do software dentro de custos, prazos e níveis de qualidade desejados.
* Produtividade no desenvolvimento, operação e manutenção do software.

Responsabilidades do engenheiro
* Projetar - idealizar como seria
* Levantar requisitos
* Gerenciar projetos
* Desenvolver
* Assegurar a qualidade
* Fazer deploy - implementação do sistema, Produção: entrega do produto para o cliente final.
* Manter - manutenção

TDD - Teste driver development, desenvolvimento guiado a testes. 

* Padrão UML

#

## Ciclos de vida de projeto de software

Conjunto de etapas do início do planejamento do software até a sua finalização.
* Orientar desenvolvedores
* Otimizar recursos
* Garantir eficiência

Fases de um projeto: início, planejamento, execução e encerramento.

### Início
* Justificativa (problema);
* Estimativa de recursos (equipe, tempo, orçamento...)
* Stakeholders (partes interessadas, público alvo)

### Planejamento
* Objetivos (ex. tempo)
* Escopo (o que a aplicação fará) e riscos
* Estruturação do plano (ex. levantamento de requisitos)

### Execução
* Aplicação prática
* Utilização dos recursos (ex. tempo)

### Encerramento
* Encerramento dos contratos, servidores, etc.

### Fases do ciclo de vida
* Termo de abertura do projeto
* Plano de gerenciamento do projeto
* Aceite de entregas
* Documentação e arquivamento

Software como produto é diferente de software como serviço (linearidade).

* Gestão de projetos

### Padrões para gerenciamentos de projetos
* Cascata (mais engessado pois os requisitos são bem definidos, produto final bem definido por todas as partes, estimativas mais precisas, escopo do trabalho conhecido previamente, possui fases sequenciais)\
Requirements, design, implementation, verification, maintenance
* Incremental (modelo em que o projeto é construido e entregue em partes(incrementos), MPV em cascata e features, modulariza as funcionalidades do sistema, os requisitos vão sendo refinados em sucessivas iterações, possibilidade de atraso no sistema final)
* Evolutivo (análise feita em cima dos requisitos, presença constante do cliente no processo de desenvolvimento, maior flexibilidade, documentação pouco consistente, possível ônus financeiro e de tempo, risco de nunca terminar o desenvolvimento do software)

#

## Metodologias Ágeis - SCRUM
Ambiente: volátil, incerto, complexo, ambiguo\
Termos atuais: propósito, liderança distribuida, facilitador, liberdade e confiança, experimentação, aprendizado contínuo, transparência total

### Os 12 principios ágeis
1 - Nossa maior prioridade é satisfazer o cliente através da entrega contínua e adiantada de software com valor agregado.

2 - Aceitar mudanças de requisitos, mesmo no fim do desenvolvimento. Processos ágeis se adequam a mudanças, para que o cliente possa tirar vantagens competitivas.

3 - Entregar frequentemente software funcionando, de poucas semanas a poucos meses, com preferência à menor escala de tempo.

4 - Pessoas de negócio e desenvolvedores devem trabalhar diariamente em conjunto por todo o projeto.

5 - Construir projetos em torno de indivíduos motivados, dando a eles o ambiente e o suporte necessário e confiando neles para fazer o trabalho.

6 - O método mais eficiente e eficaz de transmitir informações para e entre uma equipe de desenvolvimento é por meio de conversa face a face.

7 - Software funcionando é a medida primária de progresso.

8 - Os processos ágeis promovem desenvolvimento sustentável. Os patrocinadores, desenvolvedores e usuários devem ser capazes de manter um ritmo constante indefinidamente.

9 - Contínua atenção a excelência técnica e bom design aumenta a agilidade.

10 - Simplicidade: a arte de maximizar a quantidade de trabalho não realizado é essencial.

11 - As melhores arquiteturas, requisitos e designs emergem de times auto-organizáveis.

12 - Em intervalos regulares, a equipe reflete sobre como se tornar mais eficaz e então refina e ajusta seu comportamento de acordo.


* Práticas com o objetivo de permitir entregas rápidas e de alta qualidade do produto.

Pilares: transparência, adaptação, inspeção.\
Valores: foco, comprometimento, coragem, sinceridade e respeito.

#

## Overview (DevOps, Kubernetes, Docker, Workloads)

Devops: integração de desenvolvimento e operações.

CICD: continuous integration and continuous delivery. (Automatização do deploy ligado ao versionamento)

* Testes automatizados (TDD), entrega continua...

### Ferramentas DevOps
* Git (gerenciamento de codigo fonte, ferramenta de versionamento)
* Docker (conteinerização, ferramenta para a criação de conteiner)
* Vagrant (simplicidade na criação de maquinas virtuais)
* Jenkins (servidor de código aberto para a automação de estagios de desenvolvimento)
* Kubernets (ferramenta para gerenciamento-agrupamento) de conteiner)
* Nagios (monitora a infraestrutura em tempo real para a indentificação de ameaças a segurança)

* Termo workload: se refere a um conjunto de códigos e recursos que fornece valor empresarial, como um aplicativo voltado ao cliente ou um processo de back-end. 

Recursos de segurança: criptografia, armazenamento na nuvem (previne ataques ddos, e dura mais tempo durante um ataque ddos do que um servidor local comum), gerenciamento de servidores

### Testes regressivos
O teste de regressão é uma técnica do teste de software que consiste na aplicação de versões mais recente do software, para garantir que não surgiram novos defeitos em componentes já analisados.
Muitas vezes são usadas ferramentas específicas para o teste de regressão, chamadas de ferramentas de automação. Elas conseguem um resultado mais exato do teste executando exatamente os passos seguidos para o teste das primeiras versões já que elas permitem a gravação do teste. (Wikipédia)

# Bancos de Dados e Aplicações Web

## Banco de dados
* [X] Extra: [Curso de MySQL do Curso em Video no Youtube](https://www.youtube.com/watch?v=Ofktsne-utM&list=PLHz_AreHm4dkBs-795Dsgvau_ekxg8g1r&ab_channel=CursoemV%C3%ADdeo)

### Criando um banco de dados
* CREATE DATABASE IF NOT EXITS 'database'; - if not exists impede a sobrescrita dos dados
* USE 'database'; (para começar a usar)

### Criando uma tabela
* CREATE TABLE IF NOT EXITS 'table' (columns+datatype...) **ENGINE = INNODB;**; 

### Manipulações de dados
DML = COMANDOS DE MANIPULAÇÃO DE DADOS 
* DROP TABLE 'table'; Apaga a tabela
* INSERT INTO 'table' (atributos...) value (valores...);
* SELECT * FROM 'table';
* UPDATE 'table' SET 'column' WHERE primarykey = '';
* Comandos de manipulação: limit, set, where, inner join (pode conter mais de um), like(%), delete, order by (asc/desc), between, on, in, and, or, distinct, having, default, unique, not null, left outer join e right outer join
* Funções de agregação: count() - (a coluna precisa ser not null), max(), min(), avg(), sum()

### Manipulando a estrutura da tabela
DDL = COMANDOS DE DEFINIÇÃO DE DADOS (ESTRUTURA)
* ALTER TABLE 'table' **comandos**; Modifica a tabela: adiciona/remove colunas, muda o nome...
* DESCRIBE 'table'; Mostra a estrutura da tabela (colunas e tipos de dados das colunas)
* ALTER TABLE 'table' ADD PRIMARY KEY (column)
* Comandos de manipulação: after, add, drop, truncate(apaga todas as linhas da tabela, as colunas permanecem), modify, change column, rename, alias, as...

### Gerando cópias de segurança da estrutura (DUMP)
* Server, Data export, Dump structure and data (Export to self-contained file && Include create schema - cria o database)
* Server, data import para restaurar backup

### Console mysql 
* show databases;
* status;
* use 'database';
* show tables;
* describe 'column';
* select * from 'table'; 

### Qual é a diferença entre usar where e inner join para fazer consultas?
Em questão de resultados, não terá diferenças. Sobre desempenho, a condição de junção INNER tem um ganho discreto comparado com o WHERE, pelo fato de ser interpretado antes.

Ordem de interpretação: 1 - FROM; 2 - ON; 3 - INNER; 4 - WHERE; 5 - SELECT;

Mas existem dois fatores que fazem a utilização do INNER ser aconselhada: Padronização e flexibilidade - INNER JOIN explícito é padrão da indústria e portanto compatível entre os SGBDs. [Resposta encontrada aqui](https://pt.stackoverflow.com/questions/44914/qual-a-diferen%C3%A7a-entre-usar-inner-join-ou-por-relacionamentos-no-where)

### Modelo relacional
* Cardinalidade
* Chave primaria (UNIQUE), chave primaria composta 
* Chave estrangeira (ADD FOREING KEY, REFERENCES) - MUL
* Integridade referencial (relação de tabelas, dependencia)
* Relacionando tabelas com cardinalidade muitos para muitos: uso de entidade intermediária que leva chave estrangeira referenciando as duas tabelas

### ACID
Regras de uma boa transação. Toda a ação que um banco de dados possa realizar é considerada uma transação.
* A Atomicidade (ou tudo acontece ou nada é considerado)
* C Consistência
* I Isolamento (duas ou mais transações podem ser feitas ao mesmo tempo e uma
não pode interferir na outra)
* D Durabilidade

set default_storage_engine = InnoDB;
SET NAMES 'utf8';

### Views
View é um resultado originado de uma consulta pré-definida. Essencialmente é um metadado que mapeia uma query para outra, por isto pode ser considerado como uma tabela virtual. Como o próprio nome diz, ela representa uma visão de dados e não contém dados. Com ela você tem a ilusão que está vendo uma tabela que não existe. Claro que o que você vê nesta tabela existe de outra forma no banco. [Texto retirado do stackoverflow](https://pt.stackoverflow.com/questions/35413/o-que-s%C3%A3o-views-em-sql-quais-vantagens-e-desvantagens-em-utilizar)

#

## JAVA EE

### TOMCAT
Servidor HTTP voltado para Java - sistemas/aplicações web. (vem incluso no eclipse enterprise)\
Servidor: disponibiliza, serve, responde a requisições... 

### Maven 
Gerenciamento e construção de projetos, responsável pela estruturação das dependências. Serve para gerenciar dependências e automatizar builds. Tem o pom.xml como arquivo de configuração.

### Design pattern 
Solução geral de um problema frequente, é um modelo/template de como resolver problemas corriqueiros. Funciona como uma padronização de processos em desenvolvimento de sofwtare. Esses modelos não são códigos prontos para resolver problemas, mas são como uma planta de construção que serve para guiar o que deve ser feito para resolver determinado problema - diferente dos algoritmos, que fornecem um passo a passo.

Há diversos modelos disponíveis, que se encaixam em um desses padrões:
* Padrão decorator (estrutural)
* Padrão factory (criação)
* Padrão strategy (comportamental)

### MVC
Padrão de arquitetura: model, view, controller
