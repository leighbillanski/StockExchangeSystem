package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.LoginRepository;
import cputProject.domain.Login.Login;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoginRepositoryImp implements LoginRepository {
    private static LoginRepositoryImp repo = null;
    private List<Login> comp;

    private LoginRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static LoginRepositoryImp getRepo(){
        if(repo == null){
            repo = new LoginRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Login> getAll() {
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

    }

    @Override
    public Login read(Login company) {
        return company;
    }
}
