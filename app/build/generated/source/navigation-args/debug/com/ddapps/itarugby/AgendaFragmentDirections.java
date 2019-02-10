package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class AgendaFragmentDirections {
  @NonNull
  public static ActionAgendaFragmentToDisplayEventFragment actionAgendaFragmentToDisplayEventFragment(@NonNull String docID) {
    return new ActionAgendaFragmentToDisplayEventFragment(docID);
  }

  @NonNull
  public static ActionAgendaFragmentToDisplayGameFragment actionAgendaFragmentToDisplayGameFragment(@NonNull String docID) {
    return new ActionAgendaFragmentToDisplayGameFragment(docID);
  }

  @NonNull
  public static ActionAgendaFragmentToNewEventFragment actionAgendaFragmentToNewEventFragment() {
    return new ActionAgendaFragmentToNewEventFragment();
  }

  public static class ActionAgendaFragmentToDisplayEventFragment implements NavDirections {
    @NonNull
    private String docID;

    public ActionAgendaFragmentToDisplayEventFragment(@NonNull String docID) {
      this.docID = docID;
      if (this.docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public ActionAgendaFragmentToDisplayEventFragment setDocID(@NonNull String docID) {
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
      return com.ddapps.itarugby.R.id.action_agendaFragment_to_displayEventFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAgendaFragmentToDisplayEventFragment that = (ActionAgendaFragmentToDisplayEventFragment) object;
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

  public static class ActionAgendaFragmentToDisplayGameFragment implements NavDirections {
    @NonNull
    private String docID;

    public ActionAgendaFragmentToDisplayGameFragment(@NonNull String docID) {
      this.docID = docID;
      if (this.docID == null) {
        throw new IllegalArgumentException("Argument \"docID\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public ActionAgendaFragmentToDisplayGameFragment setDocID(@NonNull String docID) {
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
      return com.ddapps.itarugby.R.id.action_agendaFragment_to_displayGameFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAgendaFragmentToDisplayGameFragment that = (ActionAgendaFragmentToDisplayGameFragment) object;
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

  public static class ActionAgendaFragmentToNewEventFragment implements NavDirections {
    public ActionAgendaFragmentToNewEventFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_agendaFragment_to_newEventFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAgendaFragmentToNewEventFragment that = (ActionAgendaFragmentToNewEventFragment) object;
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
}
