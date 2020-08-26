public interface DAO<T> {
    void addTask(T t);
    T[] getList(T t);
    void updateTask(T t);


}
