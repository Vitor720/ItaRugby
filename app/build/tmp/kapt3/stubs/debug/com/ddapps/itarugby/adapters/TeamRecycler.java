package com.ddapps.itarugby.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/ddapps/itarugby/adapters/TeamRecycler;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ddapps/itarugby/adapters/TeamRecycler$TemViewHolder;", "playerList", "", "Lcom/ddapps/itarugby/models/Players;", "dataBase", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Ljava/util/List;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "getDataBase", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "getPlayerList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TemViewHolder", "app_debug"})
public final class TeamRecycler extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ddapps.itarugby.adapters.TeamRecycler.TemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ddapps.itarugby.models.Players> playerList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore dataBase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ddapps.itarugby.adapters.TeamRecycler.TemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.adapters.TeamRecycler.TemViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ddapps.itarugby.models.Players> getPlayerList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getDataBase() {
        return null;
    }
    
    public TeamRecycler(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ddapps.itarugby.models.Players> playerList, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore dataBase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ddapps/itarugby/adapters/TeamRecycler$TemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ddapps/itarugby/databinding/PlayerRowBinding;", "(Lcom/ddapps/itarugby/adapters/TeamRecycler;Lcom/ddapps/itarugby/databinding/PlayerRowBinding;)V", "getBinding", "()Lcom/ddapps/itarugby/databinding/PlayerRowBinding;", "playerName", "Landroid/widget/TextView;", "getPlayerName", "()Landroid/widget/TextView;", "app_debug"})
    public final class TemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView playerName = null;
        @org.jetbrains.annotations.NotNull()
        private final com.ddapps.itarugby.databinding.PlayerRowBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPlayerName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ddapps.itarugby.databinding.PlayerRowBinding getBinding() {
            return null;
        }
        
        public TemViewHolder(@org.jetbrains.annotations.NotNull()
        com.ddapps.itarugby.databinding.PlayerRowBinding binding) {
            super(null);
        }
    }
}