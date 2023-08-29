/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String fName,String lName,String ssn,double gSales,double cRate)
    {
        super(fName,lName,ssn);
        setGrossSales(gSales);
        setCommissionRate(cRate);   
    }
   public void setGrossSales(double gSales)
   {
       if(gSales>=0.0)
       grossSales=gSales;
       else
           throw new IllegalArgumentException("Gross sales can't be lessthan zero");
   }
   public void setCommissionRate(double cRate)
   {
       if(cRate>0.0 && cRate<1.0)
       commissionRate=cRate;
       else
           throw new IllegalArgumentException("Commission Rate should be between zero and one!");
   }
   public double getGrossSales()
   {
       return grossSales;
   }
   public double getCommissionRate()
   {
       return commissionRate;
   } 
   public double earnings()
   {
       return getGrossSales()*getCommissionRate();
   
   }
   public String toString()
   {
       return (super.toString()+"\nGross Sales: "+getGrossSales()+"\nCommission Rate: "+getCommissionRate()+
               "\nCommission: "+earnings());
   }
}
