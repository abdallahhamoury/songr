package com.example.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
@Autowired
AlbumRespository albumRespository;
    @GetMapping("/hello")
    @ResponseBody
    public String helloH() {
        return ("hello world");
    }
    @GetMapping("/")
    public String homePage() {
        return ("home.html");
    }

    @GetMapping("/capitalize/{word}")
    public String renderCapitalizePage(Model model, @PathVariable String word) {
        model.addAttribute("name", word.toUpperCase());
        return "hello.html";
    }

    @GetMapping("/showAllalbums")
    public String showAllalbums(Model model){
        model.addAttribute("albums",albumRespository.findAll());
        return "albums.html";
    }
    @PostMapping("/addAllalbums")

    public RedirectView addAllalbums(@RequestParam(value = "title")String title, @RequestParam(value = "artist")String artist, @RequestParam(value = "songCount")int songCount, @RequestParam(value = "length")int length, @RequestParam(value = "imageUrl")String imageUrl){
        Albums album=new Albums(title,artist,songCount,length,imageUrl);
        albumRespository.save(album);
        return new RedirectView("/showAllalbums");
    }
}





