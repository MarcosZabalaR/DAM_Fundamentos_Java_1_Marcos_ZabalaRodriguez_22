package es.MZabala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, por favor introduzca un número entre 0 y 9999.");
        int x = sc.nextInt();
        if (x < 0 || x > 9999) {
            System.out.println("Número no válido.");
        } else {
            System.out.println("Introduzca una acción a realizar: \n 1-Tamaño del número \n 2-Invertir el número \n 3-Comprobar si es capicua");
            int select= sc.nextInt();
            switch (select){
                case 1:
                    check(x);
                    break;
                case 2:
                    investor(x);
                    break;
                case 3:
                    headandtail(x);
                    break;
                default:
                    System.out.println("Elección incorrecta");
                    break;
            }
        }
    }

    /*
    Función main con un switch que hace la función de menú para elegir el programa a realizar
     */

    private static void check(int x) {
            String numero = String.valueOf(x);
            System.out.println("El tamaño del número es: " + numero.length());
    }

    /*
    Pasamos el número a string para medir su tamaño
     */

    private static void investor(int x) {
        String numero =Integer.toString(x);
        String numeroInvertido = "";
        for (int i=numero.length()-1;i>=0;i--) {
            numeroInvertido = numeroInvertido + numero.charAt(i);
        }
        System.out.println(numeroInvertido);
    }

    /*
    Usamos un bucle for, que recorre el numero pasado a string de forma inversa, con 2 variables para guardar esta inversion y mostrarla.
     */

    private static void headandtail(int x) {
        int u=0,d=0,c=0,m=0;
        for (int i = 0; i <x; i++) {
            u++;
            if(u==10){
                u=0;
                d++;
                if(d==10){
                    d=0;
                    c++;
                    if(c==10){
                        c=0;
                        m++;
                    }
                }
            }
        }
        if(x>1000){
            if(u==m && d==c){
                System.out.println("Sí es capicua");
            }else{
                System.out.println("No es capicua");
            }
        }else{
            if(x>100){
                if(u==c){
                    System.out.println("Sí es capicua");
                }else{
                    System.out.println("No es capicua");
                }
            }else{
                if(x>10){
                    if(u==d){
                        System.out.println("Sí es capicua");
                    }else{
                        System.out.println("No es capicua");
                    }
                }else{
                    System.out.println("Introduzca más de un número, por favor.");
                }
            }
        }
    }

    /*
    Contador que separa el número en 4 variables máximo y opera en base al número total de variables con un conjunto de if anidados
     */
}