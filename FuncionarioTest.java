/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carla
 */
public class FuncionarioTest {
    
    public Funcionario funcionario;
    
    public FuncionarioTest() {
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

    
    @Test
    public void TestFuncionario() {
    funcionario = new Funcionario();
    assertEquals("Ativo", funcionario.getSituacao());
}
 
@Test
    public void TestSalario() {
    funcionario = new Funcionario();
    
    assertEquals(0, funcionario.calcularSalarioLiquido(), 0.001);  
      
}
@Test
    public void TestDes1() {
    funcionario = new Funcionario();
    
    
    assertEquals(0, funcionario.calcularSalarioLiquido(), 0.001);  
      
}
@Test
    public void TestDes2() {
    funcionario = new Funcionario();
    
    
    assertEquals(0, funcionario.calcularSalarioLiquido(), 0.001);  
      
}   
@Test
    public void TestDes3() {
    funcionario = new Funcionario();
    
    
    assertEquals(0, funcionario.calcularSalarioLiquido(), 0.001);  
      
}   
@Test
    public void TestDes4() {
    funcionario = new Funcionario();
    
    
    assertEquals(0, funcionario.calcularSalarioLiquido(), 0.001);  
      
}        
    
}