package TestingZone;

import java.io.FileNotFoundException;

public class TesterClass {
    public static void main(String[]args) throws FileNotFoundException {
        AboutReader aboutReader = new AboutReader("About.txt");
        aboutReader.filereader();
        aboutReader.fileoutput();
    }
}
