package com.example.edubackend.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectPayLoad {
    private String title;
    private String subject;
    private int score;
    private boolean status;
}
