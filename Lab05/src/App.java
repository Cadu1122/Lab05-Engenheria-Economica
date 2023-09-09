public class App {

    // Projeto para a matéria de engenharia economica para Software
    public static void main(String[] args) {

        //[I] - CELFA - 05/09/2023
        imprimirDados();

        System.out.println(somar(2, 5));
        //[F] - CELFA - 05/09/2023
    }

    public static void imprimirDados() 
    {
        System.out.println("Carlos Aquino"); System.out.println("Engenharia Economica para Software");
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}