/**
 * No.836
 * 给出两个矩形，判断它们是否重叠并返回结果。
 */
public class IsRectangleOverlap {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        double rec1MidX = (rec1[0] + rec1[2]) / 2.0;
        double rec1MidY = (rec1[1] + rec1[3]) / 2.0;
        double rec2MidX = (rec2[0] + rec2[2]) / 2.0;
        double rec2MidY = (rec2[1] + rec2[3]) / 2.0;
        double x = Math.abs(rec1MidX - rec2MidX);
        double y = Math.abs(rec1MidY - rec2MidY);
        double xLen = Math.abs(rec1[2] - rec1[0] + rec2[2] - rec2[0]);
        double yLen = Math.abs(rec1[3] - rec1[1] + rec2[3] - rec2[1]);
        return x < xLen / 2.0 && y < yLen / 2.0;
    }
}
