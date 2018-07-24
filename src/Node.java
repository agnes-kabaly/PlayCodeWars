public class Node {

    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception{
        int counter = 0;
        if (n == null) {
            throw new IllegalArgumentException();
        }
        while (n != null) {
            if (counter == index) {
                return n.data;
            } else {
                counter++;
                n = n.next;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
