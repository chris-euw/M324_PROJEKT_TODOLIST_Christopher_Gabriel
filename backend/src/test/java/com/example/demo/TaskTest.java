package com.example.demo;

import java.security.PublicKey;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TaskTest {

    @Test
    public void shouldHaveCreationDateWhenTaskIsCreated() {
        Task newTask = new Task();
        
        String creationDate = newTask.getCreationDate();
        
        assertNotNull(creationDate, "The creation date should not be null.");
        assertFalse(creationDate.isEmpty(), "The creation date should not be an empty string.");
        
    }
}