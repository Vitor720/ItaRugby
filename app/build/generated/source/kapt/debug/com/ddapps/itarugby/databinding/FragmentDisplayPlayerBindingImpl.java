package com.ddapps.itarugby.databinding;
import com.ddapps.itarugby.R;
import com.ddapps.itarugby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDisplayPlayerBindingImpl extends FragmentDisplayPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 1);
        sViewsWithIds.put(R.id.display_player_header, 2);
        sViewsWithIds.put(R.id.player_imageView, 3);
        sViewsWithIds.put(R.id.player_name, 4);
        sViewsWithIds.put(R.id.player_position, 5);
        sViewsWithIds.put(R.id.display_stats_header, 6);
        sViewsWithIds.put(R.id.player_birthday, 7);
        sViewsWithIds.put(R.id.textView3, 8);
        sViewsWithIds.put(R.id.player_since, 9);
        sViewsWithIds.put(R.id.textView4, 10);
        sViewsWithIds.put(R.id.player_body, 11);
        sViewsWithIds.put(R.id.player_body_desc, 12);
        sViewsWithIds.put(R.id.display_spacer, 13);
        sViewsWithIds.put(R.id.player_stats_header, 14);
        sViewsWithIds.put(R.id.imageViewPlayer, 15);
        sViewsWithIds.put(R.id.last_drill, 16);
        sViewsWithIds.put(R.id.drill, 17);
        sViewsWithIds.put(R.id.last_drill_divider, 18);
        sViewsWithIds.put(R.id.imageViewYellowCard, 19);
        sViewsWithIds.put(R.id.player_yellow_cards, 20);
        sViewsWithIds.put(R.id.yellow_cards, 21);
        sViewsWithIds.put(R.id.yellow_cards_divider, 22);
        sViewsWithIds.put(R.id.imageViewRedCard, 23);
        sViewsWithIds.put(R.id.player_red_cards, 24);
        sViewsWithIds.put(R.id.red_cards, 25);
        sViewsWithIds.put(R.id.red_cards_divider, 26);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDisplayPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentDisplayPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[2]
            , (android.view.View) bindings[13]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.view.View) bindings[18]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[25]
            , (android.view.View) bindings[26]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[21]
            , (android.view.View) bindings[22]
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