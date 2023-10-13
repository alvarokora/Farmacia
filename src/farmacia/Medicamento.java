/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Mora
 */
public class Medicamento extends Producto{

    protected boolean generico;

    public Medicamento() {
    }

    public Medicamento(boolean generico, int codigo, int precioBase, String nombre) {
        super(codigo, precioBase, nombre);
        this.generico = generico;
    }

    public boolean isGenerico() {
        return generico;
    }

    public void setGenerico(boolean generico) {
        this.generico = generico;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " Medicamento{" + "generico=" + generico + '}';
    }
    
    /*
    recargar 20% a los medicamentos no genéricos
    */
    @Override
    public int recargar() {
//        if (generico) {
//            return 0;
//        }else{
//            return (int)(super.precioBase*0.2);
//        }        
        if (!generico) {
            return (int)(super.getPrecioBase()*0.2);
        }
        return 0;
    }

    /*
    descontar el día lunes para los medicamentos genéricos 
    */
    @Override
    public int descontar(String dia) {
        if (generico && dia.equalsIgnoreCase("lunes")) {
            return (int)(super.getPrecioBase()* DSCTO);
        }
        return 0;
    }
    
    
    
}
