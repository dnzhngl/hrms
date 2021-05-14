package spring.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.hrms.business.abstracts.UserService;
import spring.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getbyemail")
    public User getByEmail(@RequestParam String email){
        return userService.getByEmail(email);
    }

    @GetMapping("/getbyid")
    public User getById(@RequestParam int id){
        return userService.getById(id);
    }
}
