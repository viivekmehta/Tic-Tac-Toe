package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    boolean isGameActive = true;
    boolean isKohliImage = false;
    boolean isImageViewPressed = false, isImageView2Pressed = false, isImageView3Pressed = false, isImageView4Pressed = false, isImageView5Pressed = false, isImageView6Pressed = false, isImageView7Pressed = false, isImageView8Pressed = false, isImageView9Pressed = false;
    HashMap<String, String> whichImageInImageView = new HashMap<String, String>();

    public void showDialog(String winner) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this)
                .setTitle("Voilla!! "+winner+" won!")
                .setMessage("Do you want to Play again ?")
                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //this will always start your activity as a new task
                        startActivity(intent);
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                        homeIntent.addCategory( Intent.CATEGORY_HOME );
                        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(homeIntent);
                    }
                });
        AlertDialog alertCard = alert.create();
        alertCard.getWindow().setGravity(Gravity.TOP);
        alertCard.show();
    }

    public void showDialogPlayAgain() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this)
                .setTitle("Oops!! Its a tie!")
                .setMessage("Do you want to Play again ?")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //this will always start your activity as a new task
                        startActivity(intent);
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                        homeIntent.addCategory( Intent.CATEGORY_HOME );
                        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(homeIntent);
                    }
                });

        AlertDialog alertCard = alert.create();
        alertCard.getWindow().setGravity(Gravity.TOP);
        alertCard.show();
    }

    public void checkIfWon() {
        if((whichImageInImageView.get("ImageView1") != null) && (whichImageInImageView.get("ImageView2") != null) && (whichImageInImageView.get("ImageView3") != null) && (whichImageInImageView.get("ImageView1").equalsIgnoreCase(whichImageInImageView.get("ImageView2"))) && (whichImageInImageView.get("ImageView2").equalsIgnoreCase(whichImageInImageView.get("ImageView3")))) {
            showDialog(whichImageInImageView.get("ImageView1"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView1") != null) && (whichImageInImageView.get("ImageView4") != null) && (whichImageInImageView.get("ImageView7") != null) && (whichImageInImageView.get("ImageView1").equalsIgnoreCase(whichImageInImageView.get("ImageView4"))) && (whichImageInImageView.get("ImageView4").equalsIgnoreCase(whichImageInImageView.get("ImageView7")))) {
            showDialog(whichImageInImageView.get("ImageView1"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView3") != null) && (whichImageInImageView.get("ImageView6") != null) && (whichImageInImageView.get("ImageView9") != null) && (whichImageInImageView.get("ImageView3").equalsIgnoreCase(whichImageInImageView.get("ImageView6"))) && (whichImageInImageView.get("ImageView6").equalsIgnoreCase(whichImageInImageView.get("ImageView9")))) {
            showDialog(whichImageInImageView.get("ImageView3"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView7") != null) && (whichImageInImageView.get("ImageView8") != null) && (whichImageInImageView.get("ImageView9") != null) && (whichImageInImageView.get("ImageView7").equalsIgnoreCase(whichImageInImageView.get("ImageView8"))) && (whichImageInImageView.get("ImageView8").equalsIgnoreCase(whichImageInImageView.get("ImageView9")))) {
            showDialog(whichImageInImageView.get("ImageView7"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView4") != null) && (whichImageInImageView.get("ImageView5") != null) && (whichImageInImageView.get("ImageView6") != null) && (whichImageInImageView.get("ImageView4").equalsIgnoreCase(whichImageInImageView.get("ImageView5"))) && (whichImageInImageView.get("ImageView5").equalsIgnoreCase(whichImageInImageView.get("ImageView6")))) {
            showDialog(whichImageInImageView.get("ImageView4"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView2") != null) && (whichImageInImageView.get("ImageView5") != null) && (whichImageInImageView.get("ImageView8") != null) && (whichImageInImageView.get("ImageView2").equalsIgnoreCase(whichImageInImageView.get("ImageView5"))) && (whichImageInImageView.get("ImageView5").equalsIgnoreCase(whichImageInImageView.get("ImageView8")))) {
            showDialog(whichImageInImageView.get("ImageView2"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView1") != null) && (whichImageInImageView.get("ImageView5") != null) && (whichImageInImageView.get("ImageView9") != null) && (whichImageInImageView.get("ImageView1").equalsIgnoreCase(whichImageInImageView.get("ImageView5"))) && (whichImageInImageView.get("ImageView5").equalsIgnoreCase(whichImageInImageView.get("ImageView9")))) {
            showDialog(whichImageInImageView.get("ImageView1"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView3") != null) && (whichImageInImageView.get("ImageView5") != null) && (whichImageInImageView.get("ImageView7") != null) && (whichImageInImageView.get("ImageView3").equalsIgnoreCase(whichImageInImageView.get("ImageView5"))) && (whichImageInImageView.get("ImageView5").equalsIgnoreCase(whichImageInImageView.get("ImageView7")))) {
            showDialog(whichImageInImageView.get("ImageView3"));
            isGameActive = false;
        } else if((whichImageInImageView.get("ImageView1") != null) && (whichImageInImageView.get("ImageView2") != null) && (whichImageInImageView.get("ImageView3") != null) && (whichImageInImageView.get("ImageView4") != null) && (whichImageInImageView.get("ImageView5") != null) && (whichImageInImageView.get("ImageView6") != null) && (whichImageInImageView.get("ImageView7") != null) && (whichImageInImageView.get("ImageView8") != null) && (whichImageInImageView.get("ImageView9") != null)) {
            showDialogPlayAgain();
        }

    }

    public void clickedImageView (View view){
        if(isGameActive) {
            ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
            if (!isImageViewPressed) {
                isImageViewPressed = true;
                if (isKohliImage) {
                    imageView1.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView1", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView1.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView1", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView2(View view) {
        if(isGameActive) {
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
            if(!isImageView2Pressed) {
                isImageView2Pressed = true;
                if(isKohliImage) {
                    imageView2.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView2", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView2.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView2", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView3(View view) {
        if(isGameActive) {
            ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
            if(!isImageView3Pressed) {
                isImageView3Pressed = true;
                if(isKohliImage) {
                    imageView3.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView3", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView3.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView3", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView4(View view) {
        if(isGameActive) {
            ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
            if(!isImageView4Pressed) {
                isImageView4Pressed = true;
                if(isKohliImage) {
                    imageView4.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView4", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView4.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView4", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView5(View view) {
        if(isGameActive) {
            ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
            if(!isImageView5Pressed) {
                isImageView5Pressed = true;
                if(isKohliImage) {
                    imageView5.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView5", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView5.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView5", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView6(View view) {
        if(isGameActive) {
            ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
            if(!isImageView6Pressed) {
                isImageView6Pressed = true;
                if(isKohliImage) {
                    imageView6.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView6", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView6.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView6", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView7(View view) {
        if(isGameActive) {
            ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
            if(!isImageView7Pressed) {
                isImageView7Pressed = true;
                if(isKohliImage) {
                    imageView7.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView7", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView7.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView7", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView8(View view) {
        if(isGameActive) {
            ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
            if(!isImageView8Pressed) {
                isImageView8Pressed = true;
                if(isKohliImage) {
                    imageView8.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView8", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView8.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView8", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    public void clickedImageView9(View view) {
        if(isGameActive) {
            ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
            if(!isImageView9Pressed) {
                isImageView9Pressed = true;
                if(isKohliImage) {
                    imageView9.setImageResource(R.drawable.dhoni);
                    whichImageInImageView.put("ImageView9", "Dhoni");
                    isKohliImage = false;
                } else {
                    imageView9.setImageResource(R.drawable.kohli);
                    whichImageInImageView.put("ImageView9", "Kohli");
                    isKohliImage = true;
                }
            }
            checkIfWon();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
