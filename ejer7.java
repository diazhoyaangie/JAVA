import javax.swing.JOptionPane;
public class ejer7{
    public static void main(String[] arg){
        int producidos=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de tornillos producidos en su periodo de prueba"));
        int defectuosos=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de tornillos defectuosos producidos"));
        
        if(defectuosos>200 && producidos<10000){
            JOptionPane.showMessageDialog(null, "Su grado de eficiencia es de 5");
        }
  

       else if(producidos>10000 && defectuosos>200){
            JOptionPane.showMessageDialog(null, "Su grado de eficiencia es de 6");
        }

       else if(producidos<10000 && defectuosos<200){
            JOptionPane.showMessageDialog(null, "Su grado de eficiencia es de 7");
        }
       else if(producidos>10000 && defectuosos>200){
            JOptionPane.showMessageDialog(null, "Su grado de eficiencia es 8");
        }
    }
}