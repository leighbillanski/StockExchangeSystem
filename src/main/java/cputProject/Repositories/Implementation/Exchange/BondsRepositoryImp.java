package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.domain.Exchange.Bonds;

import java.util.*;

public class BondsRepositoryImp implements BondsRepository {
    private static BondsRepositoryImp repo = null;
    private Set<Bonds> comp;

    private BondsRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static BondsRepositoryImp getRepo(){
        if(repo == null){
            repo = new BondsRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Bonds> getAll() {
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
        for(Iterator<Bonds> it = comp.iterator(); it.hasNext(); ){
            Bonds c = it.next();
            if (c.equals(new Bonds.Builder().bond(s))){
                this.comp.remove(c);
            }
        }

    }

    @Override
    public Bonds read(Bonds company) {
        return company;
    }
}
