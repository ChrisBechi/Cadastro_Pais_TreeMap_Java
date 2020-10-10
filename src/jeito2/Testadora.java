package jeito2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Testadora {
    public static void main(String[] args) {
        TreeMap<String, Estado> atlas = new TreeMap<String, Estado>();
        
        Estado sp = new Estado("sp","Selva de pedra.");
        Estado es = new Estado("es","Espirito Santo.");
        Estado pe = new Estado("pe","pernanbuco.");
        Estado rj = new Estado("rj","Cidade maravilhosa.");
        Estado pr = new Estado("pr","Paraná.");
        
        atlas.put(sp.getSigla(), sp);
        atlas.put(es.getSigla(), es);
        atlas.put(pe.getSigla(), pe);
        atlas.put(rj.getSigla(), rj);
        atlas.put(pr.getSigla(), pr);
        
        listEstados(atlas);
    }
    
    
    public static void listEstados(TreeMap<String, Estado> atlas){
        Set siglas = atlas.keySet();
        Iterator it = siglas.iterator();
        while(it.hasNext()){
            String siglaAtual = (String) it.next();
            atlas.get(siglaAtual).mostrarEstado();
        }
    }
}
