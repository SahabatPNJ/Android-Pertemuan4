package example.domain.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {


    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        if (position == 0) {
            f = new FragmentSatu();
        }
        if (position == 1) {
            f = new FragmentDua();
        }
        return f;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String name = null;
        if(position == 0){
            name = "FRAGMENT SATU";
        }
        if(position == 1){
            name = "FRAGMENT DUA";
        }
        return name;
    }
}
