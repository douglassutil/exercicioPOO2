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
public class HorarioAtendimentoTest {
    
    public HorarioAtendimentoTest() {
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
     * Test of getHoraInicio method, of class HorarioAtendimento.
     */
    @Test
    public void testGetHoraInicio() {
        System.out.println("getHoraInicio");
        HorarioAtendimento instance = new HorarioAtendimento();
        String expResult = "20:30";
        String result = instance.getHoraInicio();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHoraInicio method, of class HorarioAtendimento.
     */
    @Test
    public void testSetHoraInicio() {
        System.out.println("setHoraInicio");
        String horaInicio = "20:30";
        HorarioAtendimento instance = new HorarioAtendimento();
        instance.setHoraInicio(horaInicio);

    }

    /**
     * Test of getHoraFinal method, of class HorarioAtendimento.
     */
    @Test
    public void testGetHoraFinal() {
        System.out.println("getHoraFinal");
        HorarioAtendimento instance = new HorarioAtendimento();
        String expResult = "20:30";
        String result = instance.getHoraFinal();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHoraFinal method, of class HorarioAtendimento.
     */
    @Test
    public void testSetHoraFinal() {
        System.out.println("setHoraFinal");
        String horaFinal = "20:30";
        HorarioAtendimento instance = new HorarioAtendimento();
        instance.setHoraFinal(horaFinal);

    }
    
}


// Gets forçados ao erro