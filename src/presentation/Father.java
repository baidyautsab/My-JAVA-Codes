package presentation;

public class Father {
    Father(){
        System.out.println("Father class no arg constructor");
    }
    Father(int a){
        this();
        System.out.println("Father class one arg constructor");
    }
    Father(int a, String b){
        this(10);
        System.out.println("Father class two arg constructor");
    }
    Father(int a, int b, int c){
        System.out.println("Father class three arg constructor");
    }
    public static void main(String[] args) {
        Father f1 = new Father(10, "Java");
    }
}

class Son extends Father{
    Son(){
        super(10, 20, 30);
        System.out.println("Son class no arg constructor");
    }
    Son(int a, int b){
        this();
        System.out.println("Son class two arg constructor");
    }
    public static void main(String[] args) {
        Son s1 = new Son(30,40);
    }
}
