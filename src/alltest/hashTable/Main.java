package alltest.hashTable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.insert(1);
        table.insert(2);
        table.insert(3);
        table.insert(4);

        System.out.println(Arrays.toString(table.array));

        System.out.println(table.find(5));
    }
}
