/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.composite.v3;

    class GeometricShapesDemo {
        
        public static void main(String[] args) {
            GraphicObject drawing = new GraphicObject();
            drawing.setName("My Drawing");
            drawing.children.add(new Square("Red"));
            drawing.children.add(new Circle("Yellow"));

            GraphicObject group = new GraphicObject();
            group.children.add(new Circle("Blue"));
            group.children.add(new Square("Blue"));
            drawing.children.add(group);

            System.out.println(drawing);
        }
    }


