/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;
import com.jdbc.tutorial.entity.Worker;

/**
 *
 * @author asiro
 */
public interface WorkerDAO {
    
    public void addWorker(Worker w);
    public void updateWorker(Worker w);
    public Worker getWorkerById(int id);
    public void removeWorker(int id);
    public List<Worker> listWorker();
    
}
