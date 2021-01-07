## Hypertext markup language - HTML

* [Visual Studio Code](https://code.visualstudio.com/docs)\
code . dentro da pasta no terminal para abrir o vs code

Assim como o XML, HTML é uma linguagem interpretada de marcação de textos composta por tags e atributos que formam elementos.\
Identação: organização e leitura do código. Algumas linguagens delimitam o código por identação, como Python.\
Index: página principal.

Estrutura básica: html, head, body.

[Lipsum](https://www.lipsum.com/) - Site que gera textos para testes.

### HTML Semântico
Compreensão dos buscadores SEO (search engine optimization - otimização dos motores de busca). É criar um código que faça sentido para esses buscadores, as tags precisam ser coerentes com o conteúdo.

### Atributos
Caracteristicas que podem ser modificadas na tag. 
* Charset: define a codificação de caracteres a ser utilisada. Exemplo: UTF-8 (metadado que evita a exibição incorreta dos navegadores e segue os padrões da W3C).

### Tags
* head: cabeçalho com informações escondidas da página (configurações). 
* header: fica no corpo da página.
* h: gera títulos e subtitulos de h1 a h6, possui leitura semântica e é importante para o posicionamento nos buscadores. O h1, que representa o título principal, só pode ser usado uma **única vez** por documento html. 
* p: gera blocos de texto em forma de parágrafo. 
* Listas: podem ser aninhadas, não ordenadas e ordenadas.\
ul: lista não ordenada, que utiliza bullet como marcador por padrão, mas pode assumir outras formas como square, disc...\
ol: lista ordenada que possui marcadores ordenados, que podem ser numericos, com letras, algarismos romanos... é possivel começar por exemplo no número 20 *(start=20)*, e a lista seguirá com 21, 22, 23. O mesmo com os outros -> b, c, d, IV, V, VI.
* Exemplo de tags semânticas: em, mark, strong, cite, abbr, section, article, header, footer, main...

...Não é recomendável usar o < br > para quebra de linha pois ele não é semântico. É preferível o uso de CSS para fazê-lo. Evitar também outras tags não semânticas: div, span, pre... E optar sempre por fazer as modificações de estilo no CSS ao invés de fazê-lo no HTML. (organização!)

## Cascading Style Sheets - CSS
É o conjunto de comandos que se aplicam a uma determinada etiqueta (tag) para estilizá-la.
Usado para definir cor, plano de fundo, tipografia, altura... infinitas opção na estilização de um documento HTML. A folha de estilo linkada no documento (css externo) é a melhor opção para inserir o CSS, porque deixa o código mais organizado, entretanto ele também pode ser inline (direto na tag) e interno (tag style dentro do documento html). Dar preferencia também a sempre colocar os arquivos de estilo em pastas. 

**Sintaxe**\
seletor {\
    propriedade: valor;\
}

RGB - red, green, blue. Porcentagem de cada uma dessas cores (0-255) para formar uma nova. 

**Font size**\
Evitar trabalhar com medidas absolutas (responsividade!). Sempre preferir utilizar o EM (relativo a fonte declarada no elemento pai) ou REM (relativo a raiz (root) - body).\
O percentual na fonte tem como base de valor o elemento pai.\
Ao usar uma fonte externa (ex: [Google Fonts](https://fonts.google.com/)), também usar uma fonte de sistema como alternativa para o caso de o sistema da fonte cair ou demorar a carregar.

**Media queries - consulta de mídia**\
Usado para tornar a aplicação responsiva.

### Extra
* [X] [Unidades de medidas CSS](https://www.maujor.com/tutorial/unidades-de-medidas-css.php)

#

## Formulário e box model

Sistema para captura de dados, o formulário precisa de outras linguagens para ser tratado.
* Captura - cliente através do HTML.
* Validação - cliente através do Javascript, e servidor através do PHP, por exemplo. - Validação dupla.
* Processamento - lado do servidor.

#### Tag <'form'> - Propriedades
- Action: para onde os dados serão enviados.
- Method: pode ser do tipo post (mais usado, informações escondidas no corpo da requisição) ou do tipo get, que é o padrão (esse deixa as informações explicidas na URL, então não é seguro).

Link: http://gabsferreira.com/pra-que-serve-o-protocolo-http-quando-eu-uso-ele/

**Campos do formulário e atributos**
- Input - campo de entrada. Type text, email, password, submit, number...
- Checkbox - pode ser multivalor
- Radio - só pode ter um valor selecionado. Value é o valor da seleção, e name para a identificação da seleção. 
- Required - campo obrigatório a ser preenchido para o usuário, é um tipo de validação front-end. 
- Placeholder - valor que aparece no campo antes de o usuário digitar (explicação da entrada de dados). 
- Fieldset - tag para agrupar elementos selecionados dentro do formulário (por exemplo os radios).
- Label - é como um título-legenda, para identificação dos inputs.
- Select - atributo name, lista rolavel com tags option (atributo value), ou optiongroup, onde é possivel agrupar opções similares no dropdown. -> valor da exibição é diferente do valor da informação.
- Text area - utilizada para entrada de textos longos. É possivel delimitar a area do texto em caracteres, linhas, colunas, tamanho pelo css... a propriedade resize pode servir para impedir que o usuário possa manipular o tamanho do textarea no navegador (valores none, both, horizontal, vertical)
- Button - type submit processa o formulário e envia para a "action", type reset limpa o formulário, type button faz qualquer coisa, cuja funcionalidade pode ser especificada no javascript.

### Propriedades CSS
Pseudo seletor trata comportamento extra. Como por exemplo o hover quando o mouse passa em cima de um elemento, active para selecionar e estilizar um link ou elemento ativo, focus controla o foco nos campos de um formulário (o que for definido com focus só será visível quando o cursor estiver dentro do campo). 

### Elementos CSS
Display
* Inline - elemento com comportamento de linha
* Block - comportamento de bloco
* Inline-block - comportamento de semibloco, recebe “facilmente” propriedades do modelo de caixa.Também tem propriedades do elemento de linha.
* None - oculta visualmente um elemento sem eliminá-lo da estrutura HTML.

Overflow
* Visible - permite a ultrapassagem do bloco
* Hidden - esconde ultrapassagem
* Scroll - permite a ultrapassagem do bloco com barra de scroll
* Auto - permite a ultrapassagem do bloco com barra de scroll

Espaçamento
* Padding: margem interna, é o distanciamente da borda do quadro. 
* Margin: espaçamento fora do componente.
* Box-sizing: desconta automaticamente da largura e da altura o que será somado ao preenchimento e à borda. 

#

## Rotas no HTML

### Atributos globais
* id: identificador único - só pode aparecer uma **única vez** em um documento HTML.
* class: classe, útil para uso no css e JS. Usado para grupos de elementos.
* title: texto que aparece quando mouse passa sobre o elemento.
* style: estrutura css inline.

### Caminhos
* caminho absoluto: url inteira.
* caminho relativo: diretório de onde estou, até onde eu quero ir.
* links: target="_blank" para abrir o link em uma nova aba.
* links internos(âncoras): #id ou .class
* email e telefone linkados (ex: input email)

### Descendentes e combinações
* Seletorpai seletorfilho {} - todos abaixo
* elementofilho - seletorpai>seletorfilho{} 
* mesmoelemento: elemento#id.class{}
* múltiplos elementos: seletor1, seletor2, ... {} - separados por virgulas

### Fundos de imagens
Sempre ter a imagem no diretório, porque no caso de uma imagem hospedada em algum lugar, o site pode cair, demorar, não abrir, etc. 
* background-image: url();
* background-repeat: no repeat / repeate x / repeat y;
* background-position: right, center, length...
* background-attachement: scroll, fixed, local;
* background-size: cover, contain, length; 

### Cores
* Hexadecimal
* RGB - 3 parâmetros
* RGBA - 4 parâmetros, rgb e alfa para a transparência em %. 

### Positions
* Relativa: move elemento para nova posição usando como referência sua posição relativa ao elemento pai e irmão. 
* Absolute: referência ao body. Porém se o pai for relativo, vai fazer referência ao pai (será absolute em relação ao pai).
* Fixed: referência as laterais da janela (não sai do lugar quando a página é rolada).
* z-index: permite mudar a ordem da camadas dentro de um documento HTML. Só funciona se o elemento tiver posicionamento relativo, absoluto ou fixo. Ele sobrepõe a página (3D), o número passado é referente a camada que ele vai ocupar. Todo elemento, por padrão, já vem com o Z-index = 0.

#

## FlexBox

display: flex;\
Torna o elemento um flex container automaticamente transformando seus elementos filhos diretos em flex.
* flex-direction: row (em linha - padrão), define a direção dos flex itens
* justify-content: alinha os itens flex no container de acordo com a direção (só funciona se os itens atuais não ocuparem todo o container) - utilizar o 'flex' anula essa propriedade.
* flex: numero - os itens serão somados e formarão uma proporção.
* flex-wrap: wrap, nowrap, wrap-reverse - define se os itens devem quebrar linha. Por padrão, eles não quebram linha, os flex itens são compactados além do limite do conteúdo.
* align-items: alinha os itens de acordo com o eixo do container (horizontalmente).
* align-content: alinha as linhas do conteiner em relação ao eixo vertical. Só funciona se existir mais de uma linha de flex-itens e para isso o flex-wrap precisa ser ativado.
* align-self: aceita os mesmos valores que a propeiedade align-item mas só alinha o item selecionado.

### Unidades relativas e media-queries
As unidades de medidas relativas são relacionadas ao pai direto.\
**Mobile first**: estrutura da página pensando primeiro em um dispositivo móvel (diferente de mobile reverse).\
**Responsive web design**\
Porcentagens: medida no mesmo eixo que o pai que a contém. **PS. não se usa porcentagem para altura!!**\
EM: usada para tipografias (line-heigth, font size...)\
Viewport: tag dentro do head(metadado) referente ao tamanho da tela. Viewport measures VW e VH, terá sempre como referencia o VW do documento (caixa visível do conteudo de um navegador).\
Media-queries: conjunto de regras do CSS que permite reorganizar o conteúdo de acordo com as visualizações do documento (screen-size). Também é possível definir a orientação (portrait, landscape..). São sempre escritos no final do documento.\
@ media (min ou max-width: medida em px){\
    regras do css por elemento\
}\
* **O último sobrescreve os anteriores!!!** - Começar sempre pelo maior.

### Barras de navegação, pseudo elementos e tabelas
Feitas com listas desordenadas e links. 
- Retirar estilo padrão da lista, tornar li inline, fazer com que os links se comportem como blocos... 

Pseudo elementos
- ::before
- ::after 
- ::selected

Tabelas
* table, thead, tbody
* tr - linhas
* td rowspawn = "numero" - linhas (onde td é a celula)
* td colspawn = "numero" - colunas

### Extra
* [X] [Exercício landing page](https://github.com/thejanesol/projeto-kitchening)

## Bootstrap
### Framework para layouts com conceito de mobile first
* Siglas: xs, sm, md, lg
* Padrão: row
* cada conteiner se divide em 12 colunas

#### Propriedades 
* py e px: padding horizontal e vertical 
* d-flex: classe que implementa o display flex, pode aninhar o justify-content-center e outros...
* container-fluid: width 100% at all breakpoints (responsive)
* custom-row: classe para customizar css (padrão)
* mt: margin top
* aria-label: acessibilidade (leitor de tela)
* data-dismiss: fecha o componente acima dele (oculta)
* img responsive: ocupa 100% 
* btn, btn-default, submit...
* Font awesome: library of icons (we fonts or vector graphics). Pixels for size, treated like fonts. Have to add a code on the HTML, can be added to i and span elements to turn it to an icon.\
Designed templates for: botões (default, primary, info, danger), imagens, tables, forms, navigation..
* col-xs-* onde * é o número de colunas ocupado e xs é o tipo de device, nesse caso é um extra small (smartphone)
* class well: create a visual sense of depth for columns.
* each id must be unique to a specifique element and used once per page.
* We can modify HTML elements without needing to actually change them in HTML.

### Extra
* [X] Capitulo de bootstrap FreeCodeCamp
* [X] Exercício landing page