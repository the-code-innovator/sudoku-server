package com.thecodeinnovator.sudokuserver.controller;

import java.util.HashMap;

import com.thecodeinnovator.sudokuserver.model.request.SavePuzzleRequestModel;
import com.thecodeinnovator.sudokuserver.service.PuzzleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/sudoku")
public class HomeController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    public PuzzleService puzzleService;

    @GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> getStatus() {
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("status", "success");
        result.put("data", this.applicationName + " is up.");
        return result;
    }

    // @GetMapping(value = "/get_slug")
    // public HashMap<String, Object> getPuzzleWithSlug(@RequestParam("slug_id") String slugID) {
    //     HashMap<String, Object> result = new HashMap<String, Object>();
    //     try {
    //         result.put("data", slugService.fetchPuzzleWithSlugID(slugID));
    //         result.put("status", "success");
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         result.put("status", "failed");
    //     }
    //     return result;
    // }

    @GetMapping(value = "/get_by_id", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> getPuzzleByID(@RequestParam("id") String id) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            result.put("status", "success");
            result.put("data", puzzleService.fetchPuzzleWithID(id));
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "failed");
        }
        return result;
    }

    @GetMapping(value = "/get_by_difficulty", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> getPuzzleByDifficulty(@RequestParam("difficulty") int difficulty) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            result.put("status", "success");
            result.put("data", puzzleService.fetchByDifficulty(difficulty));
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "failed");
        }
        return result;
    }

    @PostMapping(value = "save_puzzle", consumes = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> savePuzzleToDatabase(@RequestBody SavePuzzleRequestModel model) {
        return null;
        
    }
}
