import ObserverPackage.ILinesProcessing;
import ObserverPackage.LinesCountCharacter;
import ObserverPackage.LinesDisplay;
import ObserverPackage.LinesUppercase;
import ObserverPackage.Source.LineSource;
import ObserverPackage.Source.SourceInterface;

public class Client {
    public static void main (String args[]){
        System.out.println("Enter a text: ");
        SourceInterface source = new LineSource();

        ILinesProcessing display = new LinesDisplay(source);
        ILinesProcessing uppercase = new LinesUppercase(source);
        ILinesProcessing count = new LinesCountCharacter(source);

        source.startProcessing();
    }
}
