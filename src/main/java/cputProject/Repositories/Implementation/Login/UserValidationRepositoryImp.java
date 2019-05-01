package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserValidationRepository;
import cputProject.domain.Login.UserValidation;

import java.util.*;

public class UserValidationRepositoryImp implements UserValidationRepository {
    private static UserValidationRepositoryImp repo = null;
    private Set<UserValidation> comp;

    private UserValidationRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static UserValidationRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserValidationRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<UserValidation> getAll() {
        return this.comp;
    }

    @Override
    public UserValidation create(UserValidation company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public UserValidation update(UserValidation company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<UserValidation> it = comp.iterator(); it.hasNext(); ){
            UserValidation c = it.next();
            if (c.equals(new UserValidation.Builder().message(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public UserValidation read(UserValidation company) {
        return company;
    }
}
