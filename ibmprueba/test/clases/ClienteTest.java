/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getNumero_id method, of class Cliente.
     */
    @Test
    public void testGetNumero_id() {
        System.out.println("getNumero_id");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumero_id method, of class Cliente.
     */
    @Test
    public void testSetNumero_id() {
        System.out.println("setNumero_id");
        String numero_id = "1032389443";
        Cliente instance = new Cliente();
        instance.setNumero_id(numero_id);
       
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getTipo_id method, of class Cliente.
     */
    @Test
    public void testGetTipo_id() {
        System.out.println("getTipo_id");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTipo_id method, of class Cliente.
     */
    @Test
    public void testSetTipo_id() {
        System.out.println("setTipo_id");
        String tipo_id = "";
        Cliente instance = new Cliente();
        instance.setTipo_id(tipo_id);
       
    }

    /**
     * Test of getDireccion method, of class Cliente.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDireccion method, of class Cliente.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Cliente instance = new Cliente();
        instance.setDireccion(direccion);
        
    }

    /**
     * Test of getTiporopa method, of class Cliente.
     */
    @Test
    public void testGetTiporopa() {
        System.out.println("getTiporopa");
        Cliente instance = new Cliente();
        List<Ropa> expResult = null;
        List<Ropa> result = instance.getTiporopa();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTiporopa method, of class Cliente.
     */
    @Test
    public void testSetTiporopa() {
        System.out.println("setTiporopa");
        List<Ropa> tiporopa = null;
        Cliente instance = new Cliente();
        instance.setTiporopa(tiporopa);
        
    }
    
}
