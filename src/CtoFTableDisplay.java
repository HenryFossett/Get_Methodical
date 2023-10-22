public class CtoFTableDisplay {
    public static void main(String[] args) {
        double fahrenheit = 0;
        for(double i = -100; i <= 100; i+= 0.50){
            fahrenheit = CtoF(i);
            System.out.printf("%3.2f %3.2f%n",i,fahrenheit);
        }

    }
    public static double CtoF(double Celsius){
        double fahrenheit = 0;
        fahrenheit = ((Celsius * (9.0/5.0))+32);
        return fahrenheit;
    }
}
