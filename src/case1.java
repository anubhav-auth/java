public class case1 {
    int c = 0;

    void counter(){
        c++;
        System.out.println(c);
    }

    public static void main(String[] args) {
        case1 cd = new case1();
        case1 cd2 = new case1();
        case1 cd3 = new case1();
        case1 cd4 = new case1();

        cd.counter();  // 1

        cd2.counter(); // 2

        cd3.counter();

        cd4.counter();
    }
}
