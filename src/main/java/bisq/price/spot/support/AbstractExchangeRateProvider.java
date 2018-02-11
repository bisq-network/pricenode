/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.price.spot.support;

import bisq.price.spot.ExchangeRateProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractExchangeRateProvider implements ExchangeRateProvider {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    private final String name;
    private final String prefix;

    public AbstractExchangeRateProvider(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }
}
