package tarea8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by yamir on 10/12/15.
 */
public class problema3 {
    /* la empresa milagrito tiene la siguiente tabla de parametros para pagar las comisiones de sus
        ejecutivos de ventas:
        venta por:          comision:
        2 500.00             7%
        8 600.00             7.5%
        10 560.00            8%
        20 000.00            8.7%
        21 200.00            8.8%
        30 000.00            10%
        50 000.00            15%
        mas de 50            20%
        escriba un programa que al introducir la unidad vendida por el ejecutivo de ventas se calcule cual
        es la comision a devengar.
     */
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println( " Calcular comisiones V 3.0 ");
        String ans;
        char rpta = 's';
        while ((rpta == 's') | (rpta == 'S')) {

                try {

                    DecimalFormat decimales = new DecimalFormat("0.00");
                    Double res;
                    Double com;
                    System.out.print("Introduzca la unidad vendida: ");
                    String temp = br.readLine();

                    Double x = Double.parseDouble(temp);
                    while (x<0){
                        System.out.print("Introduzca solo numeros positivos: ");
                        temp = br.readLine();

                        x = Double.parseDouble(temp);

                    }
                    if (x <= 2500) {
                        com = x * 0.07;
                        res = x + com;
                    } else if (x > 2500 && x <= 8600) {
                        com = x * 0.075;
                        res = x + com;
                    } else if (x > 8600 && x <= 10560) {
                        com = x * 0.08;
                        res = x + com;
                    } else if (x > 10560 && x <= 20000) {
                        com = x * 0.087;
                        res = x + com;

                    } else if (x > 20000 && x <= 21200) {
                        com = x * 0.088;
                        res = x + com;
                    } else if (x > 21200 && x <= 30000) {
                        com = x * 0.10;
                        res = x + com;
                    } else if (x > 30000 && x <= 50000) {
                        com = x * 0.15;
                        res = x + com;
                    } else {
                        com = (x * 0.20);
                        res = x + com;
                    }

                    System.out.println("La comision es de: " + decimales.format(com));
                    System.out.println( "El valor introducido fue de: " + decimales.format(x));
                    System.out.println( "El total es de: " + decimales.format(res));
                    System.out.println("Desea continuar [S] Si, [N] No : ");
                    ans = br.readLine();
                    rpta = ans.charAt(0);
                    while (!(rpta =='s' || rpta =='S' || rpta =='n' || rpta == 'N')){
                        System.out.println("solo S o N"  );
                        ans = br.readLine();
                        rpta = ans.charAt(0);

                    }


                } catch (Exception e) {
                    System.out.println("introduzca solo numeros");
                }
            }
        System.out.println("Fin del programa :)");


        }
    }