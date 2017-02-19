package caraocruz;

import java.io.*;

public class caraocruz {

	public static void main(String[] args) throws IOException {
		int cantidad = 0;
		do {
			System.out.println("Introduce tu apuesta.");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int teclado=Integer.parseInt(br.readLine());
			try {
				cantidad=teclado;	
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un número.");
				return;
			}
			int moneda=(int)(Math.random()*2);
			if (moneda==0){
				cantidad=cantidad*2;
				System.out.println("Ha salido cara, ha ganado "+cantidad+" euros.");
			}else {
				System.out.println("Ha salido cruz, lo ha perdido todo.");
			}			
		} while (cantidad!=0);
		System.out.println("¡Gracias por jugar!");
	}
}