package com.wojtek.fotojaneczko;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class Plener extends Activity{
	
	WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plener);
		
		String url = "http://www.fotojaneczko.pl/plener/index.html";
		
		webView= (WebView) findViewById(R.id.webViewPlener);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setUserAgentString("Mozilla/5.0");
		webView.loadUrl(url);
		
		//chromeView.setWebViewClient(new WebViewClient());
	
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_powrot, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		
		switch (id) {
		case R.id.action_powrot:
			Intent galeriaIntent = new Intent(Plener.this, GaleriaMenu.class);
			startActivity(galeriaIntent);
			this.finish();
			break;

		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onBackPressed() {

		AlertDialog.Builder saveDialog = new AlertDialog.Builder(this);
		saveDialog.setTitle(R.string.mainActivity_dialogTitle);
		saveDialog.setMessage(R.string.mainActivity_dialogMessage);
		saveDialog.setPositiveButton(R.string.dialogZamknij,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

						System.exit(0);
					}
				});
		saveDialog.setNegativeButton(R.string.dialogAnuluj,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});
		
		saveDialog.show();
	}
	
}
