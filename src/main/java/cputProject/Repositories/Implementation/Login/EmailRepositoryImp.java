package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.EmailRepository;
import cputProject.domain.Login.Email;

import java.util.*;

public class EmailRepositoryImp implements EmailRepository {
    private static EmailRepositoryImp repo = null;
    private Set<Email> comp;

    private EmailRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static EmailRepositoryImp getRepo(){
        if(repo == null){
            repo = new EmailRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Email> getAll() {
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
        for(Iterator<Email> it = comp.iterator(); it.hasNext(); ){
            Email c = it.next();
            if (c.equals(new Email.Builder().emailAddres(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Email read(Email company) {
        return company;
    }
}
