public class MyHashSet<K, V> implements MySet<K, V> {

    MyHashMap map = new MyHashMap();

    @Override
    public V add(K key, V value) {
         map.put(key, value);
        return value;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(K o) {
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean remove(K o) {
        return map.remove(o);
    }

    @Override
    public int size() {
        return map.size();
    }
}
