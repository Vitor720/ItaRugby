package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TeamFragmentDirections {
  @NonNull
  public static ActionTeamFragmentToDisplayPlayerFragment actionTeamFragmentToDisplayPlayerFragment(@NonNull String playerName) {
    return new ActionTeamFragmentToDisplayPlayerFragment(playerName);
  }

  @NonNull
  public static ActionTeamFragmentToRegisterPlayerFragment actionTeamFragmentToRegisterPlayerFragment() {
    return new ActionTeamFragmentToRegisterPlayerFragment();
  }

  public static class ActionTeamFragmentToDisplayPlayerFragment implements NavDirections {
    @NonNull
    private String playerName;

    public ActionTeamFragmentToDisplayPlayerFragment(@NonNull String playerName) {
      this.playerName = playerName;
      if (this.playerName == null) {
        throw new IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public ActionTeamFragmentToDisplayPlayerFragment setPlayerName(@NonNull String playerName) {
      if (playerName == null) {
        throw new IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value.");
      }
      this.playerName = playerName;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putString("player_name", this.playerName);
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_teamFragment_to_displayPlayerFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTeamFragmentToDisplayPlayerFragment that = (ActionTeamFragmentToDisplayPlayerFragment) object;
      if (playerName != null ? !playerName.equals(that.playerName) : that.playerName != null) {
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
      result = 31 * result + (playerName != null ? playerName.hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }
  }

  public static class ActionTeamFragmentToRegisterPlayerFragment implements NavDirections {
    public ActionTeamFragmentToRegisterPlayerFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.ddapps.itarugby.R.id.action_teamFragment_to_registerPlayerFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTeamFragmentToRegisterPlayerFragment that = (ActionTeamFragmentToRegisterPlayerFragment) object;
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
