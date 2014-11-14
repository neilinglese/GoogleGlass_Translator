package mono.com.google.android.glass.widget;


public class CardScrollView_TransformListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.glass.widget.CardScrollView.TransformListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCountChanged:(I)V:GetOnCountChanged_IHandler:Com.Google.Android.Glass.Widget.CardScrollView/ITransformListenerInvoker, GDK\n" +
			"n_onScaleChanged:(F)V:GetOnScaleChanged_FHandler:Com.Google.Android.Glass.Widget.CardScrollView/ITransformListenerInvoker, GDK\n" +
			"n_onScrollPositionChanged:(F)V:GetOnScrollPositionChanged_FHandler:Com.Google.Android.Glass.Widget.CardScrollView/ITransformListenerInvoker, GDK\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Glass.Widget.CardScrollView/ITransformListenerImplementor, GDK, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CardScrollView_TransformListenerImplementor.class, __md_methods);
	}


	public CardScrollView_TransformListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardScrollView_TransformListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Glass.Widget.CardScrollView/ITransformListenerImplementor, GDK, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCountChanged (int p0)
	{
		n_onCountChanged (p0);
	}

	private native void n_onCountChanged (int p0);


	public void onScaleChanged (float p0)
	{
		n_onScaleChanged (p0);
	}

	private native void n_onScaleChanged (float p0);


	public void onScrollPositionChanged (float p0)
	{
		n_onScrollPositionChanged (p0);
	}

	private native void n_onScrollPositionChanged (float p0);

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
