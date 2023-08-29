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
public class SalaryPlusCommissionEmployee extends CommissionEmployee{
    private double salary;
    public SalaryPlusCommissionEmployee(String fn,String ln,String ssn,double gs,double cr,double s)
    {
        super(fn,ln,ssn,gs,cr);
        setSalary(s);        
    }
    public void setSalary(double s)
    {
       if(s>=0.0) 
           salary=s;
       else
           throw new IllegalArgumentException("Salary can't be lessthan zero");
    }
    public double getSalary()
    {
        return salary;
    }
    public String toString()
    { 
      
      return (super.toString()+"\nSalary: "+getSalary()+"\nTotal Earning: "+(earnings()+salary));  
    }
}
