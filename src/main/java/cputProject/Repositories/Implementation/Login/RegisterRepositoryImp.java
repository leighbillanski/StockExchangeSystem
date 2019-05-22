package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RegisterRepository;
import cputProject.domain.Login.Register;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryreg")
public class RegisterRepositoryImp implements RegisterRepository {
    private static RegisterRepositoryImp repo = null;
    private Map<String,Register> comp;

    private RegisterRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static RegisterRepositoryImp getRepo(){
        if(repo == null){
            repo = new RegisterRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Register> getAll() {
        Collection<Register> students = this.comp.values();
        Set<Register> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Register create(Register company) {
        this.comp.put(company.getEmail(),company);
        return company;
    }

    @Override
    public Register update(Register company) {
        this.comp.replace(company.getEmail(),company);
        return this.comp.get(company.getEmail());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Register read(String company) {
        return this.comp.get(company);
    }
}
