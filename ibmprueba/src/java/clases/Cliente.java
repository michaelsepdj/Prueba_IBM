/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement; //para que sea de tipo web
/**
 *
 * @author Ingeniero Michael G
 */

@XmlRootElement
public class Cliente {
    
    
    private String numero_id;
    private String nombre;
    private String tipo_id;
    private String direccion;
    private List<Ropa> tiporopa;
    
    
    
    public Cliente() {
    }
    
    public Cliente(String numero_id, String nombre, String tipo_id, String direccion, List<Ropa> tiporopa){
        /**
     * estoy creando el constructor para Cliente
     */
        this.numero_id=numero_id;
        this.nombre=nombre;
        this.tipo_id=tipo_id;
        this.direccion= direccion;
        this.tiporopa=tiporopa;
       
    }

    

    /**
     * @return the numero_id
     */
    public String getNumero_id() {
        return numero_id;
    }

    /**
     * @param numero_id the numero_id to set
     */
    public void setNumero_id(String numero_id) {
        this.numero_id = numero_id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_id
     */
    public String getTipo_id() {
        return tipo_id;
    }

    /**
     * @param tipo_id the tipo_id to set
     */
    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tiporopa
     */
    public List<Ropa> getTiporopa() {
        return tiporopa;
    }

    /**
     * @param tiporopa the tiporopa to set
     */
    public void setTiporopa(List<Ropa> tiporopa) {
        this.tiporopa = tiporopa;
    }

    
    
    
    
}
