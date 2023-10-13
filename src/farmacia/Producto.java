/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Mora
 */
public abstract class Producto implements IControlable{
    protected int codigo, precioBase;
    protected String nombre;

    public Producto() {
    }

    public Producto(int codigo, int precioBase, String nombre) {
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract int recargar();

    @Override
    public String mostrar() {
        return "Producto{" + "codigo=" + codigo + ", precioBase=" + precioBase + ", nombre=" + nombre + '}';
    }
    
    
}
