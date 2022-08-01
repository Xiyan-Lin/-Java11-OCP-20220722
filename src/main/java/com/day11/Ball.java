package com.day11;

import java.util.Objects;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = 89 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ball other = (Ball) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }
    
    
    
    /*
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ball)) {
            return false;
        }
        Ball ball = (Ball)obj;
        return color.equals(ball.color) && price == ball.price;
    }

    @Override
    public int hashCode() {
        // 資料離散: 二個質數相乘再乘上或加上有比較的屬性資料
        return 7 * 13 * price + color.hashCode();
    }
    */
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
    
}
