package com.ddapps.itarugby.adapters;

import java.lang.System;

/**
 * Recycler View class
 * * Ao clicar em um botão ele tem o fundo e a cor do texto a.
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rH\u0017J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u0000H\u0002J\u0014\u0010\u001c\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u0000H\u0002J\u0014\u0010\u001d\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u0000H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/ddapps/itarugby/adapters/EventViewRecycler;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ddapps/itarugby/adapters/EventViewRecycler$EventViewHolder;", "hereContext", "Landroid/content/Context;", "eventList", "", "Lcom/ddapps/itarugby/models/Event;", "database", "Lcom/google/firebase/firestore/FirebaseFirestore;", "userName", "", "screen_width", "", "screen_heigh", "(Landroid/content/Context;Ljava/util/List;Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;II)V", "getHereContext", "()Landroid/content/Context;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setConfirmed", "setDeclined", "setMayBe", "EventViewHolder", "app_debug"})
public final class EventViewRecycler extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ddapps.itarugby.adapters.EventViewRecycler.EventViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context hereContext = null;
    private final java.util.List<com.ddapps.itarugby.models.Event> eventList = null;
    private final com.google.firebase.firestore.FirebaseFirestore database = null;
    private final java.lang.String userName = null;
    private final int screen_width = 0;
    private final int screen_heigh = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ddapps.itarugby.adapters.EventViewRecycler.EventViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.adapters.EventViewRecycler.EventViewHolder holder, int position) {
    }
    
    private final void setConfirmed(com.ddapps.itarugby.adapters.EventViewRecycler.EventViewHolder holder) {
    }
    
    private final void setMayBe(com.ddapps.itarugby.adapters.EventViewRecycler.EventViewHolder holder) {
    }
    
    private final void setDeclined(com.ddapps.itarugby.adapters.EventViewRecycler.EventViewHolder holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getHereContext() {
        return null;
    }
    
    public EventViewRecycler(@org.jetbrains.annotations.NotNull()
    android.content.Context hereContext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ddapps.itarugby.models.Event> eventList, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore database, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, int screen_width, int screen_heigh) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b\'\u0010\fR\u001a\u0010(\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/ddapps/itarugby/adapters/EventViewRecycler$EventViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ddapps/itarugby/databinding/EventRowBinding;", "(Lcom/ddapps/itarugby/adapters/EventViewRecycler;Lcom/ddapps/itarugby/databinding/EventRowBinding;)V", "getBinding", "()Lcom/ddapps/itarugby/databinding/EventRowBinding;", "confirmButton", "Landroid/widget/Button;", "getConfirmButton", "()Landroid/widget/Button;", "setConfirmButton", "(Landroid/widget/Button;)V", "date", "Landroid/widget/TextView;", "getDate", "()Landroid/widget/TextView;", "setDate", "(Landroid/widget/TextView;)V", "declineButton", "getDeclineButton", "setDeclineButton", "eventRow", "Landroidx/cardview/widget/CardView;", "getEventRow", "()Landroidx/cardview/widget/CardView;", "setEventRow", "(Landroidx/cardview/widget/CardView;)V", "eventTime", "getEventTime", "setEventTime", "mapView", "Landroid/widget/ImageView;", "getMapView", "()Landroid/widget/ImageView;", "setMapView", "(Landroid/widget/ImageView;)V", "maybeButton", "getMaybeButton", "setMaybeButton", "name", "getName", "setName", "placeName", "getPlaceName", "setPlaceName", "app_debug"})
    public final class EventViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView eventRow;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView mapView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView placeName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView date;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button confirmButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button maybeButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button declineButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView eventTime;
        @org.jetbrains.annotations.NotNull()
        private final com.ddapps.itarugby.databinding.EventRowBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getEventRow() {
            return null;
        }
        
        public final void setEventRow(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMapView() {
            return null;
        }
        
        public final void setMapView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPlaceName() {
            return null;
        }
        
        public final void setPlaceName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getConfirmButton() {
            return null;
        }
        
        public final void setConfirmButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getMaybeButton() {
            return null;
        }
        
        public final void setMaybeButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getDeclineButton() {
            return null;
        }
        
        public final void setDeclineButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEventTime() {
            return null;
        }
        
        public final void setEventTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ddapps.itarugby.databinding.EventRowBinding getBinding() {
            return null;
        }
        
        public EventViewHolder(@org.jetbrains.annotations.NotNull()
        com.ddapps.itarugby.databinding.EventRowBinding binding) {
            super(null);
        }
    }
}