import java.util.Scanner;
public class reto1.java
{
	public static void main(String[] args) {
		int tempIn;
		String nombre;
		int controlador, cenToF, farToC;
		Scanner tempScan = new Scanner(System.in);
		System.out.println("Hola, ¿Qué quieres convertir?");
		System.out.println("1. c a f ,o, 2.f a c?");
		controlador = tempScan.nextInt();
		
		if(controlador==1){
		    System.out.println("Hola, digita la temp en grados c");
		    tempIn = tempScan.nextInt();
		    cenToF = tempIn*9/5+32;
		    System.out.println("La temperatura en f es: " + cenToF);
		}
		else if(controlador==2){
		    System.out.println("Hola, digita la temp en grados f");
		    tempIn = tempScan.nextInt();
		    farToC=(tempIn-32)*5/9;
		    System.out.println("La temperatura en c es: " + farToC);
		}
		else{
		    System.out.println("Error");
		}
		tempScan.close();
	}
}
