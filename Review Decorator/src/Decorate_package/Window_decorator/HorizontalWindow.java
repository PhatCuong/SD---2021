package Decorate_package.Window_decorator;

import Decorate_package.Window;

public class HorizontalWindow extends WindowDecoratorAC{
    //Inherit from AC
    public HorizontalWindow(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    //Own generate
    private void drawHorizontalWindow(){
        System.out.println("Draw horizontal window");
    }

    @Override
    public void draw() {
        super.draw();
        drawHorizontalWindow();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + including horizontal";
    }
}
