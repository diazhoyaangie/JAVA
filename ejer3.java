import javax.swing.JOptionPane; 
public class ejer3{
    public static void main(String[] arg){
        String producto=Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre del articulo"));
        int precio1=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del articulo"));
        int clave=Integer.parseInt(JOptionPane.showInputDialog("Digite su clave (1 o 2)"));

        if(clave=1){
            int mul=precio1*0.1;
            int descuento=precio1-mul;
            JOptionPane.showMessageDialog(null,"Articulo: "+producto+"\nPrecio sin descuento: "+precio1+"\nPrecio con descuento del 10%: "+descuento);
        }
        else{
            int mul=precio1*0.2;
            int descuento=precio1-mul;
            JOptionPane.showMessageDialog(null,"Articulo: "+producto+"\nPrecio sin descuento: "+precio1+"\nPrecio con descuento del 20%: "+descuento);
        }
    }
}