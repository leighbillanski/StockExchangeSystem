package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SharesRepository;
import cputProject.domain.Exchange.Shares;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SharesRepositoryImp implements SharesRepository {
    private static SharesRepositoryImp repo = null;
    private List<Shares> comp;

    private SharesRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static SharesRepositoryImp getRepo(){
        if(repo == null){
            repo = new SharesRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Shares> getAll() {
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

    }

    @Override
    public Shares read(Shares company) {
        return company;
    }
}
