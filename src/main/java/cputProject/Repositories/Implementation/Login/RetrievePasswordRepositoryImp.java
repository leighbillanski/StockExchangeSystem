package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RetrievePasswordRepository;
import cputProject.domain.Login.RetreivePassword;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryrp")
public class RetrievePasswordRepositoryImp implements RetrievePasswordRepository {
    private static RetrievePasswordRepositoryImp repo = null;
    private Map<String,RetreivePassword> comp;

    private RetrievePasswordRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static RetrievePasswordRepositoryImp getRepo(){
        if(repo == null){
            repo = new RetrievePasswordRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<RetreivePassword> getAll() {
        Collection<RetreivePassword> students = this.comp.values();
        Set<RetreivePassword> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public RetreivePassword create(RetreivePassword company) {
        this.comp.put(company.getOldPassword(),company);
        return company;
    }

    @Override
    public RetreivePassword update(RetreivePassword company) {
        this.comp.replace(company.getOldPassword(),company);
        return this.comp.get(company.getOldPassword());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public RetreivePassword read(String company) {
        return this.comp.get(company);
    }
}
