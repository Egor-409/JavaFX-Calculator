package com.example.Calculator.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;

public class MainController {

    private StringBuilder currentInput = new StringBuilder(); 
    private double first = 0; 
    private double second = 0; 
    private String operand = ""; 
    @FXML
    private TextField display;

    
    @FXML
    void OneButtonClick(ActionEvent event) {
        currentInput.append("1");
        display.setText(currentInput.toString());
    }

    @FXML
    void TwoButtonClick(ActionEvent event) {
        currentInput.append("2");
        display.setText(currentInput.toString());
    }

    @FXML
    void ThreeButtonClick(ActionEvent event) {
        currentInput.append("3");
        display.setText(currentInput.toString());
    }

    @FXML
    void FourButtonClick(ActionEvent event) {
        currentInput.append("4");
        display.setText(currentInput.toString());
    }

    @FXML
    void FiveButtonClick(ActionEvent event) {
        currentInput.append("5");
        display.setText(currentInput.toString());
    }

    @FXML
    void SixButtonClick(ActionEvent event) {
        currentInput.append("6");
        display.setText(currentInput.toString());
    }

    @FXML
    void SevenButtonClick(ActionEvent event) {
        currentInput.append("7");
        display.setText(currentInput.toString());
    }

    @FXML
    void EightButtonClick(ActionEvent event) {
        currentInput.append("8");
        display.setText(currentInput.toString());
    }

    @FXML
    void NineButtonClick(ActionEvent event) {
        currentInput.append("9");
        display.setText(currentInput.toString());
    }

    @FXML
    void ZeroButtonClick(ActionEvent event) {
        currentInput.append("0");
        display.setText(currentInput.toString());
    }

   
    @FXML
    void PlusButtonClick(ActionEvent event) {
        if (currentInput.length() > 0) {
            first = Double.parseDouble(currentInput.toString());
            operand = "+";
            currentInput.setLength(0); 
            display.setText("+");
        }
    }

    @FXML
    void MinusButtonClick(ActionEvent event) {
        if (currentInput.length() > 0) {
            first = Double.parseDouble(currentInput.toString());
            operand = "-";
            currentInput.setLength(0); 
            display.setText("-");
        }
    }

    @FXML
    void MltiplicationButtonClick(ActionEvent event) {
        if (currentInput.length() > 0) {
            first = Double.parseDouble(currentInput.toString());
            operand = "*";
            currentInput.setLength(0); 
            display.setText("*");
        }
    }

    @FXML
    void DivisionButtonClick(ActionEvent event) {
        if (currentInput.length() > 0) {
            first = Double.parseDouble(currentInput.toString());
            operand = "/";
            currentInput.setLength(0); 
            display.setText("/");
        }
    }

    
    @FXML
    void ResButtonClick(ActionEvent event) {
        if (currentInput.length() > 0) {
            second = Double.parseDouble(currentInput.toString());
            currentInput.setLength(0);

           
            double result = 0;
            switch (operand) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                    } else {
                        display.setText("Error");
                        return; 
                    }
                    break;
                default:
                    display.setText("Error");
                    return;
            }

          
            display.setText(String.valueOf(result));
            first = result; 
            operand = ""; 
        }
    }
    
    @FXML
    void CleanButtonClick(ActionEvent event) {
        
        display.clear();

      
        currentInput.setLength(0);  
        first = 0; 
        second = 0;  
        operand = "";  
    }

 
    @FXML
    void initialize() {
        display.setEditable(false);
        display.setFocusTraversable(false);
   
   

    }

}
