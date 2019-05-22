package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.UserRepository;
import cputProject.domain.Exchange.User;
import cputProject.service.Exchange.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplu")
public class UserServiceImp implements UserService {
    @Autowired
    @Qualifier("InMemoryu")
    private UserRepository repository;
    @Override
    public Set<User> getAll() {
        return repository.getAll();
    }

    @Override
    public User create(User user) {
        return repository.create(user);
    }

    @Override
    public User read(String user) {
        return repository.read(user);
    }

    @Override
    public User update(User user) {
        return repository.update(user);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
