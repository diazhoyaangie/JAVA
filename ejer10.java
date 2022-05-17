import javax.swing.JOptionPane;
  
  public class ejer10{

      public static void main(String arg[]){

 int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Qúe Edad Tiene? "));

int antiguedad=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanto Tiempo lleva Trabajando? "));

if(edad>=60 && antiguedad<25){

JOptionPane.showMessageDialog(null,"Usted quedó Adscrito a la Jubilación por Edad.");     
      
    }

else if(edad<60 && antiguedad>=25){

 JOptionPane.showMessageDialog(null,"Usted quedó Adscrito a la Jubilación por Antigüedad Jóven.");     
      
    }


else if(edad<=60 && antiguedad>=25){

 JOptionPane.showMessageDialog(null,"Usted quedó Adscrito a la Jubilación por Antigüedad Adulta.");     
      
    }

      }
  }