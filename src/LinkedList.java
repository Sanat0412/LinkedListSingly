interface LinkedADT<E> {
    boolean add(E item);
    E remove();
    E remove(int index);
    E get(int index);
    int size();
    void show();
}
class LinkedList<E> implements LinkedADT<E> {
    private Node<E> head;
    private int size = 0;

    @Override
    public E remove(int index) {
        Node<E> n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        E value = n.next.data;
        n.next = n.next.next;
        size--;
        return value;
    }

    @Override
    public boolean add(E item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
            size++;
            return true;
        }
        else {
            Node<E> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            size++;
            return true;
        }
    }

    @Override
    public E remove() {
        Node<E> n = head;
        for (int i = 0; i < size - 1; i++) {
            n = n.next;
        }
        E value = n.data;
        n.next = null;
        size--;
        return value;
    }

    @Override
    public E get(int index) {
        Node<E> n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void show() {
        Node<E> n = head;
        for (int i = 0; i < size; i++) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
