package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.PasswordRepository;
import cputProject.domain.Login.Password;

import java.util.*;

public class PasswordRepositoryImp implements PasswordRepository {
    private static PasswordRepositoryImp repo = null;
    private Set<Password> comp;

    private PasswordRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static PasswordRepositoryImp getRepo(){
        if(repo == null){
            repo = new PasswordRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Password> getAll() {
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
        for(Iterator<Password> it = comp.iterator(); it.hasNext(); ){
            Password c = it.next();
            if (c.equals(new Password.Builder().password(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Password read(Password company) {
        return company;
    }
}
