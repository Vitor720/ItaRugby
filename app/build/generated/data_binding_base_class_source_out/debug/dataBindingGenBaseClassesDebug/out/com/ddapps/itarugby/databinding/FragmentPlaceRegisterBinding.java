package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.maps.MapView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlaceRegisterBinding extends ViewDataBinding {
  @NonNull
  public final Button mapMarkerButton;

  @NonNull
  public final TextInputEditText placeDetails;

  @NonNull
  public final TextInputEditText placesName;

  @NonNull
  public final MapView registerMap;

  @NonNull
  public final Button registerPlaceButton;

  @NonNull
  public final TextInputEditText searchLocation;

  protected FragmentPlaceRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button mapMarkerButton, TextInputEditText placeDetails, TextInputEditText placesName,
      MapView registerMap, Button registerPlaceButton, TextInputEditText searchLocation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mapMarkerButton = mapMarkerButton;
    this.placeDetails = placeDetails;
    this.placesName = placesName;
    this.registerMap = registerMap;
    this.registerPlaceButton = registerPlaceButton;
    this.searchLocation = searchLocation;
  }

  @NonNull
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceRegisterBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_place_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceRegisterBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.fragment_place_register, null, false, component);
  }

  public static FragmentPlaceRegisterBinding bind(@NonNull View view) {
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
  public static FragmentPlaceRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlaceRegisterBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_place_register);
  }
}
