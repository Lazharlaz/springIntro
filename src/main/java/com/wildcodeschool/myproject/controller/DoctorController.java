package com.wildcodeschool.myproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {
    @ResponseBody
    @GetMapping("/doctor/1")
    public String doctorA() {
        return "William Hartnel";
    }
    @ResponseBody
    @GetMapping("/doctor/10")
    public String doctorB() {
        return "David Tennant";
    }
    @ResponseBody
    @GetMapping("/doctor/13")
    public String doctorC() {
        return "Jodie Whittaker";
    }

}
