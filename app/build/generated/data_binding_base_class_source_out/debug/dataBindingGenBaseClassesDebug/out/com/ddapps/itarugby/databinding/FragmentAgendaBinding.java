package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.fabtransitionactivity.SheetLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAgendaBinding extends ViewDataBinding {
  @NonNull
  public final RapidFloatingActionButton agendaRfab;

  @NonNull
  public final RapidFloatingActionLayout agendaRfal;

  @NonNull
  public final SheetLayout bottomSheet;

  @NonNull
  public final RecyclerView recyclerViewAgenda;

  @NonNull
  public final FloatingActionButton trasitionFab;

  protected FragmentAgendaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RapidFloatingActionButton agendaRfab, RapidFloatingActionLayout agendaRfal,
      SheetLayout bottomSheet, RecyclerView recyclerViewAgenda, FloatingActionButton trasitionFab) {
    super(_bindingComponent, _root, _localFieldCount);
    this.agendaRfab = agendaRfab;
    this.agendaRfal = agendaRfal;
    this.bottomSheet = bottomSheet;
    this.recyclerViewAgenda = recyclerViewAgenda;
    this.trasitionFab = trasitionFab;
  }

  @NonNull
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_agenda, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAgendaBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_agenda, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_agenda, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAgendaBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_agenda, null, false, component);
  }

  public static FragmentAgendaBinding bind(@NonNull View view) {
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
  public static FragmentAgendaBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAgendaBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_agenda);
  }
}
