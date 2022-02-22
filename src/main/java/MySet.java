public interface MySet<K, V> {

        V add(K key, V value); // Returns true if this set did not already contain the specified element

        void clear();

        boolean contains(K o);

        boolean isEmpty();

        boolean remove(K o); // Returns true if this set contained the specified element

        int size();

    }
