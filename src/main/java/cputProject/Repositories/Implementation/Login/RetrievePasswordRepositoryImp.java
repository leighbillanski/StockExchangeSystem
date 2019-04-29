package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RetrievePasswordRepository;
import cputProject.domain.Login.RetreivePassword;

import java.util.HashSet;
import java.util.Set;

public class RetrievePasswordRepositoryImp implements RetrievePasswordRepository {
    private static RetrievePasswordRepositoryImp repo = null;
    private Set<RetreivePassword> comp;

    private RetrievePasswordRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static RetrievePasswordRepositoryImp getRepo(){
        if(repo == null){
            repo = new RetrievePasswordRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<RetreivePassword> getAll() {
        return this.comp;
    }

    @Override
    public RetreivePassword create(RetreivePassword company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public RetreivePassword update(RetreivePassword company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public RetreivePassword read(RetreivePassword company) {
        return company;
    }
}
