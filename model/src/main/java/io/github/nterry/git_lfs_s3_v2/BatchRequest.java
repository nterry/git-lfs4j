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
class BatchRequest {

  @Expose
  @SerializedName("transfers")
  private List<String> transfers = new ArrayList<String>();

  @Expose
  @SerializedName("operation")
  private Actions operation;

  @Expose
  @SerializedName("objects")
  private List<BatchObject> objects = new ArrayList<>();

  List<String> getTransfers() {
    return transfers;
  }

  void setTransfers(List<String> transfers) {
    this.transfers = transfers;
  }

  BatchRequest withTransfers(List<String> transfers) {
    this.transfers = transfers;
    return this;
  }

  Actions getOperation() {
    return operation;
  }

  void setOperation(Actions operation) {
    this.operation = operation;
  }

  BatchRequest withOperation(Actions operation) {
    this.operation = operation;
    return this;
  }

  List<BatchObject> getObjects() {
    return objects;
  }

  void setObjects(List<BatchObject> batchRequestObjects) {
    this.objects = batchRequestObjects;
  }

  BatchRequest withObjects(List<BatchObject> batchRequestObjects) {
    this.objects = batchRequestObjects;
    return this;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder()
        .append(transfers)
        .append(operation)
        .append(objects)
        .toHashCode();
  }

  @Override
  public boolean equals(java.lang.Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof BatchRequest) == false) {
      return false;
    }

    BatchRequest rhs = ((BatchRequest) other);
    return new EqualsBuilder()
        .append(transfers, rhs.transfers)
        .append(operation, rhs.operation)
        .append(objects, rhs.objects)
        .isEquals();
  }

}
