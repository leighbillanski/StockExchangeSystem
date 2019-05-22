package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.LoginRepository;
import cputProject.domain.Login.Login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryl")
public class LoginRepositoryImp implements LoginRepository {
    private static LoginRepositoryImp repo = null;
    private Map<String,Login> comp;

    private LoginRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static LoginRepositoryImp getRepo(){
        if(repo == null){
            repo = new LoginRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Login> getAll() {
        Collection<Login> students = this.comp.values();
        Set<Login> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Login create(Login company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Login update(Login company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Login read(String company) {
        return this.comp.get(company);
    }
}
