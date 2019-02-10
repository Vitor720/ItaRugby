package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class DisplayGameFragmentDirections {
  @NonNull
  public static ActionDisplayGameFragmentToAgendaFragment actionDisplayGameFragmentToAgendaFragment() {
    return new ActionDisplayGameFragmentToAgendaFragment();
  }

  @NonNull
  public static ActionDisplayGameFragmentToHomeFragment actionDisplayGameFragmentToHomeFragment() {
    return new ActionDisplayGameFragmentToHomeFragment();
  }

  public static class ActionDisplayGameFragmentToAgendaFragment implements NavDirections {
    public ActionDisplayGameFragmentToAgendaFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_displayGameFragment_to_agendaFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDisplayGameFragmentToAgendaFragment that = (ActionDisplayGameFragmentToAgendaFragment) object;
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

  public static class ActionDisplayGameFragmentToHomeFragment implements NavDirections {
    public ActionDisplayGameFragmentToHomeFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_displayGameFragment_to_homeFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDisplayGameFragmentToHomeFragment that = (ActionDisplayGameFragmentToHomeFragment) object;
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
