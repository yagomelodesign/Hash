package hashtimecount;
import java.util.*;

public class HashTimeCount {

    public static void main(String[] args) {
        HashMap<Integer,String> pessoaHashMap = 
                new HashMap<>();
        ArrayList<Integer> pessoaArray = 
                new ArrayList<>();
        LinkedList<Integer> pessoaLinkedList =
                new LinkedList<>();
        
        // Medindo tempo de inserção
        long tempoInicial, tempoFinal;

        // HashMap
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<200000;i++){
            pessoaHashMap.put(i, "Pessoa " + i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de Adição no HashMap: %.3f \n", 
                (tempoFinal - tempoInicial)/1000.00);

        // ArrayList
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<200000;i++){
            pessoaArray.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de Adição no ArrayList: %.3f \n", 
                (tempoFinal - tempoInicial)/1000.00);

        // LinkedList
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<200000;i++){
            pessoaLinkedList.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de Adição na LinkedList: %.3f \n", 
                (tempoFinal - tempoInicial)/1000.00);
    }
}
