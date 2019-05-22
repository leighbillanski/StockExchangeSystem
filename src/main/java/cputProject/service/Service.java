package cputProject.service;

public interface Service<TYPE ,ID> {
    TYPE create(TYPE type);
    TYPE read(ID id);
    TYPE update(TYPE type);
    void delete(ID id);
}
