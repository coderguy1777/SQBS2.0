package tournament;
import java.util.*;
import java.io.*;

public class Player {
    private int age;
    private String Name;
    private String schoolName;
    
    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        Name = n;
    }

    public String getName() {
        return Name;
    }

    public void setSchoolName(String schoolname) {
        schoolName = schoolname;
    }

    public String getSchoolName() {
        return schoolName;
    }
}