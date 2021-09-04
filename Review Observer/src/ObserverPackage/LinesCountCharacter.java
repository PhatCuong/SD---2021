package ObserverPackage;

import ObserverPackage.Source.SourceInterface;

public class LinesCountCharacter extends ILinesProcessing{
    public LinesCountCharacter(SourceInterface source) {
        super(source);
        source.attach(this);
    }

    @Override
    public void update() {
        String line = source.getState();
        System.out.println("Character count: " + line.length());
    }
}
