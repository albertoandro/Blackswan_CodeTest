/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package alberto.avengers.injector.components;

import javax.inject.Singleton;

import alberto.avengers.AvengersApplication;
import alberto.avengers.injector.AppModule;
import alberto.avengers.model.repository.Repository;
import dagger.Component;

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    AvengersApplication app();
    Repository dataRepository();
}
