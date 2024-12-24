public class HugeInteger{
    private int[] store = new int[40];
    public HugeInteger(String numb){
        int j = numb.length();
        String[] num = numb.split("");
        if(j>40){
            System.out.println("Invalid number exced digits 40");
        }
        else{
            for(int i = 1;i<=j;i++){

                this.store[40-i] = Integer.valueOf(num[j-i]);
            }
        }
    }
    public String Add(HugeInteger other){
        int[] datas = new int[40];
        int back = 0;
        int ans = 0;
        for(int i = 39;i >= 0;i--){
            ans = this.store[i] + other.store[i] + back;
            back = ans / 10;
            datas[i] = ans % 10;
        }
        int no = 0;
        for(int i = 0;i<40;i++){

            if(datas[i]==0 && i == no){
                no++;
            }
        }
        String ans2 = "";
        for(int n:datas){
            ans2 += "" + n;
        }
        return ans2.substring(no);
    }
   
    public String substract(HugeInteger other){
        int[] datas = new int[40];
        int back = 0;
        int ans = 0;
        for(int i = 39;i >= 0;i--){
            if((this.store[i] < other.store[i]) || (this.store[i] == other.store[i] && back == 1)){
            ans = 10 + this.store[i] - other.store[i] - back;
            back = 1;
            datas[i] = ans;
        }
            
            else {
            ans = this.store[i] - other.store[i] - back;
            back = 0;
            datas[i] = ans;
            }
        }
        
        int no = 0;
        for(int i = 0;i<40;i++){

            if(datas[i]==0 && i == no){
                no++;
            }
        }
        String ans2 = "";
        for(int n:datas){
            ans2 += "" + n;
        }
        return ans2.substring(no);
    }
    
    

    public String output(){
        String ans3 = "";
        int no = 0;
        for(int i = 0;i<40;i++){

            if(this.store[i]==0 && i == no){
                no++;
            }
        }
        for(int num:store){
            ans3 += "" + num;
        }
        return ans3.substring(no);
    }
    public void input(String numb){
        int j = numb.length();
        String[] num = numb.split("");
        if(j>40){
            System.out.println("Invalid number exced digits 40");
        }
        else{
            for(int i = 1;i<=j;i++){

                this.store[40-i] = Integer.valueOf(num[j-i]);
            }
        }
    }
    public boolean sEqualTo(HugeInteger other){
        return this.output() == other.output();
    }
    public boolean isNotEqualTo(HugeInteger other){
        return this.output() != other.output();
    }
    public boolean isLessThan(HugeInteger other){
        boolean t = false;
        if(this.output().length() < other.output().length()){
            t = true;
        }
        else if(this.output().length() == other.output().length()){
            int n1 = this.output().charAt(0) - '0';
            int n2 = other.output().charAt(0) - '0';
            t = n1 < n2;
        }
        return t;
    }
    public boolean isGreaterThan(HugeInteger other){
        boolean t = false;
        if(this.output().length() > other.output().length()){
            t = true;
        }
        else if(this.output().length() == other.output().length()){
            int n1 = this.output().charAt(0) - '0';
            int n2 = other.output().charAt(0) - '0';
            t = n1 > n2;
        }
        return t;
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger other){
        boolean t = false;
        if(this.output().length() > other.output().length()){
            t = true;
        }
        else if(this.output().length() == other.output().length()){
            int n1 = this.output().charAt(0) - '0';
            int n2 = other.output().charAt(0) - '0';
            t = n1 == n2;
            if(t){
            t = true;
            for(int i = 0; i < this.output().length(); i++){
                if(this.output().charAt(i) != other.output().charAt(i)){
                    t = false;
                }
            }
        }
        else{
            t = n1 > n2;
        }
        }
        return t;
    }
    public boolean isLessThanOrEqualToeach(HugeInteger other){
        boolean t = false;
        if(this.output().length() < other.output().length()){
            t = true;
        }
        else if(this.output().length() == other.output().length()){
            int n1 = this.output().charAt(0) - '0';
            int n2 = other.output().charAt(0) - '0';
            t = n1 == n2;
            if(t){
            t = true;
            for(int i = 0; i < this.output().length(); i++){
                if(this.output().charAt(i) != other.output().charAt(i)){
                    t = false;
                }
            }
        }
        else{
            t = n1 < n2;
        }
        }
        return t;
    }
    public boolean isZero(){
        return this.output() == "";
    }

    public static void main(String[] args) {
        HugeInteger hint1 = new HugeInteger("65432112345678901234567890123456");
        hint1.input("3456789");
        System.out.println(hint1.output());

        HugeInteger hint2 = new HugeInteger("12345612345678901765453216789654");
        
        System.out.println(hint2.output());

        System.out.println(hint1.Add(hint2));
        System.out.println(hint1.substract(hint2));

        HugeInteger hint3 = new HugeInteger("0");
        HugeInteger hint4 = new HugeInteger("567895678956789567895678956789");
        HugeInteger hint5 = new HugeInteger("567895678956789567895678956789");
        HugeInteger hint6 = new HugeInteger("987655876587658765876587658765");
        System.out.println(hint3.isZero());
        System.out.println(hint5.isGreaterThan(hint6));
        System.out.println(hint5.isGreaterThanOrEqualTo(hint4));
        System.out.println(hint5.isLessThan(hint6));
        System.out.println(hint5.isLessThanOrEqualToeach(hint6));
        System.out.println(hint5.isNotEqualTo(hint6));
        System.out.println(hint5.output().length());
        System.out.println(hint6.output().length());
       
        
        
        
    }    
}