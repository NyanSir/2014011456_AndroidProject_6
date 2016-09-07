package bistu.rookie.u_nity.androidproject_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private PopupMenu popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView)findViewById(R.id.TextView);
        registerForContextMenu(textView);

        popup = new PopupMenu(this, findViewById(R.id.Button));
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.PopupE:
                        Toast.makeText(MainActivity.this, "Choose E", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.PopupF:
                        Toast.makeText(MainActivity.this, "Choose F", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;            }
        });
        popup.inflate(R.menu.menu_popup);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.OptionA:
                Toast.makeText(MainActivity.this, "choose A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.OptionB:
                Toast.makeText(MainActivity.this, "choose B", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ContextC:
                Toast.makeText(MainActivity.this, "choose C", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ContextD:
                Toast.makeText(MainActivity.this, "choose D", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }

    public void popup(View v) {
        popup.show();
    }

}
