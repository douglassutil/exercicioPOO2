/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
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
public class MedicoTest {
    
    public MedicoTest() {
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
     * Test of getCRM method, of class Medico.
     */
    @Test
    public void testGetCRM() {
        System.out.println("getCRM");
        Medico instance = new Medico();
        String expResult = "8457283542";
        String result = instance.getCRM();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setCRM method, of class Medico.
     */
    @Test
    public void testSetCRM() {
        System.out.println("setCRM");
        String CRM = "8457283542";
        Medico instance = new Medico();
        instance.setCRM(CRM);

    }

    /**
     * Test of getEspecialidade method, of class Medico.
     */
    @Test
    public void testGetEspecialidade() {
        System.out.println("getEspecialidade");
        Medico instance = new Medico();
        ArrayList<Especialidades> expResult = null;
        ArrayList<Especialidades> result = instance.getEspecialidade();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEspecialidade method, of class Medico.
     */
    @Test
    public void testSetEspecialidade() {
        System.out.println("setEspecialidade");
        ArrayList<Especialidades> especialidade = null;
        Medico instance = new Medico();
        instance.setEspecialidade(especialidade);

    }

    /**
     * Test of getPlanosConveniados method, of class Medico.
     */
    @Test
    public void testGetPlanosConveniados() {
        System.out.println("getPlanosConveniados");
        Medico instance = new Medico();
        ArrayList<PlanoSaude> expResult = null;
        ArrayList<PlanoSaude> result = instance.getPlanosConveniados();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlanosConveniados method, of class Medico.
     */
    @Test
    public void testSetPlanosConveniados() {
        System.out.println("setPlanosConveniados");
        ArrayList<PlanoSaude> planosConveniados = null;
        Medico instance = new Medico();
        instance.setPlanosConveniados(planosConveniados);

    }

    /**
     * Test of getHorarioAtend method, of class Medico.
     */
    @Test
    public void testGetHorarioAtend() {
        System.out.println("getHorarioAtend");
        Medico instance = new Medico();
        HashMap<String, HorarioAtendimento> expResult = null;
        HashMap<String, HorarioAtendimento> result = instance.getHorarioAtend();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setHorarioAtend method, of class Medico.
     */
    @Test
    public void testSetHorarioAtend() {
        System.out.println("setHorarioAtend");
        HashMap<String, HorarioAtendimento> horarioAtend = null;
        Medico instance = new Medico();
        instance.setHorarioAtend(horarioAtend);

    }
    
}

// Gets forçados ao erro