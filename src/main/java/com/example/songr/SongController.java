package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    AlbumRespository albumRespository;
    @Autowired
    SongRespositry songRespositry;
    @GetMapping("/showSongs")
    public  String showSong(Model model){
        model.addAttribute("songs",songRespositry.findAll());
        return "song.html";
    }
    @GetMapping("/album/{id}")
    public String getparticularAlbum(@PathVariable Integer id, Model model){

        model.addAttribute("particular",albumRespository.findById(id).get());
        return "particular.html";
    }
    @PostMapping("/addOneSong/{id}")
    public RedirectView addOneSong(@RequestParam(value = "title")String title,
                                   @RequestParam(value = "length")int length,
                                   @RequestParam(value = "trackNumber")int trackNumber,
                                   @RequestParam(value = "albumSongTiltle")String albumSongTiltle,
                                   @PathVariable Integer id){
        System.out.println(title+trackNumber+albumSongTiltle+length);
        Song song=new Song(title,length,trackNumber,albumSongTiltle);
        song.setAlbumsSong(albumRespository.findById(id).get());
        songRespositry.save(song);
        return new RedirectView("/album/{id}");
    }


}
