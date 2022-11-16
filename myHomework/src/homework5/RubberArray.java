package homework5;

public class RubberArray {
    private int[] array;

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int item) {
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

    public void add(int item) {
        if (array == null) {
            array = new int[0];
        }
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = item;
        array = newArray;
    }

    public void addAll(int... items) {
        for (int item : items) {
            add(item);
        }
    }

    public boolean remove(Integer item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (array != null && array.length > 0) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
            array = newArray;
        }
    }

    public boolean contains(int item) {
        for (int i : array) {
            if (i == item) {
                return true;
            }
        }
        return false;
    }

    public int[] toArray() {
        return array;
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
