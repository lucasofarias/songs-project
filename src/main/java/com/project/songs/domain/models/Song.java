package com.project.songs.domain.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Boolean isFavorite;

    @ManyToOne
    private Album album;

}
