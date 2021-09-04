package ObserverPackage;

import ObserverPackage.Source.SourceInterface;

public abstract class ILinesProcessing {
    protected SourceInterface source;
    public ILinesProcessing(SourceInterface source){
        this.source = source;
    }
    public abstract void update();
}
