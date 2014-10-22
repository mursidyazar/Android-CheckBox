package org.kod5.android;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {

	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) { // Bu metod uygulama
															// a��ld���nda
															// �al��t�r�lan
															// metod.
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// webView'i tasar�mdakiyle ba�l�yoruz.
		webView = (WebView) findViewById(R.id.webView1);

		// webView'i JavaScript kodlar�n� �al��t�racak �ekilde set ediyoruz.
		webView.getSettings().setJavaScriptEnabled(true);

		// ��lem yap�ld���n�n anla��lmas� i�in ProgressDialog a��yoruz.
		final ProgressDialog progressDialog = ProgressDialog.show(this, "KOD5",
				"Sayfa Y�kleniyor...", true);
		
		webView.setWebViewClient(new WebViewClient() {

			// Sayfa Y�klenirken bir hata olu�ursa kullan�c�y� uyar�yoruz.
			public void onReceivedError(WebView view, int errorCode,
					String description, String failingUrl) {
				Toast.makeText(getApplicationContext(), "Sayfa Y�klenemedi!",
						Toast.LENGTH_SHORT).show();
			}

			// Sayfan�n y�klenme i�lemi bitti�inde progressDialog'u kapat�yoruz.
			@Override
			public void onPageFinished(WebView view, String url) {
				super.onPageFinished(view, url);
				if (progressDialog.isShowing())
					progressDialog.dismiss();
			}
		});

		//Web sayfam�z�n url'ini webView'e y�kl�yoruz.
		webView.loadUrl("http://www.kod5.org");

	}
}
