/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNacimiento method, of class Persona.
     */
    @Test
    public void testSetNacimiento() {
        System.out.println("setNacimiento");
        int nacimiento = 0;
        Persona instance = new Persona();
        instance.setNacimiento(nacimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class Persona.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "";
        Persona instance = new Persona();
        instance.setPais(pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNacimiento method, of class Persona.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Persona.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PersonaNew method, of class Persona.
     */
    @Test
    public void testPersonaNew() {
        System.out.println("PersonaNew");
        Persona trabajador = null;
        Persona instance = new Persona();
        instance.PersonaNew(trabajador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
