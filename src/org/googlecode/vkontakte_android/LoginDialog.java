package org.googlecode.vkontakte_android;

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import org.googlecode.vkontakte_android.R;

public class LoginDialog extends Dialog {
    private Button button;

    public LoginDialog(Context context) {
        super(context);
        setContentView(R.layout.login_dialog);
        button = (Button) findViewById(R.id.button_login);
    }

    public void setOnClick(View.OnClickListener l) {
        button.setOnClickListener(l);
    }

    public String getLogin() {
        return ((TextView) findViewById(R.id.login)).getText().toString();
    }

    public String getPass() {
        return ((TextView) findViewById(R.id.pass)).getText().toString();
    }
}
