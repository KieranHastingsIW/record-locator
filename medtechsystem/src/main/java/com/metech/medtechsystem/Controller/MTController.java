package com.metech.medtechsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metech.medtechsystem.modles.SystemModel;
import com.metech.medtechsystem.modles.User;
@Controller
public class MTController {
    @GetMapping("/medtech")
    public String getMedTech1(Model model){
        model.addAttribute("user", new User());
        return "SystemHomePage";
    }


    @PostMapping("/medtech")
    public String postMedTech1(@ModelAttribute User user, Model model){
        
        
        model.addAttribute("user", user);
        user.setPwHash(user.getPwHash().bcrypt());
        return "SystemReturn";
    }
}
