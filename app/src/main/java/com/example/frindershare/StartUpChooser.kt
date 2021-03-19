package com.example.frindershare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

//Whether the user is logged in.
class StartUpChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_start_up_chooser)

        //Current user is not null and their email is verified then
        val intentA =
            if (FirebaseAuth.getInstance().currentUser?.isEmailVerified == true) { //user is logged in
            //OR means combining then clear task and then do the new task.
            //clear a task and create a new task (start up a new task) So it will clear the current back stack and start a whole new back stack with the activity that is being opened. with the
            Intent(this, HomeActivity::class.java)

            //startActivity(intent)
        } else {
            Intent(this, LoginActivity::class.java)
        }
        intentA.flags =  Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intentA)
    }
}