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

public abstract class FragmentTeamBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerViewTeam;

  protected FragmentTeamBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView recyclerViewTeam) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerViewTeam = recyclerViewTeam;
  }

  @NonNull
  public static FragmentTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTeamBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_team, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTeamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTeamBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_team, null, false, component);
  }

  public static FragmentTeamBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTeamBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTeamBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_team);
  }
}
