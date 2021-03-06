package pong;

public class Enemy {
    
    private int width, height, x, y;
    
    public Enemy(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    
    public void move(int dir) {
        
        switch(dir) {
            case 1:
                this.y -= 10;
                break;
            case -1:
                this.y += 10;
                break;
            case 0:
                this.y += 0;
                break;
        }
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
    
}