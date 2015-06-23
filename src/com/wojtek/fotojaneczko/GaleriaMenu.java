package com.wojtek.fotojaneczko;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class GaleriaMenu extends Activity implements OnClickListener {

	private ImageView viewWeselna;
	private ImageView viewCeremonia;
	private ImageView viewPlener;

	private ImageView viewDziecieca;
	private ImageView viewNiemowleta;
	private ImageView viewDzieci;

	private ImageView viewKobieca;
	private ImageView viewCiaza;
	private ImageView viewPortret;

	private int widthScreen;
	private int heightScreen;

	boolean visableSlubna = false;
	boolean visableDziecieca = false;
	boolean visableKobieca = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.galeria_menu);

		// download screen width
		widthScreen = getResources().getDisplayMetrics().widthPixels;
		// download screen height
		heightScreen = getResources().getDisplayMetrics().heightPixels;

		// Wesele
		viewWeselna = (ImageView) findViewById(R.id.viewSlubna);
		viewCeremonia = (ImageView) findViewById(R.id.viewCeremonia);
		viewPlener = (ImageView) findViewById(R.id.viewPlener);

		viewCeremonia.setVisibility(View.INVISIBLE);
		viewPlener.setVisibility(View.INVISIBLE);

		Drawable imageViewSlubna = getResources()
				.getDrawable(R.drawable.slubna);
		Bitmap bitmapSlubna = ((BitmapDrawable) imageViewSlubna).getBitmap();
		Drawable ibSlubna = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapSlubna, widthScreen / 5,
						widthScreen / 5, true));

		viewWeselna.setX(widthScreen / 9f);
		viewWeselna.setY(heightScreen / 10f);
		viewWeselna.setImageDrawable(ibSlubna);

		Drawable imageViewCeremonia = getResources().getDrawable(
				R.drawable.ceremonia);
		Bitmap bitmapCeremonia = ((BitmapDrawable) imageViewCeremonia)
				.getBitmap();
		Drawable ibCeremonia = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapCeremonia, widthScreen / 8,
						widthScreen / 22, true));

		viewCeremonia.setX(widthScreen / 7);
		viewCeremonia.setY(heightScreen / 7);
		viewCeremonia.setImageDrawable(ibCeremonia);

		viewWeselna.setOnClickListener(this);
		viewCeremonia.setOnClickListener(this);
		viewPlener.setOnClickListener(this);

		Drawable imageViewPlener = getResources()
				.getDrawable(R.drawable.plener);
		Bitmap bitmapPlener = ((BitmapDrawable) imageViewPlener).getBitmap();
		Drawable ibPlener = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapPlener, widthScreen / 8,
						widthScreen / 22, true));

		viewPlener.setX(widthScreen / 7f);
		viewPlener.setY(heightScreen / 6f);
		viewPlener.setImageDrawable(ibPlener);

		viewWeselna.setOnClickListener(this);
		viewCeremonia.setOnClickListener(this);
		viewPlener.setOnClickListener(this);

		// Dzieci
		viewDziecieca = (ImageView) findViewById(R.id.viewDziecieca);
		viewNiemowleta = (ImageView) findViewById(R.id.viewNiemowleta);
		viewDzieci = (ImageView) findViewById(R.id.viewDzieci);

		viewNiemowleta.setVisibility(View.INVISIBLE);
		viewDzieci.setVisibility(View.INVISIBLE);

		Drawable imageViewDziecieca = getResources().getDrawable(
				R.drawable.dziecieca);
		Bitmap bitmapDziecieca = ((BitmapDrawable) imageViewDziecieca)
				.getBitmap();
		Drawable ibDziecieca = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapDziecieca, widthScreen / 5,
						widthScreen / 5, true));

		viewDziecieca.setX(widthScreen / 2.6f);
		viewDziecieca.setY(heightScreen / 10f);
		viewDziecieca.setImageDrawable(ibDziecieca);

		Drawable imageViewNiemowleta = getResources().getDrawable(
				R.drawable.niemowleta);
		Bitmap bitmapNiemowleta = ((BitmapDrawable) imageViewNiemowleta)
				.getBitmap();
		Drawable ibNiemowleta = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapNiemowleta, widthScreen / 8,
						widthScreen / 22, true));

		viewNiemowleta.setX(widthScreen / 2.4f);
		viewNiemowleta.setY(heightScreen / 7f);
		viewNiemowleta.setImageDrawable(ibNiemowleta);

		viewDziecieca.setOnClickListener(this);
		viewNiemowleta.setOnClickListener(this);
		viewDzieci.setOnClickListener(this);

		Drawable imageViewDzieci = getResources()
				.getDrawable(R.drawable.dzieci);
		Bitmap bitmapDzieci = ((BitmapDrawable) imageViewDzieci).getBitmap();
		Drawable ibDzieci = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapDzieci, widthScreen / 8,
						widthScreen / 22, true));

		viewDzieci.setX(widthScreen / 2.4f);
		viewDzieci.setY(heightScreen / 6f);
		viewDzieci.setImageDrawable(ibDzieci);

		viewDziecieca.setOnClickListener(this);
		viewNiemowleta.setOnClickListener(this);
		viewDzieci.setOnClickListener(this);

		// Kobieca
		viewKobieca = (ImageView) findViewById(R.id.viewKobieca);
		viewCiaza = (ImageView) findViewById(R.id.viewCiaza);
		viewPortret = (ImageView) findViewById(R.id.viewPortret);

		viewCiaza.setVisibility(View.INVISIBLE);
		viewPortret.setVisibility(View.INVISIBLE);

		Drawable imageViewKobieca = getResources().getDrawable(
				R.drawable.kobieca);
		Bitmap bitmapKobieca = ((BitmapDrawable) imageViewKobieca).getBitmap();
		Drawable ibKobieca = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapKobieca, widthScreen / 5,
						widthScreen / 5, true));

		viewKobieca.setX(widthScreen / 1.5f);
		viewKobieca.setY(heightScreen / 10f);
		viewKobieca.setImageDrawable(ibKobieca);

		Drawable imageViewCiaza = getResources().getDrawable(
				R.drawable.dziewiec_miesiecy);
		Bitmap bitmapCiaza = ((BitmapDrawable) imageViewCiaza).getBitmap();
		Drawable ibCiaza = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapCiaza, widthScreen / 8,
						widthScreen / 22, true));

		viewCiaza.setX(widthScreen / 1.43f);
		viewCiaza.setY(heightScreen / 7f);
		viewCiaza.setImageDrawable(ibCiaza);

		viewKobieca.setOnClickListener(this);
		viewCiaza.setOnClickListener(this);
		viewPortret.setOnClickListener(this);

		Drawable imageViewPortret = getResources().getDrawable(
				R.drawable.portret);
		Bitmap bitmapPortret = ((BitmapDrawable) imageViewPortret).getBitmap();
		Drawable ibPortret = new BitmapDrawable(getResources(),
				Bitmap.createScaledBitmap(bitmapPortret, widthScreen / 8,
						widthScreen / 22, true));

		viewPortret.setX(widthScreen / 1.43f);
		viewPortret.setY(heightScreen / 6f);
		viewPortret.setImageDrawable(ibPortret);

		viewKobieca.setOnClickListener(this);
		viewCiaza.setOnClickListener(this);
		viewPortret.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {

		// Wesele
		case R.id.viewSlubna:
			if (visableSlubna == false) {

				viewCeremonia.setVisibility(View.VISIBLE);
				viewPlener.setVisibility(View.VISIBLE);
				visableSlubna = true;
			} else {
				viewCeremonia.setVisibility(View.INVISIBLE);
				viewPlener.setVisibility(View.INVISIBLE);
				visableSlubna = false;
			}
			break;

		case R.id.viewCeremonia:

			Intent intentCeremonia = new Intent(GaleriaMenu.this,
					Ceremonia.class);
			startActivity(intentCeremonia);
			this.finish();
			break;

		case R.id.viewPlener:

			Intent intentPlener = new Intent(GaleriaMenu.this, Plener.class);
			startActivity(intentPlener);
			this.finish();
			break;

		// Dzieci
		case R.id.viewDziecieca:
			if (visableDziecieca == false) {

				viewNiemowleta.setVisibility(View.VISIBLE);
				viewDzieci.setVisibility(View.VISIBLE);
				visableDziecieca = true;
			} else {
				viewNiemowleta.setVisibility(View.INVISIBLE);
				viewDzieci.setVisibility(View.INVISIBLE);
				visableDziecieca = false;
			}
			break;

		case R.id.viewNiemowleta:

			Intent intentNiemowleta = new Intent(GaleriaMenu.this,
					Niemowleta.class);
			startActivity(intentNiemowleta);
			this.finish();
			break;

		case R.id.viewDzieci:

			Intent intentDzieci = new Intent(GaleriaMenu.this, Dzieci.class);
			startActivity(intentDzieci);
			this.finish();
			break;

		// Kobieca
		case R.id.viewKobieca:
			if (visableKobieca == false) {

				viewCiaza.setVisibility(View.VISIBLE);
				viewPortret.setVisibility(View.VISIBLE);
				visableKobieca = true;
			} else {
				viewCiaza.setVisibility(View.INVISIBLE);
				viewPortret.setVisibility(View.INVISIBLE);
				visableKobieca = false;
			}
			break;

		case R.id.viewCiaza:

			Intent intentCiaza = new Intent(GaleriaMenu.this,
					Ciaza.class);
			startActivity(intentCiaza);
			this.finish();
			break;

		case R.id.viewPortret:

			Intent intentPortret = new Intent(GaleriaMenu.this, Portret.class);
			startActivity(intentPortret);
			this.finish();
			break;

		default:
			break;
		}

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_galeria, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

		switch (id) {
		case R.id.action_strona_glowna:
			Intent stronaGlownaIntent = new Intent(GaleriaMenu.this, MainActivityFJ.class);
			startActivity(stronaGlownaIntent);
			this.finish();
			break;

		case R.id.action_oferta:
			Intent ofertaIntent = new Intent(GaleriaMenu.this, Oferta.class);
			startActivity(ofertaIntent);
			this.finish();
			break;

		case R.id.action_kontakt:
			Intent kontaktIntent = new Intent(GaleriaMenu.this, Kontakt.class);
			startActivity(kontaktIntent);
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
