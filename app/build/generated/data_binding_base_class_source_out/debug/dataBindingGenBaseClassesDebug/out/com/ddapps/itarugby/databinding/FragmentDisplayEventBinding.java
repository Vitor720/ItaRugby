package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentDisplayEventBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout cardView;

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
  public final ImageView imageViewMayBe;

  @NonNull
  public final ImageView imageViewTime;

  @NonNull
  public final View locationLineDivider;

  @NonNull
  public final TextView mayBeList;

  @NonNull
  public final TextView noteExplicit;

  @NonNull
  public final View noteLineDivider;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final View timeLineDivider;

  protected FragmentDisplayEventBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout cardView, TextView confirmationHeader,
      TextView confirmedList, TextView declineList, TextView displayEventAdress,
      TextView displayEventNotes, TextView eventAdress, TextView eventArriveTime,
      TextView eventFullDate, TextView eventLocation, ImageView eventMapView,
      TextView eventStartEnd, View headerLineDivider, ImageView imageViewCalendar,
      ImageView imageViewConfirmed, ImageView imageViewDecline, ImageView imageViewGps,
      ImageView imageViewMayBe, ImageView imageViewTime, View locationLineDivider,
      TextView mayBeList, TextView noteExplicit, View noteLineDivider, TextView textView10,
      View timeLineDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
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
    this.headerLineDivider = headerLineDivider;
    this.imageViewCalendar = imageViewCalendar;
    this.imageViewConfirmed = imageViewConfirmed;
    this.imageViewDecline = imageViewDecline;
    this.imageViewGps = imageViewGps;
    this.imageViewMayBe = imageViewMayBe;
    this.imageViewTime = imageViewTime;
    this.locationLineDivider = locationLineDivider;
    this.mayBeList = mayBeList;
    this.noteExplicit = noteExplicit;
    this.noteLineDivider = noteLineDivider;
    this.textView10 = textView10;
    this.timeLineDivider = timeLineDivider;
  }

  @NonNull
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDisplayEventBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_display_event, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDisplayEventBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_display_event, null, false, component);
  }

  public static FragmentDisplayEventBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDisplayEventBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDisplayEventBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_display_event);
  }
}
