package com.arnoldas.uploader.controller;

import com.arnoldas.uploader.model.Worker;
import com.arnoldas.uploader.service.WorkerService;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/getAll")
    public List<Worker> getAllWorkers(){
        return workerService.getAllWorkers();
    }
}
