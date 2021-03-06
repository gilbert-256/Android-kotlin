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

class Idea : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)


        val  idea= view.findViewById(R.id.home) as WebView
        idea.loadUrl("https://www.digestafrica.com")

        val webSettings =  idea.getSettings()
        webSettings.setJavaScriptEnabled(true)

        idea.setWebViewClient(WebViewClient())

        return view
    }
}