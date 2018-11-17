/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Ingeniero Michael G
 */


public class Ropa {

    
    private Integer cantidad;
    private String tipo_ropa;
    private Float precio;
    private Date fecha_entrega;

    
    public Ropa() {
    }
    
    public Ropa(Integer cantidad, String tipo_ropa, Float precio, Date fecha_entrega) {
        this.cantidad = cantidad;
        this.tipo_ropa = tipo_ropa;
        this.precio = precio;
        this.fecha_entrega = fecha_entrega;
    }
    
    
    
    
    
    
    
    
    /**
     * @return the fecha_entrega
     */
   
    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    /**
     * @param fecha_entrega the fecha_entrega to set
     */
    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipo_ropa
     */
    public String getTipo_ropa() {
        return tipo_ropa;
    }

    /**
     * @param tipo_ropa the tipo_ropa to set
     */
    public void setTipo_ropa(String tipo_ropa) {
        this.tipo_ropa = tipo_ropa;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
