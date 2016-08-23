package io.github.nterry.git_lfs_s3_v2;

import java.util.Map;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
class BatchObject {

  @Expose
  @SerializedName("oid")
  private String oid;

  @Expose
  @SerializedName("size")
  private double size;

  @Expose
  @SerializedName("authenticated")
  private boolean authenticated;

  @Expose
  @SerializedName("actions")
  private Map<Actions, Action> actions;

  @Expose
  @SerializedName("error")
  private Error error;

  String getOid() {
    return oid;
  }

  void setOid(String oid) {
    this.oid = oid;
  }

  BatchObject withOid(String oid) {
    this.oid = oid;
    return this;
  }

  double getSize() {
    return size;
  }

  void setSize(double size) {
    this.size = size;
  }

  BatchObject withSize(double size) {
    this.size = size;
    return this;
  }

  boolean isAuthenticated() {
    return authenticated;
  }

  void setAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
  }

  BatchObject withAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

  Map<Actions, Action> getActions() {
    return actions;
  }

  void setActions(Map<Actions, Action> actions) {
    this.actions = actions;
  }

  BatchObject withActions(Map<Actions, Action> actionz) {
    this.actions = actionz;
    return this;
  }

  Error getError() {
    return error;
  }

  void setError(Error error) {
    this.error = error;
  }

  BatchObject withError(Error error) {
    this.error = error;
    return this;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder()
        .append(oid)
        .append(size)
        .append(authenticated)
        .append(actions)
        .append(error)
        .toHashCode();
  }

  @Override
  public boolean equals(java.lang.Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof BatchObject) == false) {
      return false;
    }

    BatchObject rhs = ((BatchObject) other);
    return new EqualsBuilder()
        .append(oid, rhs.oid)
        .append(size, rhs.size)
        .append(authenticated, rhs.authenticated)
        .append(actions, rhs.actions)
        .append(error, rhs.error)
        .isEquals();
  }

}
