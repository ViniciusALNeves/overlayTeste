package br.com.makrosystems.overlaytest;

import android.util.Log;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

public class OverlayTest extends AppCompatActivity {
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        String text;
        if (ev.getFlags() == MotionEvent.FLAG_WINDOW_IS_OBSCURED || ev.getFlags() == MotionEvent.FLAG_WINDOW_IS_PARTIALLY_OBSCURED) {
            text = "Window esta parcialmente ou totalmente obstruido";
            Log.d("Mensagem", text);
        } else {
            text = "Window não esta obstruido.";
            Log.d("Mensagem", text);
        }


//        info.setText(text);


        Log.d("Mensagem", "Resultado: " + ev.getFlags());
        // MotionEvent.F
        return super.dispatchTouchEvent(ev);
    }
}
