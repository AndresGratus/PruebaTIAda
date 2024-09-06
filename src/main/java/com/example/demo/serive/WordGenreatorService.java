package com.example.demo.serive;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordGenreatorService {

    public List<String> generateWords(char[] chars, int length){
        List<String> result = new ArrayList<>();
        generateWords(chars, length, "", result);
        return result;
    }

    private void generateWords(char[] chars, int length, String prefix, List<String> result) {
        if (length == 0) {
            result.add(prefix);
            return;
        }

        for (char c : chars) {
            generateWords(chars, length - 1, prefix + c, result);
        }
    }
}
