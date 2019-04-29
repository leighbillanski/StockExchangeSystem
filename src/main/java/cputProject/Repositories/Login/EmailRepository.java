package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.Email;

import java.util.List;
import java.util.Set;

public interface EmailRepository extends Repository<Email, String> {
    List<Email> getAll();
}
