import javax.swing.JOptionPane; 

public class ejer5{

public static void main(String[] arg){

int num1=Integer.parseInt(JOptionPane.showInputDialog("escriba el numero 1"));
int num2=Integer.parseInt(JOptionPane.showInputDialog("escriba el numero 2"));
JOptionPane.showMessageDialog(null,"(1) SUMA");
int suma=num1+num2;
JOptionPane.showMessageDialog(null,""+num1+"+"+num2+"="+suma);
JOptionPane.showMessageDialog(null,"(2) RESTA");
int resta=num1-num2;
JOptionPane.showMessageDialog(null,""+num1+"-"+num2+"="+resta);
JOptionPane.showMessageDialog(null,"(3) MULTIPLICACION");
int multi=num1*num2;
JOptionPane.showMessageDialog(null,""+num1+"x"+num2+"="+multi);
JOptionPane.showMessageDialog(null,"(4) DIVISIÓN");
int division=num1/num2;
JOptionPane.showMessageDialog(null,""+num1+"/"+num2+"="+division);




}
}