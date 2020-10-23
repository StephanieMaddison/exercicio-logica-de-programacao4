import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o valor A, B e C:");
		float a = ler.nextFloat();
		float b = ler.nextFloat();
		float c = ler.nextFloat();
		
		Calcular deltac = new Calcular();
		
		float delta = deltac.calcularbask(a, b, c);

		System.out.println("Delta: " + delta);
		 if (delta < 0)
         {
			 System.out.println("O valor de delta menor que zero");
         }       
         
         else       
         {           
             double x1 = deltac.calc1(a, b, delta);
             double x2 = deltac.calc2(a, b, delta);
   
             
             
             System.out.printf ("O valor de X1:  "+x1+ "\nO valor de X2: "+x2);
         }
		
	}

}
