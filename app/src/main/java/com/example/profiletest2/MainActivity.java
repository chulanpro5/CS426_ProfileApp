package com.example.profiletest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView avatarImageView;
    private TextView nameTextView;
    private TextView professionTextView;
    private TextView summaryContentTextView;
    private TextView awardContentTextView;
    private TextView educationContentTextView;

    private TextView projectContentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avatarImageView = findViewById(R.id.avatarImageView);
        nameTextView = findViewById(R.id.nameTextView);
        professionTextView = findViewById(R.id.professionTextView);
        summaryContentTextView = findViewById(R.id.summaryContentTextView);
        awardContentTextView = findViewById(R.id.awardContentTextView);
        educationContentTextView = findViewById(R.id.educationContentTextView);
        projectContentTextView = findViewById(R.id.projectContentTextView);

        // Set the avatar, name, and profession
        avatarImageView.setImageResource(R.drawable.ic_user);
        nameTextView.setText("John Doe");
        professionTextView.setText("Student");

        // Set the summary content
        String summary = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra nisi eu nisi volutpat, vel lacinia felis consectetur. Donec ac tellus dolor. Ut sed dignissim elit, sit amet malesuada lectus. Integer.";
        summaryContentTextView.setText(summary);

        // Set the award content
        String award = "First Price in ... (08/2020)\n\nSecond Price in ... (03/2023)";
        awardContentTextView.setText(award);

        // Set the education content
        String education = "Bachelor of Computer Science - University of Sciences (2020-2024)";
        educationContentTextView.setText(education);

        // Set the project content
        String project = " ... (08/2020)\n\n ... (03/2023)";
        projectContentTextView.setText(project);
    }
}