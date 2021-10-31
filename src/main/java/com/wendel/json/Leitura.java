package com.wendel.json;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
  
public class Leitura
{
    public static void main(String[] args) throws Exception 
    {

    	Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
          
        JSONObject livro = (JSONObject) obj;
          
        String Titulo = (String) livro.get("Titulo");
        String Autor = (String) livro.get("Autor");
          
        System.out.println(Titulo);
        System.out.println(Autor);
          
        long ANO = (long) livro.get("ANO");
        System.out.println(ANO);
          
        Map address = ((Map)livro.get("address"));
          
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
          
        JSONArray ja = (JSONArray) livro.get("Dados de Capa");
          
        Iterator itr2 = ja.iterator();
          
        while (itr2.hasNext()) 
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}