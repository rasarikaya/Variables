package Day03_Variables;

public class Currency {

    public static void main(String[] args) {

        int dollar = 100;

        double lira = dollar * 8.41;
        double euro = dollar * 0.81;
        double ruble = dollar* 73.60;

        /*
        System.out.print("Lira: ");
        System.out.println(Lira);
         */

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("ruble = " + ruble);

    }
}
