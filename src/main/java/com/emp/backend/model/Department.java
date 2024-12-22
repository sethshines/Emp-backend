package com.emp.backend.model;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Department")
public class Department {
    @Id
    String id;
    String name;
    String description;

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
