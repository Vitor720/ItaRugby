package com.ddapps.itarugby;

import java.lang.System;

/**
 * @author Vitor Vieira
 * * Trocar  para um spinner  de dois digitos para melhorar o UI.
 * *
 * ***Refazer Algumas Coisas***
 * * Caso seja criado um novo evento, se houver outro criado para mesma data, o novo irá substituir o antigo.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020-H\u0002J\u0012\u00101\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010:\u001a\u00020-H\u0016J\b\u0010;\u001a\u00020-H\u0003J\b\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u00020-H\u0002J\b\u0010>\u001a\u00020-H\u0002J\b\u0010?\u001a\u00020-H\u0002J\b\u0010@\u001a\u00020-H\u0002J\b\u0010A\u001a\u00020-H\u0002J\b\u0010B\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/ddapps/itarugby/NewEventFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addEventButton", "Lcom/dd/CircularProgressButton;", "arriveEarlyTimePicker", "Lcom/ddapps/itarugby/pickers/ArriveEarlyTimePicker;", "binding", "Lcom/ddapps/itarugby/databinding/NewEventFragmentBinding;", "getBinding", "()Lcom/ddapps/itarugby/databinding/NewEventFragmentBinding;", "setBinding", "(Lcom/ddapps/itarugby/databinding/NewEventFragmentBinding;)V", "dataBase", "Lcom/google/firebase/firestore/FirebaseFirestore;", "dateButton", "Lcom/google/android/material/textfield/TextInputEditText;", "event", "Lcom/ddapps/itarugby/models/Event;", "getEvent", "()Lcom/ddapps/itarugby/models/Event;", "setEvent", "(Lcom/ddapps/itarugby/models/Event;)V", "gameOpponents", "Lcom/rengwuxian/materialedittext/MaterialAutoCompleteTextView;", "getGameOpponents", "()Lcom/rengwuxian/materialedittext/MaterialAutoCompleteTextView;", "setGameOpponents", "(Lcom/rengwuxian/materialedittext/MaterialAutoCompleteTextView;)V", "gamesQty", "", "", "opponentsDisplay", "", "places", "Lcom/ddapps/itarugby/models/PLACES;", "placesButton", "Lcom/weiwangcn/betterspinner/library/material/MaterialBetterSpinner;", "placesDisplay", "secondTimePicker", "Lcom/ddapps/itarugby/pickers/SecondTimePickerFragment;", "timeButton", "timePicker", "Lcom/ddapps/itarugby/pickers/TimePickerFragment;", "clearFields", "", "getOpponents", "getPlaces", "hideOpponentsSpinner", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "setData", "showFiveOpponents", "showFourOpponents", "showOneOpponent", "showOpponents", "showSixOpponents", "showTreeOpponents", "showTwoOpponents", "app_debug"})
public final class NewEventFragment extends androidx.fragment.app.Fragment {
    private com.ddapps.itarugby.pickers.TimePickerFragment timePicker;
    private com.ddapps.itarugby.pickers.SecondTimePickerFragment secondTimePicker;
    private com.ddapps.itarugby.pickers.ArriveEarlyTimePicker arriveEarlyTimePicker;
    private final java.util.List<java.lang.String> gamesQty = null;
    @org.jetbrains.annotations.NotNull()
    public com.rengwuxian.materialedittext.MaterialAutoCompleteTextView gameOpponents;
    private java.util.List<com.ddapps.itarugby.models.PLACES> places;
    private final java.util.List<java.lang.String> placesDisplay = null;
    private final java.util.List<java.lang.String> opponentsDisplay = null;
    private com.dd.CircularProgressButton addEventButton;
    @org.jetbrains.annotations.NotNull()
    public com.ddapps.itarugby.databinding.NewEventFragmentBinding binding;
    private com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner placesButton;
    private com.google.android.material.textfield.TextInputEditText timeButton;
    private com.google.android.material.textfield.TextInputEditText dateButton;
    private com.google.firebase.firestore.FirebaseFirestore dataBase;
    @org.jetbrains.annotations.NotNull()
    public com.ddapps.itarugby.models.Event event;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rengwuxian.materialedittext.MaterialAutoCompleteTextView getGameOpponents() {
        return null;
    }
    
    public final void setGameOpponents(@org.jetbrains.annotations.NotNull()
    com.rengwuxian.materialedittext.MaterialAutoCompleteTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ddapps.itarugby.databinding.NewEventFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.databinding.NewEventFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ddapps.itarugby.models.Event getEvent() {
        return null;
    }
    
    public final void setEvent(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.models.Event p0) {
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
    
    private final void clearFields() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void setData() {
    }
    
    private final void getOpponents() {
    }
    
    private final void getPlaces() {
    }
    
    private final void showOpponents() {
    }
    
    private final void showOneOpponent() {
    }
    
    private final void showTwoOpponents() {
    }
    
    private final void showTreeOpponents() {
    }
    
    private final void showFourOpponents() {
    }
    
    private final void showFiveOpponents() {
    }
    
    private final void showSixOpponents() {
    }
    
    private final void hideOpponentsSpinner() {
    }
    
    public NewEventFragment() {
        super();
    }
}