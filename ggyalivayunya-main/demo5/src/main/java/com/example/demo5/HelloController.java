package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.EventObject;

public class HelloController {
    @FXML
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13;
    @FXML
    private Pane pane1, pane2;
    @FXML
    private TextField textField1;
    @FXML
    private Label  label2, label3;


    @FXML
    private void button1_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button1.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #8c7373;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button2_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button2.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #8c7373;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button3_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button3.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #8c7373;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button4_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button4.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #8c7373;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button5_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button5.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #8c7373;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button6_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button6.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #8c7373;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button7_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button7.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #8c7373;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button8_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button8.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #8c7373;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

    @FXML
    private void button9_Click()
    {
        label3.setVisible(false);
        textField1.setStyle("-fx-background-color:  #C0C0C0;");
        String getName = button9.getText();
        textField1.setText(getName);
        pane2.setVisible(true);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #8c7373;");
    }


    @FXML
    private void button10_Click()                   //сохранение в зависимости от нажатого места
    {
        if (button1.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button1);
        }
        else if (button2.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button2);
        }
        else if (button3.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button3);
        }
        else if (button4.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button4);
        }
        else if (button5.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button5);
        }
        else if (button6.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button6);
        }
        else if (button7.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button7);
        }
        else if (button8.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button8);
        }
        else if (button9.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            saveClick(button9);
        }
    }
    @FXML
    private void saveClick(Button button)                           // метод, который сохраняет запись
    {
        String getName = textField1.getText();
        if (getName.equals("СВОБОДНО"))
        {
            label3.setVisible(true);
            textField1.setStyle("-fx-background-color:  #F4A460;");
        }
        else
        {
            label3.setVisible(false);
            textField1.setStyle("-fx-background-color:  #C0C0C0;");
            button.setText(getName);
            button.setStyle("-fx-background-color: #98FB98;");
            pane2.setVisible(false);
        }

    }


    @FXML
    private void button11_Click()                //бронь места, в зависимости от нажатой кнопки
    {
        if (button1.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button1);
        }
        else if (button2.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button2);
        }
        else if (button3.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button3);
        }
        else if (button4.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button4);
        }
        else if (button5.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button5);
        }
        else if (button6.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button6);
        }
        else if (button7.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button7);
        }
        else if (button8.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button8);
        }
        else if (button9.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            bookClick(button9);
        }
    }

    @FXML
    private void bookClick(Button button)              //метод, который бронирует
    {
        String getName = textField1.getText();
        if (getName.equals("СВОБОДНО"))
        {
            label3.setVisible(true);
            textField1.setStyle("-fx-background-color:  #F4A460;");
        }
        else
        {
            label3.setVisible(false);
            textField1.setStyle("-fx-background-color:  #C0C0C0;");
            button.setText(getName);
            button.setStyle("-fx-background-color: #F4A460;");
            pane2.setVisible(false);
        }
    }

    @FXML
    private void button12_Click()   //удаление в зависимости от выбранной кнопки
    {
        if (button1.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button1);
        }
        else if (button2.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button2);
        }
        else if (button3.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button3);
        }
        else if (button4.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button4);
        }
        else if (button5.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button5);
        }
        else if (button6.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button6);
        }
        else if (button7.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button7);
        }
        else if (button8.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button8);
        }
        else if (button9.getStyle().equals("-fx-background-color:  #8c7373;"))
        {
            deleteClick(button9);
        }
    }

    @FXML
    private void deleteClick(Button button)   //удаление
    {
        String getName = button.getText();
        textField1.setText(getName);
        button.setText("СВОБОДНО");
        button.setStyle("-fx-background-color:  #C0C0C0;");
        pane2.setVisible(false);
    }

    @FXML
    private void button13_Click()
    {
        pane2.setVisible(false);
        button1.setStyle("-fx-background-color:  #C0C0C0;");
        button2.setStyle("-fx-background-color:  #C0C0C0;");
        button3.setStyle("-fx-background-color:  #C0C0C0;");
        button4.setStyle("-fx-background-color:  #C0C0C0;");
        button5.setStyle("-fx-background-color:  #C0C0C0;");
        button6.setStyle("-fx-background-color:  #C0C0C0;");
        button7.setStyle("-fx-background-color:  #C0C0C0;");
        button8.setStyle("-fx-background-color:  #C0C0C0;");
        button9.setStyle("-fx-background-color:  #C0C0C0;");
    }

}