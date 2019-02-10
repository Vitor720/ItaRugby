package com.ddapps.itarugby;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010(\u001a\u00020)H\u0002J\u001c\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020)H\u0016J\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J \u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010>H\u0016J \u0010?\u001a\u00020)2\u0006\u0010<\u001a\u00020=2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010>H\u0016J\b\u0010@\u001a\u00020)H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006A"}, d2 = {"Lcom/ddapps/itarugby/AgendaFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/wangjie/rapidfloatingactionbutton/contentimpl/labellist/RapidFloatingActionContentLabelList$OnRapidFloatingActionContentLabelListListener;", "", "Lcom/github/fabtransitionactivity/SheetLayout$OnFabAnimationEndListener;", "()V", "agendaRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "getAgendaRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "setAgendaRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "binding", "Lcom/ddapps/itarugby/databinding/FragmentAgendaBinding;", "getBinding", "()Lcom/ddapps/itarugby/databinding/FragmentAgendaBinding;", "setBinding", "(Lcom/ddapps/itarugby/databinding/FragmentAgendaBinding;)V", "currentTime", "Ljava/util/Date;", "dataBase", "Lcom/google/firebase/firestore/FirebaseFirestore;", "fabContent", "Lcom/wangjie/rapidfloatingactionbutton/contentimpl/labellist/RapidFloatingActionContentLabelList;", "getFabContent", "()Lcom/wangjie/rapidfloatingactionbutton/contentimpl/labellist/RapidFloatingActionContentLabelList;", "setFabContent", "(Lcom/wangjie/rapidfloatingactionbutton/contentimpl/labellist/RapidFloatingActionContentLabelList;)V", "rfaBtn", "Lcom/wangjie/rapidfloatingactionbutton/RapidFloatingActionButton;", "rfaLayout", "Lcom/wangjie/rapidfloatingactionbutton/RapidFloatingActionLayout;", "rfabHelper", "Lcom/wangjie/rapidfloatingactionbutton/RapidFloatingActionHelper;", "sheetLayout", "Lcom/github/fabtransitionactivity/SheetLayout;", "getSheetLayout", "()Lcom/github/fabtransitionactivity/SheetLayout;", "setSheetLayout", "(Lcom/github/fabtransitionactivity/SheetLayout;)V", "loadEvents", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFabAnimationEnd", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRFACItemIconClick", "position", "", "Lcom/wangjie/rapidfloatingactionbutton/contentimpl/labellist/RFACLabelItem;", "onRFACItemLabelClick", "onResume", "app_debug"})
public final class AgendaFragment extends androidx.fragment.app.Fragment implements com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList.OnRapidFloatingActionContentLabelListListener<java.lang.Object>, com.github.fabtransitionactivity.SheetLayout.OnFabAnimationEndListener {
    @org.jetbrains.annotations.NotNull()
    public com.ddapps.itarugby.databinding.FragmentAgendaBinding binding;
    private final com.google.firebase.firestore.FirebaseFirestore dataBase = null;
    private final java.util.Date currentTime = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView agendaRecycler;
    private com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout rfaLayout;
    private com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton rfaBtn;
    private com.wangjie.rapidfloatingactionbutton.RapidFloatingActionHelper rfabHelper;
    @org.jetbrains.annotations.NotNull()
    public com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList fabContent;
    @org.jetbrains.annotations.NotNull()
    public com.github.fabtransitionactivity.SheetLayout sheetLayout;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ddapps.itarugby.databinding.FragmentAgendaBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.ddapps.itarugby.databinding.FragmentAgendaBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getAgendaRecycler() {
        return null;
    }
    
    public final void setAgendaRecycler(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList getFabContent() {
        return null;
    }
    
    public final void setFabContent(@org.jetbrains.annotations.NotNull()
    com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.fabtransitionactivity.SheetLayout getSheetLayout() {
        return null;
    }
    
    public final void setSheetLayout(@org.jetbrains.annotations.NotNull()
    com.github.fabtransitionactivity.SheetLayout p0) {
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
    
    private final void loadEvents() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onRFACItemLabelClick(int position, @org.jetbrains.annotations.Nullable()
    com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RFACLabelItem<java.lang.Object> item) {
    }
    
    @java.lang.Override()
    public void onRFACItemIconClick(int position, @org.jetbrains.annotations.Nullable()
    com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RFACLabelItem<java.lang.Object> item) {
    }
    
    @java.lang.Override()
    public void onFabAnimationEnd() {
    }
    
    public AgendaFragment() {
        super();
    }
}