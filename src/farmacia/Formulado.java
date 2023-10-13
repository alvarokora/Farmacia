/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Mora
 */
public class Formulado extends Medicamento{
    private String contraindicaciones;

    public Formulado() {
    }

    public Formulado(String contraindicaciones, boolean generico, int codigo, int precioBase, String nombre) {
        super(generico, codigo, precioBase, nombre);
        this.contraindicaciones = contraindicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " Formulado{" + "contraindicaciones=" + contraindicaciones + '}';
    }
    
    
}
