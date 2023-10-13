/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

import java.util.*;

/**
 *
 * @author Mora
 */
public class RegistroProducto {
    private List<Producto> listaProducto;
    
    public RegistroProducto(){
        listaProducto = new ArrayList<>();
    }
    
    public boolean addProducto(Producto p){
        if(!verificarProducto(p.getCodigo()))
            return listaProducto.add(p);
        return false;
    }
    
    public boolean eliminarProducto(Producto p){
        return listaProducto.remove(p);
    }
    
    public Producto obtenerProductoI(int i){
        return listaProducto.get(i);
    }
    
    public Producto obtenerProducto(int codigo){
        for(int i=0;i<listaProducto.size();i++){
            if(listaProducto.get(i).getCodigo()==codigo)
                return listaProducto.get(i);
        }
        return null;
    }
    
    public boolean verificarProducto(int codigo){
        for(int i=0;i<listaProducto.size();i++){
            if(listaProducto.get(i).getCodigo()==codigo)
                return true;
        }
        return false;
    }
    
    public String obtenerDatos(){
        if(listaProducto.isEmpty())
            return "Lista Vacia";
        String r = "Lista Productos\n";
        for(int i=0;i<listaProducto.size();i++){
            r+="Producto "+(i+1)+": "+listaProducto.get(i).mostrar()+"\n";
        }
        return r;
    }
    
    public String obtenerDatosSup(){
        if(listaProducto.isEmpty())
            return "Lista Vacia";
        String r = "Lista Productos precios mayor a $15.000\n";
        for(int i=0;i<listaProducto.size();i++){
            if(listaProducto.get(i).getPrecioBase()>15000)
                r+="Producto "+(i+1)+": "+listaProducto.get(i).mostrar()+"\n";
        }
        return r;
    }
}