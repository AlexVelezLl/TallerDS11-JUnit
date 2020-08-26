/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

/**
 *
 * @author CORE i7 ULTIMATE
 */
public class EmployeeTest {
    
    Employee e4;
    public EmployeeTest() {
        
        e4 = new Employee(100f,"EUR",1f,EmployeeType.Manager);
    }

    
    /**
     * Test para probar que se esté calculando correctamente el salario de un 
     * Manager que gana en Euros, sabiendo que la fecha actual tiene un mes par,
     * su salario sea 100 y con 1 de bonus.
     */
    
    @Test
    public void csTest4(){
        Assert.assertEquals(95.7f,e4.cs());
    }
    
    
    /**
    * Test para comprobar si el metodo calculateYearBonus() 
     * devuelve el valor correcto de bonus para el manager
     * que gana en euros.
     */
    @Test
    public void calculateYearBonusTest4(){
        Assert.assertEquals(481f,e4.CalculateYearBonus());
    }
}
