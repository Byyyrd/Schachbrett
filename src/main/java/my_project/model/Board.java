package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Board extends GraphicalObject {
    private int size;
    private int squareSize;

    public Board(int size, int squareSize) {
        this.size = size;
        this.squareSize = squareSize;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawOneLoop(drawTool);
    }
    private void drawBoard(DrawTool drawTool){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j%2) % 2 == 0) {
                    drawTool.setCurrentColor(Color.WHITE);
                }else {
                    drawTool.setCurrentColor(Color.BLACK);
                }
                drawTool.drawFilledRectangle(i*squareSize,j*squareSize,squareSize,squareSize);

            }
        }
    }
    private void drawOneLoop(DrawTool drawTool){
        int j = 0;
        for (int i = 0; i < 144; i++) {
            if ((i + j%2) % 2 == 0) {
                drawTool.setCurrentColor(Color.WHITE);
            }else {
                drawTool.setCurrentColor(Color.BLACK);
            }
            System.out.println("i: "+ i + "j: " +j);
            drawTool.drawFilledRectangle((i-j*12)*50,j*50,squareSize,squareSize);
            if ((i+1) % 12 == 0){
                j++;
            }
        }
    }
}
