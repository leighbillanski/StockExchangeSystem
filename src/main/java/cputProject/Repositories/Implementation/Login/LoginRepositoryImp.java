package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.LoginRepository;
import cputProject.domain.Login.Login;

import java.util.*;

public class LoginRepositoryImp implements LoginRepository {
    private static LoginRepositoryImp repo = null;
    private Set<Login> comp;

    private LoginRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static LoginRepositoryImp getRepo(){
        if(repo == null){
            repo = new LoginRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Login> getAll() {
        return this.comp;
    }

    @Override
    public Login create(Login company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Login update(Login company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Login> it = comp.iterator(); it.hasNext(); ){
            Login c = it.next();
            if (c.equals(new Login.Builder().login(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Login read(Login company) {
        return company;
    }
}
