package com.example.demo9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class Que implements Initializable {
    @FXML
    public Label lv1;
    @FXML
    public Label lv2;
    @FXML
    public Label lv3;
    @FXML
    public Label lv4;
    @FXML
    public Label lv5;
    @FXML
    public Label lv6;
    @FXML
    public Label lv7;
    @FXML
    public Label lv8;
    @FXML
    public Label lv9;
    @FXML
    public Label lv10;
    @FXML
    public TextField insert;
    @FXML
    public Label r1;
    @FXML
    public Label r2;
    @FXML
    public Label r10;
    @FXML
    public Label r3;
    @FXML
    public Label r4;
    @FXML
    public Label r5;
    @FXML
    public Label r6;
    @FXML
    public Label r7;
    @FXML
    public Label r8;
    @FXML
    public Label r9;
    
    public Label full;
    public Label full1;

    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ok(ActionEvent actionEvent) {
        full.setText("");
        full1.setText("");
        full1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        
    	String s = insert.getText();
        
    	/*if(s.equals(""))
        {
    		full1.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
    		full1.setText("Error: Input Blank");
        	ok(actionEvent);
        }

    	full1.setText(" ");
    	full1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));*/
        if(insert.getText().isEmpty()) {
            full1.setText("Please enter a value");
            //full1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0F0"), CornerRadii.EMPTY, new Insets(3))));
        }
    	else if(count1==0)
        {
            lv1.setText(s); count1++;
            lv1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count2==0)
        {
            lv2.setText(s); count2++;
            lv2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count3==0)
        {
            lv3.setText(s); count3++;
            lv3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count4==0)
        {
            lv4.setText(s); count4++;
            lv4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count5==0)
        {
            lv5.setText(s); count5++;
            lv5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count6==0)
        {
            lv6.setText(s); count6++;
            lv6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count7==0)
        {
            lv7.setText(s); count7++;
            lv7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count8==0)
        {
            lv8.setText(s); count8++;
            lv8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count9==0)
        {
            lv9.setText(s); count9++;
            lv9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count10==0)
        {
            lv10.setText(s); count10++;
            lv10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
        }
        else {
            full.setText("Queue is full");
            //full.setTextFill(Paint.valueOf("#000000"));
        }

    }

    public void out(ActionEvent actionEvent) {
        full1.setText("");
        full.setText("");
        full1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        if(count1==1) {
            String s1 = lv1.getText(); count1++;
            lv1.setText(" ");
            r10.setText(s1);
            full.setText(" ");
            
            r10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
            
        }
        else if(count2==1) {
            String s1 = lv2.getText(); count2++;
            lv2.setText(" ");
            r9.setText(s1);
            
            r9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count3==1) {
            String s1 = lv3.getText(); count3++;
            lv3.setText(" ");
            r8.setText(s1);
            
            r8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count4==1) {
            String s1 = lv4.getText(); count4++;
            lv4.setText(" ");
            r7.setText(s1);
            
            r7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count5==1) {
            String s1 = lv5.getText(); count5++;
            lv5.setText(" ");
            r6.setText(s1);
            
            r6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count6==1) {
            String s1 = lv6.getText(); count6++;
            lv6.setText(" ");
            r5.setText(s1);
            
            r5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count7==1) {
            String s1 = lv7.getText(); count7++;
            lv7.setText(" ");
            r4.setText(s1);
            
            r4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count8==1) {
            String s1 = lv8.getText(); count8++;
            lv8.setText(" ");
            r3.setText(s1);
            
            r3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count9==1) {
            String s1 = lv9.getText(); count9++;
            lv9.setText(" ");
            r2.setText(s1);
            
            r2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else if(count10==1) {
            String s1 = lv10.getText(); count10++;
            lv10.setText(" ");
            r1.setText(s1);
            
            r1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0") , CornerRadii.EMPTY, new Insets(3))));
            lv10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        }
        else {
            full1.setText("Queue is empty");
           // full1.setTextFill(Paint.valueOf("#000000"));
        }

    }

    public void back(ActionEvent actionEvent) {
        HelloApplication.stage.show();
        HelloController.stage.close();
    }

    public void ref(ActionEvent actionEvent) {
        full1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
        count1=0;
        count2=0;
        count3=0;
        count4=0;
        count5=0;
        count6=0;
        count7=0;
        count8=0;
        count9=0;
        count10=0;
        lv1.setText("");
        lv2.setText("");
        lv3.setText("");
        lv4.setText("");
        lv5.setText("");
        lv6.setText("");
        lv7.setText("");
        lv8.setText("");
        lv9.setText("");
        lv10.setText("");
        r1.setText("");
        r2.setText("");
        r3.setText("");
        r4.setText("");
        r5.setText("");
        r6.setText("");
        r7.setText("");
        r8.setText("");
        r9.setText("");
        r10.setText("");
        full1.setText("");
        full.setText("");
        
        lv1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        lv10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        r10.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        insert.setText("");
        
    }
}
