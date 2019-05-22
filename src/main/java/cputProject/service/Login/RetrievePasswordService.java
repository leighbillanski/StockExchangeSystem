package cputProject.service.Login;

import cputProject.domain.Login.RetreivePassword;
import cputProject.service.Service;

import java.util.Set;

public interface RetrievePasswordService extends Service <RetreivePassword,String>{
    Set<RetreivePassword> getAll();
}
