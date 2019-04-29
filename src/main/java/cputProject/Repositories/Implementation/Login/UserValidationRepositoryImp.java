package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserValidationRepository;
import cputProject.domain.Login.UserValidation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserValidationRepositoryImp implements UserValidationRepository {
    private static UserValidationRepositoryImp repo = null;
    private List<UserValidation> comp;

    private UserValidationRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static UserValidationRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserValidationRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<UserValidation> getAll() {
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

    }

    @Override
    public UserValidation read(UserValidation company) {
        return company;
    }
}
