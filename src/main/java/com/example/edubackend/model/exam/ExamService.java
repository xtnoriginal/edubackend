package com.example.edubackend.model.exam;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ExamService {

    @Autowired
    ExamRepository examRepository;

    public boolean addExam(Exam exam){
        examRepository.save(exam);
        return  true;
    }
}
