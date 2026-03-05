import Model.Moneda;
import Service.Consulta_Api;
import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consulta_Api consulta = new Consulta_Api();

        Gson gson = new Gson();


        int opcion;

        do {
            System.out.println("*********************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda");
            System.out.println("1) Quetzales a Dólares");
            System.out.println("2) Dólares a Quetzales");
            System.out.println("3) Dólar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dólar");
            System.out.println("5) Peso Mexicano a Dólar");
            System.out.println("6) Dólar a Peso Mexicano");
            System.out.println("7) Salir");
            System.out.println("*********************************");

            opcion = scanner.nextInt();
            if (opcion == 7){
                System.out.println("Gracias por usar el conversor.");
                break;
            }
            if (opcion < 1 || opcion > 6){
                System.out.println("Opción inválida. Intente nuevamente.");
                continue;
            }

            System.out.println("Ingrese el valor que deseas convertir");
            double cantidad = scanner.nextDouble();

            String json = consulta.obtenerDatos();
            Moneda moneda = gson.fromJson(json, Moneda.class);

            double resultado = 0;
            String origen = "";
            String destino = "";

            switch (opcion){
                case 1 -> {
                    origen = "GTQ";
                    destino = "USD";
                    resultado = cantidad / moneda.conversion_rates().get("GTQ");
                }

                case 2 -> {
                    origen = "USD";
                    destino = "GTQ";
                    resultado = cantidad * moneda.conversion_rates().get("GTQ");
                }

                case 3 -> {
                    origen = "USD";
                    destino = "BRL";
                    resultado = cantidad * moneda.conversion_rates().get("BRL");
                }

                case 4 -> {
                    origen = "BRL";
                    destino = "USD";
                    resultado = cantidad / moneda.conversion_rates().get("BRL");
                }

                case 5 -> {
                    origen = "MXN";
                    destino = "USD";
                    resultado = cantidad / moneda.conversion_rates().get("MXN");
                }

                case 6 -> {
                    origen = "USD";
                    destino = "MXN";
                    resultado = cantidad * moneda.conversion_rates().get("MXN");
                }
                default -> System.out.println("Opcion Invalida");
            }
            System.out.printf(
                    "El valor %.2f [%s] corresponde al valor final de ===> %.2f [%s]%n",
                    cantidad, origen, resultado, destino
            );

        }while (opcion != 7);
        scanner.close();
    }
}
