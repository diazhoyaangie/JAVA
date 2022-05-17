

import java.util.Scanner;
public class ejer1{


    public static void main(String[]args)   {
        Scanner entrada=new Scanner(System.in);

        int horastrabajadas,total,horasextras;
        System.out.println("ingrese el numero de horas trabajadas");
        horastrabajadas=entrada.nextInt();

        if(horastrabajadas<=40)     {
            total=horastrabajadas*16;
            System.out.println("su sueldo es de $"+total);

        }
        else{
            horasextras=horastrabajadas-40;
            total=(horasextras*20)+(40*16);
            System.out.println("su sueldo es de $"+total);
        }
    }
}