package com.ddapps.itarugby;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0003J\b\u0010\u0014\u001a\u00020\u0012H\u0003J\b\u0010\u0015\u001a\u00020\u0012H\u0003J\b\u0010\u0016\u001a\u00020\u0012H\u0003J\b\u0010\u0017\u001a\u00020\u0012H\u0003J\b\u0010\u0018\u001a\u00020\u0012H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/ddapps/itarugby/DisplayGameFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ddapps/itarugby/databinding/FragmentDisplayGameBinding;", "dataBase", "Lcom/google/firebase/firestore/FirebaseFirestore;", "event", "Lcom/ddapps/itarugby/models/Event;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "showFiveOpponents", "showFourOpponents", "showOneOpponent", "showSixOpponents", "showTreeOpponents", "showTwoOpponents", "app_debug"})
public final class DisplayGameFragment extends androidx.fragment.app.Fragment {
    private com.ddapps.itarugby.databinding.FragmentDisplayGameBinding binding;
    private com.google.firebase.firestore.FirebaseFirestore dataBase;
    private com.ddapps.itarugby.models.Event event;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showOneOpponent() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showTwoOpponents() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showTreeOpponents() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showFourOpponents() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showFiveOpponents() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showSixOpponents() {
    }
    
    public DisplayGameFragment() {
        super();
    }
}