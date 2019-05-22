package cputProject.service.Implementation.Login;

import cputProject.Repositories.Login.LoginRepository;
import cputProject.domain.Login.Login;
import cputProject.service.Login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImpll")
public class LoginServiceImp implements LoginService {
    @Autowired
    @Qualifier("InMemoryl")
    private LoginRepository repository;
    @Override
    public Set<Login> getAll() {
        return repository.getAll();
    }

    @Override
    public Login create(Login login) {
        return repository.create(login);
    }

    @Override
    public Login read(String login) {
        return repository.read(login);
    }

    @Override
    public Login update(Login login) {
        return repository.update(login);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
