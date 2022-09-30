interface A
{
    default void display() {
        System.out.println("MyInterface1");
    }
}
interface  B
{
    default void display() {
        System.out.println("MyInterface2");
    }

}
public class Multiple  implements  A,B

{
    @Override
    public void display() {
        System.out.println("Multiple class");
       // A.super.display();
        //B.super.display();
    }


    public static void main(String[] args) {
        new Multiple().display();

    }
}







