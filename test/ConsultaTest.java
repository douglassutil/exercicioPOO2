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
public class ConsultaTest {
    
    public ConsultaTest() {
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
     * Test of getPaciente method, of class Consulta.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        Consulta instance = new Consulta();
        Pacientes expResult = null;
        Pacientes result = instance.getPaciente();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setPaciente method, of class Consulta.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Pacientes paciente = null;
        Consulta instance = new Consulta();
        instance.setPaciente(paciente);

    }

    /**
     * Test of getMedico method, of class Consulta.
     */
    @Test
    public void testGetMedico() {
        System.out.println("getMedico");
        Consulta instance = new Consulta();
        Medico expResult = null;
        Medico result = instance.getMedico();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMedico method, of class Consulta.
     */
    @Test
    public void testSetMedico() {
        System.out.println("setMedico");
        Medico medico = null;
        Consulta instance = new Consulta();
        instance.setMedico(medico);

    }

    /**
     * Test of getData method, of class Consulta.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Consulta instance = new Consulta();
        String expResult = "20/11/2000";
        String result = instance.getData();
        assertEquals(expResult, result);

    }

    /**
     * Test of setData method, of class Consulta.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "20/11/2000";
        Consulta instance = new Consulta();
        instance.setData(data);

    }

    /**
     * Test of getHorario method, of class Consulta.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Consulta instance = new Consulta();
        String expResult = "12:30";
        String result = instance.getHorario();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHorario method, of class Consulta.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "12:30";
        Consulta instance = new Consulta();
        instance.setHorario(horario);

    }

    /**
     * Test of getPlanoSaude method, of class Consulta.
     */
    @Test
    public void testGetPlanoSaude() {
        System.out.println("getPlanoSaude");
        Consulta instance = new Consulta();
        PlanoSaude expResult = null;
        PlanoSaude result = instance.getPlanoSaude();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlanoSaude method, of class Consulta.
     */
    @Test
    public void testSetPlanoSaude() {
        System.out.println("setPlanoSaude");
        PlanoSaude planoSaude = null;
        Consulta instance = new Consulta();
        instance.setPlanoSaude(planoSaude);

    }

    /**
     * Test of getObservacao method, of class Consulta.
     */
    @Test
    public void testGetObservacao() {
        System.out.println("getObservacao");
        Consulta instance = new Consulta();
        String expResult = "sei la";
        String result = instance.getObservacao();
        assertEquals(expResult, result);

    }

    /**
     * Test of setObservacao method, of class Consulta.
     */
    @Test
    public void testSetObservacao() {
        System.out.println("setObservacao");
        String observacao = "sei la";
        Consulta instance = new Consulta();
        instance.setObservacao(observacao);

    }
    
}

// Gets forçados ao erro