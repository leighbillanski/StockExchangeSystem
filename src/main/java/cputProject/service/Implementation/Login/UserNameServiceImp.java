package cputProject.service.Implementation.Login;

import cputProject.Repositories.Login.UserNameRepository;
import cputProject.domain.Login.UserName;
import cputProject.service.Login.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplun")
public class UserNameServiceImp implements UserNameService {
    @Autowired
    @Qualifier("InMemoryun")
    private UserNameRepository repository;
    @Override
    public Set<UserName> getAll() {
        return repository.getAll();
    }

    @Override
    public UserName create(UserName userName) {
        return repository.create(userName);
    }

    @Override
    public UserName read(String userName) {
        return repository.read(userName);
    }

    @Override
    public UserName update(UserName userName) {
        return repository.update(userName);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
