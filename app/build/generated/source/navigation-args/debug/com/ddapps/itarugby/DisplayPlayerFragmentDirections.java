package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class DisplayPlayerFragmentDirections {
  @NonNull
  public static ActionDisplayPlayerFragmentToTeamFragment actionDisplayPlayerFragmentToTeamFragment() {
    return new ActionDisplayPlayerFragmentToTeamFragment();
  }

  public static class ActionDisplayPlayerFragmentToTeamFragment implements NavDirections {
    public ActionDisplayPlayerFragmentToTeamFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_displayPlayerFragment_to_teamFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDisplayPlayerFragmentToTeamFragment that = (ActionDisplayPlayerFragmentToTeamFragment) object;
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
