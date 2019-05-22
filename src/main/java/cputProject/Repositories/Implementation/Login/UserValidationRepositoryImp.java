package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserValidationRepository;
import cputProject.domain.Login.UserValidation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryuv")
public class UserValidationRepositoryImp implements UserValidationRepository {
    private static UserValidationRepositoryImp repo = null;
    private Map<String,UserValidation> comp;

    private UserValidationRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static UserValidationRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserValidationRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<UserValidation> getAll() {
        Collection<UserValidation> students = this.comp.values();
        Set<UserValidation> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public UserValidation create(UserValidation company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public UserValidation update(UserValidation company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public UserValidation read(String company) {
        return this.comp.get(company);
    }
}
