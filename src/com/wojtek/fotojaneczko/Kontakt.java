package com.wojtek.fotojaneczko;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Kontakt extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.kontakt);
		
		
	
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_kontakt, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

		switch (id) {
		case R.id.action_strona_glowna:
			Intent stronaGlownaIntent = new Intent(Kontakt.this, MainActivityFJ.class);
			startActivity(stronaGlownaIntent);
			this.finish();
			break;

		case R.id.action_galeria:
			Intent galeriaIntent = new Intent(Kontakt.this, GaleriaMenu.class);
			startActivity(galeriaIntent);
			this.finish();
			break;

		case R.id.action_oferta:
			Intent ofertaIntent = new Intent(Kontakt.this, Oferta.class);
			startActivity(ofertaIntent);
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
