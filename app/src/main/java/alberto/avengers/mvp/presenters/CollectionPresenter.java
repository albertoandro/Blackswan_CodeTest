package alberto.avengers.mvp.presenters;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;

import alberto.avengers.model.entities.CollectionItem;
import alberto.avengers.mvp.views.View;
import alberto.avengers.domain.GetCollectionUsecase;
import alberto.avengers.mvp.views.CollectionView;

public class CollectionPresenter implements Presenter {
	private final GetCollectionUsecase mGetCollectionUsecase;
	private final Context mActivityContext;
	private int mCharacterId;
	private String mCollectionType;
	private CollectionView mCollectionView;

	@Inject
	public CollectionPresenter(GetCollectionUsecase getCollectionUsecase, Context activityContext) {
		mGetCollectionUsecase = getCollectionUsecase;
		mActivityContext = activityContext;
	}

	@Override public void onStart() {}

	@Override public void onStop() {}

	@Override
	public void onPause() {}

	@Override
	public void attachView(View v) {
		mCollectionView = (CollectionView) v;
	}

	@Override
	public void onCreate() {
		mGetCollectionUsecase.execute(mCollectionType).subscribe(
			this::onCollectionItemsReceived);
	}

	public void initialisePresenters(String collectionType, int characterId) {
		mCollectionType = collectionType;
		mCharacterId = characterId;
	}

	private void onCollectionItemsReceived(List<CollectionItem> items) {
		mCollectionView.hideLoadingIndicator();
		mCollectionView.showItems(items);
	}
}
