/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeito1;

/**
 *
 * @author christian
 */
public class testadora {
        public static void main(String[] args) {
        Atlas atlas = new Atlas();
        Atlas es = new Atlas("es","Espirito Santo.");
        Atlas pe = new Atlas("pe","pernanbuco.");    
        Atlas pr = new Atlas("pr","Paraná.");
        Atlas rj = new Atlas("rj","Cidade maravilhosa.");
        Atlas sp = new Atlas("sp","Selva de pedra.");
        atlas.incluirEstado(sp);       
        atlas.incluirEstado(es);
        atlas.incluirEstado(pe);
        atlas.incluirEstado(rj);
        atlas.listar();
        System.out.println("---------------------");
        atlas.incluirEstado(pr);
        atlas.listar();
               
    }
}
