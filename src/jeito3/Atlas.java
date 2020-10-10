/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeito3;

import java.util.*;

public class Atlas {
    	private TreeMap<String, Estado> atlas;
    
    	public Atlas(){
        	atlas = new TreeMap<String, Estado>();
    	}
    
    	public void incluirEstado(Estado est){
        	atlas.put(est.getSigla(), est);
    	}
    
    	public void listar(){
        	Set siglas = atlas.keySet();
        	Iterator it = siglas.iterator();
        	while(it.hasNext()){
            		String siglaAtual = (String) it.next();
            		atlas.get(siglaAtual).mostrarEstado();
        	}
    	}
}
