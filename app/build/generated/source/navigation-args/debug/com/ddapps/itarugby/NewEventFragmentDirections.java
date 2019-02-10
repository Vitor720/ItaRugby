package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class NewEventFragmentDirections {
  @NonNull
  public static ActionNewEventFragmentToHomeFragment actionNewEventFragmentToHomeFragment() {
    return new ActionNewEventFragmentToHomeFragment();
  }

  @NonNull
  public static ActionNewEventFragmentToAgendaFragment actionNewEventFragmentToAgendaFragment() {
    return new ActionNewEventFragmentToAgendaFragment();
  }

  public static class ActionNewEventFragmentToHomeFragment implements NavDirections {
    public ActionNewEventFragmentToHomeFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_newEventFragment_to_homeFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNewEventFragmentToHomeFragment that = (ActionNewEventFragmentToHomeFragment) object;
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

  public static class ActionNewEventFragmentToAgendaFragment implements NavDirections {
    public ActionNewEventFragmentToAgendaFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_newEventFragment_to_agendaFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNewEventFragmentToAgendaFragment that = (ActionNewEventFragmentToAgendaFragment) object;
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
