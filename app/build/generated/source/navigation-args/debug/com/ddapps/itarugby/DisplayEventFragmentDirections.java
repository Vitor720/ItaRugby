package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class DisplayEventFragmentDirections {
  @NonNull
  public static ActionDisplayEventFragmentToAgendaFragment actionDisplayEventFragmentToAgendaFragment() {
    return new ActionDisplayEventFragmentToAgendaFragment();
  }

  @NonNull
  public static ActionDisplayEventFragmentToHomeFragment actionDisplayEventFragmentToHomeFragment() {
    return new ActionDisplayEventFragmentToHomeFragment();
  }

  public static class ActionDisplayEventFragmentToAgendaFragment implements NavDirections {
    public ActionDisplayEventFragmentToAgendaFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_displayEventFragment_to_agendaFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDisplayEventFragmentToAgendaFragment that = (ActionDisplayEventFragmentToAgendaFragment) object;
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

  public static class ActionDisplayEventFragmentToHomeFragment implements NavDirections {
    public ActionDisplayEventFragmentToHomeFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_displayEventFragment_to_homeFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDisplayEventFragmentToHomeFragment that = (ActionDisplayEventFragmentToHomeFragment) object;
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
