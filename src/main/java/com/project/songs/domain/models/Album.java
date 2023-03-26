package com.project.songs.domain.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Date releaseDate;
    private Boolean isFavorite;

    @OneToMany(mappedBy = "album")
    private List<Song> songs;

    @ManyToOne
    private Artist artist;

}
