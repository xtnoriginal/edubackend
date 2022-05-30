package com.example.edubackend.model.blog;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name="comment")
public class Comment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String comment;


}
