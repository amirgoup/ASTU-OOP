/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
public abstract class Employee {
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
  public Employee(String fName,String lName,String ssNumber)
  {
     setFirstName(fName);
     setlastName(lName);
     setSocialSecurityNumer(ssNumber);
  }
  public void setFirstName(String fName)
  {
   firstName=fName;   
  }
  public void setlastName(String lName)
  {
   lastName=lName;   
  }
  public void setSocialSecurityNumer(String ssNumber)
  {
   socialSecurityNumber=ssNumber;   
  }
  public String getFirstName()
  {
      return firstName;
  }
  public String getLastName()
  {
      return lastName;
  }
  public String getSocialSecurityNumber()
  {
      return socialSecurityNumber;
  }
 public String toString()
 {
    return ("First Name: "+getFirstName()+"\n"+"Last Name: "+getLastName()+"\n"+
            "Social Security Number: "+getSocialSecurityNumber()); 
 }
public abstract double earnings();
 }
