package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

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
  public final TextView eventAddress;

  @NonNull
  public final TextView eventArriveTime;

  @NonNull
  public final TextView eventDate;

  @NonNull
  public final TextView eventDescription;

  @NonNull
  public final ImageView eventImageHeader;

  @NonNull
  public final LinearLayout eventMap;

  @NonNull
  public final ImageView eventMapView;

  @NonNull
  public final ImageView imageViewConfirmed;

  @NonNull
  public final ImageView imageViewDecline;

  @NonNull
  public final ImageView imageViewMayBe;

  @NonNull
  public final LinearLayout lytAddress;

  @NonNull
  public final LinearLayout lytDate;

  @NonNull
  public final LinearLayout lytDistance;

  @NonNull
  public final LinearLayout lytWebsite;

  @NonNull
  public final TextView mayBeList;

  @NonNull
  public final TextView placeName;

  @NonNull
  public final TextView textView2;

  protected FragmentDisplayEventBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout cardView, TextView confirmationHeader, TextView confirmedList,
      TextView declineList, TextView eventAddress, TextView eventArriveTime, TextView eventDate,
      TextView eventDescription, ImageView eventImageHeader, LinearLayout eventMap,
      ImageView eventMapView, ImageView imageViewConfirmed, ImageView imageViewDecline,
      ImageView imageViewMayBe, LinearLayout lytAddress, LinearLayout lytDate,
      LinearLayout lytDistance, LinearLayout lytWebsite, TextView mayBeList, TextView placeName,
      TextView textView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.confirmationHeader = confirmationHeader;
    this.confirmedList = confirmedList;
    this.declineList = declineList;
    this.eventAddress = eventAddress;
    this.eventArriveTime = eventArriveTime;
    this.eventDate = eventDate;
    this.eventDescription = eventDescription;
    this.eventImageHeader = eventImageHeader;
    this.eventMap = eventMap;
    this.eventMapView = eventMapView;
    this.imageViewConfirmed = imageViewConfirmed;
    this.imageViewDecline = imageViewDecline;
    this.imageViewMayBe = imageViewMayBe;
    this.lytAddress = lytAddress;
    this.lytDate = lytDate;
    this.lytDistance = lytDistance;
    this.lytWebsite = lytWebsite;
    this.mayBeList = mayBeList;
    this.placeName = placeName;
    this.textView2 = textView2;
  }

  @NonNull
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_display_event, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDisplayEventBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_display_event, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_display_event, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDisplayEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDisplayEventBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_display_event, null, false, component);
  }

  public static FragmentDisplayEventBinding bind(@NonNull View view) {
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
  public static FragmentDisplayEventBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDisplayEventBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_display_event);
  }
}
