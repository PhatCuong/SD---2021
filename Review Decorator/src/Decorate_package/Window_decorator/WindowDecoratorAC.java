package Decorate_package.Window_decorator;

import Decorate_package.Window;

public abstract class WindowDecoratorAC implements Window {

    //Important!!
    private final Window window;

    //Important!!
    protected WindowDecoratorAC(Window windowToBeDecorated) {
        this.window = windowToBeDecorated;
    }

    @Override
    public void draw() {
        window.draw();
    }

    @Override
    public String getDescription() {
        return window.getDescription();
    }
}
