package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Board extends GraphicalObject {


    public Board(){
    }

    @Override
    public void draw(DrawTool drawTool) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j%2) % 2 == 0)
                    drawTool.setCurrentColor(Color.WHITE);
                else {
                    drawTool.setCurrentColor(Color.BLACK);
                }
                drawTool.drawFilledRectangle(i*50,j*50,50,50);
            }
        }
    }
}
