package Decorate_package;

public class SimpleWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Draw a simple window");
    }

    @Override
    public String getDescription() {
        return "Simple window";
    }
}
