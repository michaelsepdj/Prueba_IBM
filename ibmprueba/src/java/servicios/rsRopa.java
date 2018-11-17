
package servicios;

/**
 *
 * @author Ingeniero Michael G
 */


import clases.*; //importamos las clases que se han creado
import gestiones.*;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType; // importacion para los tipos de datos


@Path("ropa")
public class rsRopa {
    public static List<Cliente>listadeclientes=new ArrayList<>();
    public gestionPedido gr= new gestionPedido();
    
    
    @GET //consultar todo
    @Produces((MediaType.APPLICATION_JSON)) // estamos aclarando que es de tipo json el formato de intercambio de datos
    public List<Cliente> consultar(){
    gr.setListaclientes(listadeclientes)  ;  
    return gr.consultar();
    }
    
    /**
 *
 * ya creamos el metodo get ahora creamos el get como parametro es decir una consulta por parametro
     * @param param
     * @return 
 */

    @GET //consultar individual con path
    @Path("{parametroconsulta}")
    @Produces((MediaType.APPLICATION_JSON)) 
    public Cliente conultarIndividual(@PathParam("parametroconsulta") String param){
    gr.setListaclientes(listadeclientes);
    return gr.consultarIndividual(param);
    }
    
    @POST //para insertar
    @Consumes({MediaType.APPLICATION_JSON})
    public void insertar(Cliente c){
        gr.setListaclientes(listadeclientes);
        gr.insertar(c);
    }
    
    @PUT //modificar cliente que estamos enviando
    @Consumes({MediaType.APPLICATION_JSON})
    public void modificar(Cliente cl){
        gr.setListaclientes(listadeclientes);
        gr.modificar(cl);
    }
    
    
    @DELETE// eliminar cliente
    @Path("{parametroeliminar}")
    public void eliminar(@PathParam ("parametroeliminar") String eliminar){
       Cliente auxiliar = new Cliente(eliminar, null, null, null, null); // se hizo asi para garantizar la eliminacion de un cliente por su numero de documento
       gr.setListaclientes(listadeclientes);
       gr.eliminar(auxiliar);
    }
    
    
}
