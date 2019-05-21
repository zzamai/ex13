import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer integer;

        System.out.println("Digite um inteiro: ");
        try {
            integer = scanner.nextInt();
            System.out.println("Você digitou "+ integer);
        } catch(InputMismatchException e) {
            System.out.println("Este não é um inteiro numérico");
        } finally {
            System.out.println("Tem como colocar o try em Loop até não entrar em nenhum catch?...");
        }

    }
}
