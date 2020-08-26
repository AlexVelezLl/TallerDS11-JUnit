/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
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
    
    private Employee e1;
    private Employee e2;
    private Employee e3;
    private Employee e4;
    private Employee e5;
    private Employee e6;
    
    public EmployeeTest(){
        e1 = new Employee(100f,"USD",1f,EmployeeType.Manager); //Carlos
        e2 = new Employee(100f,"USD",1f,EmployeeType.Supervisor); //Carlos
        e3 = new Employee(100f,"USD",1f,EmployeeType.Worker); // Valeria
        e4 = new Employee(100f,"EUR",1f,EmployeeType.Manager); // Jaime
        e5 = new Employee(100f,"EUR",1f,EmployeeType.Supervisor); //Eddo
        e6 = new Employee(100f,"EUR",1f,EmployeeType.Worker); //Alex
    }
    
    @Test
    public void supervisorEuroTestDecimo(){
        assertEquals(95.35F, e5.cs(),0F);
    }
    
    @Test
    public void supervisorEuroTestBonus(){
        assertEquals(288.0F, e5.CalculateYearBonus(),0F);
    }
}    