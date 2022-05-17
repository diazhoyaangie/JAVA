import javax.swing.JOptionPane;
  
  public class ejer12{

      public static void main(String arg[]){



int aparato= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuánto Costó el Aparato que Compró?"));
 
String marca= Integer.String(JOptionPane.showInputDialog(null,"¿Qué Marca es el Aparato?"));
 
 if (aparato>=2000) {
     
   Double descuento= aparato*0.10;
   Double des=aparato-descuento;
   JOptionPane.showMessageDialog(null,"Por Haber Adquirido un Aparato con precio Mayor a $2000, se le hace un Descuento del 10% sobre el Total de su Compra. Ahora, su Compra le cuesta $"+des);
}
if (marca.equals("nosy")) {
  Double descuento= aparato*0.10;
 Double des=aparato-descuento;
    Double nosy=des*0.05;
   Double oferta=des-nosy;
    JOptionPane.showMessageDialog(null,"Y por haber Adquirido un aparato marca NOSY, se le hace un Descuento adicional del 5% sobre el Total de su Compra. Ahora su Compra le Cuesta $"+oferta);
} 


else if(marca.equals("nosy")){
  Double descuento= aparato*0.10;
     Double des=aparato-descuento;
   Double nosy=aparato*0.05;
   Double oferta=aparato-nosy;
    JOptionPane.showMessageDialog(null,"Por haber Adquirido un aparato marca NOSY, se le hace un Descuento adicional del 5% sobre el Total de su Compra. Ahora su Compra le Cuesta $"+oferta);
    

}

else {
   JOptionPane.showMessageDialog(null,"No Obtiene ningún Tipo de Descuento, el Total de su compra es de $"+aparato);
}

}
}