/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;
import taller.Employee;
import taller.EmployeeType;

/**
 *
 * @author AlexVelezLl
 */
public class EmployeeTest {

    private Employee e1;
    private Employee e2;
    private Employee e3;
    private Employee e4;
    private Employee e5;
    private Employee e6;

    int numMes;

    public EmployeeTest() {
        e1 = new Employee(100f, "USD", 1f, EmployeeType.Manager);
        e2 = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
        e3 = new Employee(100f, "USD", 1f, EmployeeType.Worker);
        e4 = new Employee(100f, "EUR", 1f, EmployeeType.Manager);
        e5 = new Employee(100f, "EUR", 1f, EmployeeType.Supervisor);
        e6 = new Employee(100f, "EUR", 1f, EmployeeType.Worker);

        int numMes = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
    }

    /*
     * Test que prueba que el metodo cs calcule de forma correcta
     * el decimo de un empleado Manager que tenga como salario
     * 100 USD y 1 de bonusPercentaje 
     */
    @Test
    public void csTest1() {
        Float value = 100.0f + 0.7f;
        Float operacion = numMes % 2 == 0 ? value : value + (386f / 6f);
        Assert.assertEquals((Float) e1.cs(), operacion);
    }

    /*
     * Test que prueba que el metodo CalculateYearBonus calcula de forma correcta
     * el bonus anual de un empleado Manager que tenga como salario
     * 100 USD y 1 de bonusPercentaje 
     */
    @Test
    public void CalculateYearBonusTest1(){
        Assert.assertEquals(486.0f, e1.CalculateYearBonus()); 
    }

    /*
     * Test que prueba que el metodo cs calcule de forma correcta
     * el decimo de un empleado Supervisor que tenga como salario
     * 100 USD y 1 de bonusPercentaje 
     */
    @Test
    public void csTest2() {
        Float value = 100.0f + 0.35F;
        Float operacion = numMes % 2 == 0 ? value : value + (386f / 6f);
        Assert.assertEquals((Float) e2.cs(), operacion);
    }

    /*
     * Test que prueba que el metodo CalculateYearBonus calcula de forma correcta
     * el bonus anual de un empleado Supervisor que tenga como salario
     * 100 USD y 1 de bonusPercentaje 
     */
    @Test
    public void CalculateYearBonusTest2(){
        Assert.assertEquals(293.0f, e2.CalculateYearBonus()); 
    }

    /*
     * Test que prueba que el metodo cs calcule de forma correcta
     * el decimo de un empleado worker que tenga como salario
     * 100 USD y 1 de bonusPercentaje 
     */
    @Test
    public void csTest3(){
        float esperado = (float)100 + (float) 386.0/12*2;
        if(numMes%2==0)Assert.assertEquals((float)100, e3.cs());
        else Assert.assertEquals(esperado, e3.cs());
    }
    
    /**
     * Test que prueba que el metodo CalculateYearBonus calcula de forma correcta
     * el bonus anual de un empleado worker que tenga como salario
     * 100 USD y 1 de bonusPercentaje 
     */
    @Test
    public void CalculateYearBonusTest3(){
        Assert.assertEquals((float) 386.0, e3.CalculateYearBonus()); 
    }

        
    /**
     * Test para probar que se esté calculando correctamente el salario de un 
     * Manager que gana en Euros, sabiendo que la fecha actual tiene un mes par,
     * su salario sea 100 y con 1 de bonus.
     */
    @Test
    public void csTest4(){
        float esperado = numMes % 2 ==0 ? 95.7f : 95.7f + 386.0f/12*2;
        Assert.assertEquals(esperado,e4.cs());
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

    /**
     * Test que prueba que el metodo cs calcule de forma correcta
     * el decimo de un empleado Supervisor que tenga como salario
     * 100 Euros y 1 de bonusPercentaje
     */
    @Test
    public void csTest5(){
        float esperado = numMes % 2 ==0 ? 95.35f : 95.35f + 386.0f/12*2;
        assertEquals(esperado, e5.cs());
    }
    
    /**
     * Test que prueba que el metodo CalculateYearBonus calcule de forma correcta
     * el bono de fin de año de un empleado Supervisor que tenga como salario
     * 100 Euros y 1 de bonusPercentaje
     */
    @Test
    public void CalculateYearBonusTest5(){
        assertEquals(288.0f, e5.CalculateYearBonus());
    }

    /**
     * Test que prueba que el metodo cs calcule de forma correcta
     * el decimo de un empleado worker que tenga como salario
     * 100 Euros y 1 de bonusPercentaje
     */
    @Test
    public void csTest6(){
        float preValue = 100f*0.95f;
        float esperado = numMes%2==0?preValue:preValue + 386f/12*2;
        Assert.assertEquals(esperado, e6.cs());
    }

    /**
     * Test que prueba que el metodo CalculateYearBonus calcule de forma correcta
     * el bono de fin de año de un empleado worker que tenga como salario
     * 100 Euros y 1 de bonusPercentaje
     */
    @Test
    public void CalculateYearBonusTest6(){
        float esperado = 386f;
        Assert.assertEquals(esperado, e6.CalculateYearBonus());
    }

}
