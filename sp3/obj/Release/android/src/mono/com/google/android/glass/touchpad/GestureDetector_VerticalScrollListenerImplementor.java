package mono.com.google.android.glass.touchpad;


public class GestureDetector_VerticalScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.glass.touchpad.GestureDetector.VerticalScrollListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onVerticalScroll:(FFF)Z:GetOnVerticalScroll_FFFHandler:Com.Google.Android.Glass.Touchpad.GestureDetector/IVerticalScrollListenerInvoker, GDK\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Glass.Touchpad.GestureDetector/IVerticalScrollListenerImplementor, GDK, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GestureDetector_VerticalScrollListenerImplementor.class, __md_methods);
	}


	public boolean onVerticalScroll (float p0, float p1, float p2)
	{
		return n_onVerticalScroll (p0, p1, p2);
	}

	private native boolean n_onVerticalScroll (float p0, float p1, float p2);

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
