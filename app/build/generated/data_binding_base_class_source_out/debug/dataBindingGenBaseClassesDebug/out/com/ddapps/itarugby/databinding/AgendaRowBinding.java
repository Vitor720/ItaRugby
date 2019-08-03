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

public abstract class AgendaRowBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout agendaRowLayout;

  @NonNull
  public final TextView eventDay;

  @NonNull
  public final TextView eventMonth;

  @NonNull
  public final TextView eventName;

  @NonNull
  public final TextView eventPlace;

  @NonNull
  public final TextView eventStartHour;

  @NonNull
  public final ImageView imageBackground;

  protected AgendaRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout agendaRowLayout, TextView eventDay, TextView eventMonth, TextView eventName,
      TextView eventPlace, TextView eventStartHour, ImageView imageBackground) {
    super(_bindingComponent, _root, _localFieldCount);
    this.agendaRowLayout = agendaRowLayout;
    this.eventDay = eventDay;
    this.eventMonth = eventMonth;
    this.eventName = eventName;
    this.eventPlace = eventPlace;
    this.eventStartHour = eventStartHour;
    this.imageBackground = imageBackground;
  }

  @NonNull
  public static AgendaRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.agenda_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AgendaRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AgendaRowBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.agenda_row, root, attachToRoot, component);
  }

  @NonNull
  public static AgendaRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.agenda_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AgendaRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AgendaRowBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.agenda_row, null, false, component);
  }

  public static AgendaRowBinding bind(@NonNull View view) {
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
  public static AgendaRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (AgendaRowBinding)bind(component, view, com.ddapps.itarugby.R.layout.agenda_row);
  }
}
