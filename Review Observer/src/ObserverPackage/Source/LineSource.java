package ObserverPackage.Source;

import ObserverPackage.ILinesProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class LineSource implements SourceInterface {
    private String line;
    private ArrayList<ILinesProcessing> linesProcessingArrayList = new ArrayList<>();

    @Override
    public void startProcessing() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            for(ILinesProcessing linesProcessing : linesProcessingArrayList){
                this.line = line;
                linesProcessing.update();
            }
        }
    }

    @Override
    public void attach(ILinesProcessing iLinesProcessing) {
        linesProcessingArrayList.add(iLinesProcessing);
    }

    @Override
    public void detach(ILinesProcessing iLinesProcessing) {
        linesProcessingArrayList.add(iLinesProcessing);
    }

    @Override
    public String getState() {
        return this.line;
    }
}
