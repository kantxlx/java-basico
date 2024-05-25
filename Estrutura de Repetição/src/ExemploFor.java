public class ExemploFor {
    public static void main(String[] args) throws Exception {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        System.out.println("Iguinho o perigoso dormiu!!!");

        //Tambem usamos o for para interagir sobre arrays e coleções

        String alunos [] = {"AFONSO", "CLAUDINHO", "ROGERINHO", "THIAGO DELAS"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("\nO aluno no indice x= " + x + " é " + alunos[x]);
        }

        //Tambem usamos o for / each onde ele está relacionado em um cenario onde contenha um array ou coleção

        //forma abreviada
        System.out.println("\n");
        for(String aluno : alunos) {
            System.out.println("nome do aluno é: " + aluno);
        }

        //E usado tambem com o for o break e o continue
        //break
        System.out.println("\n");
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                break;
            }
            System.out.println(numero);
        }

        //continue
        System.out.println("\n");
        for(int numeros = 1; numeros <= 5; numeros++){
            if(numeros == 3){
                continue;
            }
            System.out.println(numeros);
        }

    }
}
