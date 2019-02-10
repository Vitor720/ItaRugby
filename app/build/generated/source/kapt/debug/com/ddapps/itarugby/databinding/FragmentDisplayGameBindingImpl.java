package com.ddapps.itarugby.databinding;
import com.ddapps.itarugby.R;
import com.ddapps.itarugby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDisplayGameBindingImpl extends FragmentDisplayGameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.event_start_end, 1);
        sViewsWithIds.put(R.id.event_full_date, 2);
        sViewsWithIds.put(R.id.event_map_view, 3);
        sViewsWithIds.put(R.id.event_location, 4);
        sViewsWithIds.put(R.id.header_line_divider, 5);
        sViewsWithIds.put(R.id.event_arrive_time, 6);
        sViewsWithIds.put(R.id.imageViewTime, 7);
        sViewsWithIds.put(R.id.textView10, 8);
        sViewsWithIds.put(R.id.time_line_divider, 9);
        sViewsWithIds.put(R.id.imageViewGps, 10);
        sViewsWithIds.put(R.id.display_event_adress, 11);
        sViewsWithIds.put(R.id.event_adress, 12);
        sViewsWithIds.put(R.id.location_line_divider, 13);
        sViewsWithIds.put(R.id.display_event_notes, 14);
        sViewsWithIds.put(R.id.note_explicit, 15);
        sViewsWithIds.put(R.id.imageViewCalendar, 16);
        sViewsWithIds.put(R.id.note_line_divider, 17);
        sViewsWithIds.put(R.id.imageViewOpponents, 18);
        sViewsWithIds.put(R.id.games, 19);
        sViewsWithIds.put(R.id.opponents, 20);
        sViewsWithIds.put(R.id.opponents_divider, 21);
        sViewsWithIds.put(R.id.imageViewLineUp, 22);
        sViewsWithIds.put(R.id.lineUp, 23);
        sViewsWithIds.put(R.id.lineUpHeader, 24);
        sViewsWithIds.put(R.id.lineUp_divider, 25);
        sViewsWithIds.put(R.id.confirmation_header, 26);
        sViewsWithIds.put(R.id.imageViewConfirmed, 27);
        sViewsWithIds.put(R.id.confirmed_list, 28);
        sViewsWithIds.put(R.id.imageViewMayBe, 29);
        sViewsWithIds.put(R.id.mayBe_list, 30);
        sViewsWithIds.put(R.id.imageViewDecline, 31);
        sViewsWithIds.put(R.id.decline_list, 32);
        sViewsWithIds.put(R.id.lineUpButton, 33);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDisplayGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentDisplayGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[19]
            , (android.view.View) bindings[5]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[23]
            , (android.widget.Button) bindings[33]
            , (android.view.View) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[15]
            , (android.view.View) bindings[17]
            , (android.widget.TextView) bindings[20]
            , (android.view.View) bindings[21]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[9]
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