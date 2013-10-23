package actividad11;

import java.util.Scanner;

public class PracticaLayout {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		int n;
		do{
			System.out.println(
				"¿Desea introducir separación entre los botones?"
				+ "\n1.-No"
				+ "\n2.-Si"
				+ "\n0.-Salir");
			n = reader.nextInt();
			
			if(n==1){
				new Model();
			}
			else if(n==2){
				System.out.println("Introduce separación vertical");
					int v = reader.nextInt();
				System.out.println("Introduce separación horizontal");
					int h = reader.nextInt();
				new Model(v,h);
			}
		
		}while(n!=0);
			System.out.println("¡Hasta la vista!");
		
	}

}
