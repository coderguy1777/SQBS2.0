package MainFiles;
import java.util.*;

public class TeamEntry {
    public ArrayList<String>teamnames = new ArrayList<>();
    public String teamname;
    public int memberamount;

    public TeamEntry(String teamname, int memberamount) {
        this.teamname = teamname;
        this.memberamount = memberamount;
        teamnames.add(teamname);
    }
}
