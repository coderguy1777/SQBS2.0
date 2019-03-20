package MainFiles;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilder;

public class DivisionEntry {
    private int divisionamounts;
    private int bracketAmount;
    private int teamamounts;
    public static String DivName;
    private static final int maxmatchsize = 2;
    private ArrayList<String>Divisions = new ArrayList<>();
    private ArrayList<String>Brackets = new ArrayList<>();

    public DivisionEntry(int bracketAmount, int divisionamounts, int teamamounts, String DivName) {
        this.divisionamounts = divisionamounts;
        this.teamamounts = teamamounts;
        this.bracketAmount = bracketAmount;
        DivisionEntry.DivName = DivName;
        Divisions.add(DivName);
    }

    public void setDivisionamounts(int size) {
        this.divisionamounts = size;
    }

    public int getDivisionamounts() {
        return divisionamounts;
    }

    public void setTeamamounts(int size) {
        this.teamamounts = size;
    }

    public String getDivName(int index) {
        return Divisions.get(index);
    }
}
