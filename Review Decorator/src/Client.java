import Decorate_package.SimpleWindow;
import Decorate_package.Window;
import Decorate_package.Window_decorator.BorderWindow;
import Decorate_package.Window_decorator.HorizontalWindow;
import Decorate_package.Window_decorator.VerticalWindow;

public class Client {
    public static void main(String args[]){
        Window simpleWindow = new SimpleWindow();

        Window decoratedWindow = new BorderWindow(
                                    new HorizontalWindow(
                                            new VerticalWindow(
                                                    simpleWindow)));
        decoratedWindow.draw();
        System.out.println(decoratedWindow.getDescription());
    }
}
