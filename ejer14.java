import javax.swing.JOptionPane;
public class ejer14{
    public static void main(String[] arg){
        float promedio=Integer.parseInt(JOptionPane.showInputDialog("Digite su promedio"));
        String programa=Integer.parseInt(JOptionPane.showInputDialog("A que institucion pertenece, secundaria o profesional"));
        int materiasrepro=Integer.parseInt(JOptionPane.showInputDialog("Numero de materias reprobadas"));

        int unidadsecu=180/5;
        int unidadpro=300/5;
        if(programa=='secundaria'){

            if(promedio>=9.5){
                int preciounidades=unidadsecu*55;
                float mul=preciounidades*0.25;
                int desunidad=preciounidades-mul;
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 55 unidades con un descuento del 25% \n"+desunidad);
            }
            else if(promedio>=9 && promedio<9.5){
                int preciounidades=unidadsecu*50;
                float mul=preciounidades*0.1;
                int desunidad=preciounidades-mul;
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 50 unidades con un descuento del 10% \n"+desunidad);
            }
            else if(promedio>7 && promedio<9){
                int preciounidades=unidadsecu*50;
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 50 unidades\n"+preciounidades);
            }
            else if(promedio<=7 && materiasrepro>0 && materiasrepro>3){
                int preciounidades=unidadsecu*45;
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 45 unidades\n"+preciounidades);
            }
            else if(promedio<=7 && materiasrepro>=4){
                int preciounidades=unidadsecu*40;
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 40 unidades\n"+preciounidades);
            }
        }
        else{
            if(promedio>=9){
                int preciounidades=unidadpro*55;
                float mul=preciounidades*0.20;
                int desunidad=preciounidades-mul;
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 55 unidades con un descuento del 20%\n"+desunidad);
            }
            else if(promedio<9.5){
                int preciounidades=unidadpro*55
                JOptionPane.showMessageDialog(null,"Por su promedio, podra cursar 55 unidades\n"+preciounidades);
            }
        }
    }
}