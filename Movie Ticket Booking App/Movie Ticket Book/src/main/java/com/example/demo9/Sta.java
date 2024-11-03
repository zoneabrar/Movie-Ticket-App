package com.example.demo9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;


import java.net.URL;
import java.util.ResourceBundle;

public class Sta implements Initializable {
    
	private static final String FX_BACKGROUND_COLOR_WHITE ="#f4f0f0";
    
    @FXML
    public Label l1;
    @FXML
    public Label l2;
    @FXML
    public Label l3;
    @FXML
    public Label l4;
    @FXML
    public Label l5;
    @FXML
    public Label l6;
    @FXML
    public Label l7;
    @FXML
    public Label l8;
    @FXML
    public Label l9;
    @FXML
    public Label l10;
    
    public Label mis;
    public TextField in;

    public Label r1;
    public Label r2;
    public Label r3;
    public Label r4;
    public Label r5;
    public Label r6;
    public Label r7;
    public Label r8;
    public Label r9;
    public Label r10;
    @FXML
    public Button pop;


    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ok(ActionEvent actionEvent) {
        mis.setText("");
        mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));

        String s = in.getText();
      
       /* if(in.getText().isEmpty())
        {
        	mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        	mis.setText("Error: Input Blank");
        	ref(actionEvent);
        }

        
        mis.setText(" ");
        mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));*/
        
        
        
        if(in.getText().isEmpty()) {
            mis.setText("Please enter a value ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count1==0)
        {
            l1.setText(s); count1++;
            l1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count2==0)
        {
            l2.setText(s); count2++;
            l2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count3==0)
        {
            l3.setText(s); count3++;
            l3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count4==0)
        {
            l4.setText(s); count4++;
            l4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count5==0)
        {
            l5.setText(s); count5++;
            l5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count6==0)
        {
            l6.setText(s); count6++;
            l6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count7==0)
        {
            l7.setText(s); count7++;
            l7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count8==0)
        {
            l8.setText(s); count8++;
            l8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count9==0)
        {
            l9.setText(s); count9++;
            l9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count10==0)
        {
            l10.setText(s); count10++;
            l10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
        }
        else {
            mis.setText("Stack is full");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
        }
    }

    public void back(ActionEvent actionEvent) {
        HelloApplication.stage.show();
        HelloController.stage.close();
    }

    public void ref(ActionEvent actionEvent) {
        count1=0;
        count2=0;
        count3=0;
        count4=0;
        count5=0;
        count6=0;
        count7=0;
        count8=0;
        count9=0;
        count10=0; //      #f4f0f0
        mis.setText(" ");
        l1.setText(" ");
        l2.setText(" ");
        l3.setText(" ");
        l4.setText(" ");
        l5.setText(" ");
        l6.setText(" ");
        l7.setText(" ");
        l8.setText(" ");
        l9.setText(" ");
        l10.setText(" ");
        l1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        l10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        //in.setText(" ");
    }

    public void pop(ActionEvent actionEvent) {
        mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        if(count10==1) {
            String s1 = l10.getText(); count10--;
            l10.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));

            l10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));

        }
        else if(count9==1) {
            String s1 = l9.getText(); count9--;
            l9.setText(" ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));

            mis.setText(s1+" is removed ");

            l9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count8==1) {
            String s1 = l8.getText(); count8--;
            l8.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));


            l8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count7==1) {
            String s1 = l7.getText(); count7--;
            l7.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            l7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count6==1) {
            String s1 = l6.getText(); count6--;
            l6.setText(" ");

            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));

            l6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count5==1) {
            String s1 = l5.getText(); count5--;
            l5.setText(" ");

            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));

            l5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count4==1) {
            String s1 = l4.getText(); count4--;
            l4.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            l4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count3==1) {
            String s1 = l3.getText(); count3--;
            l3.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            l3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count2==1) {
            String s1 = l2.getText(); count2--;
            l2.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));

            l2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count1==1) {
            String s1 = l1.getText(); count1--;
            l1.setText(" ");
            mis.setText(s1+" is removed ");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            l1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else {
            mis.setText("Stack is empty");
            mis.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));

        }

    }
    }
