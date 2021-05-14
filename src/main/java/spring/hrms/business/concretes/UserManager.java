package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.UserService;
import spring.hrms.dataAccess.abstracts.UserDao;
import spring.hrms.entities.concretes.User;

import java.util.List;
@Service
public class UserManager implements UserService {

    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User getById(int id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User getByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
