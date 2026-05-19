public class Test {

public int thisIsANewMethod(int a) {
int number = 10;
if (number > a) return number;
else return a; 
}
    // einfache Methode
    public void hello() {
        System.out.println("Hello World!");
	System.out.println("How are you, Nicole?");
    }

    // main-Methode zum Ausführen
    public static void main(String[] args) {
        Test t = new Test();
        t.hello();
    }
}
