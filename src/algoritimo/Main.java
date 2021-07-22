
package algoritimo;

import java.util.Scanner;

/**
 *
 * @author wilian
 */
public class Main {

    public static void main(String[] args) {
        int DIAS_NO_ANO = 365;
        int DIAS_NO_MES = 30;
            int dias;
            int meses;
            int anos;
            Scanner leitor = new Scanner(System.in);
		
	System.out.println("Informe a sua idade.");
	System.out.print("Anos: ");
	anos = leitor.nextInt();
		
	System.out.print("Meses: ");
	meses = leitor.nextInt();
		
	System.out.print("Dias: ");
	dias = leitor.nextInt();
		
	dias += (anos * DIAS_NO_ANO) + (meses * DIAS_NO_MES);
		
	System.out.println("\n\nA sua idade em dias é " + dias);
	}
}
    
    
