package tournament;
import java.util.*;
import java.io.*;

public class Team {
    public String school;
    public String teamcaptain;
    public String teamname;
    public int TeamWithSubs;
    private String State;
    public ArrayList<Player>players = new ArrayList<Player>();
    public Team(String school, String teamname, int TeamWithSubs, String teamcaptain) {
        this.school = school;
        this.teamname = teamname;
        this.TeamWithSubs = TeamWithSubs;
        this.teamcaptain = teamcaptain;
    }

    public void setState(String state) {
        State = state;
    }

    public String getState() {
        return State;
    }
}