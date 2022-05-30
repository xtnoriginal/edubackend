package com.example.edubackend.controller;

import com.example.edubackend.model.user.User;
import com.example.edubackend.model.user.UserService;
import com.example.edubackend.payload.PagedResponse;
import com.example.edubackend.payload.SubjectHome;
import com.example.edubackend.payload.UserProfile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/app")
@RestController
public class ApplicationController {

    private UserService userService;



   @GetMapping("/profile/{username}")
    public ResponseEntity<UserProfile> profile(@PathVariable(value = "username") String username){

        UserProfile userProfile  = new UserProfile((long) 1,"Claudious", "Nhemwa","spicectn@gmail.com" ,"0777345454","Harare","Zimbabwe");
        return  new ResponseEntity<UserProfile>(userProfile, HttpStatus.ACCEPTED);

   }

    @GetMapping("/home/{username}")
    public ResponseEntity<PagedResponse> home(@PathVariable(value = "username") String username){

       String[] subjects = new String[]{"Biology","Physics", "Mathematics", "PE", "Shona", "VPA", "Computer_Science","English"};
        PagedResponse<SubjectHome> pagedResponse = new PagedResponse<>();
        List<SubjectHome> list = new ArrayList<>();
        for (String i:subjects) {
            list.add(new SubjectHome(i,"IGCSE","ic:baseline-science"));
        }
        pagedResponse.setContent(list);

        return  new ResponseEntity<PagedResponse>(pagedResponse ,HttpStatus.OK);

    }


}
