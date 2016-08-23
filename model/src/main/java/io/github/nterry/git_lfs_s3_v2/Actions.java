package io.github.nterry.git_lfs_s3_v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

enum Actions {
  @Expose
  @SerializedName("upload")
  UPLOAD("upload"),

  @Expose
  @SerializedName("download")
  DOWNLOAD("download"),

  @Expose
  @SerializedName("verify")
  VERIFY("verify");

  final String action;

  Actions(String action) {
    this.action = action;
  }

  String getAction() {
    return action;
  }

  static Actions fromString(String action) {
    return valueOf(action);
  }
}
