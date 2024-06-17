package ITER.Sem2.Assignment3.assignment;

class Box <T> {
    T value;
    Box(T value){
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class Q4 {
    public static void main(String[] args) {
        System.out.println("String Box");
        Box<String> box1 = new Box<String>("Hello");

        Box<String> refs1 = box1;
        Box<String> refs2 = box1;

        System.out.println("refs1: " + refs1.value);
        System.out.println("refs2: " + refs2.value);

        refs1.value = "ji";

        System.out.println("refs1: " + refs1.value);
        System.out.println("refs2: " + refs2.value);


        System.out.println("Integer Box");

        Box<Integer> box2 = new Box<Integer>(10);

        Box<Integer> refi1 = box2;
        Box<Integer> refi2 = box2;

        System.out.println("ref1: " + refi1.value);
        System.out.println("ref2: " + refi2.value);

        refi1.setValue(30);

        System.out.println("ref1: " + refi1.value);
        System.out.println("ref2: " + refi2.value);

        System.out.println("Object Box");
        Box<Object> box3 = new Box<>("hi");

        Box<Object> refo1 = box3;
        Box<Object> refo2 = box3;

        System.out.println("ref1: " + refo1.value);
        System.out.println("ref2: " + refo2.value);

        refo1.setValue(30);

        System.out.println("ref1: " + refo1.value);
        System.out.println("ref2: " + refo2.value);
    }
}
