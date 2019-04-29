package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.UserRepository;
import cputProject.domain.Exchange.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImp implements UserRepository {
    private static UserRepositoryImp repo = null;
    private Set<User> comp;

    private UserRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static UserRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<User> getAll() {
        return this.comp;
    }

    @Override
    public User create(User company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public User update(User company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public User read(User company) {
        return company;
    }
}
