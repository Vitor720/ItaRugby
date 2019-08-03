package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDisplayPlayerBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final LinearLayout displayPlayerHeader;

  @NonNull
  public final View displaySpacer;

  @NonNull
  public final LinearLayout displayStatsHeader;

  @NonNull
  public final TextView drill;

  @NonNull
  public final ImageView imageViewPlayer;

  @NonNull
  public final ImageView imageViewRedCard;

  @NonNull
  public final ImageView imageViewYellowCard;

  @NonNull
  public final TextView lastDrill;

  @NonNull
  public final View lastDrillDivider;

  @NonNull
  public final TextView playerBirthday;

  @NonNull
  public final TextView playerBody;

  @NonNull
  public final TextView playerBodyDesc;

  @NonNull
  public final CircularImageView playerImageView;

  @NonNull
  public final TextView playerName;

  @NonNull
  public final TextView playerPosition;

  @NonNull
  public final TextView playerRedCards;

  @NonNull
  public final TextView playerSince;

  @NonNull
  public final TextView playerStatsHeader;

  @NonNull
  public final TextView playerYellowCards;

  @NonNull
  public final TextView redCards;

  @NonNull
  public final View redCardsDivider;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView yellowCards;

  @NonNull
  public final View yellowCardsDivider;

  protected FragmentDisplayPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, LinearLayout displayPlayerHeader, View displaySpacer,
      LinearLayout displayStatsHeader, TextView drill, ImageView imageViewPlayer,
      ImageView imageViewRedCard, ImageView imageViewYellowCard, TextView lastDrill,
      View lastDrillDivider, TextView playerBirthday, TextView playerBody, TextView playerBodyDesc,
      CircularImageView playerImageView, TextView playerName, TextView playerPosition,
      TextView playerRedCards, TextView playerSince, TextView playerStatsHeader,
      TextView playerYellowCards, TextView redCards, View redCardsDivider, TextView textView3,
      TextView textView4, TextView yellowCards, View yellowCardsDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.displayPlayerHeader = displayPlayerHeader;
    this.displaySpacer = displaySpacer;
    this.displayStatsHeader = displayStatsHeader;
    this.drill = drill;
    this.imageViewPlayer = imageViewPlayer;
    this.imageViewRedCard = imageViewRedCard;
    this.imageViewYellowCard = imageViewYellowCard;
    this.lastDrill = lastDrill;
    this.lastDrillDivider = lastDrillDivider;
    this.playerBirthday = playerBirthday;
    this.playerBody = playerBody;
    this.playerBodyDesc = playerBodyDesc;
    this.playerImageView = playerImageView;
    this.playerName = playerName;
    this.playerPosition = playerPosition;
    this.playerRedCards = playerRedCards;
    this.playerSince = playerSince;
    this.playerStatsHeader = playerStatsHeader;
    this.playerYellowCards = playerYellowCards;
    this.redCards = redCards;
    this.redCardsDivider = redCardsDivider;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.yellowCards = yellowCards;
    this.yellowCardsDivider = yellowCardsDivider;
  }

  @NonNull
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_display_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDisplayPlayerBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_display_player, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_display_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDisplayPlayerBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_display_player, null, false, component);
  }

  public static FragmentDisplayPlayerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentDisplayPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDisplayPlayerBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_display_player);
  }
}
