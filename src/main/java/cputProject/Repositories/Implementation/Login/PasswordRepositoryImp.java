package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.PasswordRepository;
import cputProject.domain.Login.Password;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PasswordRepositoryImp implements PasswordRepository {
    private static PasswordRepositoryImp repo = null;
    private List<Password> comp;

    private PasswordRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static PasswordRepositoryImp getRepo(){
        if(repo == null){
            repo = new PasswordRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Password> getAll() {
        return this.comp;
    }

    @Override
    public Password create(Password company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Password update(Password company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Password read(Password company) {
        return company;
    }
}
