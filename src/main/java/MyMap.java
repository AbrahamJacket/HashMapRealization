public interface MyMap<K, V> {

    void clear();

    boolean containsKey(K key);

    V get(K key);

    boolean isEmpty();

    boolean remove(K key); // Returns the value to which this map previously associated the key, or null

    V put(K key, V value); // Returns the previous value associated with key, or null

    int size();

}
