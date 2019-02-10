package com.ddapps.itarugby.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b2\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002BW\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b&\u0010 \"\u0004\b\'\u0010\"R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"\u00a8\u0006?"}, d2 = {"Lcom/ddapps/itarugby/models/Players;", "", "()V", "name", "", "weight", "", "hight", "position", "gamesPlayed", "drillsAttended", "playerSince", "injured", "", "yellowCards", "redCards", "(Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;ZII)V", "activePlayer", "getActivePlayer", "()Ljava/lang/Boolean;", "setActivePlayer", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "born", "getBorn", "()Ljava/lang/String;", "setBorn", "(Ljava/lang/String;)V", "contact", "getContact", "setContact", "getDrillsAttended", "()Ljava/lang/Integer;", "setDrillsAttended", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGamesPlayed", "setGamesPlayed", "getHight", "setHight", "getInjured", "setInjured", "lastDrill", "getLastDrill", "setLastDrill", "getName", "setName", "photo", "getPhoto", "setPhoto", "getPlayerSince", "setPlayerSince", "getPosition", "setPosition", "getRedCards", "setRedCards", "uID", "getUID", "setUID", "getWeight", "setWeight", "getYellowCards", "setYellowCards", "app_debug"})
public final class Players {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String uID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer weight;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer hight;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String position;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer gamesPlayed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer drillsAttended;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String playerSince;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean injured;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer yellowCards;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer redCards;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean activePlayer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastDrill;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String photo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String born;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String contact;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUID() {
        return null;
    }
    
    public final void setUID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWeight() {
        return null;
    }
    
    public final void setWeight(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHight() {
        return null;
    }
    
    public final void setHight(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosition() {
        return null;
    }
    
    public final void setPosition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGamesPlayed() {
        return null;
    }
    
    public final void setGamesPlayed(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDrillsAttended() {
        return null;
    }
    
    public final void setDrillsAttended(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlayerSince() {
        return null;
    }
    
    public final void setPlayerSince(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getInjured() {
        return null;
    }
    
    public final void setInjured(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYellowCards() {
        return null;
    }
    
    public final void setYellowCards(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRedCards() {
        return null;
    }
    
    public final void setRedCards(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getActivePlayer() {
        return null;
    }
    
    public final void setActivePlayer(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastDrill() {
        return null;
    }
    
    public final void setLastDrill(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoto() {
        return null;
    }
    
    public final void setPhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBorn() {
        return null;
    }
    
    public final void setBorn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Players() {
        super();
    }
    
    public Players(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int weight, int hight, @org.jetbrains.annotations.NotNull()
    java.lang.String position, int gamesPlayed, int drillsAttended, @org.jetbrains.annotations.NotNull()
    java.lang.String playerSince, boolean injured, int yellowCards, int redCards) {
        super();
    }
}