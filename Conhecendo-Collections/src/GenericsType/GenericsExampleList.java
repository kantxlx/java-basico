package GenericsType;
import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        //exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); //permite adicionar qualquer tipo de objeto

        //Exemplo de Generics
        List<String> lisaGenerics = new ArrayList<>();
        lisaGenerics.add("Elemento 1");
        lisaGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for(String elemento : lisaGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem Generics(necessario fazer cast)
        for(Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}