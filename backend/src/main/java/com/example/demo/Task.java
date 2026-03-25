package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** * The simplest task 
 * @author luh
 */
public class Task {
    
    private String taskdescription;
    private String creationDate;

    //Zeitstempel wird erstellt
    public Task() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.creationDate = LocalDateTime.now().format(formatter);
    }

    //Getter und Setter
    public String getTaskdescription() { 
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public String getCreationDate() {
        return creationDate;
    }

    //Überschreiben des Erstellungsdatums ist nicht vorgesehen, aber hier ist der Setter, falls es doch notwendig sein sollte
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}