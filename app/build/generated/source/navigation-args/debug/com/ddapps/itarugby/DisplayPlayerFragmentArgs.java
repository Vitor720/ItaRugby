package com.ddapps.itarugby;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class DisplayPlayerFragmentArgs {
  @NonNull
  private String playerName;

  private DisplayPlayerFragmentArgs() {
  }

  @NonNull
  public static DisplayPlayerFragmentArgs fromBundle(Bundle bundle) {
    DisplayPlayerFragmentArgs result = new DisplayPlayerFragmentArgs();
    bundle.setClassLoader(DisplayPlayerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("player_name")) {
      result.playerName = bundle.getString("player_name");
      if (result.playerName == null) {
        throw new IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value.");
      }
    } else {
      throw new IllegalArgumentException("Required argument \"player_name\" is missing and does not have an android:defaultValue");
    }
    return result;
  }

  @NonNull
  public String getPlayerName() {
    return playerName;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putString("player_name", this.playerName);
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
    DisplayPlayerFragmentArgs that = (DisplayPlayerFragmentArgs) object;
    if (playerName != null ? !playerName.equals(that.playerName) : that.playerName != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (playerName != null ? playerName.hashCode() : 0);
    return result;
  }

  public static class Builder {
    @NonNull
    private String playerName;

    public Builder(DisplayPlayerFragmentArgs original) {
      this.playerName = original.playerName;
    }

    public Builder(@NonNull String playerName) {
      this.playerName = playerName;
      if (this.playerName == null) {
        throw new IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public DisplayPlayerFragmentArgs build() {
      DisplayPlayerFragmentArgs result = new DisplayPlayerFragmentArgs();
      result.playerName = this.playerName;
      return result;
    }

    @NonNull
    public Builder setPlayerName(@NonNull String playerName) {
      if (playerName == null) {
        throw new IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value.");
      }
      this.playerName = playerName;
      return this;
    }

    @NonNull
    public String getPlayerName() {
      return playerName;
    }
  }
}
