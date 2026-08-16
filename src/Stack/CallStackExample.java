package Stack;

public class CallStackExample {
    public static void D(){
        System.out.println("This is method D.");
    }
    public static void C(){
        System.out.println("This is method C.");
    }
    public static void B(){
        C();
        System.out.println("This is method B.");
    }
    public static void A(){
        B();
        System.out.println("This is method A.");
    }
   public static void main(){
        A();
        D();
   }
}
