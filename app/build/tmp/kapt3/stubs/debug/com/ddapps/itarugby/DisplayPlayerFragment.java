package com.ddapps.itarugby;

import java.lang.System;

/**
 * *
 * *
 * * Picasso não carrega bem imagens jpg
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/ddapps/itarugby/DisplayPlayerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ddapps/itarugby/databinding/FragmentDisplayPlayerBinding;", "getBinding", "()Lcom/ddapps/itarugby/databinding/FragmentDisplayPlayerBinding;", "setBinding", "(Lcom/ddapps/itarugby/databinding/FragmentDisplayPlayerBinding;)V", "dataBase", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getDataBase", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setDataBase", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "player", "Lcom/ddapps/itarugby/models/Players;", "getPlayer", "()Lcom/ddapps/itarugby/models/Players;", "setPlayer", "(Lcom/ddapps/itarugby/models/Players;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "app_debug"})
public final class DisplayPlayerFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.firestore.FirebaseFirestore dataBase;
    @org.jetbrains.annotations.NotNull()
    private com.ddapps.itarugby.models.Players player;
    @org.jetbrains.annotations.NotNull()
    public com.ddapps.itarugby.databinding.FragmentDisplayPlayerBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getDataBase() {
        return null;
    }
    
    public final void setDataBase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ddapps.itarugby.models.Players getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.models.Players p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ddapps.itarugby.databinding.FragmentDisplayPlayerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.databinding.FragmentDisplayPlayerBinding p0) {
    }
    
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
    
    public DisplayPlayerFragment() {
        super();
    }
}