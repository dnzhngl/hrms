package spring.hrms.business.abstracts;

import spring.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {

    User getById(int id);
    User getByEmail(String email);
}
