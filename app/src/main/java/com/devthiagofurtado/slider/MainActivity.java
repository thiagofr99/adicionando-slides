package com.devthiagofurtado.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        //Remover butões do slide
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //Criar Slide com fragment
        addSlide(new FragmentSlide.Builder().background(android.R.color.white).fragment(R.layout.intro_1).build());
        addSlide(new FragmentSlide.Builder().background(android.R.color.white).fragment(R.layout.intro_2).build());

        /*Cria um slider

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("Descricao")
                .image(R.drawable.um)
                .background(android.R.color.white)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Titulo2")
                .description("Descricao2")
                .image(R.drawable.dois)
                .background(android.R.color.white)
                .build());*/
    }
}