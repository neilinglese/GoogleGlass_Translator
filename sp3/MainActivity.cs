using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Speech;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Net;
using Com.Google.Android.Glass;
using System.Threading;

namespace sp3
{
	[Activity (Label = "sp3", MainLauncher = true)]
	[IntentFilter(new[] { "com.google.android.glass.action.VOICE_TRIGGER" })]
	[MetaData("com.google.android.glass.VoiceTrigger", Resource = "@xml/voicetrigger")]

	public class MainActivity : Activity
	{

		int Voice_Recognition = 0;
		private ListView voice_list;
		private TextView tv;

		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);

			// Get our button from the layout resource,
			// and attach an event to it
			Button button = FindViewById<Button> (Resource.Id.myButton);
			voice_list = FindViewById<ListView>(Resource.Id.listView1);
			tv = FindViewById<TextView> (Resource.Id.textView1);

			button.Click += new EventHandler (button_Click);

		}
		private void button_Click(object sender, EventArgs e)
		{
			Intent intent = new Intent(RecognizerIntent.ActionRecognizeSpeech);
			intent.PutExtra(RecognizerIntent.ExtraLanguageModel, RecognizerIntent.LanguageModelFreeForm);
			intent.PutExtra (RecognizerIntent.ExtraPrompt, "Whats on your mind?");
			SetResult (Result.Ok, intent);

			StartActivityForResult(intent, Voice_Recognition);
		}
		protected override void OnActivityResult (int requestCode, Result resultCode, Intent data)
		{

			if (requestCode == Voice_Recognition) {

				IList<System.String> matches = data.GetStringArrayListExtra (RecognizerIntent.ExtraResults);
				string texttotranslate = matches [0].ToString ();
				string url = "https://translate.google.com/translate_a/t?client=t&text=" + texttotranslate.Replace (" ", "%20")
				             + "&hl=en&sl=en&tl=fr&ie=UTF-8&oe=UTF-8&multires=1&otf=2$ssel=0&tsel=0&sc=1";
				WebRequest wr = WebRequest.Create (url);
				Stream resp = wr.GetResponse ().GetResponseStream ();
				StreamReader respReader = new StreamReader (resp);
				string TranslatedText = "", ans = respReader.ReadToEnd ();
				string[] arr = ans.Split (',');
				TranslatedText = arr [0];
				TranslatedText = TranslatedText.Substring (4, TranslatedText.Length - 5);
				tv.Text = TranslatedText;

			}

		}

	}
}


