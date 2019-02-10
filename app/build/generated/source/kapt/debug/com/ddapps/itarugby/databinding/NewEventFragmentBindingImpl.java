package com.ddapps.itarugby.databinding;
import com.ddapps.itarugby.R;
import com.ddapps.itarugby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NewEventFragmentBindingImpl extends NewEventFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.new_event_layout, 1);
        sViewsWithIds.put(R.id.event_txt_header, 2);
        sViewsWithIds.put(R.id.new_event_name, 3);
        sViewsWithIds.put(R.id.new_event_date_layout, 4);
        sViewsWithIds.put(R.id.new_event_date, 5);
        sViewsWithIds.put(R.id.arrive_early, 6);
        sViewsWithIds.put(R.id.new_event_time, 7);
        sViewsWithIds.put(R.id.new_event_duration, 8);
        sViewsWithIds.put(R.id.new_event_place, 9);
        sViewsWithIds.put(R.id.new_event_notes, 10);
        sViewsWithIds.put(R.id.game_details_header, 11);
        sViewsWithIds.put(R.id.games_quantity, 12);
        sViewsWithIds.put(R.id.first_opponent, 13);
        sViewsWithIds.put(R.id.second_opponent, 14);
        sViewsWithIds.put(R.id.third_opponent, 15);
        sViewsWithIds.put(R.id.forth_opponent, 16);
        sViewsWithIds.put(R.id.fifth_opponent, 17);
        sViewsWithIds.put(R.id.sixth_opponent, 18);
        sViewsWithIds.put(R.id.new_game_notes, 19);
        sViewsWithIds.put(R.id.add_event_button, 20);
        sViewsWithIds.put(R.id.dateEventID, 21);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NewEventFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private NewEventFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.dd.CircularProgressButton) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[2]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[17]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[13]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[16]
            , (android.widget.TextView) bindings[11]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (android.widget.LinearLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[19]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[14]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[18]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[15]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameOpponents == variableId) {
            setGameOpponents((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameOpponents(@Nullable java.lang.String GameOpponents) {
        this.mGameOpponents = GameOpponents;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameOpponents
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}