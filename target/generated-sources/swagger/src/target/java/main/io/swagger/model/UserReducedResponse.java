package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserReducedResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-23T22:20:16.004-02:00")

public class UserReducedResponse   {
  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("login")
  private String login = null;

  public UserReducedResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * name of the player
   * @return fullName
  **/
  @ApiModelProperty(value = "name of the player")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserReducedResponse login(String login) {
    this.login = login;
    return this;
  }

   /**
   * login of the player
   * @return login
  **/
  @ApiModelProperty(value = "login of the player")


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserReducedResponse userReducedResponse = (UserReducedResponse) o;
    return Objects.equals(this.fullName, userReducedResponse.fullName) &&
        Objects.equals(this.login, userReducedResponse.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserReducedResponse {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
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

