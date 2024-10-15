package my.edu.utem.ftmk.welcomefirst;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import my.edu.utem.ftmk.welcomefirst.databinding.ActivityMainFirstBinding;

public class MainActivityFirst extends AppCompatActivity {

    ActivityMainFirstBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        binding = ActivityMainFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void fnGreet(View view) {


        binding.txtGreet.setText("hello "+binding.txtname.getText());


    }
}