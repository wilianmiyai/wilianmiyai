
package porcentagem;

import java.util.Scanner;

/**
 *
 * @author wilian
 */
public class Main {

    public static void main(String[] args) {
        double saldo,saldo_reajustado;
    
Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o saldo original ");
        saldo = ler.nextDouble();
            System.out.println("Foi informado saldo de "+saldo);
                ler.close();
                    System.out.println("O saldo reajustado é "+(saldo * 0.01));
    }
    
}
