package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class PlayerRowBinding extends ViewDataBinding {
  @NonNull
  public final ImageView playerImage;

  @NonNull
  public final LinearLayout playerLayout;

  @NonNull
  public final TextView playerName;

  @NonNull
  public final TextView textView2;

  protected PlayerRowBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView playerImage, LinearLayout playerLayout, TextView playerName,
      TextView textView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.playerImage = playerImage;
    this.playerLayout = playerLayout;
    this.playerName = playerName;
    this.textView2 = textView2;
  }

  @NonNull
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PlayerRowBinding>inflate(inflater, com.ddapps.itarugby.R.layout.player_row, root, attachToRoot, component);
  }

  @NonNull
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PlayerRowBinding>inflate(inflater, com.ddapps.itarugby.R.layout.player_row, null, false, component);
  }

  public static PlayerRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PlayerRowBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PlayerRowBinding)bind(component, view, com.ddapps.itarugby.R.layout.player_row);
  }
}
