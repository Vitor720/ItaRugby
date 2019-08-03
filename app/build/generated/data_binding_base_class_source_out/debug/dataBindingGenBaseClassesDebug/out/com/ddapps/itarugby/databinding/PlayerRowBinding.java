package com.ddapps.itarugby.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PlayerRowBinding extends ViewDataBinding {
  @NonNull
  public final CircularImageView playerImage;

  @NonNull
  public final LinearLayout playerLayout;

  @NonNull
  public final TextView playerName;

  @NonNull
  public final TextView textView2;

  protected PlayerRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircularImageView playerImage, LinearLayout playerLayout, TextView playerName,
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

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.player_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PlayerRowBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.player_row, root, attachToRoot, component);
  }

  @NonNull
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.player_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PlayerRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PlayerRowBinding>inflateInternal(inflater, com.ddapps.itarugby.R.layout.player_row, null, false, component);
  }

  public static PlayerRowBinding bind(@NonNull View view) {
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
  public static PlayerRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (PlayerRowBinding)bind(component, view, com.ddapps.itarugby.R.layout.player_row);
  }
}
