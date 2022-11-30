package homework9;

import java.util.Iterator;

public class ItrRubberList<T> implements Iterable<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    //stack methods

    public void push(T value) {
        add(value);
    }

    public T pop() {
        T value = getLast();
        if (size == 1) {
            first = null;
        } else {
            last = last.pred;
            last.next = null;
        }
        size--;
        return value;
    }

    //queue methods

    public void enqueue(T value) {
        add(value);
    }

    public T dequeue() {
        T value = first.value == null ? null : first.value;
        if (size == 1) {
            first = null;
        } else {
            first = first.next;
            first.pred = null;
        }
        size--;
        return value;
    }

    public T getFirst() {
        return first != null ? null : first.value;
    }

    public T getLast() {
        return last == null ? getFirst() : last.value;
    }

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

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        private Node<T> cursor = first;
        private T value;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            value = cursor.value;
            cursor = cursor.next;
            return value;
        }

        @Override
        public void remove() {
            if (value != null) {
                ItrRubberList.this.remove(value);
            }
        }
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
