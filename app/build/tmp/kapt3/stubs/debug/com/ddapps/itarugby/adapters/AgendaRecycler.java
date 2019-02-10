package com.ddapps.itarugby.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0017J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/ddapps/itarugby/adapters/AgendaRecycler;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ddapps/itarugby/adapters/AgendaRecycler$AgendaViewHolder;", "eventList", "", "Lcom/ddapps/itarugby/models/Event;", "dataBase", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Ljava/util/List;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "getDataBase", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "getEventList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AgendaViewHolder", "app_debug"})
public final class AgendaRecycler extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ddapps.itarugby.adapters.AgendaRecycler.AgendaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ddapps.itarugby.models.Event> eventList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore dataBase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ddapps.itarugby.adapters.AgendaRecycler.AgendaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.adapters.AgendaRecycler.AgendaViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ddapps.itarugby.models.Event> getEventList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getDataBase() {
        return null;
    }
    
    public AgendaRecycler(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ddapps.itarugby.models.Event> eventList, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore dataBase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/ddapps/itarugby/adapters/AgendaRecycler$AgendaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ddapps/itarugby/databinding/AgendaRowBinding;", "(Lcom/ddapps/itarugby/adapters/AgendaRecycler;Lcom/ddapps/itarugby/databinding/AgendaRowBinding;)V", "agendaRow", "Landroid/widget/LinearLayout;", "getAgendaRow", "()Landroid/widget/LinearLayout;", "setAgendaRow", "(Landroid/widget/LinearLayout;)V", "getBinding", "()Lcom/ddapps/itarugby/databinding/AgendaRowBinding;", "eventDay", "Landroid/widget/TextView;", "getEventDay", "()Landroid/widget/TextView;", "setEventDay", "(Landroid/widget/TextView;)V", "eventMonth", "getEventMonth", "setEventMonth", "eventName", "getEventName", "setEventName", "eventPlace", "getEventPlace", "setEventPlace", "eventStartHour", "getEventStartHour", "setEventStartHour", "app_debug"})
    public final class AgendaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView eventDay;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView eventMonth;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView eventStartHour;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView eventName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView eventPlace;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout agendaRow;
        @org.jetbrains.annotations.NotNull()
        private final com.ddapps.itarugby.databinding.AgendaRowBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEventDay() {
            return null;
        }
        
        public final void setEventDay(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEventMonth() {
            return null;
        }
        
        public final void setEventMonth(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEventStartHour() {
            return null;
        }
        
        public final void setEventStartHour(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEventName() {
            return null;
        }
        
        public final void setEventName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEventPlace() {
            return null;
        }
        
        public final void setEventPlace(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getAgendaRow() {
            return null;
        }
        
        public final void setAgendaRow(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ddapps.itarugby.databinding.AgendaRowBinding getBinding() {
            return null;
        }
        
        public AgendaViewHolder(@org.jetbrains.annotations.NotNull()
        com.ddapps.itarugby.databinding.AgendaRowBinding binding) {
            super(null);
        }
    }
}