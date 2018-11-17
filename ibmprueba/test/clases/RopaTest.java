/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
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
public class RopaTest {
    
    public RopaTest() {
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
     * Test of getFecha_entrega method, of class Ropa.
     */
    @Test
    public void testGetFecha_entrega() {
        System.out.println("getFecha_entrega");
        Ropa instance = new Ropa();
        Date expResult = null;
        Date result = instance.getFecha_entrega();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFecha_entrega method, of class Ropa.
     */
    @Test
    public void testSetFecha_entrega() {
        System.out.println("setFecha_entrega");
        Date fecha_entrega = null;
        Ropa instance = new Ropa();
        instance.setFecha_entrega(fecha_entrega);
        
    }

    /**
     * Test of getCantidad method, of class Ropa.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Ropa instance = new Ropa();
        Integer expResult = null;
        Integer result = instance.getCantidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCantidad method, of class Ropa.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        Integer cantidad = null;
        Ropa instance = new Ropa();
        instance.setCantidad(cantidad);
        
    }

    /**
     * Test of getTipo_ropa method, of class Ropa.
     */
   

    /**
     * Test of setTipo_ropa method, of class Ropa.
     */
    @Test
    public void testSetTipo_ropa() {
        System.out.println("setTipo_ropa");
        String tipo_ropa = "";
        Ropa instance = new Ropa();
        instance.setTipo_ropa(tipo_ropa);
        
    }

    /**
     * Test of getPrecio method, of class Ropa.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Ropa instance = new Ropa();
        Float expResult = null;
        Float result = instance.getPrecio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPrecio method, of class Ropa.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        Float precio = null;
        Ropa instance = new Ropa();
        instance.setPrecio(precio);
        
    }
    
}
