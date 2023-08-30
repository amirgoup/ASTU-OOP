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
public class RectangleGeometricObject extends SimpleGeometricObject {
private double width;
private double length; 
public RectangleGeometricObject(String c,double w,double l)
{
    super(c);
    setWidth(w);
    setLength(l);
}
public void setWidth(double w)
{
  if(w>0)
       width=w;
       else
           throw new IllegalArgumentException("Width can never be lessthan zero!");
   
}
public void setLength(double l)
{
  if(l>0)
       length=l;
       else
           throw new IllegalArgumentException("Length can never be lessthan zero!");
  
}
public double getWidth()
{
    return width;
}
public double getLength()
{
    return length;
}
public double area()
{
    return getWidth()*getLength();
}
public double perimeter()
{
    return 2*(getWidth()+getLength());
}
public String toString()
{
    return ("\nProperty of Rectangle Object:\n"
            + "Width:"+getWidth()+"\nLength:"+getLength()+
            "\nArea: "+area()+"\nPerimeter:"+perimeter()+"\n"+super.toString());
}
}
