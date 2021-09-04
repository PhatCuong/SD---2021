package ObserverPackage.Source;

import ObserverPackage.ILinesProcessing;

public interface SourceInterface {
    void startProcessing();
    void attach(ILinesProcessing iLinesProcessing);
    void detach(ILinesProcessing iLinesProcessing);
    String getState();
}
