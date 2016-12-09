/**
 * Created by vig on 10/31/16.
 */
public enum Resolution {
    HIGHT(1024, 768), LOW(640, 480), MEDIUM(768, 640);

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    Resolution(int x, int y) {
        this.width = x;
        this.height = y;
    }
}
