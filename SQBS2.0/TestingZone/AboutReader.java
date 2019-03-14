package TestingZone;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class AboutReader  {
    public static ArrayList<String>fileinfo = new ArrayList<>();
    public String filename;

    public AboutReader(String filename) {
        this.filename = filename;
    }

    public void filereader() throws FileNotFoundException {
        File file = new File(this.filename);
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            fileinfo.add(scan.next());
        }
        scan.close();
    }

    public String fileoutput() {
        ArrayList<String>fileinfo2 = new ArrayList<>();
        for (String s : fileinfo) {
            System.out.println(s);
            fileinfo2.add(s);
            if(fileinfo2.size() > 5) {
                System.out.println("it works");
                break;
            }
        }
        return fileinfo.get(2);
    }


}
