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
public class Process extends Thread{
    //-------------------CREACION DE VARIABLES---------------------
    private int process_id;
    private int process_priority;
    private String process_name;
    private String start_time;
    private int process_size;
    private int missing_time;
    private String process_status;
    private int instructions;
    
    public Process(String start_time, int process_id, int process_size){
        this.start_time = start_time;
        this.process_id = process_id;
         this.process_size = process_size;
         
    }
    
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
    public void setProcess_id(int process_id) {
        this.process_id = process_id;
    }
    public void setProcess_size(int process_size) {
        this.process_size = process_size;
        this.missing_time = process_size;
    }
    public void setProcess_status(String process_status) {
        this.process_status = process_status;
    }

    public String getProcess_status() {
        return process_status;
    }
    public int getProcess_id() {
        return process_id;
    }
    public String getStart_time() {
        return start_time;
    }
    public int getProcess_size() {
        return process_size;
    }
    
    public int getProcess_instructions(){
        return instructions;
    }
    
    @Override
    public void run(){
        int i = 0;
        for (i = 0; i <= missing_time; i++){
            System.out.println("Process => " + process_name + " id => " + process_id + "Running, Time running => " + i);
        }
        this.missing_time = missing_time - i;
    }
    
    public void NewProcess(Process p){
        Random random = new Random();
        p.process_size = (int) Math.floor(Math.random()*(2-10+1)+10);
        p.instructions = p.process_size;

    }
    


    
}
