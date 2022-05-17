import javax.swing.JOptionPane; 

public class ejer4{

public static void main(String[] arg){

int total=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De Cuánto fue el Total de su Compra? "));
int azar=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un Número al Azar"));
      
        if(azar<74){

       Double descuento=total*0.15;
        Double des=total-descuento;
        JOptionPane.showMessageDialog(null,"Por Haber digitado el Número "+azar+", Su Descuento es del 15% de su Compra. \n El Nuevo Total de su Compra es de $"+des);   
}
        
        else if (azar>=74){
       Double  descuento=total*0.20;
       Double  des=total-descuento;
        JOptionPane.showMessageDialog(null,"Por Haber digitado el Número "+azar+", Su Descuento es del 20% de su Compra. \n El Nuevo Total de su Compra es de $"+des);
    }
    }
    
    }