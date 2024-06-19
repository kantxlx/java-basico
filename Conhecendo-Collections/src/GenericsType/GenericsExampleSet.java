package GenericsType;
import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) {
        //exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10); //permite adicionar qualquer tipo de objeto

        //Exemplo de Generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        //Iterando sobre a conjunto com Generics
        for(String elemento : conjuntoGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre a conjunto sem Generics(necessario fazer cast)
        for(Object elemento : conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
