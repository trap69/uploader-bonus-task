package com.arnoldas.uploader.service;

import com.arnoldas.uploader.model.Worker;

import java.util.List;

public interface WorkerService {
    public Worker saveWorker (Worker worker);
    public List<Worker> getAllWorkers();
}
