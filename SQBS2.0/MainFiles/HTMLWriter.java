package MainFiles;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import java.util.ArrayList;

public class HTMLWriter {
    public ArrayList<Object>Divisions = new ArrayList<>();
    public ArrayList<Object>Teams = new ArrayList<>();
    public ArrayList<Object>Players = new ArrayList<>();
    public String divname;
    public String teamname;

    public HTMLWriter(String divname, String teamname) {
        this.divname = divname;
        this.teamname = teamname;
        for(int i = 1; i < Divisions.size(); i++) {
            Divisions.add(this.divname);
        }
        for(Object team : Teams) {
            Teams.add((Object)teamname);
        }
    }
}
