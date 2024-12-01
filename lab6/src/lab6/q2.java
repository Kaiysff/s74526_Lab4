package lab6;

public class q2 {

    public static void main(String[] args) {

        int kilogram = 1;
        double pound = 0;
        while (kilogram < 200) {
            pound = kilogram * 2.2;
            System.out.println(kilogram + "  " + pound);
            kilogram += 2;
        }
    }
}
