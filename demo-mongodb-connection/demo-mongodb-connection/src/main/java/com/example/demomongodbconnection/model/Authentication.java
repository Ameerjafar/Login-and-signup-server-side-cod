package com.example.demomongodbconnection.model;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Authentication")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {

    @Id
    private int id;

    private String FirstName;

    private String LastName;

    private String Email;

    @Size(min = 8,message = "your password at least eight characters")
    public String Password;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
}
