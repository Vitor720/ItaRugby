package com.ddapps.itarugby.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\tJ\u001e\u0010b\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR.\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b\'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001e\u0010.\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0017\"\u0004\bA\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR\u001c\u0010D\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR.\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u0010\u0019R\u001c\u0010J\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001c\u0010M\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\u001c\u0010P\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\u001c\u0010S\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u000eR\u001c\u0010V\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR \u0010Y\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010_\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\f\"\u0004\ba\u0010\u000e\u00a8\u0006f"}, d2 = {"Lcom/ddapps/itarugby/models/Event;", "", "()V", "name", "", "gameNotes", "canceled", "", "date", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "arriveEarly", "getArriveEarly", "()Ljava/lang/String;", "setArriveEarly", "(Ljava/lang/String;)V", "getCanceled", "()Z", "setCanceled", "(Z)V", "confirmed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getConfirmed", "()Ljava/util/ArrayList;", "setConfirmed", "(Ljava/util/ArrayList;)V", "getDate", "setDate", "declined", "getDeclined", "setDeclined", "docID", "getDocID", "setDocID", "endTime", "getEndTime", "setEndTime", "fifthOpponent", "getFifthOpponent", "setFifthOpponent", "firstOpponent", "getFirstOpponent", "setFirstOpponent", "forthOpponent", "getForthOpponent", "setForthOpponent", "gameEvent", "getGameEvent", "()Ljava/lang/Boolean;", "setGameEvent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getGameNotes", "setGameNotes", "gamesQty", "getGamesQty", "setGamesQty", "location", "Lcom/ddapps/itarugby/models/PLACES;", "getLocation", "()Lcom/ddapps/itarugby/models/PLACES;", "setLocation", "(Lcom/ddapps/itarugby/models/PLACES;)V", "mayBe", "getMayBe", "setMayBe", "getName", "setName", "notes", "getNotes", "setNotes", "opponents", "getOpponents", "setOpponents", "placeDetails", "getPlaceDetails", "setPlaceDetails", "secondOpponent", "getSecondOpponent", "setSecondOpponent", "sixthOpponent", "getSixthOpponent", "setSixthOpponent", "startTime", "getStartTime", "setStartTime", "thirdOpponent", "getThirdOpponent", "setThirdOpponent", "timeStamp", "Ljava/util/Date;", "getTimeStamp", "()Ljava/util/Date;", "setTimeStamp", "(Ljava/util/Date;)V", "userID", "getUserID", "setUserID", "addRest", "", "toMap", "", "app_debug"})
public final class Event {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String docID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date;
    @org.jetbrains.annotations.Nullable()
    private com.ddapps.itarugby.models.PLACES location;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String notes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String startTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String placeDetails;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String endTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.firebase.firestore.ServerTimestamp()
    private java.util.Date timeStamp;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> confirmed;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> mayBe;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> declined;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gamesQty;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> opponents;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String arriveEarly;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gameNotes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstOpponent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secondOpponent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thirdOpponent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String forthOpponent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fifthOpponent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sixthOpponent;
    private boolean canceled;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean gameEvent;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDocID() {
        return null;
    }
    
    public final void setDocID(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ddapps.itarugby.models.PLACES getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    com.ddapps.itarugby.models.PLACES p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserID() {
        return null;
    }
    
    public final void setUserID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    public final void setStartTime(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getEndTime() {
        return null;
    }
    
    public final void setEndTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getTimeStamp() {
        return null;
    }
    
    public final void setTimeStamp(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getConfirmed() {
        return null;
    }
    
    public final void setConfirmed(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getMayBe() {
        return null;
    }
    
    public final void setMayBe(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getDeclined() {
        return null;
    }
    
    public final void setDeclined(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGamesQty() {
        return null;
    }
    
    public final void setGamesQty(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getOpponents() {
        return null;
    }
    
    public final void setOpponents(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArriveEarly() {
        return null;
    }
    
    public final void setArriveEarly(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGameNotes() {
        return null;
    }
    
    public final void setGameNotes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstOpponent() {
        return null;
    }
    
    public final void setFirstOpponent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecondOpponent() {
        return null;
    }
    
    public final void setSecondOpponent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThirdOpponent() {
        return null;
    }
    
    public final void setThirdOpponent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForthOpponent() {
        return null;
    }
    
    public final void setForthOpponent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFifthOpponent() {
        return null;
    }
    
    public final void setFifthOpponent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSixthOpponent() {
        return null;
    }
    
    public final void setSixthOpponent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getCanceled() {
        return false;
    }
    
    public final void setCanceled(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getGameEvent() {
        return null;
    }
    
    public final void setGameEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final void addRest(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String gameNotes, boolean canceled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        return null;
    }
    
    public Event() {
        super();
    }
    
    public Event(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String gameNotes, boolean canceled, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        super();
    }
}