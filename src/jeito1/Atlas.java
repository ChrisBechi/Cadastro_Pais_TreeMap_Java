/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeito1;


import java.util.*;

public class Atlas {
    public TreeMap<String, Atlas> atlas;
    private String sigla;
    private String descricao;
    
    public Atlas(String sig, String desc){
        this.sigla = sig;
        this.descricao = desc;
    }
    
    public Atlas(){
        atlas = new TreeMap<String, Atlas>();
    }

    

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void incluirEstado(Atlas estado){
         atlas.put(estado.getSigla(), estado);
    }
    
    public void mostrarEstado(){
        System.out.println("Sigla:"+this.sigla+", Descrição:"+this.descricao);
    }  
    
    public void listar(){
        Set at = atlas.keySet();
        Iterator it = at.iterator();
        while(it.hasNext()){
            String sig = (String) it.next();
            atlas.get(sig).mostrarEstado();
        }
    }
}
