package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserNameRepository;
import cputProject.domain.Login.UserName;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryun")
public class UserNameRepositoryImp implements UserNameRepository {
    private static UserNameRepositoryImp repo = null;
    private Map<String,UserName> comp;

    private UserNameRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static UserNameRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserNameRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<UserName> getAll() {
        Collection<UserName> students = this.comp.values();
        Set<UserName> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public UserName create(UserName company) {
        this.comp.put(company.getUserId(),company);
        return company;
    }

    @Override
    public UserName update(UserName company) {
        this.comp.replace(company.getUserId(),company);
        return this.comp.get(company.getUserId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public UserName read(String company) {
        return this.comp.get(company);
    }
}
