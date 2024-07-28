package ir.reyhani.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahmadreza Reyhani
 * @since 7/28/2024 - 2:08 PM
 */

@RestController
public class HomeRestController {

    @GetMapping("/")
    public String root() {
        return "Welcome to the root page!";
    }

}
