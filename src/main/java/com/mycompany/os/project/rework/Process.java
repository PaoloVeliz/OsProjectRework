/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.os.project.rework;

import java.util.Random;

/**
 *
 * @author Paolo_Veliz
 */
public class Process extends Thread {

    //-------------------CREACION DE VARIABLES---------------------
    private String process_id;
    private Integer start_time;
    private Integer process_size;
    private Integer missing_time;
    private String process_status;
    private Integer quantum;

    public Process(String process_id) {
        Random random = new Random();
        this.process_size = (int) Math.floor(Math.random() * (2 - 10 + 1) + 10);
        this.process_id = process_id;
        this.missing_time = this.process_size;
        this.process_status = "Listo";
        System.out.println("Proceso creado: " + this.process_id + " - Tiempo: " + this.process_size);
    }

    public String getProcess_id() {
        return process_id;
    }

    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(Integer start_time) {
        this.start_time = start_time;
    }

    public int getProcess_size() {
        return process_size;
    }

    public void setProcess_size(Integer process_size) {
        this.process_size = process_size;
    }

    public int getMissing_time() {
        return missing_time;
    }

    public void setMissing_time(Integer missing_time) {
        this.missing_time = missing_time;
    }

    public String getProcess_status() {
        return process_status;
    }

    public void setProcess_status(String process_status) {
        this.process_status = process_status;
    }

    public Integer getQuantum() {
        return quantum;
    }

    public void setQuantum(Integer quantum) {
        this.quantum = quantum;
    }

    @Override
    public void run() {
        int i = 0;
        for (i = 0; i <= missing_time; i++) {
            // sleep(quantum)
            System.out.println("Process - id => " + process_id + "Running, Time running => " + i);
        }
        this.missing_time = missing_time - i;
    }
    
}
