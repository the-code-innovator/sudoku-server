package com.thecodeinnovator.sudokuserver.controller;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import com.thecodeinnovator.sudokuserver.model.request.SavePuzzleRequestModel;
import com.thecodeinnovator.sudokuserver.service.PuzzleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            result.put("status", "success");
            puzzleService.savePuzzleToDatabase(model);
        } catch (DataIntegrityViolationException e) {
            result.put("status", "failed");
            try {
                String slugID = puzzleService.getSlugID(model);
                result.put("data", "slug_id = " + slugID + " already exists.");
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                result.put("data", noSuchAlgorithmException.getMessage());
            }
        } catch (Exception e) {
            result.put("status", "failed");
            e.printStackTrace();
        }
        return result;
    }

    @GetMapping(value = "{slug_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> getPuzzleBySlugID(@PathVariable(value = "slug_id") String slugID) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            result.put("status", "success");
            result.put("data", puzzleService.getPuzzleBySlugID(slugID));
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "failed");
        }
        return result;
    }
}