import java.util.Scanner;
public class ejercicio7
{
  public static void main (String[]args)
  {
    String nombre1="", nombre2="", nombre3="", nMayor="", nMenor="";
    int edad1 = 0, edad2 = 0, edad3 = 0, eMayor = 0, eMenor = 0, eMedio = 0;
    Scanner edadScan = new Scanner (System.in);
        System.out.println("Bienvenido al sistema para calcular mayoria y menoria de edad entre hijos");
        System.out.println("Ingresa el nombre del primer hijo");
            nombre1 = edadScan.nextLine();
        System.out.println("Ingresa la edad del primero hijo");
            edad1 = edadScan.nextInt();
        System.out.println("Ingresa el nombre del segundo hijo");
        edadScan.nextLine();
            nombre2 = edadScan.nextLine();
        System.out.println("Ingresa la edad del segundo hijo");
            edad2 = edadScan.nextInt();
        System.out.println("Ingresa el nombre del tercer hijo");
            edadScan.nextLine();
            nombre3 = edadScan.nextLine();
        System.out.println("Ingresa la edad del tercer hijo");
            edad3 = edadScan.nextInt();
        if(edad1>edad2 && edad1>edad2)
        {
          eMayor=edad1;
          nMayor=nombre1;
        }
            else if(edad2>edad1 && edad2>edad3)
            {
                eMayor=edad2;
                nMayor=nombre2;
            }
                else if(edad3>edad1 && edad3>edad2)
                {
                    eMayor=edad3;
                    nMayor=nombre3;
                }
        if(edad1<edad2 && edad1<edad2)
        {
            eMenor=edad1;
            nMenor=nombre1;
        }
            else if(edad2<edad1 && edad2<edad3)
                {
                    eMenor=edad2;
                    nMenor=nombre2;
                }
                    else if(edad3<edad1 && edad3<edad2)
                        {
                            eMenor=edad3;
                            nMenor=nombre3;
                        }
        System.out.println("El hijo mayor es " + nMayor + ", tiene: " + eMayor);
        System.out.println("el menor es: " + nMenor + " con edad: " + eMenor);
        eMedio = (edad1+edad2+edad3)-(eMayor+eMenor);
        System.out.println("el de en medio tiene: " + eMedio);
        edadScan.close();
    }
}