import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            EXTERNA:
            while (true){
                System.out.println("Conversor de moneda");
                System.out.println("1 - Soles peruanos a dolares \n" +
                        "2 - Pesos mexicanos a dolares \n"
                         + "3 - Pesos argentinos a dolares \n"
                         + "4 - Salir");
                System.out.println("Ingrese un opcion : ");
                Scanner leer = new Scanner(System.in);
                char opcion = leer.next().charAt(0);

                switch (opcion){
                    case '1':
                        convertir(3.73, "Soles peruanos");
                        break;
                    case '2':
                        convertir(17.21, "Soles mexicanos");
                        break;
                    case '3':
                        convertir(873.75, "Soles argentinos");
                        break;
                    case '4':
                        System.out.println("Cerrando programa");
                        break EXTERNA;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

            }

        }

        static void convertir(double valorDolar, String pais){
            Scanner leer = new Scanner(System.in);
            System.out.printf("Ingrese la cantidad de %s :", pais);
            double cantidadMoneda = leer.nextDouble();

            double dolares = cantidadMoneda / valorDolar;

            dolares = (double) Math.round(dolares * 100d)/100;

            System.out.println("=============================================");

            System.out.println("|        Tienes $" + dolares +"Dolares       |");

            System.out.println("=============================================");
        }

    }