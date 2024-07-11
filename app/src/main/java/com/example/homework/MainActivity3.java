package com.example.homework;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        ImageButton goBackButton = findViewById(R.id.go_back_button3);
        TextView textView = findViewById(R.id.text_view);

        String text = "Дарквеб (dark web, «темная паутина», «темная сеть») – это часть всемирной паутины (World Wide Web), которая находится в даркнетах, и доступ к которой можно получить только при помощи специального программного обеспечения (такого как Tor). Дарквеб относится к глубокой сети, то есть является частью сети, недоступной для поисковиков. Dark web, который иногда называют «Darknet» (темный интернет) или «Deep Web» (глубокая паутина) является частью теневого онлайн-рынка. Dark web представляет из себя специализированную группу сайтов, где личность каждого пользователя скрыта от власти, трекеров и правоохранительных органов. Обычные поисковые системы и стандартные веб-браузеры не могут видеть страницы Dark web. По сути — это частное виртуальное пространство, где люди действуют анонимно для достижения своих целей.";

        SpannableStringBuilder spannable = new SpannableStringBuilder(text);

        String part1 = "Дарквеб (dark web, «темная паутина», «темная сеть»)";
        String part2 = "Dark web, который иногда называют «Darknet» (темный интернет) или «Deep Web» (глубокая паутина)";
        String part3 = "частное виртуальное пространство, где люди действуют анонимно для достижения своих целей";

        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPart1)), text.indexOf(part1), text.indexOf(part1) + part1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPart2)), text.indexOf(part2), text.indexOf(part2) + part2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPart3)), text.indexOf(part3), text.indexOf(part3) + part3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannable);

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
