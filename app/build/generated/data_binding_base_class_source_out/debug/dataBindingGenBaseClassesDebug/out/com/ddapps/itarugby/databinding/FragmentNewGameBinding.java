package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public abstract class FragmentNewGameBinding extends ViewDataBinding {
  @NonNull
  public final Button addEventButton;

  @NonNull
  public final TextView dateEventID;

  @NonNull
  public final TextView eventTxtHeader;

  @NonNull
  public final MaterialBetterSpinner gameArriveEarly;

  @NonNull
  public final TextView gameDetailsHeader;

  @NonNull
  public final TextInputEditText gamesQuantity;

  @NonNull
  public final MaterialBetterSpinner newEventDuration;

  @NonNull
  public final TextInputEditText newGameDate;

  @NonNull
  public final LinearLayout newGameLayout;

  @NonNull
  public final TextInputEditText newGameLocationDetails;

  @NonNull
  public final TextInputEditText newGameName;

  @NonNull
  public final TextInputEditText newGameOpponents;

  @NonNull
  public final MaterialBetterSpinner newGamePlace;

  @NonNull
  public final TextInputEditText newGameTime;

  protected FragmentNewGameBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button addEventButton, TextView dateEventID, TextView eventTxtHeader,
      MaterialBetterSpinner gameArriveEarly, TextView gameDetailsHeader,
      TextInputEditText gamesQuantity, MaterialBetterSpinner newEventDuration,
      TextInputEditText newGameDate, LinearLayout newGameLayout,
      TextInputEditText newGameLocationDetails, TextInputEditText newGameName,
      TextInputEditText newGameOpponents, MaterialBetterSpinner newGamePlace,
      TextInputEditText newGameTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addEventButton = addEventButton;
    this.dateEventID = dateEventID;
    this.eventTxtHeader = eventTxtHeader;
    this.gameArriveEarly = gameArriveEarly;
    this.gameDetailsHeader = gameDetailsHeader;
    this.gamesQuantity = gamesQuantity;
    this.newEventDuration = newEventDuration;
    this.newGameDate = newGameDate;
    this.newGameLayout = newGameLayout;
    this.newGameLocationDetails = newGameLocationDetails;
    this.newGameName = newGameName;
    this.newGameOpponents = newGameOpponents;
    this.newGamePlace = newGamePlace;
    this.newGameTime = newGameTime;
  }

  @NonNull
  public static FragmentNewGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentNewGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentNewGameBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_new_game, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNewGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentNewGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentNewGameBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_new_game, null, false, component);
  }

  public static FragmentNewGameBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentNewGameBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentNewGameBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_new_game);
  }
}
