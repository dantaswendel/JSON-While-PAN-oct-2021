package com.wendel.json;

	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	  
	public class Escrita {
	
	    public static void main(String[] args) throws FileNotFoundException 
	    {
	        // criando Objeto JSON
	        JSONObject livro = new JSONObject();
	          
	        // adicionando itens ao Objeto
	        livro.put("Titulo", "A Cidade da Bahia");
	        livro.put("Autor", "Crônica");
	        livro.put("ANO",2000);
	          
	        // Criando LinkedHashMap
	        Map m = new LinkedHashMap(4);
	        m.put("Editora", "A casa das palavras");
	        m.put("Genero", "Cronica");
	        m.put("Cidade", "Sao Paulo");
	        m.put("Edicao", 12);
	          
	        // Endereçando o JSONOject
	        livro.put("address", m);
	          
	        // Criando JSONArray DADOS
	        JSONArray ja = new JSONArray();
	          
	        m = new LinkedHashMap(2);
	        m.put("Capa", "Capa Dura");
	        m.put("ISBN", "8572780556");
	          
	         
	        ja.add(m);
	          
	        livro.put("Dados de Capa",ja);
	          
	        // Gravando arquivo Json
	        PrintWriter pw = new PrintWriter("JSONExample.json");
	        pw.write(livro.toJSONString());
	          
	        pw.flush();
	        pw.close();
	    }
	}