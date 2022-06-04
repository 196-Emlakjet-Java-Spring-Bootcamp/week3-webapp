package com.example.springboot.controller;

import com.example.springboot.dto.ReportDTO;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private RabbitTemplate rabbitTemplate;
    private Queue queue;


    @Autowired
    public ReportController(RabbitTemplate rabbitTemplate, Queue queue){
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }



    @PostMapping("/report")
    public String getReport(@RequestBody ReportDTO report){
        rabbitTemplate.convertAndSend(this.queue.getName(), report);
        return "Talebiniz alindi.";
    }


}
