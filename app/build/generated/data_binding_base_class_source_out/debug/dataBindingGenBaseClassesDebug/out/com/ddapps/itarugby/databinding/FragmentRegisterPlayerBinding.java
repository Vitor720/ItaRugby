package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public abstract class FragmentRegisterPlayerBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText playerBirthdayDate;

  @NonNull
  public final TextInputLayout playerBirthdayDateLayout;

  @NonNull
  public final TextInputEditText playerContactCreate;

  @NonNull
  public final TextInputEditText playerHight;

  @NonNull
  public final TextInputEditText playerLastDrill;

  @NonNull
  public final TextInputEditText playerNameCreate;

  @NonNull
  public final TextInputEditText playerPhoto;

  @NonNull
  public final TextInputEditText playerPositionCreate;

  @NonNull
  public final TextInputEditText playerRedCardsCreate;

  @NonNull
  public final TextInputEditText playerSinceDate;

  @NonNull
  public final TextView playerTxtHeader;

  @NonNull
  public final TextInputEditText playerWeight;

  @NonNull
  public final TextInputEditText playerYellowCardsCreate;

  @NonNull
  public final Button register;

  protected FragmentRegisterPlayerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextInputEditText playerBirthdayDate,
      TextInputLayout playerBirthdayDateLayout, TextInputEditText playerContactCreate,
      TextInputEditText playerHight, TextInputEditText playerLastDrill,
      TextInputEditText playerNameCreate, TextInputEditText playerPhoto,
      TextInputEditText playerPositionCreate, TextInputEditText playerRedCardsCreate,
      TextInputEditText playerSinceDate, TextView playerTxtHeader, TextInputEditText playerWeight,
      TextInputEditText playerYellowCardsCreate, Button register) {
    super(_bindingComponent, _root, _localFieldCount);
    this.playerBirthdayDate = playerBirthdayDate;
    this.playerBirthdayDateLayout = playerBirthdayDateLayout;
    this.playerContactCreate = playerContactCreate;
    this.playerHight = playerHight;
    this.playerLastDrill = playerLastDrill;
    this.playerNameCreate = playerNameCreate;
    this.playerPhoto = playerPhoto;
    this.playerPositionCreate = playerPositionCreate;
    this.playerRedCardsCreate = playerRedCardsCreate;
    this.playerSinceDate = playerSinceDate;
    this.playerTxtHeader = playerTxtHeader;
    this.playerWeight = playerWeight;
    this.playerYellowCardsCreate = playerYellowCardsCreate;
    this.register = register;
  }

  @NonNull
  public static FragmentRegisterPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRegisterPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRegisterPlayerBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_register_player, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRegisterPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRegisterPlayerBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_register_player, null, false, component);
  }

  public static FragmentRegisterPlayerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentRegisterPlayerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentRegisterPlayerBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_register_player);
  }
}
