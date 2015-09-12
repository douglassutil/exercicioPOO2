/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class PacientesTest {
    
    public PacientesTest() {
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
     * Test of getDataNascimento method, of class Pacientes.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Pacientes instance = new Pacientes();
        String expResult = "20/12/1990";
        String result = instance.getDataNascimento();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDataNascimento method, of class Pacientes.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        String dataNascimento = "20/12/1990";
        Pacientes instance = new Pacientes();
        instance.setDataNascimento(dataNascimento);

    }

    /**
     * Test of getProfissao method, of class Pacientes.
     */
    @Test
    public void testGetProfissao() {
        System.out.println("getProfissao");
        Pacientes instance = new Pacientes();
        String expResult = "20/12/1990";
        String result = instance.getProfissao();
        assertEquals(expResult, result);

    }

    /**
     * Test of setProfissao method, of class Pacientes.
     */
    @Test
    public void testSetProfissao() {
        System.out.println("setProfissao");
        String profissao = "20/12/1990";
        Pacientes instance = new Pacientes();
        instance.setProfissao(profissao);

    }
    
}
// Gets forçados ao erro