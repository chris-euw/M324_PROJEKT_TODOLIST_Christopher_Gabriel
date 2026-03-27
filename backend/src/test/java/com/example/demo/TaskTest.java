package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TaskTest {

    //* Testet, ob eine neu erstellte Task automatisch ein Erstellungsdatum erhält
    @Test
    public void shouldHaveCreationDateWhenTaskIsCreated() {
        Task newTask = new Task();
        
        String creationDate = newTask.getCreationDate();
        
        //Prüft, ob das Erstellungsdatum nicht null und nicht leer ist
        assertNotNull(creationDate, "The creation date should not be null.");
        assertFalse(creationDate.isEmpty(), "The creation date should not be an empty string.");
        
    }
    @Test
    public void newTaskShouldNotBeCompletedByDefault() { Task newTask = new Task();
        assertFalse(newTask.isCompleted(), "A new task should not be completed by default.");
    }
}