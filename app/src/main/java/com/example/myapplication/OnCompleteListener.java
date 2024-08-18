package com.example.myapplication;

import androidx.annotation.NonNull;

public abstract class OnCompleteListener<T> implements com.google.android.gms.tasks.OnCompleteListener<com.google.firebase.auth.AuthResult> {
    public abstract void onComplete(@NonNull Task<AuthResult> task);
}
