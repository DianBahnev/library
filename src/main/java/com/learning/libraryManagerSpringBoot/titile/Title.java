package com.learning.libraryManagerSpringBoot.titile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Title {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String author;

    public Title(final  String titleName, final String titleAuthor) {this(null, titleName, titleAuthor);}
}
