package homework6.rubber;

public class RubberArray<T> {
    private T[] array;

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T item) {
        if (array != null) {
            array[index] = item;
        }
    }

    public int size() {
        if (array != null) {
            return array.length;
        }
        return 0;
    }

    public void add(T item) {
        if (array == null) {
            array = (T[]) new Object[0];
        }
        T[] newArray = (T[]) new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = item;
        array = newArray;
    }

    public void addAll(T... items) {
        for (T item : items) {
            add(item);
        }
    }

    public boolean remove(Integer item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (array != null && array.length > 0) {
            T[] newArray = (T[]) new Object[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
            array = newArray;
        }
    }

    public boolean contains(T item) {
        for (T i : array) {
            if (i == item) {
                return true;
            }
        }
        return false;
    }

    public T toArray() {
        return (T) array;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                builder.append(array[i]);
                if (i != array.length - 1) {
                    builder.append(", ");
                }
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
