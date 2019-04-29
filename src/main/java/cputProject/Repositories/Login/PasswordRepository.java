package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.Password;

import java.util.List;
import java.util.Set;

public interface PasswordRepository extends Repository<Password, String> {
    List<Password> getAll();
}
