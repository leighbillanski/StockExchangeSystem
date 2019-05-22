package cputProject.service.Implementation.Login;

import cputProject.Repositories.Login.RegisterRepository;
import cputProject.domain.Login.Register;
import cputProject.service.Login.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplreg")
public class RegisterServiceImp implements RegisterService {
    @Autowired
    @Qualifier("InMemoryreg")
    private RegisterRepository repository;
    @Override
    public Set<Register> getAll() {
        return repository.getAll();
    }

    @Override
    public Register create(Register register) {
        return repository.create(register);
    }

    @Override
    public Register read(String register) {
        return repository.read(register);
    }

    @Override
    public Register update(Register register) {
        return repository.update(register);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
