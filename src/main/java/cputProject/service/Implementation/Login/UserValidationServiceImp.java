package cputProject.service.Implementation.Login;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.Repositories.Login.UserValidationRepository;
import cputProject.domain.Login.UserValidation;
import cputProject.service.Login.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImpluv")
public class UserValidationServiceImp implements UserValidationService {
    @Autowired
    @Qualifier("InMemoryuv")
    private UserValidationRepository repository;
    @Override
    public Set<UserValidation> getAll() {
        return repository.getAll();
    }

    @Override
    public UserValidation create(UserValidation userValidation) {
        return repository.create(userValidation);
    }

    @Override
    public UserValidation read(String userValidation) {
        return repository.read(userValidation);
    }

    @Override
    public UserValidation update(UserValidation userValidation) {
        return repository.update(userValidation);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
