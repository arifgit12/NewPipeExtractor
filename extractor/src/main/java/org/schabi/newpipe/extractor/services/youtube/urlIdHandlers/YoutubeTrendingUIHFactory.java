package org.schabi.newpipe.extractor.services.youtube.urlIdHandlers;

/*
 * Created by Christian Schabesberger on 12.08.17.
 *
 * Copyright (C) Christian Schabesberger 2018 <chris.schabesberger@mailbox.org>
 * YoutubeTrendingUIHFactory.java is part of NewPipe.
 *
 * NewPipe is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NewPipe is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NewPipe.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.schabi.newpipe.extractor.uih.ListUIHFactory;
import org.schabi.newpipe.extractor.utils.Parser;

import java.util.List;

public class YoutubeTrendingUIHFactory extends ListUIHFactory {

    public String getUrl(String id, List<String> contentFilters, String sortFilter) {
        return "https://www.youtube.com/feed/trending";
    }

    @Override
    public String getId(String url) {
        return "Trending";
    }

    @Override
    public boolean onAcceptUrl(final String url) {
        return Parser.isMatch("^(https://|http://|)(www.|m.|)youtube.com/feed/trending(|\\?.*)$", url);
    }
}