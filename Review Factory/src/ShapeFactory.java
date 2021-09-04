import Shape_package.Circle;
import Shape_package.Rectangle;
import Shape_package.ShapeInterface;

import java.util.Locale;

public class ShapeFactory {
    public ShapeInterface getShape(String shape){
        if(shape == "circle"){
            return new Circle();
        }
        if(shape == "rectangle"){
            return new Rectangle();
        }
        return null;
    }
}
