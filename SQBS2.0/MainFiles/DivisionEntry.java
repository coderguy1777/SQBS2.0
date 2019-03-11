package MainFiles;

import java.util.ArrayList;

public class DivisionEntry {
    private int divisionamounts;
    private int teamamounts;
    public static String DivName;
    private ArrayList<String>Divisions = new ArrayList<>();

    public DivisionEntry(int divisionamounts, int teamamounts, String DivName) {
        this.divisionamounts = divisionamounts;
        this.teamamounts = teamamounts;
        this.DivName = DivName;
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

    public int getTeamamounts() {
        return teamamounts;
    }

    public String getDivName(int index) {
        return Divisions.get(index);
    }
}
