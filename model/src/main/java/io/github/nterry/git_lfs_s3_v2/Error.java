package io.github.nterry.git_lfs_s3_v2;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
class Error {

  @Expose
  @SerializedName("code")
  private double code;

  @Expose
  @SerializedName("message")
  private String message;

  double getCode() {
    return code;
  }

  void setCode(double code) {
    this.code = code;
  }

  Error withCode(double code) {
    this.code = code;
    return this;
  }

  String getMessage() {
    return message;
  }

  void setMessage(String message) {
    this.message = message;
  }

  Error withMessage(String message) {
    this.message = message;
    return this;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder()
        .append(code)
        .append(message)
        .toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Error) == false) {
      return false;
    }

    Error rhs = ((Error) other);
    return new EqualsBuilder()
        .append(code, rhs.code)
        .append(message, rhs.message)
        .isEquals();
  }

}
