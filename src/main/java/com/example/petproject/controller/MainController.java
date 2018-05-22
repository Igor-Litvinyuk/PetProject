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
public class MainController {
    @Autowired
    private PyramidBilliardCuesRepository pyramidBilliardCuesRepository;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        Iterable<PyramidBilliardCues> pyramidBilliardCuesIterable = pyramidBilliardCuesRepository.findAll();
        model.put("pyramidBilliardCues", pyramidBilliardCuesIterable);
        return "main";
    }

    @PostMapping("/main")
    public String addPyramidBilliardCueToDatabase(@RequestParam String cue, @RequestParam String tree,
                                                  @RequestParam String saw, @RequestParam String weight, @RequestParam String ferule,
                                                  @RequestParam String sticker, @RequestParam String length, @RequestParam String incrustation,
                                                  @RequestParam String producer, @RequestParam String price, @RequestParam String state,
                                                  Map<String, Object> model){
        PyramidBilliardCues pyramidBilliardCues = new PyramidBilliardCues(cue, tree, saw, weight, ferule, sticker, length, incrustation, producer, price, state);
        pyramidBilliardCuesRepository.save(pyramidBilliardCues);
        Iterable<PyramidBilliardCues> pyramidBilliardCuesIterable = pyramidBilliardCuesRepository.findAll();
        model.put("pyramidBilliardCues", pyramidBilliardCuesIterable);
        return "main";
    }

    @PostMapping("producerFilter")
    public String producerFilter(@RequestParam String producerFilter, Map<String, Object> model){
        Iterable<PyramidBilliardCues> pyramidBilliardCuesIterable;
        if (producerFilter != null && !producerFilter.isEmpty()){
            pyramidBilliardCuesIterable = pyramidBilliardCuesRepository.findByProducer(producerFilter);
        }
        else {
            pyramidBilliardCuesIterable = pyramidBilliardCuesRepository.findAll();
        }
        model.put("pyramidBilliardCues", pyramidBilliardCuesIterable);
        return "main";
    }
}