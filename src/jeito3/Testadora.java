/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeito3;

public class Testadora {
    public static void main(String[] args) {
        Estado sp = new Estado("sp","Selva de pedra.");
        Estado es = new Estado("es","Espirito Santo.");
        Estado pe = new Estado("pe","pernanbuco.");
        Estado rj = new Estado("rj","Cidade maravilhosa.");
        Estado pr = new Estado("pr","Paraná.");
        
        Atlas at = new Atlas();
        at.incluirEstado(sp);
        at.incluirEstado(es);
        at.incluirEstado(pe);
        
        at.listar();
        
    }
}

