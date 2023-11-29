package com.party.mvcproject;

@Controller
publiic class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}