/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package alberto.avengers.injector.components;

import dagger.Component;
import alberto.avengers.domain.GetCharacterInformationUsecase;
import alberto.avengers.domain.GetCollectionUsecase;
import alberto.avengers.injector.Activity;
import alberto.avengers.injector.modules.ActivityModule;
import alberto.avengers.injector.modules.AvengerInformationModule;
import alberto.avengers.views.activities.CharacterDetailActivity;
import alberto.avengers.views.activities.CollectionActivity;

@Activity
@Component(dependencies = AppComponent.class, modules = {AvengerInformationModule.class, ActivityModule.class})
public interface AvengerInformationComponent extends ActivityComponent {

    void inject (CharacterDetailActivity detailActivity);

    void inject (CollectionActivity detailActivity);

    GetCharacterInformationUsecase getCharacerInformationUsecase();
    GetCollectionUsecase getCollectionUsecase();
}
