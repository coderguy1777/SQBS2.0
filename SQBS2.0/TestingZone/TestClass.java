package TestingZone;
import java.util.ArrayList;

class TestClass {
    public static void main(String[]args) {
        ArrayList<ArrayList<Integer>>test = new ArrayList<>();

        ArrayList<Integer>lia = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            double a = Math.random() * 6 + 1;
            lia.add((int)a);
        }

        ArrayList<Integer>lib = new ArrayList<>();
        for(int x = 0; x < 10; x++) {
            double f = Math.random() * 5 + 1;
            lib.add((int)f);
        }

        test.add(lia);
        test.add(lib);

        for(ArrayList<Integer>testli: test) {
            System.out.println(testli);
        }
        for(int i = 0; i < test.size(); i++) {
            for(int x = 0; x < test.get(i).size(); x = x+1) {
                System.out.print(test.get(i).get(x));
            }
        }
        System.out.print("\n");
        System.out.println("         ");
        for(int j = 0; j < 5; j++) {
            System.out.print(" " + '\n');
            for (int jj = 0; jj < j * 2; jj++) {
                System.out.print("K" + " ");
            }
        }

    }
}
