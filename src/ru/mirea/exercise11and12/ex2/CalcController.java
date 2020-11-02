package ru.mirea.exercise11and12.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController {

    private String arg1 = "";
    private String arg2 = "";
    private String op1;
    private String field = "";
    private boolean ravn = false;
    @FXML
    private TextField text;

    public void bCn(ActionEvent actionEvent) {
        String num = ((Button)actionEvent.getSource()).getText();
        if(ravn)
        {
            bCc();
            ravn = false;
        }
        if(op1 == null)
            arg1 += num;
        else
            arg2 += num;
        field += num;
        text.setText(field);
    }

    public void bCp()// +
    {
        if(ravn)
        {
            bCc();
            ravn = false;
        }
        op1 = "+";
        field += " + ";
        text.setText(field);
    }
    public void bCu()// *
    {
        if(ravn)
        {
            bCc();
            ravn = false;
        }
        op1 = "*";
        field += " * ";
        text.setText(field);
    }
    public void bCm()// -
    {
        if(ravn)
        {
            bCc();
            ravn = false;
        }
        if(arg1.isEmpty()) {
            arg1 += '-';
            field += "-";
            text.setText(field);
            return;
        }
        op1 = "-";
        field += " - ";
        text.setText(field);
    }
    public void bCd()// /
    {
        if(ravn)
        {
            bCc();
            ravn = false;
        }
        op1 = "/";
        field += " / ";
        text.setText(field);
    }
    public void bCb()// удалить
    {
        if(!ravn)
        {
            if(op1 == null)
            {
                arg1 = arg1.substring(0, arg1.length()-1);
                field = arg1;
                text.setText(field);
            } else {
                if (!arg2.isEmpty())
                {
                    arg2 = arg2.substring(0, arg2.length()-1);
                    field = field.substring(0, field.length()-1);
                    text.setText(field);
                } else {
                    op1 = null;
                    field = field.substring(0, field.length()-3);
                    text.setText(field);
                }
            }
        }
    }
    public void bCc()// очистить
    {
        arg1 = "";
        op1 = null;
        arg2 = "";
        field = "";
        text.setText(field);
    }
    public void bCr()// равно
    {
        ravn = true;
        if(arg1.isEmpty() || arg2.isEmpty())
        {
            field = "Ошибка";
            text.setText("Ошибка");
            return;
        }
        field += " = ";
        String rez = "";
        switch (op1)
        {
            case "+":
                rez = (int)(Integer.parseInt(arg1) + Integer.parseInt(arg2)) + "";
                break;
            case "-":
                rez = (int)(Integer.parseInt(arg1) - Integer.parseInt(arg2)) + "";
                break;
            case "*":
                rez = (int)(Integer.parseInt(arg1) * Integer.parseInt(arg2)) + "";
                break;
            case "/":
                rez = (int)(Integer.parseInt(arg1) / Integer.parseInt(arg2)) + "";
        }
        field += rez;
        text.setText(field);
    }
}