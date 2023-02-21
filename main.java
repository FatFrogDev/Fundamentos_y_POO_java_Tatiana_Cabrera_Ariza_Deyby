import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner autoScan  = new Scanner(System.in);
        String name ;
        String rep;
        int valor;
        int valorPrevio;
        int valorTotal;
        int valor1 = 1500;
        int valor2 = 2000;
        int valor3 = 2500;
        int valor4 = 3000;
        System.out.println("Bienvenido al sistema para calcular el valor del arreglo del automóvil, ingresa tu nomnbre");
        name = autoScan.nextLine();
        System.out.println("A continuación, te mostraremos el listado de valores");
        System.out.print("1. Llantas = 1500");
        System.out.println("2. Motor = 2000");
        System.out.println("3. Pintura = 2500");
        System.out.println("4. Golpes = 3000");
        int i = 1;
        while (i == 1){
            valorTotal=valorPrevio;
        System.out.println("Si quieres hacer más de una reparación escribe 1, o en su defecto escribe 2");
        int contvalor1 = autoScan.nextInt();
        if (contvalor1==2){
            System.out.println("Escribe el número correspondiente a la reparación");
            int opcion=autoScan.nextInt();
            switch(opcion){
                case 1:{
                    valorPrevio=valor1;
                }
                    break;
                case 2:{
                  valorPrevio=valor2;
                }
                    break;
                case 3:{
                    valorPrevio=valor3;
                }
                    break;
                case 4:{
                    valorPrevio=valor4;
                }
                    break;   
            default: {
                valorPrevio=valor1;
            }
            }
        }
            else{

            }
        System.out.println("¿Deseas hacer otra reparación?, si es así, escribe 1, si no, escribe 2");
        int continuar = autoScan.nextInt();
            if(continuar==1){
                i=1;
                valorPrevio = valorTotal + valorPrevio;
            }
                else{
                    valorTotal = valorPrevio;
                    i=2;
                }
        }
    }
}