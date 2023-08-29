/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Nemerra
 */
public class TestSalaryPlusCommissionEmployee {
    public static void main(String[] args) {
        SalaryPlusCommissionEmployee employee;
        employee=new SalaryPlusCommissionEmployee("Mohammed","Ali","22222",100000,0.2,10000);
        System.out.println(employee.toString());
        try{
            employee.setFirstName("Sura");
            employee.setlastName("Milto");
            employee.setSocialSecurityNumer("223344");
            employee.setGrossSales(400000);
            employee.setCommissionRate(0.3);
            employee.setSalary(24000);
            employee.setSalary(-2000);
           }
        catch(IllegalArgumentException iae)
        {
            System.out.println("Please enter valid input\n"+iae.getMessage());
        }
        System.out.println(employee.toString());
    }
}
