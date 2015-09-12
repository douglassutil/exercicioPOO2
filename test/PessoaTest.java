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
public class PessoaTest {
    
    public PessoaTest() {
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
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa instance = new Pessoa();
        String expResult = "Douglas";
        String result = instance.getNome();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Douglas";
        Pessoa instance = new Pessoa();
        instance.setNome(nome);

    }

    /**
     * Test of getTelefone method, of class Pessoa.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Pessoa instance = new Pessoa();
        String expResult = "992489900";
        String result = instance.getTelefone();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTelefone method, of class Pessoa.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "992489900";
        Pessoa instance = new Pessoa();
        instance.setTelefone(telefone);

    }

    /**
     * Test of getEndereco method, of class Pessoa.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Pessoa instance = new Pessoa();
        String expResult = "Palma de Santa Rita";
        String result = instance.getEndereco();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEndereco method, of class Pessoa.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "Palma de Santa Rita";
        Pessoa instance = new Pessoa();
        instance.setEndereco(endereco);

    }
    
}
// Gets forçados ao erro