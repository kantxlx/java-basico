import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String sigla;
        System.out.println("Digite a medida da roupa: \n ex: P, M ou G");
        sigla = scanner.next();

        //Switch case
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("TAMANHO INDEFINIDO");;
            }
    }
}
