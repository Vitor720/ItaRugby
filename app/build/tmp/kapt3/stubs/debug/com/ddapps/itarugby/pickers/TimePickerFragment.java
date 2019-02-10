package com.ddapps.itarugby.pickers;

import java.lang.System;

/**
 * * Classe que mostra o Relógio
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017\u00a8\u0006\u000f"}, d2 = {"Lcom/ddapps/itarugby/pickers/TimePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onTimeSet", "", "view", "Landroid/widget/TimePicker;", "hourOfDay", "", "minute", "app_debug"})
public final class TimePickerFragment extends androidx.fragment.app.DialogFragment implements android.app.TimePickerDialog.OnTimeSetListener {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.NotNull()
    android.widget.TimePicker view, int hourOfDay, int minute) {
    }
    
    public TimePickerFragment() {
        super();
    }
}