package com.github.talmars.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "THEMES")
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "theme_id")
    private Long id;

    @OneToMany(mappedBy = "theme")
    private Set<TweetThemeLink> tweetThemeLinks;

    @Column(name = "theme_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<TweetThemeLink> getTweetThemeLinks() {
        return tweetThemeLinks;
    }

    public void setTweetThemeLinks(Set<TweetThemeLink> tweetThemeLinks) {
        this.tweetThemeLinks = tweetThemeLinks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
