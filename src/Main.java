public class Main {
    public static void main(String [] args) {
        Node node = new Node();

        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        node.print();
        System.out.println("Размер списка " + node.size());

    }
}
