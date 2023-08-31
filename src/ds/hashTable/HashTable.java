package ds.hashTable;

class HashTable {
    public int[] array;
    public int capacity;

    public HashTable(int c) {
        capacity = c;
        array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = -1; // Initialize all slots to -1 to indicate empty
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void insert(int x) {
        int index = hash(x);
        int originalIndex = index;

        while (array[index] != -1) {
            if (array[index] == x) {
                return; // Value already exists in the table, no need to insert
            }
            index = (index + 1) % capacity; // Linear probing
            if (index == originalIndex) {
                return; // Table is full, which shouldn't happen in this simplified scenario
            }
        }

        array[index] = x; // Insert the value at the empty position
    }

    public boolean find(int x) {
        int index = hash(x);
        int originalIndex = index;

        while (array[index] != x) {
            System.out.println("ok");
            if (array[index] == x) {
                return true; // Found the value in the table
            }
            index = (index + 1) % capacity; // Linear probing

            if (index == originalIndex) {
                return false; // Checked all positions, value is not in the table
            }
        }

        return false; // Value not found in the table
    }
}
