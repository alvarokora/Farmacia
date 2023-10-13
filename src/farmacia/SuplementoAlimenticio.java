/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Mora
 */
public class SuplementoAlimenticio extends Producto{

    private int cantVitaminas;
    private String infoVitaminas;

    public SuplementoAlimenticio() {
    }

    public SuplementoAlimenticio(int cantVitaminas, String infoVitaminas, int codigo, int precioBase, String nombre) {
        super(codigo, precioBase, nombre);
        this.cantVitaminas = cantVitaminas;
        this.infoVitaminas = infoVitaminas;
    }

    public int getCantVitaminas() {
        return cantVitaminas;
    }

    public void setCantVitaminas(int cantVitaminas) {
        this.cantVitaminas = cantVitaminas;
    }

    public String getInfoVitaminas() {
        return infoVitaminas;
    }

    public void setInfoVitaminas(String infoVitaminas) {
        this.infoVitaminas = infoVitaminas;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " SuplementoAlimenticio{" + "cantVitaminas=" + cantVitaminas + ", infoVitaminas=" + infoVitaminas + '}';
    }
    
    
    /*
    recargar 2% por vitamina a los suplementos
    */
    @Override
    public int recargar() {
        return (int)(super.getPrecioBase()*this.cantVitaminas*0.02);
    }

    /*
    descontar el día lunes a los suplementos
    */
    @Override
    public int descontar(String dia) {
        if (dia.equalsIgnoreCase("lunes")) {
            return (int)(super.precioBase* DSCTO);
        }
        return 0;
    }
    
}
