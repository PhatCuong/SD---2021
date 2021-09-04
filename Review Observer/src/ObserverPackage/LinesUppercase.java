package ObserverPackage;
import ObserverPackage.Source.SourceInterface;

public class LinesUppercase extends ILinesProcessing {

    public LinesUppercase(SourceInterface source) {
        super(source);
        source.attach(this);
    }

    @Override
    public void update() {
        String line = source.getState();
        System.out.println("Uppercase: " + line.toUpperCase());
    }
}
