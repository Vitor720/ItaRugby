package com.ddapps.itarugby.pickers;

import java.lang.System;

/**
 * * Classe que mostra o Calendário
 * * Não está colocando dois digitos para minutos.
 * * Se selecionar 16:05 vai aparecer 16:5
 * ***Refazer***
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ddapps/itarugby/pickers/DatePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "calendar", "Ljava/util/Calendar;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "", "view", "Landroid/widget/DatePicker;", "year", "", "month", "day", "app_debug"})
public final class DatePickerFragment extends androidx.fragment.app.DialogFragment implements android.app.DatePickerDialog.OnDateSetListener {
    private java.util.Calendar calendar;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.NotNull()
    android.widget.DatePicker view, int year, int month, int day) {
    }
    
    public DatePickerFragment() {
        super();
    }
}