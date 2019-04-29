package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.domain.Exchange.Bonds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BondsRepositoryImp implements BondsRepository {
    private static BondsRepositoryImp repo = null;
    private List<Bonds> comp;

    private BondsRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static BondsRepositoryImp getRepo(){
        if(repo == null){
            repo = new BondsRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Bonds> getAll() {
        return this.comp;
    }

    @Override
    public Bonds create(Bonds company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Bonds update(Bonds company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Bonds read(Bonds company) {
        return company;
    }
}
