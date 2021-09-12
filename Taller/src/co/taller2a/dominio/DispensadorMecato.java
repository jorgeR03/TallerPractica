package co.taller2a.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {
    public static final int CANTIDADMAXPRODUCTOS =10;
    private String marca;
    private List<Mecato> productos;

    public DispensadorMecato(String marca) {
        this.marca = marca;
        this.productos = new ArrayList<>();
    }
    public Mecato buscar(int codigo){
        Mecato mecatoBuscado = null;
        for (Mecato mecato:this.productos) {
            if(mecato.getCodigo() == codigo){
                mecatoBuscado = mecato;
            }break;
            
        }
        return mecatoBuscado;
    }
    public boolean sacarUnidad(int codigo){

    }
    public boolean sacarUnidad(String nombre){

    }
    public List<String> consultarAgotados(){

    }
    public int consultarUnidades(int codigo){


    }
    public int consultarTotalUnidades(){

    }
    public void aumentarStock(int codigo, int carntidad){

    }

    public String getMarca() {
        return marca;
    }

    public List<Mecato> getProductos() {
        return productos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProductos(List<Mecato> productos) {
        this.productos = productos;
    }
}
