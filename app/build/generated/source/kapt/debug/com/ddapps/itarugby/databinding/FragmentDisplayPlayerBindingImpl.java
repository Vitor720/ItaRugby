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
        sViewsWithIds.put(R.id.player_imageView, 1);
        sViewsWithIds.put(R.id.player_name, 2);
        sViewsWithIds.put(R.id.player_position, 3);
        sViewsWithIds.put(R.id.imageViewCake, 4);
        sViewsWithIds.put(R.id.player_birthday, 5);
        sViewsWithIds.put(R.id.bDay, 6);
        sViewsWithIds.put(R.id.birthday_divider, 7);
        sViewsWithIds.put(R.id.imageViewContact, 8);
        sViewsWithIds.put(R.id.player_contact, 9);
        sViewsWithIds.put(R.id.contact, 10);
        sViewsWithIds.put(R.id.contact_divider, 11);
        sViewsWithIds.put(R.id.imageViewBody, 12);
        sViewsWithIds.put(R.id.player_body, 13);
        sViewsWithIds.put(R.id.body, 14);
        sViewsWithIds.put(R.id.player_info_divider, 15);
        sViewsWithIds.put(R.id.player_stats_header, 16);
        sViewsWithIds.put(R.id.imageViewBall, 17);
        sViewsWithIds.put(R.id.player_since, 18);
        sViewsWithIds.put(R.id.player_since_txt, 19);
        sViewsWithIds.put(R.id.player_since_divider, 20);
        sViewsWithIds.put(R.id.imageViewPlayer, 21);
        sViewsWithIds.put(R.id.last_drill, 22);
        sViewsWithIds.put(R.id.drill, 23);
        sViewsWithIds.put(R.id.last_drill_divider, 24);
        sViewsWithIds.put(R.id.imageViewYellowCard, 25);
        sViewsWithIds.put(R.id.player_yellow_cards, 26);
        sViewsWithIds.put(R.id.yellow_cards, 27);
        sViewsWithIds.put(R.id.yellow_cards_divider, 28);
        sViewsWithIds.put(R.id.imageViewRedCard, 29);
        sViewsWithIds.put(R.id.player_red_cards, 30);
        sViewsWithIds.put(R.id.red_cards, 31);
        sViewsWithIds.put(R.id.red_cards_divider, 32);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDisplayPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentDisplayPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.view.View) bindings[11]
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.TextView) bindings[22]
            , (android.view.View) bindings[24]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[18]
            , (android.view.View) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[31]
            , (android.view.View) bindings[32]
            , (android.widget.TextView) bindings[27]
            , (android.view.View) bindings[28]
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