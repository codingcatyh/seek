package com.app.yanhao.seek.item;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yanhao on 17-1-15.
 */

public class RecyclerViewItem {
    private Bitmap bitmap;
    private String content;

    public RecyclerViewItem(Bitmap bitmap,String content){
        this.bitmap=bitmap;
        this.content=content;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
