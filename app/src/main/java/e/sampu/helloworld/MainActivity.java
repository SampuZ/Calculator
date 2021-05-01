package e.sampu.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    StringBuffer sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext);
        sb=new StringBuffer();
    }
    public void btnClick(View V){
        int id = V.getId();
        switch (id){
            case R.id.one:
                sb.append("1");
                editText.setText(sb.toString());
                break;
        }
    }


    public int calculate(String expression){
        return 0;
    }
}