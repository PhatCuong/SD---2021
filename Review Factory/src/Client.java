import Shape_package.ShapeInterface;

import java.awt.*;

public class Client {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeInterface circle = shapeFactory.getShape("circle");
        circle.draw();

        ShapeInterface rec = shapeFactory.getShape("rectangle");
        rec.draw();
    }
}
