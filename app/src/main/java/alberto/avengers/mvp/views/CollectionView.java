package alberto.avengers.mvp.views;

import java.util.List;

import alberto.avengers.model.entities.CollectionItem;

public interface CollectionView extends View {

	void showLoadingIndicator();

	void hideLoadingIndicator();

	void showItems(List<CollectionItem> items);
}
