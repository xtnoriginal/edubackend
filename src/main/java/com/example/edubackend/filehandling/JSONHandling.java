package com.example.edubackend.filehandling;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

@Service
public class JSONHandling {

    public String readJSONfile()  {
        String output ="";
        try {
            File file = getPaperResource();
            output = new String(Files.readAllBytes(file.toPath()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return  output;


    }


    public File getPaperResource()
            throws FileNotFoundException {
        return ResourceUtils.getFile(
                "classpath:static/prac.json");
    }
}
