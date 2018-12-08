package com.manelkhouloudchaima.deliverypizzahut.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.manelkhouloudchaima.deliverypizzahut.R;


public class Inscription extends Fragment {
    Button btn_ins ;
    EditText text_nom;
    EditText text_prenom;
    EditText text_email;
    EditText text_mp;
    EditText text_mp1;
    EditText text_tel ;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.inscription, container, false);

    /*    text_nom=(EditText)rootView.findViewById(R.id.nom);
        text_prenom=(EditText)rootView.findViewById(R.id.prenom);
        text_email=(EditText)rootView.findViewById(R.id.email);
        text_mp=(EditText)rootView.findViewById(R.id.motpasse);
        text_tel=(EditText)rootView.findViewById(R.id.numtel);

         final boolean valid = true;
        btn_ins=(Button)rootView.findViewById(R.id.btn_ins);
        btn_ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }*/

        return rootView;


    }






    public boolean validate() {
        boolean valid = true;



        String nom = text_nom.getText().toString();
        String prenom = text_prenom.getText().toString();
        String email = text_email.getText().toString();
        String MP = text_mp.getText().toString();
        String MP1 = text_mp1.getText().toString();
        String tel = text_tel.getText().toString();



        if (nom.isEmpty() || nom.length() < 3) {
            text_nom.setError("at least 3 characters");
            valid = false;


        } else {
            text_nom.setError(null);
        }

        if (prenom.isEmpty() || nom.length() < 3) {
            text_prenom.setError("at least 3 characters");
            valid = false;


        } else {
            text_prenom.setError(null);
        }



        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            text_email.setError("enter a valid email address");
            valid = false;
        } else {
            text_email.setError(null);
        }

        if (tel.isEmpty() || tel.length()!=10) {
            text_tel.setError("Enter Valid Mobile Number");
            valid = false;
        } else {
            text_tel.setError(null);
        }

        if (MP.isEmpty() || MP.length() < 4 || MP.length() > 10) {
            text_mp.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            text_mp1.setError(null);
        }

        if (MP1.isEmpty() || MP1.length() < 4 || MP1.length() > 10 || !(MP1.equals(MP))) {
            text_mp1.setError("Password Do not match");
            valid = false;
        } else {
            text_mp1.setError(null);
        }

        return valid;
    }

}
