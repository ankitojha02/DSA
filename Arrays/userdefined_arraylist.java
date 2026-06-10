package Arrays;

// Time Complexity: O(1) for add operation (amortized), O(n) for resize operation
 class ArrayList{
     int[] arr;
     int idx = 0;
     int size = 0;

     ArrayList(int capacity) {
        arr = new int[capacity];
     }

     int capacity() {
        return arr.length;
     }

        void add(int value) {
            if (idx == arr.length) {
                resize();
            }
            arr[idx] = value;
            idx++;
            size++;
        }

        void resize() {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }

        int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return arr[index];
        }

        void set(int index, int value) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            arr[index] = value;
        }

        void display() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
}
public class userdefined_arraylist {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(5);
        System.out.println(myList.capacity()); // Initial capacity

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.display();
        System.out.println(myList.capacity()); // Capacity after adding elements
    }
}
