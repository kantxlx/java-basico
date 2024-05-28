public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou um programa no metodo main.");
        a();
        System.out.println("Finalizou o programa no método main.");
    }
    static void a(){
        System.out.println("Entrou no metodo a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b(){
        System.out.println("Entrou no metodo b.");
        for(int i = 0; i <=4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no metodo c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
