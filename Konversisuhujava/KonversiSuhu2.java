class KonversiSuhu2 extends KonversiSuhu {
    // Method konversi dari Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celciusToReamur(celsius); // Menggunakan metode dari superclass
    }
}