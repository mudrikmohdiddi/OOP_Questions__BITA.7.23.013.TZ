public class Complex {
    private double realPart;
    private double imaginaryPart;
    public Complex(){
        this.realPart = 1;
        this.imaginaryPart = 1;
    }
    public Complex(double realPart,double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }
    public void Adding(double realPart,double imaginaryPart){
        this.realPart = this.realPart + realPart;
        this.imaginaryPart = this.imaginaryPart + imaginaryPart;
    }
    public void Subtracting(double realPart,double imaginaryPart){
        this.realPart = this.realPart - realPart;
        this.imaginaryPart = this.imaginaryPart - imaginaryPart;
    }
    public String Printing(){
        return "( "+this.realPart+" , "+this.imaginaryPart+" )";
    }
}
