import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del animal");
        String nombre = scanner.next();
        System.out.println("Escriba el tipo de animal");
        String tipo = scanner.next();
        System.out.println("Escriba la edad del animal");
        int edad = scanner.nextInt();
        int pesoAnimal = edad*50;
        System.out.println(tipo);
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("El peso de "+nombre+" es de: "+pesoAnimal);  
    }
}