import javax.swing.JOptionPane;
  
  public class ejer8{

      public static void main(String arg[]){

 int salario=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De Cuánto es su Salario? "));

int tiempo=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanto Tiempo de Servicio lleva? "));

if(tiempo>0 && tiempo<5){

 Double aumento=salario*0.10;
 Double aum=salario+aumento;
JOptionPane.showMessageDialog(null,"Su Aumento Corresponde al 10% de su Salario.\n Su Nuevo Salario es de $"+aum);     
      
    }

else if(tiempo=5 && tiempo<10){

 Double aumento=salario*0.15;
 Double aum=salario+aumento;
JOptionPane.showMessageDialog(null,"Su Aumento Corresponde al 15% de su Salario.\n Su Nuevo Salario es de $"+aum);     
      
    }


else if(tiempo=10 && tiempo<20){

 Double aumento=salario*0.20;
 Double aum=salario+aumento;
JOptionPane.showMessageDialog(null,"Su Aumento Corresponde al 20% de su Salario.\n Su Nuevo Salario es de $"+aum);     
      
    }

 
else if(tiempo>=20){

  Double aumento=salario*0.35;
 Double aum=salario+aumento;
JOptionPane.showMessageDialog(null,"Su Aumento Corresponde al 35% de su Salario.\n Su Nuevo Salario es de $"+aum);     
      
    }   

      }
  }