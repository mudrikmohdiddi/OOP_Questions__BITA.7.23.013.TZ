public class Rational {
    
    private int numerator;
    private int denominator;
    public Rational(){
        this.numerator = 1;
        this.denominator = 2;
    }
    public Rational(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void AddingRational(int numerator,int denominator){
        
        int dtr = this.denominator;
        this.denominator = this.denominator * denominator;
        this.numerator = this.numerator * denominator + dtr * numerator;
        
    }
    public void SubtractingRational(int numerator,int denominator){
       
        int dtr = this.denominator;
        this.denominator = this.denominator * denominator;
        this.numerator = this.numerator * denominator - dtr * numerator;
        
    }
    public void MultiplyingRational(int numerator,int denominator){
        this.denominator = this.denominator * denominator;
        this.numerator = this.numerator * numerator;
    }
    public void DividingRational(int numerator,int denominator){
        this.denominator = this.denominator * numerator;
        this.numerator = this.numerator * denominator;
    }
    public String PrintingRational(){
        int m = 0;
    if(this.denominator != this.numerator){
        if(this.denominator < this.numerator){
            m = this.denominator;
        }
        else{
            m = this.numerator;
        }
        for(int i = 2;i<=m;i++){
            for(int j = 0; j<=m;j++){
            if(this.numerator % i ==0 && this.denominator % i == 0){
                this.denominator = this.denominator / i;
                this.numerator = this.numerator / i;
            }
        }
        }
    }
    else{
        this.denominator = 1;
        this.numerator = 1;
        }
    
    return this.numerator+"/"+this.denominator;
    }
    public double PrintingFloating(){
        return (double)this.numerator / this.denominator;
    }
}