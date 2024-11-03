package com.example.demo9;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Hash<k> implements Initializable {
    @FXML
    public Label in0;
    @FXML
    public Label in1;
    @FXML
    public Label in2;
    @FXML
    public Label in3;
    @FXML
    public Label in4;
    @FXML
    public Label in5;
    @FXML
    public Label in6;
    @FXML
    public Label in7;
    @FXML
    public Label in8;
    @FXML
    public Label in9;
    @FXML
    public Label in10;
    @FXML
    public TextField input;
    @FXML
    public Label index_display;
    @FXML
    public Label omg;
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int k;

    public Hash() {
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void ok(ActionEvent actionEvent) {
        String s = this.input.getText();
        int i = Integer.parseInt(s.trim());
        int mod = i % 10;
        String in;

        if (mod == 0) {
            if (this.count0 == 0) {
                this.in0.setText(s);
                ++this.count0;
                this.index_display.setText("Index : 0");
                
                this.in0.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in0.getText();
                this.in0.setText(in + " -> " + s);
                this.index_display.setText("Index : 0");
                
                this.in0.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 1) {
            if (this.count1 == 0) {
                this.in1.setText(s);
                ++this.count1;
                this.index_display.setText("Index : 1");
                
                this.in1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                 
            } else {
                in = this.in1.getText();
                this.in1.setText(in + " -> " + s);
                this.index_display.setText("Index : 1");
                
                this.in1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 2) {
            if (this.count2 == 0) {
                this.in2.setText(s);
                ++this.count2;
                this.index_display.setText("Index : 2");
                
                this.in2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in2.getText();
                this.in2.setText(in + " -> " + s);
                this.index_display.setText("Index : 2");
                
                this.in2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 3) {
            if (this.count3 == 0) {
                this.in3.setText(s);
                ++this.count3;
                this.index_display.setText("Index : 3");
                
                this.in3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in3.getText();
                this.in3.setText(in + " -> " + s);
                this.index_display.setText("Index : 3");
                
                this.in3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 4) {
            if (this.count4 == 0) {
                this.in4.setText(s);
                ++this.count4;
                this.index_display.setText("Index : 4");
                
                this.in4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in4.getText();
                this.in4.setText(in + " -> " + s);
                this.index_display.setText("Index : 4");
                
                this.in4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 5) {
            if (this.count5 == 0) {
                this.in5.setText(s);
                ++this.count5;
                this.index_display.setText("Index : 5");
                
                this.in5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in5.getText();
                this.in5.setText(in + " -> " + s);
                this.index_display.setText("Index : 5");
                
                this.in5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 6) {
            if (this.count6 == 0) {
                this.in6.setText(s);
                ++this.count6;
                this.index_display.setText("Index : 6");
                
                this.in6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in6.getText();
                this.in6.setText(in + " -> " + s);
                this.index_display.setText("Index : 6");
                
                this.in6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 7) {
            if (this.count7 == 0) {
                this.in7.setText(s);
                ++this.count7;
                this.index_display.setText("Index : 7");
                
                this.in7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in7.getText();
                this.in7.setText(in + " -> " + s);
                this.index_display.setText("Index : 7");
                
                this.in7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 8) {
            if (this.count8 == 0) {
                this.in8.setText(s);
                ++this.count8;
                this.index_display.setText("Index : 8");
                
                this.in8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in8.getText();
                this.in8.setText(in + " -> " + s);
                this.index_display.setText("Index : 8");
                
                this.in8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
            }
        } else if (mod == 9) {
            if (this.count9 == 0) {
                this.in9.setText(s);
                ++this.count9;
                this.index_display.setText("Index : 9");
                
                this.in9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                
            } else {
                in = this.in9.getText();
                this.in9.setText(in + " -> " + s);
                this.index_display.setText("Index : 9");
                
                this.in9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#ffc001"), CornerRadii.EMPTY, new Insets(3))));
                
                
            }
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
        count0=0;
        index_display.setText(" ");
        in0.setText(" ");
        in1.setText(" ");
        in2.setText(" ");
        in3.setText(" ");
        in4.setText(" ");
        in5.setText(" ");
        in6.setText(" ");
        in7.setText(" ");
        in8.setText(" ");
        in9.setText(" ");
        
        in0.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in5.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in6.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in7.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in8.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        in9.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345") , CornerRadii.EMPTY, new Insets(3))));
        input.setText(" ");
    }
}