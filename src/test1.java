class Node{
    Node node;
    int temp;

    public Node(int temp) {
        this.node = null;
        this.temp = temp;
    }
}
public class test1 {

    static Node convertToArr(int[] arr){
        Node head = new Node(arr[0]);
        Node point = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            point.node = temp;
            point = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Node head = convertToArr(arr);
        System.out.println(head.temp);
        int target = 4;
        Node Head1 = head;

        while (head != null){

            if (target == head.node.temp){
                head = head.node.node;
            }
            head = head.node;
        }

    }
}