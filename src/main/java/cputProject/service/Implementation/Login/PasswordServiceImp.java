package cputProject.service.Implementation.Login;

import cputProject.Repositories.Login.PasswordRepository;
import cputProject.domain.Login.Password;
import cputProject.service.Login.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplpa")
public class PasswordServiceImp implements PasswordService {
    @Autowired
    @Qualifier("InMemorypa")
    private PasswordRepository repository;
    @Override
    public Set<Password> getAll() {
        return repository.getAll();
    }

    @Override
    public Password create(Password password) {
        return repository.create(password);
    }

    @Override
    public Password read(String password) {
        return repository.read(password);
    }

    @Override
    public Password update(Password password) {
        return repository.update(password);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
