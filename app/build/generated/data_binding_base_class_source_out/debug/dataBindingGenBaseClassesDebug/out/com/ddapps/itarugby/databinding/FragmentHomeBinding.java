package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.fabtransitionactivity.SheetLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout;
import java.lang.Deprecated;
import java.lang.Object;

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

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RapidFloatingActionButton activityMainRfab, RapidFloatingActionLayout activityMainRfal,
      SheetLayout bottomSheet, ConstraintLayout linearLayout, RecyclerView recyclerViewHome,
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

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_home);
  }
}
