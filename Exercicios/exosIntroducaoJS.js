//1. Criar função que recebe um número e verifica se é par ou impar. 

function parOuImpar(numero){
    let tipo = "O número é...";
    if (numero % 2 == 0){
        tipo += "par";
    } else {
        tipo += "impar";
    }
    return tipo;
}
//Testes 
// console.log(parOuImpar(85))


//2. Crie uma arrow function que receba um número e verifique se ele é primo
function numerosPrimos(numero){
    let tipo = " ";
    if (numero % 2 != 0){
        tipo = "É primo.";
    } else {
        if (numero == 2){
            tipo = "É primo."
        } else {
            tipo = "Não é primo.";
    }}
    return tipo; 
}

// Testes
// console.log(numerosPrimos(5))
// console.log(numerosPrimos(4))


/*3. Crie uma função que imprime de 10 até 1 e depois imprime na tela 
"feliz ano novo" através de uma callback*/

function imprimir10a1 (frase){
    for (let i = 10; i >= 1; i--){
        console.log(i)
    }
    frase()
}

function imprimirFrase(){
    console.log("Feliz ano novo!")
}

// Teste
// imprimir10a1(imprimirFrase)

/*4. Crie uma função que imprime de 10 até 1 e depois imprime na tela 
"feliz ano novo" utilizando Promise com concatenação de then*/

const impressaoNumeros = new Promise ((ok, nok) => {
    let sequencia = "";
    for (let i = 10; i >= 1; i--){
        sequencia += i + "\n";
        console.log(sequencia)
    }
    ok(sequencia);
})

const impressaoFrase = new Promise ((ok, nok) => {
    ok("Feliz ano novo!");
})

//Testes
// impressaoNumeros
//     .then(function (ok) {return console.log(ok)})
//     .then(function() {return impressaoFrase})
//     .then(function(ok) {return console.log(ok)});

/*5. Crie uma função que imprime de 10 até 1 e depois imprime na tela 
"feliz ano novo" utilizando o método async/await*/

const impressao = async () => {
    try {
        const primeiraImpressao = await impressaoNumeros;
        const segundaImpressao = await impressaoFrase;
        console.log(primeiraImpressao);
        console.log(segundaImpressao);
        
    } catch (error) {
        console.log(error)
    }
}

// Testes
// impressao(); 


/*6. Crie um array com as seguintes notas [5.3, 4.7, 8.5, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0]
e construa uma função para imprimir apenas as notas acima de 7*/

function impressaoNotasAcimaDe7() {
    let arrayDeNotas = [5.3, 4.7, 8.5, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];
    for (let i = 0; i < arrayDeNotas.length; i++){
        let elemento = arrayDeNotas[i];
        if (elemento > 7){
            console.log(elemento)
        }
    }
}

//usando filter 
const arrayDeNotas = [5.3, 4.7, 8.5, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];
const filtroArrayDeNotas = 
    arrayDeNotas.filter (numero => {
        return numero > 7;
    })

// Testes
// impressaoNotasAcimaDe7()
// console.log(filtroArrayDeNotas)

/*7.Crie um array de objetos onde cada objeto será um produto de supermercado e terá
o nome do produto e o seu respectivo preço, agora construa uma função que some todos
os valores e te devolva o total. */

const produtosDeSupermercado = [
    {nome: "leite",
    preco: 3.50},

    {nome: "feijao",
    preco: 7},

    {nome: "arroz",
    preco: 3.25},

    {nome: "tomate",
    preco: 3.80}
];

function somaDosProdutos (arrayDeProdutos) {
    let total = 0;
    arrayDeProdutos.forEach(function (obj) {
        total += obj.preco
    })
    return total
}

// Testes
console.log(somaDosProdutos(produtosDeSupermercado))

/* 8. Em uma escola ficou definido que os alunos do 8º ano terão 
aulas de história e os alunos do 9º terão aulas de física às quartas-feiras. 
Você deve criar uma função que receba um array de objetos contento nome e série de
cada aluno e atribua a respectiva disciplina da quarta-feira 
(o array de alunos deve ser criado como você desejar, contanto que contenha pelo
menos 5 alunos.*/ 

const alunos = [
    {nome: "Patricia ",
    serie: 8},
    {nome: "Jefte",
    serie: 9},
    {nome: "Thomas",
    serie: 9},
    {nome: "Clara",
    serie: 8},
    {nome: "Gustavo",
    serie: 8},
    {nome: "Ricardo",
    serie: 8},
    {nome: "Evandro",
    serie: 9},
    {nome: "Emanuel",
    serie: 8},
    {nome: "Juliana",
    serie: 9},
    {nome: "Carla",
    serie: 9},
    {nome: "Débora",
    serie: 9},
]

function disciplinaDaQuarta (array){
    for (let i = 0; i < array.length; i++){
        let aluno = array[i];
        let disciplina = " ";
        if (aluno.serie == 9) {
            disciplina = "Física.";
        } else {
            disciplina = "História.";
        }
        console.log("Aluno(a): " + aluno.nome + " - Aula de: " + disciplina + "\n");
    }
}

// Testes
// disciplinaDaQuarta(alunos)