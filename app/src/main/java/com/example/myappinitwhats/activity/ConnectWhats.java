package com.example.myappinitwhats.activity;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ConnectWhats implements ConnectW {


    final String urlBase = "https://wa.me/";
    Context context;
    public ConnectWhats(Context cont){
        this.context = cont;
    }

    @Override
    public void initMsg(String numero, String msg) {
        String chatMsgWhats = (urlBase + numero+"/?text=" + msg);
        context.startActivity(
                new Intent( Intent.ACTION_VIEW, Uri.parse( chatMsgWhats.trim() ))
        );
    }
}
