package Arrays;
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
