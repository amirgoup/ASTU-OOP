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
import java.util.Date;
public abstract class SimpleGeometricObject {
private String color;
private Date d;
public SimpleGeometricObject(String c)
{
    setColor(c);
}
public void setColor(String c)
{
    color=c;
}
public String getColor()
{
    return color;
}
public Date getDate()
{
    return d=new Date();
}
public String toString()
{
    return ("Color: "+getColor()+"\nDate Created: "+getDate());
}
public abstract double area();
public abstract double perimeter();
}
