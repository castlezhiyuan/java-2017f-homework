package formation;

import space.Position;
import space.Space;

import java.util.Iterator;

/**
 * 默认阵法中只允许有七个位置
 */
public class BasicFormation implements Iterable<Position> {
    protected int current_x;
    protected int current_y;
    protected Space space;
    protected int no = 0;
    protected Position[] positions = new Position[7]; // 每个阵法只由七个位置构成

    /**
     * @param space, 摆放阵法的空间
     * @param x, 阵头的x方向位置
     * @param y, 阵头的y方向位置
     * 这里的x方向表示从上到下，y方向表示从左到右
     */
    public BasicFormation(Space space, int x, int y) {
        this.current_x = x;
        this.current_y = y;
        this.space = space;
    }

    /**
     * 恢复默认序数，重新开始获取位置
     */
    public void reset() {
        no = 0;
    }

    @Override
    public Iterator<Position> iterator() {
        return new FormationIterator();
    }

    private class FormationIterator implements Iterator<Position> {
        @Override
        public boolean hasNext() {
            return no < 7;
        }

        @Override
        public Position next() {
            return positions[no++];
        }
    }
}