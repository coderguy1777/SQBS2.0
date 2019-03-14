package MainFiles;
import java.util.*;

public class TeamEntry {
    public static  ArrayList<String>teamnames = new ArrayList<>();
    public String teamname;
    public int memberamount;
    public ArrayList<DivisionEntry>divisionEntries = new ArrayList<>();

    public TeamEntry(String teamname, int memberamount) {
        this.teamname = teamname;
        this.memberamount = memberamount;
        teamnames.add(teamname);
    }
}
