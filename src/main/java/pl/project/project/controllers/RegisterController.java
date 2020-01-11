package pl.project.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.services.UserService;

import javax.validation.Valid;

@Controller
public class RegisterController {

    private UserService userService;

    private UserDTO userDTO2;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        UserDTO userDTO = new UserDTO();
        model.addAttribute("user", userDTO);
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            userDTO2 = userDTO;
            return "redirect:/register2";
        }
        userService.addUser(userDTO);
        return "redirect:/login";
    }

    @GetMapping("/register2")
    public String dasdas(Model model) {
        model.addAttribute("user", userDTO2);
        return "register";
    }

}
