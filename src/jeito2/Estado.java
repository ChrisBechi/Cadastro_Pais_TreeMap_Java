/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeito2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author christian
 */
public class Estado {
    private String sigla;
    private String descricao;
    
    public Estado(String sig, String est){
        this.sigla = sig;
        this.descricao = est;
    }
    
    public String getSigla(){
        return this.sigla;
    }
    
    public void setSigla(String sig){
        this.sigla = sig;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String desc){
        this.descricao = desc;
    }
   
    public void mostrarEstado(){
        System.out.println("Sigla:"+this.sigla+", Descrição:"+this.descricao);
    }    
}
