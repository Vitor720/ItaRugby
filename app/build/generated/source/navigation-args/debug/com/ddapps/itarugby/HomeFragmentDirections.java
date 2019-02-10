package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class HomeFragmentDirections {
  @NonNull
  public static ActionHomeFragmentToLoginFragment actionHomeFragmentToLoginFragment() {
    return new ActionHomeFragmentToLoginFragment();
  }

  @NonNull
  public static ActionHomeFragmentToNewEventFragment actionHomeFragmentToNewEventFragment() {
    return new ActionHomeFragmentToNewEventFragment();
  }

  @NonNull
  public static ActionHomeFragmentToDisplayEventFragment actionHomeFragmentToDisplayEventFragment(@NonNull String docID) {
    return new ActionHomeFragmentToDisplayEventFragment(docID);
  }

  @NonNull
  public static ActionHomeFragmentToDisplayGameFragment actionHomeFragmentToDisplayGameFragment(@NonNull String docID) {
    return new ActionHomeFragmentToDisplayGameFragment(docID);
  }

  public static class ActionHomeFragmentToLoginFragment implements NavDirections {
    public ActionHomeFragmentToLoginFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_homeFragment_to_loginFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToLoginFragment that = (ActionHomeFragmentToLoginFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }
  }

  public static class ActionHomeFragmentToNewEventFragment implements NavDirections {
    public ActionHomeFragmentToNewEventFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_homeFragment_to_newEventFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToNewEventFragment that = (ActionHomeFragmentToNewEventFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }
  }

  public static class ActionHomeFragmentToDisplayEventFragment implements NavDirections {
    @NonNull
    private String docID;

    public ActionHomeFragmentToDisplayEventFragment(@NonNull String docID) {
      this.docID = docID;
      if (this.docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public ActionHomeFragmentToDisplayEventFragment setDocID(@NonNull String docID) {
      if (docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
      this.docID = docID;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putString("docID", this.docID);
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_homeFragment_to_displayEventFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDisplayEventFragment that = (ActionHomeFragmentToDisplayEventFragment) object;
      if (docID != null ? !docID.equals(that.docID) : that.docID != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (docID != null ? docID.hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }
  }

  public static class ActionHomeFragmentToDisplayGameFragment implements NavDirections {
    @NonNull
    private String docID;

    public ActionHomeFragmentToDisplayGameFragment(@NonNull String docID) {
      this.docID = docID;
      if (this.docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public ActionHomeFragmentToDisplayGameFragment setDocID(@NonNull String docID) {
      if (docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
      this.docID = docID;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putString("docID", this.docID);
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_homeFragment_to_displayGameFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDisplayGameFragment that = (ActionHomeFragmentToDisplayGameFragment) object;
      if (docID != null ? !docID.equals(that.docID) : that.docID != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (docID != null ? docID.hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }
  }
}
