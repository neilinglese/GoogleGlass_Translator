package mono.com.google.android.glass.touchpad;


public class GestureDetector_ScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.glass.touchpad.GestureDetector.ScrollListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onScroll:(FFF)Z:GetOnScroll_FFFHandler:Com.Google.Android.Glass.Touchpad.GestureDetector/IScrollListenerInvoker, GDK\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Glass.Touchpad.GestureDetector/IScrollListenerImplementor, GDK, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GestureDetector_ScrollListenerImplementor.class, __md_methods);
	}


	public boolean onScroll (float p0, float p1, float p2)
	{
		return n_onScroll (p0, p1, p2);
	}

	private native boolean n_onScroll (float p0, float p1, float p2);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
