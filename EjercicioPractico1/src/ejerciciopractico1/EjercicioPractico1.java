/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1;
import javax.swing.JOptionPane;

/**
 *
 * @author bague
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitud de numero de empledos y sus salarios correspondientes
        int numeroDeEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de empleados de la empresa: "));
        
        //Si el numero es menor a 1 o si no nos saca del programa
        if (numeroDeEmpleados <= 0){
           System.out.println("El numero debe ser mayor a cero");
        }
        
        //Como aun no tenemos los salarios el monto a pagar es de 0
        double montoAPagar = 0.0;
        
        
        for (int i = 1; i <= numeroDeEmpleados; i++){
        //Solicitud del salario de la cantidad de empleados ingresados
        int salarioDeEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el salario de empleados: " + i));
        
        
        //Calculo del SEM y del IVM
        int sem = (int) (salarioDeEmpleados * 0.0925);
        
        int ivm = (int) (salarioDeEmpleados * 0.0508);
        
        //Se calcula el total de cuando se debe pagar por el empleado 
        int totalDeEmpleado = ivm + sem;
        
        // Total del monto que se debe pagar        
        montoAPagar += totalDeEmpleado;
         
        // Mensaje final del monto que debe pagar la empresa
        JOptionPane.showMessageDialog(null, ("La empresa deberá abonar a la CCSS el monto de " + montoAPagar + " por concepto de SEM y IVM" ));    
          
        }
    }
}
       