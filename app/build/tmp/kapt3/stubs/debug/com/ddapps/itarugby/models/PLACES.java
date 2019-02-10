package com.ddapps.itarugby.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/ddapps/itarugby/models/PLACES;", "", "()V", "place_name", "", "place_details", "geo_point", "Lcom/google/firebase/firestore/GeoPoint;", "placeAdress", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/firestore/GeoPoint;Ljava/lang/String;)V", "geoPoint", "getGeoPoint", "()Lcom/google/firebase/firestore/GeoPoint;", "setGeoPoint", "(Lcom/google/firebase/firestore/GeoPoint;)V", "getPlaceAdress", "()Ljava/lang/String;", "setPlaceAdress", "(Ljava/lang/String;)V", "placeDetails", "getPlaceDetails", "setPlaceDetails", "placeName", "getPlaceName", "setPlaceName", "toMap", "", "toString", "app_debug"})
public final class PLACES {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String placeAdress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String placeDetails;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.firestore.GeoPoint geoPoint;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String placeName;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceAdress() {
        return null;
    }
    
    public final void setPlaceAdress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceDetails() {
        return null;
    }
    
    public final void setPlaceDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.firestore.GeoPoint getGeoPoint() {
        return null;
    }
    
    public final void setGeoPoint(@org.jetbrains.annotations.Nullable()
    com.google.firebase.firestore.GeoPoint p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceName() {
        return null;
    }
    
    public final void setPlaceName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PLACES() {
        super();
    }
    
    public PLACES(@org.jetbrains.annotations.NotNull()
    java.lang.String place_name, @org.jetbrains.annotations.NotNull()
    java.lang.String place_details, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.GeoPoint geo_point, @org.jetbrains.annotations.NotNull()
    java.lang.String placeAdress) {
        super();
    }
}