package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserNameRepository;
import cputProject.domain.Login.UserName;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserNameRepositoryImp implements UserNameRepository {
    private static UserNameRepositoryImp repo = null;
    private Set<UserName> comp;

    private UserNameRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static UserNameRepositoryImp getRepo(){
        if(repo == null){
            repo = new UserNameRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<UserName> getAll() {
        return this.comp;
    }

    @Override
    public UserName create(UserName company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public UserName update(UserName company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<UserName> it = comp.iterator(); it.hasNext(); ){
            UserName c = it.next();
            if (c.equals(new UserName.Builder().userName(s)) || c.equals(new UserName.Builder().userId(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public UserName read(UserName company) {
        return company;
    }
}
