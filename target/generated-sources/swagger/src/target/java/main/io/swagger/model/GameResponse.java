package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserReducedResponse;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-23T22:20:16.004-02:00")

public class GameResponse   {
  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("launch_year")
  private Long launchYear = null;

  @JsonProperty("developer")
  private String developer = null;

  @JsonProperty("players")
  private List<UserReducedResponse> players = null;

  @JsonProperty("owners")
  private List<UserReducedResponse> owners = null;

  public GameResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the game
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name of the game")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public GameResponse launchYear(Long launchYear) {
    this.launchYear = launchYear;
    return this;
  }

   /**
   * Launch year
   * @return launchYear
  **/
  @ApiModelProperty(value = "Launch year")


  public Long getLaunchYear() {
    return launchYear;
  }

  public void setLaunchYear(Long launchYear) {
    this.launchYear = launchYear;
  }

  public GameResponse developer(String developer) {
    this.developer = developer;
    return this;
  }

   /**
   * Developer of the game
   * @return developer
  **/
  @ApiModelProperty(value = "Developer of the game")


  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public GameResponse players(List<UserReducedResponse> players) {
    this.players = players;
    return this;
  }

  public GameResponse addPlayersItem(UserReducedResponse playersItem) {
    if (this.players == null) {
      this.players = new ArrayList<UserReducedResponse>();
    }
    this.players.add(playersItem);
    return this;
  }

   /**
   * List of players
   * @return players
  **/
  @ApiModelProperty(value = "List of players")

  @Valid

  public List<UserReducedResponse> getPlayers() {
    return players;
  }

  public void setPlayers(List<UserReducedResponse> players) {
    this.players = players;
  }

  public GameResponse owners(List<UserReducedResponse> owners) {
    this.owners = owners;
    return this;
  }

  public GameResponse addOwnersItem(UserReducedResponse ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<UserReducedResponse>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * List of owners
   * @return owners
  **/
  @ApiModelProperty(value = "List of owners")

  @Valid

  public List<UserReducedResponse> getOwners() {
    return owners;
  }

  public void setOwners(List<UserReducedResponse> owners) {
    this.owners = owners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameResponse gameResponse = (GameResponse) o;
    return Objects.equals(this.fullName, gameResponse.fullName) &&
        Objects.equals(this.launchYear, gameResponse.launchYear) &&
        Objects.equals(this.developer, gameResponse.developer) &&
        Objects.equals(this.players, gameResponse.players) &&
        Objects.equals(this.owners, gameResponse.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, launchYear, developer, players, owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameResponse {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    launchYear: ").append(toIndentedString(launchYear)).append("\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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

