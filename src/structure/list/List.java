package structure.list;

public interface List<T> {
    void add(T value);
    void remove(long index);

    T get(long index);
    void print();
}
