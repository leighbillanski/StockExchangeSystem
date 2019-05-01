package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RegisterRepository;
import cputProject.domain.Login.Register;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RegisterRepositoryImp implements RegisterRepository {
    private static RegisterRepositoryImp repo = null;
    private Set<Register> comp;

    private RegisterRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static RegisterRepositoryImp getRepo(){
        if(repo == null){
            repo = new RegisterRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Register> getAll() {
        return this.comp;
    }

    @Override
    public Register create(Register company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Register update(Register company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Register> it = comp.iterator(); it.hasNext(); ){
            Register c = it.next();
            if (c.equals(new Register.Builder().email(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Register read(Register company) {
        return company;
    }
}
