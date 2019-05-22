package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.EmailRepository;
import cputProject.domain.Login.Email;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorye")
public class EmailRepositoryImp implements EmailRepository {
    private static EmailRepositoryImp repo = null;
    private Map<String,Email> comp;

    private EmailRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static EmailRepositoryImp getRepo(){
        if(repo == null){
            repo = new EmailRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Email> getAll() {
        Collection<Email> students = this.comp.values();
        Set<Email> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Email create(Email company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Email update(Email company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Email read(String  company) {
        return this.comp.get(company);
    }
}
