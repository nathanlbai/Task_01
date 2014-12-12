package com.example.task.adapter;

import com.example.task.CategoriesFragment;
import com.example.task.PaymentFragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {

		case 0:
			// Payment fragment activity
			return new PaymentFragment();
		case 1:
			// Categories fragment activity
			return new CategoriesFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		//return this.getCount();
		return 2;
	}

}
