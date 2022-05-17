import javax.swing.JOptionPane;
  
  public class ejer9{

      public static void main(String arg[]){
          float valor=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de su compra" ));
         float bolita=Integer.parseInt(JOptionPane.showInputDialog("por favor escribe el color de la bolita que sacaste" ));
         
         if(bolita=="blanco"){
             JOptionPane.showMessageDialog(null,"No tiene ningún descuento");     
         }

         else if(bolita=="verde"){
             JOptionPane.showMessageDialog(null, "tendrá un descuento del 10%");
             float descuento=(float)valor*0.10;
             int total=valor-descuento;
             JOptionPane.showMessageDialog(null, "el descuento es de $ "+descuento);
             JOptionPane.showMessageDialog(null, "El total de la compra es de $ "+total);

         }

          else if(bolita=="amarilla"){
             JOptionPane.showMessageDialog(null, "tendrá un descuento del 25%");
             float descuento=(float)valor*0.25;
             int total=valor-descuento;
             JOptionPane.showMessageDialog(null, "el descuento es de $ "+descuento);
             JOptionPane.showMessageDialog(null, "El total de la compra es de $ "+total);

         }

          else if(bolita=="azul"){
             JOptionPane.showMessageDialog(null, "tendrá un descuento del 50%");
             float descuento=(float)valor*0.50;
             int total=valor-descuento;
             JOptionPane.showMessageDialog(null, "el descuento es de $ "+descuento);
             JOptionPane.showMessageDialog(null, "El total de la compra es de $ "+total);

         }

          else if(bolita=="roja"){
             JOptionPane.showMessageDialog(null, "tendrá un descuento del 100%");
             float descuento=(float)valor*1;
             int total=valor-descuento;
             JOptionPane.showMessageDialog(null, "el descuento es de $ "+descuento);
             JOptionPane.showMessageDialog(null, "El total de la compra es de $ "+total);

         }


      }
  }