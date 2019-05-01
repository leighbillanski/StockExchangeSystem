package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.UserValidation;

import java.util.List;
import java.util.Set;

public interface UserValidationRepository extends Repository<UserValidation, String> {
    Set<UserValidation> getAll();
}
