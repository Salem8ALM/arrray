//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] temps = new int[5];
        temps[0] = 67;
        temps[1]=24;
        temps[2]=22;
        temps[3]=36;
        temps[4]=41;

        temps[2]=99;
        for (int temp : temps){
            System.out.println(temp);
        }

    }
}