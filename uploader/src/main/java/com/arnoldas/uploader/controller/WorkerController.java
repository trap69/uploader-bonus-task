package com.arnoldas.uploader.controller;

import com.arnoldas.uploader.model.Worker;
import com.arnoldas.uploader.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @PostMapping("/add")
    public String add(@RequestBody Worker worker){
        workerService.saveWorker(worker);
        return "New worker  is added";
    }
}
