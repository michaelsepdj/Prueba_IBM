/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiones;

import clases.Cliente;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ingeniero Michael G
 */
public class gestionPedidoTest {
    
    public gestionPedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaclientes method, of class gestionPedido.
     */
    @Test
    public void testGetListaclientes() {
        System.out.println("getListaclientes");
        gestionPedido instance = new gestionPedido();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getListaclientes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setListaclientes method, of class gestionPedido.
     */
    @Test
    public void testSetListaclientes() {
        System.out.println("setListaclientes");
        List<Cliente> listaclientes = null;
        gestionPedido instance = new gestionPedido();
        instance.setListaclientes(listaclientes);
        
    }

    /**
     * Test of insertar method, of class gestionPedido.
     */
  

    /**
     * Test of modificar method, of class gestionPedido.
     */
    

    /**
     * Test of consultaIndividual method, of class gestionPedido.
     */
    @Test
    public void testConsultaIndividual() {
        System.out.println("consultaIndividual");
        Cliente p = null;
        gestionPedido instance = new gestionPedido();
        Cliente expResult = null;
        Cliente result = instance.consultaIndividual(p);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of consultar method, of class gestionPedido.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        gestionPedido instance = new gestionPedido();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.consultar();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of consultarIndividual method, of class gestionPedido.
     */
    @Test
    public void testConsultarIndividual() {
        System.out.println("consultarIndividual");
        String paramnumeroid = "";
        gestionPedido instance = new gestionPedido();
        Cliente expResult = null;
        Cliente result = instance.consultarIndividual(paramnumeroid);
        assertEquals(expResult, result);
        
    }
    
}
