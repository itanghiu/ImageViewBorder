package foryousoft.com.imageviewborder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by I-Tang HIU  on 05/02/2016.
 */
public class ImageBorder extends ImageView {

    public ImageBorder(Context context, AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    public void init() {

        Drawable drawable = getResources().getDrawable(R.drawable.image_border);
        setBackground(drawable);
    }
}


