package cputProject.service;

public interface Service<TYPE ,ID> {
    TYPE create(TYPE type);
    TYPE read(TYPE type);
    TYPE update(TYPE type);
    void delete(String id);
}
