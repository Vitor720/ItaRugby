package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class RegisterPlayerFragmentDirections {
  @NonNull
  public static ActionRegisterPlayerFragmentToTeamFragment actionRegisterPlayerFragmentToTeamFragment() {
    return new ActionRegisterPlayerFragmentToTeamFragment();
  }

  public static class ActionRegisterPlayerFragmentToTeamFragment implements NavDirections {
    public ActionRegisterPlayerFragmentToTeamFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_registerPlayerFragment_to_teamFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRegisterPlayerFragmentToTeamFragment that = (ActionRegisterPlayerFragmentToTeamFragment) object;
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
