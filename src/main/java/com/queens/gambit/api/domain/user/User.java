package com.queens.gambit.api.domain.user;

import com.queens.gambit.api.domain.game.Game;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "User")
@EnableAutoConfiguration
public class User implements Serializable {

    public User() {}

    public User(String login,
                String fullName,
                Long age,
                String cityName,
                String cellphone,
                String homephone,
                String insta,
                String face,
                String twitter,
                DaysOfWeek availableIn,
                String password,
                Date createdAt)
    {
            this.login = login;
            this.fullName = fullName;
            this.age = age;
            this.cityName = cityName;
            this.cellphone = cellphone;
            this.homephone = homephone;
            this.insta = insta;
            this.face = face;
            this.twitter = twitter;
            this.availableIn = availableIn;
            this.password = password;
            this.createdAt = createdAt;
    }

    @Id
    @NotNull
    private String login;

    @Column(name="full_name")
    @NotNull
    private String fullName;

    @Column(name="age")
    @NotNull
    private Long age;

    @Column(name="city_name")
    @NotNull
    private String cityName;

    @Column(name="cell_phone")
    @NotNull
    private String cellphone;

    @Column(name="home_phone")
    private String homephone;

    @Column(name="insta")
    private String insta;

    @Column(name="face")
    private String face;

    @Column(name="twitter")
    private String twitter;

    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name="available_in")
    @Enumerated(EnumType.STRING)
    @NotNull
    private DaysOfWeek availableIn;

    @Column(name="password")
    @NotNull
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "user_owned_games",
            joinColumns = {@JoinColumn(name = "login")},
            inverseJoinColumns = {@JoinColumn(name = "game_full_name")}
    )
    private Set<Game> userOwnedGames = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "user_wanted_games",
            joinColumns = {@JoinColumn(name = "login")},
            inverseJoinColumns = {@JoinColumn(name = "game_full_name")}
    )
    private Set<Game> userWantedGames = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "user_friendships",
            joinColumns = {@JoinColumn(name = "login_user_1")},
            inverseJoinColumns = {@JoinColumn(name = "login_user_2")}
    )
    private Set<User> friends = new HashSet<>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getInsta() {
        return insta;
    }

    public void setInsta(String insta) {
        this.insta = insta;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public DaysOfWeek getAvailableIn() {
        return availableIn;
    }

    public void setAvailableIn(DaysOfWeek availableIn) {
        this.availableIn = availableIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Game> getUserOwnedGames() {
        return userOwnedGames;
    }

    public void setUserOwnedGames(Set<Game> userOwnedGames) {
        this.userOwnedGames = userOwnedGames;
    }

    public Set<Game> getUserWantedGames() {
        return userWantedGames;
    }

    public void setUserWantedGames(Set<Game> userWantedGames) {
        this.userWantedGames = userWantedGames;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
