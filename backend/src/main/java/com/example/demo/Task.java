package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** * The simplest task 
 * @author luh
 */
public class Task {
    
    private String taskdescription;
    private String creationDate;

    public Task() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.creationDate = LocalDateTime.now().format(formatter);
    }

    public String getTaskdescription() { 
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}