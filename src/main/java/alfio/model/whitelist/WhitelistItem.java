/**
 * This file is part of alf.io.
 *
 * alf.io is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * alf.io is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with alf.io.  If not, see <http://www.gnu.org/licenses/>.
 */
package alfio.model.whitelist;

import ch.digitalfondue.npjt.ConstructorAnnotationRowMapper.Column;
import lombok.Getter;

@Getter
public class WhitelistItem {

    private final int id;
    private final int whitelistId;
    private final String value;
    private final String description;


    public WhitelistItem(@Column("id") int id,
                         @Column("whitelist_id_fk") int whitelistId,
                         @Column("value") String value,
                         @Column("description") String description) {
        this.id = id;
        this.whitelistId = whitelistId;
        this.value = value;
        this.description = description;
    }
}