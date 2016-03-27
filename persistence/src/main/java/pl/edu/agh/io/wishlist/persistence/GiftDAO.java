package pl.edu.agh.io.wishlist.persistence;

import pl.edu.agh.io.wishlist.domain.Gift;

import java.util.List;

public interface GiftDAO {
    Gift get(Long giftID);
    List<Gift> getAll(Long userID);
    boolean insert(Gift gift);
    boolean remove(Long giftID);
    boolean update(Long giftID, Gift gift);
}
