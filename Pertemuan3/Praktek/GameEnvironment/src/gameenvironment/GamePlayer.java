/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author ASUS
 */
public class GamePlayer {
    double width = 0;
    double height = 0;
    int positionX = 0;
    int positionY = 0;

    public GamePlayer() {
    }
    public GamePlayer(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public GamePlayer(double width, double height, int positionX, int positionY) {
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
        System.out.println("Player is running");
    }
    public void Run(int incrementX) {
        this.positionX += incrementX ;
        System.out.println("Player still running... current X position = " + this.positionX);
    }
    public void display() {
        System.out.println("\n-----------Player Position-----------");
        System.out.println("Width's player  : " + this.width);
        System.out.println("Height's Player : " + this.height);
        System.out.println("X Position      : " + this.positionX);
        System.out.println("Y Position      : " + this.positionY);
    }
}