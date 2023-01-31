public class BmiService {
    public float calculate(float weight, float height) {
        float index = (float) (weight / Math.pow(height, 2));
        float indexIn = Math.round(index * 100);
        float indexOut = indexIn / 100;
        return indexOut;
    }

}
