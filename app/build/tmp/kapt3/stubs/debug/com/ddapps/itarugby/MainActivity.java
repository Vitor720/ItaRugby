package com.ddapps.itarugby;

import java.lang.System;

/**
 * @author: Vitor Vieira
 * * @version: 1.6.1
 * *
 * *Aplicativo para gerenciamento de equipes de esporte
 * *Navegação do aplicativo segue os padrões do Android JetPack, apenas uma activity.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ddapps/itarugby/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "accessToken", "Lcom/facebook/AccessToken;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onSupportNavigateUp", "", "secureLogin", "setActionBarTitle", "title", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private com.facebook.AccessToken accessToken;
    private com.google.firebase.auth.FirebaseAuth auth;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setActionBarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void secureLogin() {
    }
    
    public MainActivity() {
        super();
    }
}