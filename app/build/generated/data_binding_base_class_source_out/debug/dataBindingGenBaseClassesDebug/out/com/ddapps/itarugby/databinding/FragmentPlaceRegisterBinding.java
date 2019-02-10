package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;

public abstract class FragmentPlaceRegisterBinding extends ViewDataBinding {
  @NonNull
  public final AutoCompleteTextView searchLocation;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  protected FragmentPlaceRegisterBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AutoCompleteTextView searchLocation, TextInputLayout textInputLayout2,
      TextInputLayout textInputLayout3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.searchLocation = searchLocation;
    this.textInputLayout2 = textInputLayout2;
    this.textInputLayout3 = textInputLayout3;
  }

  @NonNull
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPlaceRegisterBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_place_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPlaceRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPlaceRegisterBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_place_register, null, false, component);
  }

  public static FragmentPlaceRegisterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPlaceRegisterBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPlaceRegisterBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_place_register);
  }
}
