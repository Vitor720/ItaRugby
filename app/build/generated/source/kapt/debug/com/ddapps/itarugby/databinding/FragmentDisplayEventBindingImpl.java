package com.ddapps.itarugby.databinding;
import com.ddapps.itarugby.R;
import com.ddapps.itarugby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDisplayEventBindingImpl extends FragmentDisplayEventBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 1);
        sViewsWithIds.put(R.id.event_start_end, 2);
        sViewsWithIds.put(R.id.event_full_date, 3);
        sViewsWithIds.put(R.id.event_map_view, 4);
        sViewsWithIds.put(R.id.event_location, 5);
        sViewsWithIds.put(R.id.header_line_divider, 6);
        sViewsWithIds.put(R.id.event_arrive_time, 7);
        sViewsWithIds.put(R.id.imageViewTime, 8);
        sViewsWithIds.put(R.id.textView10, 9);
        sViewsWithIds.put(R.id.time_line_divider, 10);
        sViewsWithIds.put(R.id.imageViewGps, 11);
        sViewsWithIds.put(R.id.display_event_adress, 12);
        sViewsWithIds.put(R.id.event_adress, 13);
        sViewsWithIds.put(R.id.location_line_divider, 14);
        sViewsWithIds.put(R.id.display_event_notes, 15);
        sViewsWithIds.put(R.id.note_explicit, 16);
        sViewsWithIds.put(R.id.imageViewCalendar, 17);
        sViewsWithIds.put(R.id.note_line_divider, 18);
        sViewsWithIds.put(R.id.confirmation_header, 19);
        sViewsWithIds.put(R.id.imageViewConfirmed, 20);
        sViewsWithIds.put(R.id.confirmed_list, 21);
        sViewsWithIds.put(R.id.imageViewMayBe, 22);
        sViewsWithIds.put(R.id.mayBe_list, 23);
        sViewsWithIds.put(R.id.imageViewDecline, 24);
        sViewsWithIds.put(R.id.decline_list, 25);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDisplayEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentDisplayEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[6]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[8]
            , (android.view.View) bindings[14]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[16]
            , (android.view.View) bindings[18]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[10]
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