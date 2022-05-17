import java.util.Scanner;

 public class ejer13 {
    
    public static void main(String[] args) {
   int kg;

  double desc = 0, tot, pu;

   System.out.println("Ingrese precio de unidad del KG de Manzana: ");
   pu=entrada.real();
   System.out.println("¿Cuantos Kg. ha comprado?: ");
   kg = entrada.entero();

    
   if (kg > 0 && kg <= 2)   {
   desc = 0;}

   else if (kg > 2 && kg <= 5)      {
   desc = 0.1;}

   else if (kg > 5 && kg <= 10) {
   desc = 0.15;}

   else if (kg > 10)    {
   desc = 0.2;}

   tot = (pu * kg) - ((pu * kg) * desc);
   System.out.println("Total a pagar: "+ tot);
}
}