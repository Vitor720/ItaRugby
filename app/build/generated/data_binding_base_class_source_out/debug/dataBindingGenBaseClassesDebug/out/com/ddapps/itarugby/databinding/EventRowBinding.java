package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class EventRowBinding extends ViewDataBinding {
  @NonNull
  public final Button confirmButton;

  @NonNull
  public final Button declineButton;

  @NonNull
  public final TextView eventDate;

  @NonNull
  public final ImageView eventFlag;

  @NonNull
  public final TextView eventName;

  @NonNull
  public final CardView eventRowCardView;

  @NonNull
  public final TextView eventTime;

  @NonNull
  public final ImageView mapView;

  @NonNull
  public final Button maybeButton;

  @NonNull
  public final TextView placeName;

  protected EventRowBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button confirmButton, Button declineButton, TextView eventDate,
      ImageView eventFlag, TextView eventName, CardView eventRowCardView, TextView eventTime,
      ImageView mapView, Button maybeButton, TextView placeName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.confirmButton = confirmButton;
    this.declineButton = declineButton;
    this.eventDate = eventDate;
    this.eventFlag = eventFlag;
    this.eventName = eventName;
    this.eventRowCardView = eventRowCardView;
    this.eventTime = eventTime;
    this.mapView = mapView;
    this.maybeButton = maybeButton;
    this.placeName = placeName;
  }

  @NonNull
  public static EventRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static EventRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<EventRowBinding>inflate(inflater, com.ddapps.itarugby.R.layout.event_row, root, attachToRoot, component);
  }

  @NonNull
  public static EventRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static EventRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<EventRowBinding>inflate(inflater, com.ddapps.itarugby.R.layout.event_row, null, false, component);
  }

  public static EventRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static EventRowBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (EventRowBinding)bind(component, view, com.ddapps.itarugby.R.layout.event_row);
  }
}
