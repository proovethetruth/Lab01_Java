
public class App {
    public static void main(String[] args) {
        Int q = new Int(-2);
        Int res = q.pow(4);
        System.out.println(res.toString());

        Int a = new Int();
        Int b = new Int();

        b.increment();
        for(int i = 0; i < 3; i++) {
            b.add(b);
        }
        a.add(b);
        b.add(b);


        for(int i = 0; i < 5; i++) {
            b.add(b);
            a.add(b);
        } 
        a.add(a);
        a.decrement();
        a.decrement();
        System.out.println(a.toString());
    }
}
