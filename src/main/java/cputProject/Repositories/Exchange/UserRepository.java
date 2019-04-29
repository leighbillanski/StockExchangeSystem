package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.User;

import java.util.Set;

public interface UserRepository extends Repository<User, String> {
    Set<User> getAll();
}
