package UIBackend;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class ListingClass {
    public ArrayList<Label>LabelListLi = new ArrayList<>();
    public String wantedTextLabels;
    public ArrayList<Button>ButtonListLi = new ArrayList<>();
    public int wantedAmountOfLabels;

    public ListingClass(String wantedTextLabels, int wantedAmountOfLabels) {
        this.wantedAmountOfLabels = wantedAmountOfLabels;
        this.wantedTextLabels = wantedTextLabels;
    }

    public void labelTester() {
        WantedLi[] wantedLis = WantedLi.values();
        ArrayList<Label> newLabels = new ArrayList<>();
        for (WantedLi i : wantedLis) {
            newLabels.add(new Label(i + " " + "Tutorial"));
            System.out.println(i);
            LabelListLi.add(new Label(i + " " + "Tutorial"));
        }
        int i = 0;
        while(i < newLabels.size() - 1)  {
            i++;
        }
    }


}
