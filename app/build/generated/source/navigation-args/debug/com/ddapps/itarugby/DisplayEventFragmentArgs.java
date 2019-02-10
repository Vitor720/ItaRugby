package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class DisplayEventFragmentArgs {
  @NonNull
  private String docID;

  private DisplayEventFragmentArgs() {
  }

  @NonNull
  public static DisplayEventFragmentArgs fromBundle(Bundle bundle) {
    DisplayEventFragmentArgs result = new DisplayEventFragmentArgs();
    bundle.setClassLoader(DisplayEventFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("docID")) {
      result.docID = bundle.getString("docID");
      if (result.docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
    } else {
      throw new IllegalArgumentException("Required argument \"docID\" is missing and does not have an android:defaultValue");
    }
    return result;
  }

  @NonNull
  public String getDocID() {
    return docID;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putString("docID", this.docID);
    return __outBundle;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DisplayEventFragmentArgs that = (DisplayEventFragmentArgs) object;
    if (docID != null ? !docID.equals(that.docID) : that.docID != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (docID != null ? docID.hashCode() : 0);
    return result;
  }

  public static class Builder {
    @NonNull
    private String docID;

    public Builder(DisplayEventFragmentArgs original) {
      this.docID = original.docID;
    }

    public Builder(@NonNull String docID) {
      this.docID = docID;
      if (this.docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public DisplayEventFragmentArgs build() {
      DisplayEventFragmentArgs result = new DisplayEventFragmentArgs();
      result.docID = this.docID;
      return result;
    }

    @NonNull
    public Builder setDocID(@NonNull String docID) {
      if (docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
      this.docID = docID;
      return this;
    }

    @NonNull
    public String getDocID() {
      return docID;
    }
  }
}