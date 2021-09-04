package Decorate_package.Window_decorator;

import Decorate_package.Window;

public class VerticalWindow extends WindowDecoratorAC {

    //inherit
    public VerticalWindow(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    //Own generates
    private void drawVerticalWindow(){
        System.out.println("Draw vertical window");
    }

    @Override
    public void draw() {
        super.draw();
        drawVerticalWindow();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + including vertical";
    }
}
