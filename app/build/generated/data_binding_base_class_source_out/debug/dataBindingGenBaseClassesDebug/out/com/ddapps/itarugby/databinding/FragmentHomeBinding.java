package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.fabtransitionactivity.SheetLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final RapidFloatingActionButton activityMainRfab;

  @NonNull
  public final RapidFloatingActionLayout activityMainRfal;

  @NonNull
  public final SheetLayout bottomSheet;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final RecyclerView recyclerViewHome;

  @NonNull
  public final FloatingActionButton trasitionFab;

  protected FragmentHomeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RapidFloatingActionButton activityMainRfab,
      RapidFloatingActionLayout activityMainRfal, SheetLayout bottomSheet,
      ConstraintLayout linearLayout, RecyclerView recyclerViewHome,
      FloatingActionButton trasitionFab) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityMainRfab = activityMainRfab;
    this.activityMainRfal = activityMainRfal;
    this.bottomSheet = bottomSheet;
    this.linearLayout = linearLayout;
    this.recyclerViewHome = recyclerViewHome;
    this.trasitionFab = trasitionFab;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentHomeBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentHomeBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentHomeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentHomeBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_home);
  }
}
