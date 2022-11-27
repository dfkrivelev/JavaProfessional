package homework8;

public class RubberList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public void add(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = new Node<>(value, first, null);
            first.next = last;
        } else {
            Node<T> newLast = new Node<>(value, last, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public boolean remove(T value) {
        if (first != null) {
            Node<T> cursor = first;
            do {
                if (cursor.value.equals(value)) {
                    if (cursor.pred == null) {
                        if (first.next != null) {
                            first = first.next;
                            first.pred = null;
                        } else {
                            first = null;
                        }
                    } else if (cursor.next == null) {
                        last = last.pred;
                        last.next = null;
                    } else {
                        cursor.pred.next = cursor.next;
                        cursor.next.pred = cursor.pred;
                    }
                    size--;
                    return true;
                }
                cursor = cursor.next;
            } while (cursor != null);
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            Node<T> cursor = first;
            do {
                sb.append(cursor.value);
                cursor = cursor.next;
                if (cursor != null) {
                    sb.append(", ");
                }
            } while (cursor != null);
        }
        return sb.append("]").toString();
    }

    private class Node<T> {
        T value;
        Node<T> pred;
        Node<T> next;

        public Node(T value, Node<T> pred, Node<T> next) {
            this.value = value;
            this.pred = pred;
            this.next = next;
        }
    }
}
