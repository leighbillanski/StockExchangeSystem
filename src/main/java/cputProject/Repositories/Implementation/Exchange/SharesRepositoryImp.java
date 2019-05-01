package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SharesRepository;
import cputProject.domain.Exchange.Shares;

import java.util.*;

public class SharesRepositoryImp implements SharesRepository {
    private static SharesRepositoryImp repo = null;
    private Set<Shares> comp;

    private SharesRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static SharesRepositoryImp getRepo(){
        if(repo == null){
            repo = new SharesRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Shares> getAll() {
        return this.comp;
    }

    @Override
    public Shares create(Shares company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Shares update(Shares company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Shares> it = comp.iterator(); it.hasNext(); ){
            Shares c = it.next();
            if (c.equals(new Shares.Builder().order(Double.parseDouble(s)))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Shares read(Shares company) {
        return company;
    }
}
