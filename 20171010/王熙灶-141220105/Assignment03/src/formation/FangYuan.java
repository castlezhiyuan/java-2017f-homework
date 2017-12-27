package formation;

import space.Space;

/**
 * 方圆阵法：
 *         X
 *      X     X
 *   X
 *      X     X
 *         X
 */
public class FangYuan extends BasicFormation {
    /**
     * @param space, 摆放阵法的空间
     * @param x, 阵头的x方向位置
     * @param y, 阵头的y方向位置
     * 这里的x方向表示从上到下，y方向表示从左到右
     */
    public FangYuan(Space space, int x, int y) {
        super(space, x, y);
        positions[0] = space.getPos(current_x, current_y);
        positions[1] = space.getPos(current_x-1, current_y+1);
        positions[2] = space.getPos(current_x+1, current_y+1);
        positions[3] = space.getPos(current_x-2, current_y+2);
        positions[4] = space.getPos(current_x+2, current_y+2);
        positions[5] = space.getPos(current_x-1, current_y+3);
        positions[6] = space.getPos(current_x+1, current_y+3);
    }
}
