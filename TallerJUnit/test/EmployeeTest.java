/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import taller.Employee;
import taller.EmployeeType;

/**
 *
 * @author CORE i7 ULTIMATE
 */
public class EmployeeTest {
    static Employee e;

    @BeforeClass
    public static void getEmpleado(){
        e=new Employee(12.4f, "USD", 25.6f, EmployeeType.Worker);
    }
    
    @Test
    public void currentTest(){
        assertEquals(345.6f, e.CalculateYearBonus());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
