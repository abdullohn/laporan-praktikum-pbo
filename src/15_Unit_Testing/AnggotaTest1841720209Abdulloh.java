/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database1841720209Abdulloh;

import unittest.database1841720209Abdulloh.Anggota1841720209Abdulloh;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abror
 */
public class AnggotaTest1841720209Abdulloh extends TestCase {

    Anggota1841720209Abdulloh instance;

    public AnggotaTest1841720209Abdulloh() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720209Abdulloh("I Zoel", "Jl. Sembarang kalir", "08125423153");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Anggota1841720209Abdulloh> expResult = instance.getByNamaAndAlamatAndTelepon(instance.getNama(), instance.getAlamat(), instance.getTelepon());
        assertTrue(expResult.size() > 0);
    }

    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720209Abdulloh> result = instance.search(keyword);
        ArrayList<Anggota1841720209Abdulloh> expResult = instance.getByNamaAndAlamatAndTelepon(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
