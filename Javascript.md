## Javascript

Let: variável de escopo local (do bloco), mais usada que o var para o caso de um valor que tiver a necessidade de variar.\
Var: variável usada nos codigos antigos.\
Const: constante, usada se o valor não precisar variar. (opção mais segura)

### Tipos básicos de variáveis
* string
* boolean
* number
* object
* array
* function - tipo de dado, pode ser atribuido à uma variável
* null
* undefined\

**If ternário**\
condição? expressão 1 *condição true) : expressão 2 (condição false)

### Funções
A função deve ter uma única função e seu nome deve ser claro. Ela é executada quando invocada.

Função como expressão - função anônima atribuida a uma variável.\
Função arrow ou arrow function - o return é implicito\
Escopo: contexto em que uma variável está visível.\
Hoisting: puxa pra cima a declaração da variável mas só depois atribui o valor (só declara e não inicializa). Também se aplica a funções aninhadas.\
Funções aninhadas: serão visíveis apenas dentro da função pai.\
Callback: função passada como parâmetro a outra função que será executada após o termino da primeira.\
Promises\
Async await: forma mais confortável de lidar com promises.

É preferível usar const a let se tivermos a certeza que a variável não será modificada por uma questão de segurança. 

Blocos try e catch para tratamento de erro.

### Arrays
Conjunto de dados delimitado por colchetes e separados por vírgulas.\
Métodos:
* forEach
* map - retorna um array novo com o resultado da modificação de outro array utilizando uma função determinada. 
* filter - filtra elementos de um array através de uma função.
* reduce - é usado para reduzir um array a um valor único utilizando uma função determinada.

### Objeto literal
Podem ser de vários tipos.\
Para acessar uma propriedade de um objeto: nomedoobjeto.propriedade ou nomedoobjeto["propriedade"] ou utilisando variáveis\
É possível adicionar propriedades a um objeto existente com uma notação semelhante ao acesso e atribuição (=) de valor. 

#

## DOM e eventos

### DOM - document object model
Representação estrutural de um documento HTML em árvore.\
Com o DOM, o JS pode modificar, excluir e adicionar elementos ou atributos de uma página.\
Pode criar e respoder aos eventos da página.\
Pode manipular seletores como ids, tags, classes...\
Acessar elementos de uma pagina e cada seletor pode retornar apenas um elemento (id) ou uma lista de elementos.

### Métodos
document.
* getElementByID(id)
* querySelector(elemento)
* querySelectorAll(elemento) - retorna array (loop pode ser usado para acesso)

### Atributos
Quando um elemento é selecionado, é possível acessar seus atributos.
* Elemento.attributes - retorna um array com seus atributos
* elemento.getAttribute("") - retorna valor do atributo
* elemento.setAttibute("atributo", "nomedoatributo") - permite adicionar novo atributo ou modificar um existente.
* elemento.removeAttribute(nomedoatributo) - remove atributo existente
* elemento.hasAttribute(nomedoatributoemstring) - verifica se elemento possui atributo e retorna boolean

### Estilos
* elemento.style.nomedapropriedadeCSS(padrão camelCase) = "valor" - ideal para tratar excessões
* Criar elementos de forma dinâmica: createElement("") - strings com nome das tags.\
Exemplo: let btn = document.createElement("Button")\
const text = document.createTextNode("Clique")\
const body = document.querySelector("body")\
btn.appendChild(text)\
body.appendChild(btn)\
Append = adicionar\
Se fosse remover o botão: body.removeChild

Filter: grayscale(100%) - transforma imagem em preto e branco.

elemento.textContent = "texto" - escreve de forma dinâmica no HTML

### Interação do usuário através de eventos
Evento é algo que acontece no navegador ou ação do usuário.
* elemento.onNomedoElemento = function () {} - estabelece propriedade no próprio elemento
* elemento.addEventListener(tipodeevento, funçãogerenciadora) - onde a função gerenciadora é invocada quando o evento acontece.
* elemento.removeEventListener(evento, função) - os parametros precisam ser os mesmos atribuidos ao addeventlistener
* event.preventdefault() - evita a execução do evento.
* event.clientX ou event.clienteY - posição do mouse na tela
* mousehover, click... 
* eventos do teclado: addEventListener - keypress, keydown, keyup, etc...\
let variavel = event.keyCode {\
    if (variavel == 27){\
        ação - exemplo: alert("mensagem")\
    }\
}

### Timers
* setTimeOut - código executado depois de um tempo estabelecido. (clearTimeOut(delay) interrompe intervalos por exemplo em função de uma ação.)
* setInterval (clearInterval(delay))


#

## Formulários no contexto JS e AJAX
* let formulario = document.forms(indice)
* document.form.elements
* form.target - resposta depois do envio do formulário (botão submit)
* action
* encoding
* method - get ou post
* name (nome do formulário)
* value - elemento que permite recuperar valores

### Eventos
* form.onsubmit = function (evento) {evento.preventDefault - 'não envia por padrão'}
* focus, blur, change, input...

### Regex
Verifica padrões de texto em uma string e valida estruturas
* test (permite validar uma string para saber se ela cumpre a expressão regular), match
* Retorna valor boolean
* https://bar8.com.br/regex-expressoes-regulares-sap-abap-cdcb3271dd67

### JSON - subconjunto da linguagem JS
* Json - formato de dados (não se limita ao Javascript) entre aspas duplas!!!
* Stringfy - valor de JS para JSON
* Parse - valor de JSON para JS
*Troca de dados em formato de texto....*

### Ajax - Asyncronous Javascript and XML
Técnica para criar páginas dinâmicas\
* Precisa estar rodando no servidor para funcionar
* Possibilidade de iniciar solicitações HTTP, como get e post sem precisar sair da página web atual. 
* Permite atualizar conteúdo de uma pagina sem recarregar, pedir, receber e enviar informações ao servidor.
* xhr 

var xmlhttp = new XMLHttpRequest();

### Extra
* [X] [Exercícios Javascript]()

## JQUERY - "Write less, do more"
Jquery é uma biblioteca JavaScript de consulta que auxilia na busca e manipulação dos elementos na DOM, facilita o uso de eventos, bom para trabalhar com animações, simplifica o uso de chamadas ajax, tem suporte para multiplos browsers, usa seletores css e faz o uso do padrão decorator.\
Sua utilização se da atraves do CDN (preferivel) ou instalação na máquina\
**$** === JQuery\
Qual é a diferença entre biblioteca e framework?

* @ keyFrames ????
### Sintaxe JQuery
$ if (document).ready (function () {\
    codigos\
});


### Extra
* [X] Capitulo JQuery FreeCodeCamp

## SPA e PWA - Single page appication e progressive web app

### SPA

* SPA se difere de MPA (multiple page application)
* https://blog.locaweb.com.br/artigos/desenvolvimento-artigos/o-que-e-single-page-application/

Single page application gera apenas um arquivo HTML conhecido como app shell que é baixado no momento que o usuário entra na página. Este arquivo possui toda a parte estática da aplicação e uma grande carga de JS para gerenciar mudanças de extado requisitadas pelo usuário (frotas, links, etc.).

Toda a parte dinâmica da página, como consulta a banco de dados, fica a cargo do AJAX que faz requisições assincronas ao servidor que por sua vez, retorna apenas dados geralmente em formado JSON. 

Esse modelo torna mais simples o trabalho do servidor já que este apenas fica responsável por prover dados "crus" e diminui o tráfego necessário, o que torna a aplicação mais fluida.

Lady loading é utilizado para aumentar a performance e evitar que arquivos grandes sejam carregados desnecessariamente. Não afeta diretamente a reatividade do sistema, uma vez que esse conteúdo será carregado de forma assincrona via AJAX.


Principais tecnologias: angular, react, vue.

As principais vantagens de uma SPA são: as aplicações altamente reativas, total desacoplamento do backend e maior facilidade na realização de testes.

Suas desvantagens são: dificil implementação de SEO, dependencia total do JavaScript, maior tempo de carregamento da página e baixo suporte para browsers mais antigos.

### PWA - Um passo além da reatividade

PWA é uma sigla para progressive web app, que significa que a depender dos recursos disponíveis do navegador do usuário, a sua aplicação apresentará um conjunto de recursos diferentes de forma a atender as necessidades e limitações de quem tiver utilizando. 

O web app reflete bem o que seu sistema tentará entregar. A experiência de uma aplicação desktop ou mobile diretamente no browser, e isso quer dizer que a aplicação poderá ser instalada no computador ou smartphone do usuário e deverá ter funcionalidades básicas mesmo **offline**.

O conceito de pwa pode ser implementado tanto em aplicações SPA quanto MPA, basta que o app siga alguns padrões.

* Manifest.json

### Service worker

É um arquivo javascript que funciona como um interceptor de requisições internas do browser, rodando em background de forma paralela ao javascript tradicional na página.

Ele executa eventos e dispara ações baseadas no evento que foi disparado, entretanto estes eventos tendem a ser bastante diferentes dos que são usualmente escutados na DOM, uma vez que o service worker não conta com interface gráfica.

Install: é o evento que dispara a instalação do service worker na aplicação e cria todo o cache estático. Geralmente ocorre na primeira vez que o usuário entra na página.

Activate: este evento é disparado após a instalação e é o responsável por fazer a atualização tanto do cache dinâmico quanto do cache estático.

Fetch: escuta por solicitação de conteudo e implementa a lógica que deverá servir o conteúdo em cache (se disponível).
* https://developer.mozilla.org/pt-BR/docs/Web/API/Fetch_API

Sync: faz a incronização de conteúdo novo no cache.

Cache: para armazenamento de arquivos, documentos, etc.

IndexDB: próprio para armazenamento indexado, pode guardar grande quantidade de dados sendo ideal para espelhar o conteúdo em tabelas, collections, etc.

Cookies: servem principalmente para guardar pequenas informações (id do usuário, id da sessão, personalizações feitas pelo usuario, etc).

* This - flexivel
* Self - sempre referencia ao window

## Web services (API)
Serviços de aplicações podem ser usados e acessados utilizando os protooclos padrões da web (HTTP). 

* Comunicação entre sistemas distribuidos independe do SO e da LP.
Envio e recepção de dadps em XML (qualquer linguagem pode ser traduzida em XML)
* Integração entre serviços distintos
Protocolo:  soap 
* Padrão arquitetural: rest -> recursos

Request - web service - database 

Rest: define caracterisicas fundamentais para a construção de aplicações web seguindo as boas práticas. 

Métodos: 
* Get, recuperar - select
* Post, criar - insert
* Put, atualiza - update
* Delete, deleta - delete

Códigos status HTTP
* 1xx informativas
* 2xx sucesso
* 3xx redirecionamento
* 4xx erro no cliente
* 5xx erro no servidor

Content types: tipo de entrada e retorno da aplicação rest (JSON, XML...)

Json - combinação de chaves e valores. 

Principios básicos chaves do rest
* Todo recurso deve ter uma ID
* Utilizar operações padronizadas
* Definir a representação de recursos
* Use hipermidias para vincular os recursos

* Postman 

XSD: schema XML usado para definir a estrutura de dados soap message.

Soap: baseado em troca de mensagens XML. Permite integrações independente da plataforma e software. 

Envelope - header - body

WSDL: descreve um serviço web soap.

API: conjunto de rotinas de padrões disponibilizadas por uma aplicação.

Rest HTTP: representa a operação a ser realizada em um determinado recurso.