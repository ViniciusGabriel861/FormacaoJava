import java.util.Scanner;

public class Contador  {
    public static void main(String[] args){

        int inicio = 0, fim = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, tudo bem? Este é meu código <>");

        System.out.println("Insira um valor para a condição de início:");
        inicio = scanner.nextInt();
        System.out.println("Insira um valor para a condição de parada:");
        fim = scanner.nextInt();



        try {
            contar(inicio, fim);

        }catch ( ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }
    static void contar(int inicio, int fim)throws ParametrosInvalidosException  {
        int intervalo = (fim - inicio);

        if(fim < inicio){
            throw new ParametrosInvalidosException();

        }

        for (int i = 0; i < intervalo; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

