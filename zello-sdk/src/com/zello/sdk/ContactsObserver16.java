package com.zello.sdk;

import android.net.Uri;
import android.os.Handler;

class ContactsObserver16 extends ContactsObserver {

	ContactsObserver16(Contacts contacts, Handler handler) {
		super(contacts, handler);
	}

	@Override
	public void onChange(boolean selfChange) {
		invalidate();
	}

	@Override
	public void onChange(boolean selfChange, Uri uri) {
		invalidate();
	}

}
