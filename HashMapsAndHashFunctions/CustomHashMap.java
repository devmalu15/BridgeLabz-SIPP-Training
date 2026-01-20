import java.util.*;
public class CustomHashMap<K,V> {
	private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 16;  // number of buckets
    private Node<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> head = buckets[index];
        Node<K, V> current = head;

        // Check if key exists — if yes, update
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // otherwise, add at head
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    // head removal
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            Node<K, V> current = buckets[i];
            System.out.print("Bucket " + i + ": ");
            while (current != null) {
                System.out.print("[" + current.key + "=" + current.value + "] ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);
        map.put("apple", 10);  // update apple

        System.out.println("apple: " + map.get("apple"));  // 10
        System.out.println("banana: " + map.get("banana"));  // 2

        map.remove("banana");
        System.out.println("banana after remove: " + map.get("banana"));  // null

        map.display();
    }

}
