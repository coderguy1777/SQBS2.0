package MainFiles;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilder;

public class DivisionEntry extends BracketCreation{
    private String divisionamount;
    private String teamamount;
    private String subamount;
    int bracketsize;
    private ArrayList<ArrayList<Integer>>BracketLi = new ArrayList<>();

    public DivisionEntry(String divisionamount, String teamamount, String subamount) {
        this.divisionamount = divisionamount;
        this.teamamount = teamamount;
        this.subamount = subamount;
        strParse();
    }

    private ArrayList<Integer> strParse() {
        int divamount, teamamount, subamount;
        divamount = Integer.parseInt(this.divisionamount);
        teamamount = Integer.parseInt(this.teamamount);
        subamount = Integer.parseInt(this.subamount);
        ArrayList<Integer>parseStrings = new ArrayList<>();
        parseStrings.add(divamount);
        parseStrings.add(teamamount);
        parseStrings.add(subamount);
        return parseStrings;
    }

    public void newBracketCreator() throws BracketException {
        ArrayList<Integer>divisions = new ArrayList<>();
        ArrayList<Integer>teams = new ArrayList<>();
        int divcount = 0;
        int teamcount = 0;
        int subcount = 0;
        ArrayList<Integer>parsed = strParse();
        divcount = parsed.get(0);
        teamcount = parsed.get(1);
        subcount = parsed.get(2);
        for(int i = divcount; i > 0; i--) {
            divisions.add(i);
        }

        for(int j = teamcount; j > 0; j--) {
            teams.add(j);
        }
    }
}
