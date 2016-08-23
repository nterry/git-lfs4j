package io.github.nterry.git_lfs_s3_v2;


import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
class Action {

  @Expose
  @SerializedName("href")
  private String href;

  @Expose
  @SerializedName("header")
  private Map<String, String> header;

  @Expose
  @SerializedName("expires_at")
  private LocalDateTime expiresAt;

  String getHref() {
    return href;
  }

  void setHref(String href) {
    this.href = href;
  }

  Action withHref(String href) {
    this.href = href;
    return this;
  }

  Map<String, String> getHeader() {
    return header;
  }

  void setHeader(Map<String, String> header) {
    this.header = header;
  }

  Action withHeader(Map<String, String> header) {
    this.header = header;
    return this;
  }

  LocalDateTime getExpiresAt() {
    return expiresAt;
  }

  void setExpiresAt(LocalDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  Action withExpiresAt(LocalDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder()
        .append(href)
        .append(header)
        .append(expiresAt)
        .toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof Action)) {
      return false;
    }

    Action rhs = ((Action) other);
    return new EqualsBuilder()
        .append(href, rhs.href)
        .append(header, rhs.header)
        .append(expiresAt, rhs.expiresAt)
        .isEquals();
  }
}
