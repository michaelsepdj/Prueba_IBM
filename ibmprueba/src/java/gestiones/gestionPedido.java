/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiones;



import clases.*;
import java.util.List;
/**
 *
 * @author Ingeniero Michael G
 */
public class gestionPedido implements Icrud<Cliente>{
    private List<Cliente> listacliente;

    /**
     * @return the listaclientes
     */
    public List<Cliente> getListaclientes() {
        return listaclientes;
    }

    /**
     * @param listaclientes the listaclientes to set
     */
    public void setListaclientes(List<Cliente> listaclientes) {
        this.listaclientes = listaclientes;
    }
    private List<Cliente> listaclientes;

    @Override
    public void insertar(Cliente p) {
        
        listaclientes.add(p);
        
       }

    @Override
    public void modificar(Cliente p) {
     
    
    Cliente auxiliarcliente =consultaIndividual(p);
    auxiliarcliente.setNumero_id(p.getNumero_id());
    auxiliarcliente.setTipo_id(p.getTipo_id());
    auxiliarcliente.setNombre(p.getNombre());
  
    auxiliarcliente.setDireccion(p.getDireccion());
    auxiliarcliente.setTiporopa(p.getTiporopa());
    
    
    
    }

    @Override
    public void eliminar(Cliente p) {
    
    Cliente auxiliar=this.consultarIndividual(p.getNumero_id());
    listaclientes.remove(auxiliar);
    
    }

    @Override
    public Cliente consultaIndividual(Cliente p) {
    try{
       return listaclientes.stream().filter(x -> (x.getNumero_id() == null ? p.getNumero_id() == null : x.getNumero_id().equals(p.getNumero_id()))).findFirst().get();
    } catch (Exception e) {
        return null;
    }
    
    }

    @Override
    public List<Cliente> consultar() {
    
    return listaclientes;
    
    }
     public Cliente consultarIndividual(String paramnumeroid){
         try{
             return listaclientes.stream().filter(x -> (x.getNumero_id() == null ? paramnumeroid == null : x.getNumero_id().equals(paramnumeroid))).findFirst().get();
         }catch (Exception e){
             return null;
         }
     }
}
