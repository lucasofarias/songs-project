package com.project.songs.domain.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Boolean isFavorite;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums;

}
