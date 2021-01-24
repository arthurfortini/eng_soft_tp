package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ReducedGameResponse;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-23T22:20:16.004-02:00")

public class UserResponse   {
  @JsonProperty("login")
  private String login = null;

  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("city_name")
  private String cityName = null;

  @JsonProperty("age")
  private Long age = null;

  @JsonProperty("user_wanted_games")
  private List<ReducedGameResponse> userWantedGames = null;

  @JsonProperty("user_owned_games")
  private List<ReducedGameResponse> userOwnedGames = null;

  public UserResponse login(String login) {
    this.login = login;
    return this;
  }

   /**
   * User login
   * @return login
  **/
  @ApiModelProperty(value = "User login")

 @Size(min=1)
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the User
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name of the User")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserResponse cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * Ip Address of the Machine
   * @return cityName
  **/
  @ApiModelProperty(value = "Ip Address of the Machine")


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public UserResponse age(Long age) {
    this.age = age;
    return this;
  }

   /**
   * User age
   * @return age
  **/
  @ApiModelProperty(value = "User age")


  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public UserResponse userWantedGames(List<ReducedGameResponse> userWantedGames) {
    this.userWantedGames = userWantedGames;
    return this;
  }

  public UserResponse addUserWantedGamesItem(ReducedGameResponse userWantedGamesItem) {
    if (this.userWantedGames == null) {
      this.userWantedGames = new ArrayList<ReducedGameResponse>();
    }
    this.userWantedGames.add(userWantedGamesItem);
    return this;
  }

   /**
   * List of wanted games
   * @return userWantedGames
  **/
  @ApiModelProperty(value = "List of wanted games")

  @Valid

  public List<ReducedGameResponse> getUserWantedGames() {
    return userWantedGames;
  }

  public void setUserWantedGames(List<ReducedGameResponse> userWantedGames) {
    this.userWantedGames = userWantedGames;
  }

  public UserResponse userOwnedGames(List<ReducedGameResponse> userOwnedGames) {
    this.userOwnedGames = userOwnedGames;
    return this;
  }

  public UserResponse addUserOwnedGamesItem(ReducedGameResponse userOwnedGamesItem) {
    if (this.userOwnedGames == null) {
      this.userOwnedGames = new ArrayList<ReducedGameResponse>();
    }
    this.userOwnedGames.add(userOwnedGamesItem);
    return this;
  }

   /**
   * List of owned games
   * @return userOwnedGames
  **/
  @ApiModelProperty(value = "List of owned games")

  @Valid

  public List<ReducedGameResponse> getUserOwnedGames() {
    return userOwnedGames;
  }

  public void setUserOwnedGames(List<ReducedGameResponse> userOwnedGames) {
    this.userOwnedGames = userOwnedGames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.login, userResponse.login) &&
        Objects.equals(this.fullName, userResponse.fullName) &&
        Objects.equals(this.cityName, userResponse.cityName) &&
        Objects.equals(this.age, userResponse.age) &&
        Objects.equals(this.userWantedGames, userResponse.userWantedGames) &&
        Objects.equals(this.userOwnedGames, userResponse.userOwnedGames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, fullName, cityName, age, userWantedGames, userOwnedGames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    userWantedGames: ").append(toIndentedString(userWantedGames)).append("\n");
    sb.append("    userOwnedGames: ").append(toIndentedString(userOwnedGames)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

