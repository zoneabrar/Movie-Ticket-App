package com.example.demo9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import java.net.URL;
import java.util.ResourceBundle;

public class ForBst implements Initializable {

    @FXML
    public Label level_L_4;
    @FXML
    public Label level_L_5;
    @FXML
    public Label le_L6;
    @FXML
    public Label le_L7;
    @FXML
    public Label level_r_4;
    @FXML
    public Label level_r_5;
    @FXML
    public Label level_r_6;
    @FXML
    public Label level_r_7;
    @FXML
    public Label sorry;

            public Circle circle;
            public Circle circlel1;
            public Circle circlel2;
            public Circle circlel3;
            public Circle circlel4;
            public Circle circlel5;
            public Circle circlel6;
            public Circle circlel7;
            public Circle circler1;
            public Circle circler2;
            public Circle circler3;
            public Circle circler4;
            public Circle circler5;
            public Circle circler6;
            public Circle circler7;
            public Line liner1;
            public Line liner2;
            public Line liner3;
            public Line liner4;
            public Line liner5;
            public Line liner6;
            public Line liner7;
            public Line linel1;
            public Line linel2;
            public Line linel3;
            public Line linel4;
            public Line linel5;
            public Line linel6;
            public Line linel7;
            int count = 0;
    int count_L1 = 0;
    int count_L2 = 0;
    int count_L3 = 0;
    int count_L4 = 0;
    int count_L5 = 0;
    int count_L6 = 0;
    int count_L7 = 0;
    int count_R1 = 0;
    int count_R2 = 0;
    int count_R3 = 0;
    int count_R4 = 0;
    int count_R5 = 0;
    int count_R6 = 0;
    int count_R7 = 0;

    @FXML
    public TextField value;
    @FXML
    public Label level_r_1;
    @FXML
    public Label level_L_3;
    @FXML
    public Label level_r_3;
    @FXML
    public Label level_r_2;
    @FXML
    public Label label_root_1;
    @FXML
    public Label level_L_1;
    @FXML
    public Label level_L_2;

    @FXML
    public void ok_action(ActionEvent actionEvent) {
        sorry.setText("");
        sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("1c3345"), CornerRadii.EMPTY, new Insets(3))));
        String s = value.getText();
        
        
        /*if(s.equals(""))
        {
        	sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0f0"), CornerRadii.EMPTY, new Insets(3))));                 #1c3345
        	sorry.setText("Error: Input Blank");
        	ref(actionEvent);
        }*/
        if(value.getText().isEmpty()) {
            sorry.setText("Please enter a value");
            sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("#00b0F0"), CornerRadii.EMPTY, new Insets(3))));
        }
       else if (count == 0) {
            label_root_1.setText(s);
            count++;
            															// circle.setStroke(Paint.valueOf("#ffffff")); line.setStroke(Color.RED);
            circle.setFill(Paint.valueOf("#ffbf00"));
            circle.setStroke(Paint.valueOf("#ffffff"));
        } else {
            String root = label_root_1.getText();
            int i = Integer.parseInt(root.trim());
            int i_2 = Integer.parseInt(s.trim());
            if (i <= i_2) {
                if (count_L1 == 0) {
                    level_L_1.setText(s);
                    count_L1++;
                    circlel1.setFill(Paint.valueOf("#ffbf00"));
                    circlel1.setStroke(Paint.valueOf("#ffffff"));
                    linel1.setStroke(Paint.valueOf("#ffffff"));
                } else {
                    root = level_L_1.getText();
                    i = Integer.parseInt(root.trim());
                    if (i <= i_2) {
                        if (count_L3 == 0) {                                                   /*

                                                                            root = label_root_1.getText();
                                                                            i = Integer.parseInt(root.trim());

                                                                            */
                            level_L_3.setText(s);
                            count_L3++;
                            circlel3.setFill(Paint.valueOf("#ffbf00"));
                            circlel3.setStroke(Paint.valueOf("#ffffff"));
                            linel3.setStroke(Paint.valueOf("#ffffff"));
                        } else {
                            root = level_L_3.getText();
                            i = Integer.parseInt(root.trim());
                            if (i <= i_2) {
                                if (count_L7 == 0) {
                                    le_L7.setText(s);
                                    count_L7++;
                                    circlel7.setFill(Paint.valueOf("#ffbf00"));
                                    circlel7.setStroke(Paint.valueOf("#ffffff"));
                                    linel7.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            } else {
                                if (count_L6 == 0) {
                                    le_L6.setText(s);
                                    count_L6++;
                                    circlel6.setFill(Paint.valueOf("#ffbf00"));
                                    circlel6.setStroke(Paint.valueOf("#ffffff"));
                                    linel6.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            }

                        }
                    } else {
                        if (count_L2 == 0) {
                            level_L_2.setText(s);
                            count_L2++;
                            circlel2.setFill(Paint.valueOf("#ffbf00"));
                            circlel2.setStroke(Paint.valueOf("#ffffff"));
                            linel2.setStroke(Paint.valueOf("#ffffff"));
                        } else {
                            root = level_L_2.getText();
                            i = Integer.parseInt(root.trim());
                            if (i <= i_2) {
                                if (count_L5 == 0) {
                                    level_L_5.setText(s);
                                    count_L5++;
                                    circlel5.setFill(Paint.valueOf("#ffbf00"));
                                    circlel5.setStroke(Paint.valueOf("#ffffff"));
                                    linel5.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            } else {
                                if (count_L4 == 0) {
                                    level_L_4.setText(s);
                                    count_L4++;
                                    circlel4.setFill(Paint.valueOf("#ffbf00"));
                                    circlel4.setStroke(Paint.valueOf("#ffffff"));
                                    linel4.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            }
                        }
                    }
                }
            } else {
                if (count_R1 == 0) {
                    level_r_1.setText(s);
                    count_R1++;
                    circler1.setFill(Paint.valueOf("#ffbf00"));
                    circler1.setStroke(Paint.valueOf("#ffffff"));
                    liner1.setStroke(Paint.valueOf("#ffffff"));
                } else {
                    root = level_r_1.getText();
                    i = Integer.parseInt(root.trim());
                    if (i <= i_2) {
                        if (count_R3 == 0) {
                            level_r_3.setText(s);
                            count_R3++;
                            circler3.setFill(Paint.valueOf("#ffbf00"));
                            circler3.setStroke(Paint.valueOf("#ffffff"));
                            liner3.setStroke(Paint.valueOf("#ffffff"));
                        } else {
                            root = level_r_3.getText();
                            i = Integer.parseInt(root.trim());
                            if (i <= i_2) {
                                if (count_R7 == 0) {
                                    level_r_7.setText(s);
                                    count_R7++;
                                    circler7.setFill(Paint.valueOf("#ffbf00"));
                                    circler7.setStroke(Paint.valueOf("#ffffff"));
                                    liner7.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            } else {
                                if (count_R6 == 0) {
                                    level_r_6.setText(s);
                                    count_R6++;
                                    circler6.setFill(Paint.valueOf("#ffbf00"));
                                    circler6.setStroke(Paint.valueOf("#ffffff"));
                                    liner6.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }

                            }
                        }
                    } else {
                        if (count_R2 == 0) {
                            level_r_2.setText(s);
                            count_R2++;
                            circler2.setFill(Paint.valueOf("#ffbf00"));
                            circler2.setStroke(Paint.valueOf("#ffffff"));
                            liner2.setStroke(Paint.valueOf("#ffffff"));
                        } else {
                            root = level_r_2.getText();
                            i = Integer.parseInt(root.trim());
                            if (i <= i_2) {
                                if (count_R5 == 0) {
                                    level_r_5.setText(s);
                                    count_R5++;
                                    circler5.setFill(Paint.valueOf("#ffbf00"));
                                    circler5.setStroke(Paint.valueOf("#ffffff"));
                                    liner5.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            } else {
                                if (count_R4 == 0) {
                                    level_r_4.setText(s);
                                    count_R4++;
                                    circler4.setFill(Paint.valueOf("#ffbf00"));
                                    circler4.setStroke(Paint.valueOf("#ffffff"));
                                    liner4.setStroke(Paint.valueOf("#ffffff"));
                                } else {
                                    sorry.setText("Sorry! Maximum Height Reached");
                                    sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("00b0f0"), CornerRadii.EMPTY, new Insets(3))));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


            public void back(ActionEvent actionEvent) {
                HelloApplication.stage.show();
                HelloController.stage.close();
            }

            public void ref(ActionEvent actionEvent) {
                count = 0;
                count_L1 = 0;
                count_L2 = 0;
                count_L3 = 0;
                count_L4 = 0;
                count_L5 = 0;
                count_L6 = 0;
                count_L7 = 0;
                count_R1 = 0;
                count_R2 = 0;
                count_R3 = 0;
                count_R4 = 0;
                count_R5 = 0;
                count_R6 = 0;
                count_R7 = 0;
                
                circlel1.setFill(Paint.valueOf("#1c3345"));
                circlel1.setStroke(Paint.valueOf("#1c3345"));
                
                circle.setFill(Paint.valueOf("#1c3345"));
                circle.setStroke(Paint.valueOf("#1c3345"));
                
                linel1.setStroke(Paint.valueOf("#1c3345"));
                
                circlel2.setFill(Paint.valueOf("#1c3345"));
                circlel2.setStroke(Paint.valueOf("#1c3345"));
                
                linel2.setStroke(Paint.valueOf("#1c3345"));
                
                circlel3.setFill(Paint.valueOf("#1c3345"));
                circlel3.setStroke(Paint.valueOf("#1c3345"));
                
                linel3.setStroke(Paint.valueOf("#1c3345"));
                
                circlel4.setFill(Paint.valueOf("#1c3345"));
                circlel4.setStroke(Paint.valueOf("#1c3345"));
                
                linel4.setStroke(Paint.valueOf("#1c3345"));
                
                circlel5.setFill(Paint.valueOf("#1c3345"));
                circlel5.setStroke(Paint.valueOf("#1c3345"));
                
                circlel6.setFill(Paint.valueOf("#1c3345"));
                circlel6.setStroke(Paint.valueOf("#1c3345"));
                
                linel6.setStroke(Paint.valueOf("#1c3345"));
                linel5.setStroke(Paint.valueOf("#1c3345"));
                
                circlel7.setFill(Paint.valueOf("#1c3345"));
                circlel7.setStroke(Paint.valueOf("#1c3345"));
                
                linel7.setStroke(Paint.valueOf("#1c3345"));
                
                circler1.setFill(Paint.valueOf("#1c3345"));
                circler1.setStroke(Paint.valueOf("#1c3345"));
                
                liner1.setStroke(Paint.valueOf("#1c3345"));
                
                circler2.setFill(Paint.valueOf("#1c3345"));
                circler2.setStroke(Paint.valueOf("#1c3345"));
                
                liner2.setStroke(Paint.valueOf("#1c3345"));
                
                circler3.setFill(Paint.valueOf("#1c3345"));
                circler3.setStroke(Paint.valueOf("#1c3345"));
                
                liner3.setStroke(Paint.valueOf("#1c3345"));
                
                circler4.setFill(Paint.valueOf("#1c3345"));
                circler4.setStroke(Paint.valueOf("#1c3345"));
                
                liner4.setStroke(Paint.valueOf("#1c3345"));
                
                circler5.setFill(Paint.valueOf("#1c3345"));
                circler5.setStroke(Paint.valueOf("#1c3345"));
                
                liner5.setStroke(Paint.valueOf("#1c3345"));
                
                circler6.setFill(Paint.valueOf("#1c3345"));
                circler6.setStroke(Paint.valueOf("#1c3345"));
                
                liner6.setStroke(Paint.valueOf("#1c3345"));
                
                circler7.setFill(Paint.valueOf("#1c3345"));
                circler7.setStroke(Paint.valueOf("#1c3345"));
                
                liner7.setStroke(Paint.valueOf("#1c3345"));
                
                label_root_1.setText("");
                level_L_1.setText("");
                level_L_2.setText("");
                level_L_3.setText("");
                level_L_4.setText("");
                level_L_5.setText("");
                le_L6.setText("");
                le_L7.setText("");
                level_r_1.setText("");
                level_r_2.setText("");
                level_r_3.setText("");
                level_r_4.setText("");
                level_r_5.setText("");
                level_r_6.setText("");
                level_r_7.setText("");
                sorry.setText("");
                sorry.setBackground(new Background(new BackgroundFill(Paint.valueOf("#1c3345"), CornerRadii.EMPTY, new Insets(3))));
                value.setText("");

            }
        }
