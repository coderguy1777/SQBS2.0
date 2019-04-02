package MainFiles;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;

public class DivisionEntry  {
    private int divisionamount;
    private int teamamount;
    private int subamount;
    int bracketsize;
    public ArrayList<MenuItem>test = new ArrayList<>();

    public DivisionEntry(ArrayList<String>Test) {
        strParse(Test);
    }

    // Parses the ArrayList of inputted Strings to be parsed
    private ArrayList<Integer> strParse(ArrayList<String> test) {
        ArrayList<Integer> parseStrings = new ArrayList<>();
        for(String I: test) {
            parseStrings.add(Integer.parseInt(I));
        }
        divisionamount = parseStrings.get(0);
        teamamount = parseStrings.get(1);
        subamount = parseStrings.get(2);
        return parseStrings;
    }

    public int getDivisionamount() {
        return this.divisionamount;
    }

    public void newBracketCreator() {
        ArrayList<MenuItem>menuItems = new ArrayList<>();
        for(int i = 0; i < this.divisionamount; i++) {
            menuItems.add(new MenuItem(" Division " + i));
            items(test);
        }
    }

    public void items(ArrayList<MenuItem>inputs) {
        MenuItem j = null;
        for(MenuItem i: inputs) {
            test.add(i);
        }
    }

    public ArrayList<MenuItem>tester() {
        return test;
    }

}
