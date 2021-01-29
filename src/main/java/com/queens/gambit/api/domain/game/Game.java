package com.queens.gambit.api.domain.game;


import com.queens.gambit.api.domain.user.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Game")
@EnableAutoConfiguration
public class Game implements Serializable {

    @Id
    @Column(name = "full_name")
    @NotNull
    private String fullName;

    @Column(name = "launch_year")
    @NotNull
    private Long launchYear;

    @Column(name = "developer")
    @NotNull
    private String developer;

    @ManyToMany(mappedBy = "userOwnedGames")
    private Set<User> ownedBy = new HashSet<>();

    @ManyToMany(mappedBy = "userWantedGames")
    private Set<User> wantedBy = new HashSet<>();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(Long launchYear) {
        this.launchYear = launchYear;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Set<User> getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(Set<User> ownedBy) {
        this.ownedBy = ownedBy;
    }

    public Set<User> getWantedBy() {
        return wantedBy;
    }

    public void setWantedBy(Set<User> wantedBy) {
        this.wantedBy = wantedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return fullName.equals(game.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}