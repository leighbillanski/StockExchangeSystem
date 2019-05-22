package cputProject.service.Implementation.Login;

import cputProject.Repositories.Login.EmailRepository;
import cputProject.domain.Login.Email;
import cputProject.service.Login.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImple")
public class EmailServiceImp implements EmailService {
    @Autowired
    @Qualifier("InMemorye")
    private EmailRepository repository;

    @Override
    public Set<Email> getAll() {
        return repository.getAll();
    }

    @Override
    public Email create(Email email) {
        return repository.create(email);
    }

    @Override
    public Email read(String email) {
        return repository.read(email);
    }

    @Override
    public Email update(Email email) {
        return repository.update(email);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
