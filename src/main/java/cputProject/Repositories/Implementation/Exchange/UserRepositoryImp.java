package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.UserRepository;
import cputProject.domain.Exchange.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryu")
public class UserRepositoryImp implements UserRepository {
    private static UserRepositoryImp repo = null;
    private Map<String,User> comp;

    private UserRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static UserRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<User> getAll() {
        Collection<User> students = this.comp.values();
        Set<User> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public User create(User company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public User update(User company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);


    }

    @Override
    public User read(String company) {
        return this.comp.get(company);
    }
}
