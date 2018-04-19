/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.codecraft.springwebconceptstesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Djordje Cvetkovic <djolec987@gmail.com>
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }
    
}
