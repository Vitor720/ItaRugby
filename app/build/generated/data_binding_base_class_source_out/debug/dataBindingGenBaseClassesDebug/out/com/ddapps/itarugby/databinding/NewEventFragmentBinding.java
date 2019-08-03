package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dd.CircularProgressButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NewEventFragmentBinding extends ViewDataBinding {
  @NonNull
  public final CircularProgressButton addEventButton;

  @NonNull
  public final TextInputEditText arriveEarly;

  @NonNull
  public final TextView dateEventID;

  @NonNull
  public final TextView eventTxtHeader;

  @NonNull
  public final MaterialBetterSpinner fifthOpponent;

  @NonNull
  public final MaterialBetterSpinner firstOpponent;

  @NonNull
  public final MaterialBetterSpinner forthOpponent;

  @NonNull
  public final TextView gameDetailsHeader;

  @NonNull
  public final MaterialBetterSpinner gamesQuantity;

  @NonNull
  public final TextInputEditText newEventDate;

  @NonNull
  public final TextInputLayout newEventDateLayout;

  @NonNull
  public final TextInputEditText newEventDuration;

  @NonNull
  public final LinearLayout newEventLayout;

  @NonNull
  public final TextInputEditText newEventName;

  @NonNull
  public final TextInputEditText newEventNotes;

  @NonNull
  public final MaterialBetterSpinner newEventPlace;

  @NonNull
  public final TextInputEditText newEventTime;

  @NonNull
  public final TextInputEditText newGameNotes;

  @NonNull
  public final MaterialBetterSpinner secondOpponent;

  @NonNull
  public final MaterialBetterSpinner sixthOpponent;

  @NonNull
  public final MaterialBetterSpinner thirdOpponent;

  @Bindable
  protected String mGameOpponents;

  protected NewEventFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircularProgressButton addEventButton, TextInputEditText arriveEarly, TextView dateEventID,
      TextView eventTxtHeader, MaterialBetterSpinner fifthOpponent,
      MaterialBetterSpinner firstOpponent, MaterialBetterSpinner forthOpponent,
      TextView gameDetailsHeader, MaterialBetterSpinner gamesQuantity,
      TextInputEditText newEventDate, TextInputLayout newEventDateLayout,
      TextInputEditText newEventDuration, LinearLayout newEventLayout,
      TextInputEditText newEventName, TextInputEditText newEventNotes,
      MaterialBetterSpinner newEventPlace, TextInputEditText newEventTime,
      TextInputEditText newGameNotes, MaterialBetterSpinner secondOpponent,
      MaterialBetterSpinner sixthOpponent, MaterialBetterSpinner thirdOpponent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addEventButton = addEventButton;
    this.arriveEarly = arriveEarly;
    this.dateEventID = dateEventID;
    this.eventTxtHeader = eventTxtHeader;
    this.fifthOpponent = fifthOpponent;
    this.firstOpponent = firstOpponent;
    this.forthOpponent = forthOpponent;
    this.gameDetailsHeader = gameDetailsHeader;
    this.gamesQuantity = gamesQuantity;
    this.newEventDate = newEventDate;
    this.newEventDateLayout = newEventDateLayout;
    this.newEventDuration = newEventDuration;
    this.newEventLayout = newEventLayout;
    this.newEventName = newEventName;
    this.newEventNotes = newEventNotes;
    this.newEventPlace = newEventPlace;
    this.newEventTime = newEventTime;
    this.newGameNotes = newGameNotes;
    this.secondOpponent = secondOpponent;
    this.sixthOpponent = sixthOpponent;
    this.thirdOpponent = thirdOpponent;
  }

  public abstract void setGameOpponents(@Nullable String gameOpponents);

  @Nullable
  public String getGameOpponents() {
    return mGameOpponents;
  }

  @NonNull
  public static NewEventFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.new_event_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NewEventFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NewEventFragmentBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.new_event_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static NewEventFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.new_event_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NewEventFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NewEventFragmentBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.new_event_fragment, null, false, component);
  }

  public static NewEventFragmentBinding bind(@NonNull View view) {
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
  public static NewEventFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (NewEventFragmentBinding)bind(component, view, com.ddapps.itarugby.R.layout.new_event_fragment);
  }
}
