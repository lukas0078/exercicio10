import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 08/04/2023 */

public class App {

  public static void main(String[] args) {
    System.out.println("Digite uma temperatura, em Celsius: ");
    float celsius = new Scanner(System.in).nextFloat();
    double farenheit = 1.80 * celsius + 32;
    System.out.printf("A temperatura, em Farenheit, eh de: %.2f graus Farenheit", farenheit);
  }

}