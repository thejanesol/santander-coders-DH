package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.Map;
import java.util.Queue;

public class Programa {
	public static void main(String[] args) {
//-------------------- HashSet ----------------------------------------
//		Set<Produto> produtos = new HashSet<>();
//		
//		produtos.add(new Produto("farinha de trigo", 3.45));
//		produtos.add(new Produto ("ovos", 9.99));
//		produtos.add(new Produto ("açucar", 3.05));
//		produtos.add(new Produto ("manteiga", 15.99));
//		produtos.add(new Produto ("fermento", 3.55));
//		produtos.add(new Produto ("cacau em po", 6.78));
//		produtos.add(new Produto ("leite condensado", 4.52));
//		produtos.add(new Produto ("creme de leite", 1.79));
//		produtos.add(new Produto ("abacaxi", 3.50));
//		
//		for (Produto produto : produtos) {
//			System.out.println(produto);
		
		
		
//		}
//-------------------- List ----------------------------------------
//		List<ReceitaBolo> produtos = new ArrayList<>();
//		produtos.add(new ReceitaBolo(" 1 - ovos"));
//		produtos.add(new ReceitaBolo(" 2 - açucar"));
//		produtos.add(new ReceitaBolo(" 3 - manteiga"));
//		produtos.add(new ReceitaBolo(" 4 - farinha de trigo"));
//		produtos.add(new ReceitaBolo(" 5 - fermento"));
//		produtos.add(new ReceitaBolo(" 6 - cacau em po"));
//		produtos.add(new ReceitaBolo(" 7 - leite condensado"));
//		produtos.add(new ReceitaBolo(" 8 - creme de leite"));
//		produtos.add(new ReceitaBolo(" 9 - abacaxi"));
//		produtos.add(new ReceitaBolo(" 10 - açucar"));
//		
//		
//		for (ReceitaBolo produto : produtos) {
//			System.out.println(produto);
//		}
		
//-------------------- Map ----------------------------------------		
//		Map<String, String> materiais = new HashMap<>();
//		materiais.put("Junior", "Colher de pau");
//		materiais.put("Seu Geraldo", "Fuê");
//		materiais.put("Dona Rute", "Leite");
//		System.out.println(materiais.get("Seu Geraldo"));
//		
//		Map<String, List<String>> coisas = new HashMap<>();
//		List<String> lista = new ArrayList<>();
//		lista.add("vasilha");
//		lista.add("panela");
//		
//		coisas.put("Maria", lista);
//		System.out.println(coisas);
//		
//		for (String chave : materiais.keySet()) {
//			System.out.println(chave + " - " +materiais.get(chave));
//		}
		
//		Map<String, Produto> materiais = new HashMap<>();
//		materiais.put("Seu Geraldo", new Produto("Leite", 3.5));
//		materiais.put("Junior", new Produto("Vasilha", 2.5));
//		materiais.put("Marina", new Produto("doce de leite", 5.70));
//		System.out.println(materiais);
		
//-------------------- Fila ----------------------------------------
		Queue<Produto> fila = new LinkedList<>();
		fila.add(new Produto("Maizena", 2.5));
		fila.add(new Produto("Farinha", 3.5));
		fila.add(new Produto("Leite", 4.5));

		System.out.println(fila.peek());
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		
		Queue<String> fila2 = new LinkedList<>();
		fila2.add("junior");
		fila2.add("ana");
		System.out.println(fila2);
		
//-------------------- Pilha ----------------------------------------
		Stack<String> pilha = new Stack<>();
		pilha.push("um");
		pilha.push("dois");
		pilha.push("tres");
		pilha.pop();
		System.out.println(pilha);
		
	}
}