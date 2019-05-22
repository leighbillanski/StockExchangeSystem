package cputProject.service.Exchange;

import cputProject.domain.Exchange.User;
import cputProject.service.Service;
import org.springframework.context.annotation.Bean;

import java.util.Set;

public interface UserService extends Service<User,String> {
    Set<User> getAll();
}
