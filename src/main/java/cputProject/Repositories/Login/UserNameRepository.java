package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.UserName;

import java.util.Set;

public interface UserNameRepository extends Repository<UserName, String> {
    Set<UserName> getAll();
}
