package pl.project.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.services.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class RegisterController {

    private UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        userService.addUser(userDTO);
        return "redirect:/login";
    }

}
