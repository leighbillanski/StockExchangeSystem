package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.IndustryRepository;
import cputProject.domain.Company.Industry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryi")
public class IndustryRepositoryImp implements IndustryRepository {
    private static IndustryRepositoryImp repo = null;
    private Map<String,Industry> comp;

    private IndustryRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static IndustryRepositoryImp getRepo(){
        if(repo == null){
            repo = new IndustryRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Industry> getAll() {
        Collection<Industry> students = this.comp.values();
        Set<Industry> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Industry create(Industry company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Industry update(Industry company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public Industry read(String company) {
        return this.comp.get(company);
    }

}
