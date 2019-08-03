package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDisplayGameBinding extends ViewDataBinding {
  @NonNull
  public final TextView confirmationHeader;

  @NonNull
  public final TextView confirmedList;

  @NonNull
  public final TextView declineList;

  @NonNull
  public final TextView displayEventAdress;

  @NonNull
  public final TextView displayEventNotes;

  @NonNull
  public final TextView eventAdress;

  @NonNull
  public final TextView eventArriveTime;

  @NonNull
  public final TextView eventFullDate;

  @NonNull
  public final TextView eventLocation;

  @NonNull
  public final ImageView eventMapView;

  @NonNull
  public final TextView eventStartEnd;

  @NonNull
  public final TextView games;

  @NonNull
  public final View headerLineDivider;

  @NonNull
  public final ImageView imageViewCalendar;

  @NonNull
  public final ImageView imageViewConfirmed;

  @NonNull
  public final ImageView imageViewDecline;

  @NonNull
  public final ImageView imageViewGps;

  @NonNull
  public final ImageView imageViewLineUp;

  @NonNull
  public final ImageView imageViewMayBe;

  @NonNull
  public final ImageView imageViewOpponents;

  @NonNull
  public final ImageView imageViewTime;

  @NonNull
  public final TextView lineUp;

  @NonNull
  public final Button lineUpButton;

  @NonNull
  public final View lineUpDivider;

  @NonNull
  public final TextView lineUpHeader;

  @NonNull
  public final View locationLineDivider;

  @NonNull
  public final TextView mayBeList;

  @NonNull
  public final TextView noteExplicit;

  @NonNull
  public final View noteLineDivider;

  @NonNull
  public final TextView opponents;

  @NonNull
  public final View opponentsDivider;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final View timeLineDivider;

  protected FragmentDisplayGameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView confirmationHeader, TextView confirmedList, TextView declineList,
      TextView displayEventAdress, TextView displayEventNotes, TextView eventAdress,
      TextView eventArriveTime, TextView eventFullDate, TextView eventLocation,
      ImageView eventMapView, TextView eventStartEnd, TextView games, View headerLineDivider,
      ImageView imageViewCalendar, ImageView imageViewConfirmed, ImageView imageViewDecline,
      ImageView imageViewGps, ImageView imageViewLineUp, ImageView imageViewMayBe,
      ImageView imageViewOpponents, ImageView imageViewTime, TextView lineUp, Button lineUpButton,
      View lineUpDivider, TextView lineUpHeader, View locationLineDivider, TextView mayBeList,
      TextView noteExplicit, View noteLineDivider, TextView opponents, View opponentsDivider,
      TextView textView10, View timeLineDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.confirmationHeader = confirmationHeader;
    this.confirmedList = confirmedList;
    this.declineList = declineList;
    this.displayEventAdress = displayEventAdress;
    this.displayEventNotes = displayEventNotes;
    this.eventAdress = eventAdress;
    this.eventArriveTime = eventArriveTime;
    this.eventFullDate = eventFullDate;
    this.eventLocation = eventLocation;
    this.eventMapView = eventMapView;
    this.eventStartEnd = eventStartEnd;
    this.games = games;
    this.headerLineDivider = headerLineDivider;
    this.imageViewCalendar = imageViewCalendar;
    this.imageViewConfirmed = imageViewConfirmed;
    this.imageViewDecline = imageViewDecline;
    this.imageViewGps = imageViewGps;
    this.imageViewLineUp = imageViewLineUp;
    this.imageViewMayBe = imageViewMayBe;
    this.imageViewOpponents = imageViewOpponents;
    this.imageViewTime = imageViewTime;
    this.lineUp = lineUp;
    this.lineUpButton = lineUpButton;
    this.lineUpDivider = lineUpDivider;
    this.lineUpHeader = lineUpHeader;
    this.locationLineDivider = locationLineDivider;
    this.mayBeList = mayBeList;
    this.noteExplicit = noteExplicit;
    this.noteLineDivider = noteLineDivider;
    this.opponents = opponents;
    this.opponentsDivider = opponentsDivider;
    this.textView10 = textView10;
    this.timeLineDivider = timeLineDivider;
  }

  @NonNull
  public static FragmentDisplayGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_display_game, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDisplayGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDisplayGameBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_display_game, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDisplayGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_display_game, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDisplayGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDisplayGameBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_display_game, null, false, component);
  }

  public static FragmentDisplayGameBinding bind(@NonNull View view) {
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
  public static FragmentDisplayGameBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDisplayGameBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_display_game);
  }
}
