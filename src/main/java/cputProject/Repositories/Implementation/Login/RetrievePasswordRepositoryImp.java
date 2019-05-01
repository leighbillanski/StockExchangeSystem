package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RetrievePasswordRepository;
import cputProject.domain.Login.RetreivePassword;

import java.util.HashSet;
import java.util.Iterator;
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
        for(Iterator<RetreivePassword> it = comp.iterator(); it.hasNext(); ){
            RetreivePassword c = it.next();
            if (c.equals(new RetreivePassword.Builder().newPassword(s)) || c.equals(new RetreivePassword.Builder().oldPassword(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public RetreivePassword read(RetreivePassword company) {
        return company;
    }
}
