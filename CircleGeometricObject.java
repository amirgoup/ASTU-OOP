/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author Nemerra
 */
public class CircleGeometricObject extends SimpleGeometricObject {
private double radius;
public CircleGeometricObject(String c,double r)
{
    super(c);
    setRadius(r);
}
public void setRadius(double r)
{
   if(r>0)
       radius=r;
       else
           throw new IllegalArgumentException("Radius can never be lessthan zero!");
   
}
public double getRadius()
{
    return radius;
}
public double area()
{
    return 3.14*getRadius()*getRadius();
}
public double perimeter()
{
    return 2* 3.14 * getRadius();
}
public String toString()
{
    return ("Property of Circle Object:\nRadius"+ getRadius()+"\nArea: "+area()+"\nPerimeter: "+perimeter()+"\n"+super.toString());
}
}
