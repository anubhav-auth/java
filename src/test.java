interface shape{
    void area();
}

class marksout extends Exception{
    marksout(String s){
        super(s);
    }
    marksout(){
        super("Hii");
    }
}

public class test {

    public static void main(String[] args) {
        try{
            throw new marksout();
        }catch (marksout e){
            System.out.println(e.getMessage());
        }
    }

}