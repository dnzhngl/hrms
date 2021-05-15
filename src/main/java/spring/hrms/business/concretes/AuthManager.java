package spring.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hrms.business.abstracts.AuthService;
import spring.hrms.business.abstracts.UserService;
import spring.hrms.entities.concretes.User;

@Service
public class AuthManager implements AuthService {

    private UserService userService;
    @Autowired
    public AuthManager(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void register(User user) {

    }

    @Override
    public void login(User user) {
        var userToCheck = userService.getByEmail(user.getEmail());
        // user null check

        // Password check

        // return success
    }
}
