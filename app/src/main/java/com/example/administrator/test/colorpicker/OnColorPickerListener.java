package com.example.administrator.test.colorpicker;


public interface OnColorPickerListener {
    void onColorCancel(ColorPickerDialog dialog);
    void onColorChange(ColorPickerDialog dialog, int color);
    void onColorConfirm(ColorPickerDialog dialog, int color,int num);
}
