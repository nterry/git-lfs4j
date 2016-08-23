package io.github.nterry.git_lfs_s3_v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


@Generated("org.jsonschema2pojo")
class BatchResponse {

  @Expose
  @SerializedName("transfer")
  private String transfer;

  @Expose
  @SerializedName("objects")
  private List<BatchObject> objects = new ArrayList<BatchObject>();

  @Expose
  @SerializedName("message")
  private String message;

  @Expose
  @SerializedName("request_id")
  private String requestId;

  @Expose
  @SerializedName("documentation_url")
  private String documentationUrl;

  String getTransfer() {
    return transfer;
  }

  void setTransfer(String transfer) {
    this.transfer = transfer;
  }

  BatchResponse withTransfer(String transfer) {
    this.transfer = transfer;
    return this;
  }

  List<BatchObject> getObjects() {
    return objects;
  }

  void setObjects(List<BatchObject> objects) {
    this.objects = objects;
  }

  BatchResponse withObjects(List<BatchObject> objects) {
    this.objects = objects;
    return this;
  }

  String getMessage() {
    return message;
  }

  void setMessage(String message) {
    this.message = message;
  }

  BatchResponse withMessage(String message) {
    this.message = message;
    return this;
  }

  String getRequestId() {
    return requestId;
  }

  void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  BatchResponse withRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  String getDocumentationUrl() {
    return documentationUrl;
  }

  void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  BatchResponse withDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder()
        .append(transfer)
        .append(objects)
        .append(message)
        .append(requestId)
        .append(documentationUrl)
        .toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof BatchResponse) == false) {
      return false;
    }

    BatchResponse rhs = ((BatchResponse) other);
    return new EqualsBuilder()
        .append(transfer, rhs.transfer)
        .append(objects, rhs.objects)
        .append(message, rhs.message)
        .append(requestId, rhs.requestId)
        .append(documentationUrl, rhs.documentationUrl)
        .isEquals();
  }

}
