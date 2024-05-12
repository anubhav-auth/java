package ITER.Sem2.Assignment3.assignment;

class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String s){
        super(s);
    }
    MarksOutOfBoundException(){
        super("Marks should be between 0 and 100");
    }
}

class Student{
    int mark;
    String name;
    Student(int mark, String name){

        try{
            if(mark<0 || mark>100){
                throw new MarksOutOfBoundException();
            }else {
                this.mark = mark;
            }
        }catch (MarksOutOfBoundException e){
            System.out.println(e);
        }
        this.name = name;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student st = new Student(101, "John");
    }
}
