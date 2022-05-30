package com.example.edubackend.model.blog;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name="blog")
public class Blog {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private  String title;
    private  String article;


}
