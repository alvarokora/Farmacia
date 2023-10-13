/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package farmacia;

/**
 *
 * @author Mora
 */
public interface IControlable {
    double DSCTO=0.1;
    
    //descontar dependiendo del día de la semana
    int descontar(String dia);
    
    //mostrar y retornar atributos
    String mostrar();
}
