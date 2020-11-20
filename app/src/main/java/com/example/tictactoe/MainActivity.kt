package com.example.tictactoe

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity(), View.OnClickListener {
        private var firstPlayer: Boolean = true
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            init()
            resetButton()
        }

        private fun resetButton() {
            Reset.setOnClickListener {
                d("reset", "Restart Button Clicked")
                button00.isClickable = true
                button00.text = ""
                button01.isClickable = true
                button01.text = ""
                button02.isClickable = true
                button02.text = ""
                button10.isClickable = true
                button10.text = ""
                button11.isClickable = true
                button11.text = ""
                button12.isClickable = true
                button12.text = ""
                button20.isClickable = true
                button20.text = ""
                button21.isClickable = true
                button21.text = ""
                button22.isClickable = true
                button22.text = ""
            }
        }


        private fun init() {

            button00.setOnClickListener {
                playerChecker(button00)

            }

            button01.setOnClickListener {
                playerChecker(button01)
            }

            button02.setOnClickListener {
                playerChecker(button02)
            }

            button10.setOnClickListener {
                playerChecker(button10)
            }

            button11.setOnClickListener {
                playerChecker(button11)
            }

            button12.setOnClickListener {
                playerChecker(button12)
            }

            button20.setOnClickListener {
                playerChecker(button20)
            }

            button21.setOnClickListener {
                playerChecker(button21)
            }

            button22.setOnClickListener {
                playerChecker(button22)
            }


        }


        private fun playerChecker(button: Button) {
            d("onClick", "Button Clicked")
            if (firstPlayer) {
                button.text = "O"
            } else {
                button.text = "X"
            }

            button.isClickable = false
            firstPlayer = !firstPlayer
            checkWinner()
        }

        private fun checkWinner() {
            if (button00.text.toString()
                    .isNotEmpty() && button00.text.toString() == button01.text.toString() && button00.text.toString() == button02.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button00.text.toString()}", Toast.LENGTH_SHORT)
                    .show()
            } else if (button10.text.toString()
                    .isNotEmpty() && button10.text.toString() == button11.text.toString() && button10.text.toString() == button12.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button10.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else if (button20.text.toString()
                    .isNotEmpty() && button20.text.toString() == button21.text.toString() && button20.text.toString() == button22.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button20.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else if (button00.text.toString()
                    .isNotEmpty() && button00.text.toString() == button10.text.toString() && button00.text.toString() == button20.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button00.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else if (button01.text.toString()
                    .isNotEmpty() && button01.text.toString() == button11.text.toString() && button01.text.toString() == button21.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button01.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else if (button02.text.toString()
                    .isNotEmpty() && button02.text.toString() == button12.text.toString() && button02.text.toString() == button22.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button02.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else if (button00.text.toString()
                    .isNotEmpty() && button00.text.toString() == button11.text.toString() && button00.text.toString() == button22.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button00.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else if (button02.text.toString()
                    .isNotEmpty() && button02.text.toString() == button11.text.toString() && button02.text.toString() == button21.text.toString()
            ) {
                Toast.makeText(this, "Winner is ${button02.text.toString()}", Toast.LENGTH_SHORT)
                    .show()

            } else {
                if(button00.text.toString().isNotEmpty() && button01.text.toString().isNotEmpty() && button02.text.toString().isNotEmpty() && button10.text.toString().isNotEmpty() && button11.text.toString().isNotEmpty() && button12.text.toString().isNotEmpty() && button20.text.toString().isNotEmpty() && button21.text.toString().isNotEmpty() && button22.text.toString().isNotEmpty())
                Toast.makeText(this, "It Is Push!", Toast.LENGTH_SHORT).show()
            }
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }
