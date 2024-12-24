public class Triangle{
    private int a;
    private int b;
    private int c;
    public Triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean  isTriangle(){
        if(a>=0 && b>=0 && c>=0 && a+b > c && a+c > b && b+c > a){
            return true;
        }
        else{
            return false;
        }
    }
    public double getArea(){
        if(isTriangle()){
            return (1/2)*(a*b);
        }
        else{
            return 0;
        }
        
    }
}