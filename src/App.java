import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double altura,resultado,resultado2;
        int sexo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("1- HOMEM: ");
        System.out.print("\n2- MULHER: ");
        
        System.out.print("\nEscolha uma opcao: ");
        sexo = teclado.nextInt();

        System.out.print("\nColoque sua altura: ");
        altura = teclado.nextDouble();
        teclado.close();

        resultado = (72.7*altura) - 58;
        resultado2 = (62.1*altura) - 44.7;
        

        if(sexo == 1){
            System.out.printf("\nO seu peso ideal para homem eh: %.2f ",resultado);
        }else if(sexo == 2){
            System.out.printf("\nO seu peso ideal para mulher eh: %.2f",resultado2);
        }

    }
}
