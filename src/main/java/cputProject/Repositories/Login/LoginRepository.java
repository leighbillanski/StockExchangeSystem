package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.Login;

import java.util.List;
import java.util.Set;

public interface LoginRepository extends Repository<Login, String> {
    List<Login> getAll();
}
