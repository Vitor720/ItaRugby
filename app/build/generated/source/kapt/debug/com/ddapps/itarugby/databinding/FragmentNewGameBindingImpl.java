package com.ddapps.itarugby.databinding;
import com.ddapps.itarugby.R;
import com.ddapps.itarugby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewGameBindingImpl extends FragmentNewGameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.event_txt_header, 1);
        sViewsWithIds.put(R.id.new_game_name, 2);
        sViewsWithIds.put(R.id.new_game_date, 3);
        sViewsWithIds.put(R.id.new_game_time, 4);
        sViewsWithIds.put(R.id.new_game_place, 5);
        sViewsWithIds.put(R.id.new_game_location_details, 6);
        sViewsWithIds.put(R.id.new_event_duration, 7);
        sViewsWithIds.put(R.id.game_details_header, 8);
        sViewsWithIds.put(R.id.new_game_opponents, 9);
        sViewsWithIds.put(R.id.games_quantity, 10);
        sViewsWithIds.put(R.id.game_arrive_early, 11);
        sViewsWithIds.put(R.id.add_event_button, 12);
        sViewsWithIds.put(R.id.dateEventID, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNewGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentNewGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[1]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            );
        this.newGameLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}