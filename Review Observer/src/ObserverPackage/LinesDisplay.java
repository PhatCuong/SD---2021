package ObserverPackage;

import ObserverPackage.Source.SourceInterface;

public class LinesDisplay extends ILinesProcessing{

    public LinesDisplay(SourceInterface source) {
        super(source);
        source.attach(this);
    }

    @Override
    public void update() {
        String line = source.getState();
        System.out.println("Input text: " + line);
    }
}
