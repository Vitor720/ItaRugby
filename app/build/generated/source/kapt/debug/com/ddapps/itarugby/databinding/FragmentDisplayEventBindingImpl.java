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
        sViewsWithIds.put(R.id.event_image_header, 2);
        sViewsWithIds.put(R.id.lyt_distance, 3);
        sViewsWithIds.put(R.id.event_arrive_time, 4);
        sViewsWithIds.put(R.id.lyt_address, 5);
        sViewsWithIds.put(R.id.event_address, 6);
        sViewsWithIds.put(R.id.lyt_date, 7);
        sViewsWithIds.put(R.id.event_date, 8);
        sViewsWithIds.put(R.id.lyt_website, 9);
        sViewsWithIds.put(R.id.place_name, 10);
        sViewsWithIds.put(R.id.textView2, 11);
        sViewsWithIds.put(R.id.event_description, 12);
        sViewsWithIds.put(R.id.confirmation_header, 13);
        sViewsWithIds.put(R.id.imageViewConfirmed, 14);
        sViewsWithIds.put(R.id.confirmed_list, 15);
        sViewsWithIds.put(R.id.imageViewMayBe, 16);
        sViewsWithIds.put(R.id.mayBe_list, 17);
        sViewsWithIds.put(R.id.imageViewDecline, 18);
        sViewsWithIds.put(R.id.decline_list, 19);
        sViewsWithIds.put(R.id.event_map, 20);
        sViewsWithIds.put(R.id.event_map_view, 21);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDisplayEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentDisplayEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
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