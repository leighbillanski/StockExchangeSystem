package cputProject.Repositories;

public interface Repository<T,ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(T t);
}
