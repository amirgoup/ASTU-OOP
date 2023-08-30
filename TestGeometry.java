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
public class TestGeometry {

    public static void main(String[] args) {
     CircleGeometricObject circle=new CircleGeometricObject("Yellow",10);
     RectangleGeometricObject rect=new RectangleGeometricObject("Green",20,30);
     System.out.println(circle.toString());
     System.out.println(rect.toString());
     }
}
