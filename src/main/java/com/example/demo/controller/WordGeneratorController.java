package com.example.demo.controller;

import com.example.demo.serive.WordGenreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/words")
public class WordGeneratorController {

    @Autowired
    private WordGenreatorService wordGenreatorService;

    @GetMapping("/generate")
    public List<String> generateWords(@RequestParam char[] chars, @RequestParam int length) {
        return wordGenreatorService.generateWords(chars, length);
    }
}
