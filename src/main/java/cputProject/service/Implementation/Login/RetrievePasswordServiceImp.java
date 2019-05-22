package cputProject.service.Implementation.Login;

import cputProject.Repositories.Login.RetrievePasswordRepository;
import cputProject.domain.Login.RetreivePassword;
import cputProject.service.Login.RetrievePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplrp")
public class RetrievePasswordServiceImp implements RetrievePasswordService {
    @Autowired
    @Qualifier("InMemoryrp")
    private RetrievePasswordRepository repository;
    @Override
    public Set<RetreivePassword> getAll() {
        return repository.getAll();
    }

    @Override
    public RetreivePassword create(RetreivePassword retreivePassword) {
        return repository.create(retreivePassword);
    }

    @Override
    public RetreivePassword read(String retreivePassword) {
        return repository.read(retreivePassword);
    }

    @Override
    public RetreivePassword update(RetreivePassword retreivePassword) {
        return repository.update(retreivePassword);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
