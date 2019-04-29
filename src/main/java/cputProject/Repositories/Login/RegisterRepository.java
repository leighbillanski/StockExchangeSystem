package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.Register;

import java.util.Set;

public interface RegisterRepository extends Repository<Register, String> {
    Set<Register> getAll();
}
