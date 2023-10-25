public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();
        
        double celsius = 25.0;
        double fahrenheit = konversiSuhu2.celciusToFahrenheit(celsius);
        double reamur = konversiSuhu2.celciusToReamur(celsius);
        double reamurFromFahrenheit = konversiSuhu2.fahrenheitToReamur(fahrenheit);
        
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(celsius + " Celsius = " + reamur + " Reamur");
        System.out.println(fahrenheit + " Fahrenheit = " + reamurFromFahrenheit + " Reamur");
    }
}