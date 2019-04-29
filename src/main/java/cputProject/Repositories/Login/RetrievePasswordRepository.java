package cputProject.Repositories.Login;

import cputProject.Repositories.Repository;
import cputProject.domain.Login.RetreivePassword;

import java.util.Set;

public interface RetrievePasswordRepository extends Repository<RetreivePassword, String> {
    Set<RetreivePassword> getAll();
}
