package com.ktaomai

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Wired : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)


        val  wired= view.findViewById(R.id.menu) as WebView
        wired.loadUrl("https://www.wired.com")

        val webSettings =  wired.getSettings()
        webSettings.setJavaScriptEnabled(true)

        wired.setWebViewClient(WebViewClient())

        return view
    }
}