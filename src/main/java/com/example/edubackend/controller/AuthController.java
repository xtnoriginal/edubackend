package com.example.edubackend.controller;

import com.example.edubackend.payload.AuthResponse;
import com.example.edubackend.request.SignInRequest;
import com.example.edubackend.request.SignUpRequest;
import com.example.edubackend.service.SignUpService;
import com.example.edubackend.util.JwtTokenUtil;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.auth.oauth2.GooglePublicKeysManager;
import com.google.api.client.json.gson.GsonFactory;
import lombok.AllArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000")
@RequestMapping(path="/auth")
@RestController
@AllArgsConstructor
public class AuthController {
    protected final Log logger = LogFactory.getLog(getClass());
    

    private SignUpService signUpService;

    @Autowired
    private AuthenticationManager authenticationManager;

    //JwtTokenUtil jwtTokenUtil;


    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody SignInRequest request) {
        System.out.println(request.getEmail());

        try{
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
            //UserDetails userDetails =(User) authentication.getPrincipal();

            //System.out.println(authentication.getCredentials());
            //System.out.println(authentication.getAuthorities());
            //String token = jwtTokenUtil.generateToken(userDetails);
            if (authentication.isAuthenticated()) {
                logger.info("Logged In");
            }else {
                return new ResponseEntity<>(new AuthResponse("gfsxdfxfjkjjfdgffjj","Claudious Nhemwa","spicectn@gmail.com" ),HttpStatus.UNAUTHORIZED);
            }

        }catch(Exception exception){
            exception.printStackTrace();
            return new ResponseEntity<>(new AuthResponse("gfsxdfxfjkjjfdgffjj","Claudious Nhemwa","spicectn@gmail.com" ),HttpStatus.UNAUTHORIZED);
        }

        return new ResponseEntity<>(new AuthResponse("gfsxdfxfjkjjfdgffjj","Claudious Nhemwa","spicectn@gmail.com" ),HttpStatus.ACCEPTED);
       /* Map<String, Object> responseMap = new HashMap<>();
        try {
            Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail()
                    , request.getPassword()));
            if (auth.isAuthenticated()) {
                logger.info("Logged In");
                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                String token = jwtTokenUtil.generateToken(userDetails);
                responseMap.put("error", false);
                responseMap.put("message", "Logged In");
                responseMap.put("token", token);
                return ResponseEntity.ok(responseMap);
            } else {
                responseMap.put("error", true);
                responseMap.put("message", "Invalid Credentials");
                return ResponseEntity.status(401).body(responseMap);
            }
        } catch (DisabledException e) {
            e.printStackTrace();
            responseMap.put("error", true);
            responseMap.put("message", "User is disabled");
            return ResponseEntity.status(500).body(responseMap);
        } catch (BadCredentialsException e) {
            responseMap.put("error", true);
            responseMap.put("message", "Invalid Credentials");
            return ResponseEntity.status(401).body(responseMap);
        } catch (Exception e) {
            e.printStackTrace();
            responseMap.put("error", true);
            responseMap.put("message", "Something went wrong");
            return ResponseEntity.status(500).body(responseMap);
        }*/
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return signUpService.confirmToken(token);
    }

    @PostMapping("/google")
    public String signInGoogle(@RequestBody String token) throws GeneralSecurityException, IOException {


        /*
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new GooglePublicKeysManager(new ),new GsonFactory())
                .setAudience(Collections.singletonList(token))
                .build();

        GoogleIdToken idToken = verifier.verify(token);

        if(idToken != null){
            GoogleIdToken.Payload payload = idToken.getPayload();

            String userId = payload.getEmail();
            boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
            String name = (String) payload.get("name");
            String pictureUrl = (String) payload.get("picture");
            String locale = (String) payload.get("locale");
            String familyName = (String) payload.get("family_name");
            String givenName = (String)  payload.get("given_name");
        }else{
            System.out.println("Invalid ID token.");
        }
         */

        return "yes";
    }


    @PostMapping("/facebook")
    public String signInFacebook(@RequestBody String token){
        return "yes";
    }


    @PostMapping("/twitter")
    public String signInTwitter(@RequestBody String token){
        return "yes";
    }

    @PostMapping("/signup")
    public String signup(@RequestBody SignUpRequest request){
        return signUpService.register(request);
    }

    @PostMapping("/logout")
    public String logout(){


        return "logout";
    }
}
