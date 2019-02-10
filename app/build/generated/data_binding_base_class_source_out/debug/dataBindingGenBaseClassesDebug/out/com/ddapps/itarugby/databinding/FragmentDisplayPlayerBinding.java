package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentDisplayPlayerBinding extends ViewDataBinding {
  @NonNull
  public final TextView bDay;

  @NonNull
  public final View birthdayDivider;

  @NonNull
  public final TextView body;

  @NonNull
  public final TextView contact;

  @NonNull
  public final View contactDivider;

  @NonNull
  public final TextView drill;

  @NonNull
  public final ImageView imageViewBall;

  @NonNull
  public final ImageView imageViewBody;

  @NonNull
  public final ImageView imageViewCake;

  @NonNull
  public final ImageView imageViewContact;

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
  public final TextView playerContact;

  @NonNull
  public final ImageView playerImageView;

  @NonNull
  public final View playerInfoDivider;

  @NonNull
  public final TextView playerName;

  @NonNull
  public final TextView playerPosition;

  @NonNull
  public final TextView playerRedCards;

  @NonNull
  public final TextView playerSince;

  @NonNull
  public final View playerSinceDivider;

  @NonNull
  public final TextView playerSinceTxt;

  @NonNull
  public final TextView playerStatsHeader;

  @NonNull
  public final TextView playerYellowCards;

  @NonNull
  public final TextView redCards;

  @NonNull
  public final View redCardsDivider;

  @NonNull
  public final TextView yellowCards;

  @NonNull
  public final View yellowCardsDivider;

  protected FragmentDisplayPlayerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView bDay, View birthdayDivider, TextView body, TextView contact,
      View contactDivider, TextView drill, ImageView imageViewBall, ImageView imageViewBody,
      ImageView imageViewCake, ImageView imageViewContact, ImageView imageViewPlayer,
      ImageView imageViewRedCard, ImageView imageViewYellowCard, TextView lastDrill,
      View lastDrillDivider, TextView playerBirthday, TextView playerBody, TextView playerContact,
      ImageView playerImageView, View playerInfoDivider, TextView playerName,
      TextView playerPosition, TextView playerRedCards, TextView playerSince,
      View playerSinceDivider, TextView playerSinceTxt, TextView playerStatsHeader,
      TextView playerYellowCards, TextView redCards, View redCardsDivider, TextView yellowCards,
      View yellowCardsDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bDay = bDay;
    this.birthdayDivider = birthdayDivider;
    this.body = body;
    this.contact = contact;
    this.contactDivider = contactDivider;
    this.drill = drill;
    this.imageViewBall = imageViewBall;
    this.imageViewBody = imageViewBody;
    this.imageViewCake = imageViewCake;
    this.imageViewContact = imageViewContact;
    this.imageViewPlayer = imageViewPlayer;
    this.imageViewRedCard = imageViewRedCard;
    this.imageViewYellowCard = imageViewYellowCard;
    this.lastDrill = lastDrill;
    this.lastDrillDivider = lastDrillDivider;
    this.playerBirthday = playerBirthday;
    this.playerBody = playerBody;
    this.playerContact = playerContact;
    this.playerImageView = playerImageView;
    this.playerInfoDivider = playerInfoDivider;
    this.playerName = playerName;
    this.playerPosition = playerPosition;
    this.playerRedCards = playerRedCards;
    this.playerSince = playerSince;
    this.playerSinceDivider = playerSinceDivider;
    this.playerSinceTxt = playerSinceTxt;
    this.playerStatsHeader = playerStatsHeader;
    this.playerYellowCards = playerYellowCards;
    this.redCards = redCards;
    this.redCardsDivider = redCardsDivider;
    this.yellowCards = yellowCards;
    this.yellowCardsDivider = yellowCardsDivider;
  }

  @NonNull
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDisplayPlayerBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_display_player, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDisplayPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDisplayPlayerBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_display_player, null, false, component);
  }

  public static FragmentDisplayPlayerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDisplayPlayerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDisplayPlayerBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_display_player);
  }
}
