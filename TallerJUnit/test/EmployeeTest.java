/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
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
    
    /**
     * Test que prueba que el metodo cs calcule de forma correcta
     * el decimo de un empleado worker que tenga como salario
     * 100 Euros y 1 de bonusPercentaje
     */
    @Test
    public void csTest6(){
        int numMes = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
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
