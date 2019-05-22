package cputProject.service.Login;

import cputProject.domain.Login.Email;
import cputProject.service.Service;

import java.util.Set;

public interface EmailService extends Service <Email,String>{
    Set<Email> getAll();
}
