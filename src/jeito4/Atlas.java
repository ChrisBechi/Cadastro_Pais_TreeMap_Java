/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeito4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author christian
 */
public class Atlas {
    TreeMap<String, String> atlas;
    
    public Atlas(){
        atlas = new TreeMap<String, String>();
    }
    
    public void incluir(String sig, String nome){
        atlas.put(sig, nome);
    }
    
    public void listar(){
        Set lol = atlas.entrySet();
        Iterator it = lol.iterator();
        while(it.hasNext()){
            System.out.println(atlas.get(it.next()));
        }
    }
}
