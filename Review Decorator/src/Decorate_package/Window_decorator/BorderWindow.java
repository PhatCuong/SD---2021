package Decorate_package.Window_decorator;

import Decorate_package.Window;

public class BorderWindow extends WindowDecoratorAC{

    //Inherit from AC
    public BorderWindow(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    //Own generate
    private void drawBorderWindow(){
        System.out.println("Draw border window");
    }

    @Override
    public void draw() {
        super.draw();
        drawBorderWindow();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + including border";
    }
}
