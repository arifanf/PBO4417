/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvirontment;

/**
 *
 * @author ASUS
 */
public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GameEnemy() {
    }
    public GameEnemy(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public GameEnemy(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    double getWidth() {
        return this.width;
    }
    double getHeight() {
        return this.height;
    }
    int getX() {
        return this.positionX;
    }
    int getY() {
        return this.positionY;
    }
    public void Run() {
        System.out.println("Enemy is running");
    }
    public void Run(int incrementX) {
        this.positionX += incrementX ;
        System.out.println("Enemy still running... current X position = " + this.positionX);
    }
    public void display() {
        System.out.println("\n-----------Enemy Position-----------");
        System.out.println("Width's Enemy  : " + this.width);
        System.out.println("Height's Enemy : " + this.height);
        System.out.println("X Position     : " + this.positionX);
        System.out.println("Y Position     : " + this.positionY);
    }
}