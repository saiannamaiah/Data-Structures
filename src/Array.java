public class Array {

    private int[] items;
    int count = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        //if array is full resize it
        if(items.length == count) {
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
