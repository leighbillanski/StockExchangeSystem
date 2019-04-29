package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.EmailRepository;
import cputProject.domain.Login.Email;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailRepositoryImp implements EmailRepository {
    private static EmailRepositoryImp repo = null;
    private List<Email> comp;

    private EmailRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static EmailRepositoryImp getRepo(){
        if(repo == null){
            repo = new EmailRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Email> getAll() {
        return this.comp;
    }

    @Override
    public Email create(Email company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Email update(Email company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Email read(Email company) {
        return company;
    }
}
