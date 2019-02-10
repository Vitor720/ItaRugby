package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.fabtransitionactivity.SheetLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout;

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

  protected FragmentAgendaBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RapidFloatingActionButton agendaRfab,
      RapidFloatingActionLayout agendaRfal, SheetLayout bottomSheet,
      RecyclerView recyclerViewAgenda, FloatingActionButton trasitionFab) {
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

  @NonNull
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAgendaBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_agenda, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAgendaBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_agenda, null, false, component);
  }

  public static FragmentAgendaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentAgendaBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentAgendaBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_agenda);
  }
}
