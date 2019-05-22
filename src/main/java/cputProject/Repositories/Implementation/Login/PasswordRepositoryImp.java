package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.PasswordRepository;
import cputProject.domain.Login.Password;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorypa")
public class PasswordRepositoryImp implements PasswordRepository {
    private static PasswordRepositoryImp repo = null;
    private Map<String,Password> comp;

    private PasswordRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static PasswordRepositoryImp getRepo(){
        if(repo == null){
            repo = new PasswordRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Password> getAll() {
        Collection<Password> students = this.comp.values();
        Set<Password> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Password create(Password company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Password update(Password company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public Password read(String company) {
        return this.comp.get(company);
    }
}
