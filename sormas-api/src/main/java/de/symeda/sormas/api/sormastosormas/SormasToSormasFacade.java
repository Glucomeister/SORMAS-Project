/*
 * SORMAS® - Surveillance Outbreak Response Management & Analysis System
 * Copyright © 2016-2020 Helmholtz-Zentrum für Infektionsforschung GmbH (HZI)
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package de.symeda.sormas.api.sormastosormas;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface SormasToSormasFacade {

	void saveSharedCases(SormasToSormasEncryptedDataDto encryptedData) throws SormasToSormasException, SormasToSormasValidationException;

	void saveSharedContacts(SormasToSormasEncryptedDataDto sharedContact) throws SormasToSormasException, SormasToSormasValidationException;

	void shareCases(List<String> caseUuids, SormasToSormasOptionsDto options) throws SormasToSormasException;

	void shareContacts(List<String> contactUuids, SormasToSormasOptionsDto options) throws SormasToSormasException;

	void returnCase(String caseUuid, SormasToSormasOptionsDto options) throws SormasToSormasException;

	void returnContact(String contactUuid, SormasToSormasOptionsDto options) throws SormasToSormasException;

	void saveReturnedCase(SormasToSormasEncryptedDataDto sharedCase) throws SormasToSormasException, SormasToSormasValidationException;

	void saveReturnedContact(SormasToSormasEncryptedDataDto sharedContact) throws SormasToSormasException, SormasToSormasValidationException;

	List<ServerAccessDataReferenceDto> getAvailableOrganizations();

	ServerAccessDataReferenceDto getOrganizationRef(String id);

	List<SormasToSormasShareInfoDto> getShareInfoIndexList(SormasToSormasShareInfoCriteria criteria, Integer first, Integer max);

	boolean isFeatureEnabled();
}
