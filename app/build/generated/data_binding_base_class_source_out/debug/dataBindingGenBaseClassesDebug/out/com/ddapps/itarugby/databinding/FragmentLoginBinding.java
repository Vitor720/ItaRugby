package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.login.widget.LoginButton;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout LoginLayout;

  @NonNull
  public final LoginButton facebookLoginButton;

  @NonNull
  public final ImageView firstLogoImageView;

  protected FragmentLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout LoginLayout, LoginButton facebookLoginButton,
      ImageView firstLogoImageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LoginLayout = LoginLayout;
    this.facebookLoginButton = facebookLoginButton;
    this.firstLogoImageView = firstLogoImageView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLoginBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLoginBinding>inflate(inflater, com.ddapps.itarugby.R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentLoginBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentLoginBinding)bind(component, view, com.ddapps.itarugby.R.layout.fragment_login);
  }
}
