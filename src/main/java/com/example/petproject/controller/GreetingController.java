package com.example.petproject.controller;

import com.example.petproject.model.PyramidBilliardCues;
import com.example.petproject.repository.PyramidBilliardCuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private PyramidBilliardCuesRepository pyramidBilliardCuesRepository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="user") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<PyramidBilliardCues> pyramidBilliardCuesIterable = pyramidBilliardCuesRepository.findAll();
        model.put("pyramidBilliardCues", pyramidBilliardCuesIterable);
        return "main";
    }

    @PostMapping
    public String addPyramidBilliardCueToDatabase(@RequestParam Integer id, @RequestParam String cue, @RequestParam String tree,
                                                  @RequestParam String saw, @RequestParam String weight, @RequestParam String ferule,
                                                  @RequestParam String sticker, @RequestParam String length, @RequestParam String incrustation,
                                                  @RequestParam String producer, @RequestParam String price, @RequestParam String state,
                                                  Map<String, Object> model){
        PyramidBilliardCues pyramidBilliardCues = new PyramidBilliardCues(id, cue, tree, saw, weight, ferule, sticker, length, incrustation, producer, price, state);
        pyramidBilliardCuesRepository.save(pyramidBilliardCues);
        Iterable<PyramidBilliardCues> pyramidBilliardCuesIterable = pyramidBilliardCuesRepository.findAll();
        model.put("pyramidBilliardCues", pyramidBilliardCuesIterable);
        return "main";
    }
}
