public class Kitten {
    /*
     String name, String owner, and int age. 
     */
    private String name;
    private String owner;
    private int age;
    public Kitten(String name,String owner){
        this.name = name;
        this.owner = owner;
        this.age = 0;
    }
    public int getAge(int age){
        this.age = age;
        return age;
    }
    public void haveBirthday(){
        this.age = age + 1;
    }
    public String toString(int age){
        return "<Kitten"+ name+"> is <"+getAge(age)+"> and belongs to <wner "+owner+">";
    }
    public static void main(String[] args) {
        Kitten kitten = new Kitten("Mudrik MOHD", "SAID ALI");
        System.out.println(kitten.toString(67));
    }
}
