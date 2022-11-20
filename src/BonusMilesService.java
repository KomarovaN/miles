public class BonusMilesService {
    public int calculate (int price, int portion) {
        if (portion != 0) {
            return price / portion;
        }
        return 0;
    }
}
