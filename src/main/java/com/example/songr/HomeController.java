package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String helloH() {
//        return ("hello world");
//    }


//    @GetMapping("/capitalize/{word}")
//    @ResponseBody
//    public String capitalize(@PathVariable("word") String word) {
//
//        return word.toUpperCase();
//    }

//    @GetMapping("/")
//    public String homePage() {
//        return ("home.html");
//    }

//    @GetMapping("/capitalize/{word}")
//    public String renderCapitalizePage(Model model, @PathVariable String word) {
//        model.addAttribute("name", word.toUpperCase());
//        return "hello.html";
//    }

//    @GetMapping("/albums")
//    public String albumH(Model model){
//        Albums albums = new Albums("baddi hada hebbu","Nancy Ajram",5,250,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
//        Albums albums1=new Albums("anta lamen","Elisa",4,680,"https://upload.wikimedia.org/wikipedia/commons/d/d6/Elissa_-_August_24%2C_2012_%282%29.jpg");
//        Albums albums2=new Albums("anta habib","haifa",4,500,"https://upload.wikimedia.org/wikipedia/commons/8/85/Haifa_Wehbe_2016_.jpg");
//        List<Albums> albums3=new ArrayList<Albums>();
//        albums3.add(albums);
//        albums3.add(albums1);
//        albums3.add(albums2);
//        model.addAttribute("albums3",albums3);
//        return "albums.html";
//    }

}