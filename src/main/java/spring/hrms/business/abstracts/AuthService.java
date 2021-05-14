package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.User;

public interface AuthService {
    void register(User user);
    void login(User user);
}
