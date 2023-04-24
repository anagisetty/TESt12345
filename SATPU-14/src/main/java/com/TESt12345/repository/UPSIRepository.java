package com.TEST12345.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.TEST12345.entity.UPSI;

public interface UPSIRepository extends JpaRepository<UPSI, Long> {
	
	@Query("SELECT u FROM UPSI u WHERE u.dateOfSharingUPSI = :dateOfSharingUPSI AND u.personsSharedWith = :personsSharedWith AND u.natureOfUPSI = :natureOfUPSI AND u.detailsOfUPSI = :detailsOfUPSI AND u.legitimatePurposeOfSharingUPSI = :legitimatePurposeOfSharingUPSI")
	UPSI findByDateOfSharingUPSIAndPersonsSharedWithAndNatureOfUPSIAndDetailsOfUPSIAndLegitimatePurposeOfSharingUPSI(@Param("dateOfSharingUPSI") Date dateOfSharingUPSI, @Param("personsSharedWith") String personsSharedWith, @Param("natureOfUPSI") String natureOfUPSI, @Param("detailsOfUPSI") String detailsOfUPSI, @Param("legitimatePurposeOfSharingUPSI") String legitimatePurposeOfSharingUPSI);

	@Query("SELECT u FROM UPSI u WHERE u.attachment = :attachment AND u.supplierOfInformation = :supplierOfInformation AND u.nameOfThePerson = :nameOfThePerson AND u.panOrAnyOtherIdentifier = :panOrAnyOtherIdentifier AND u.receiverOfInformation = :receiverOfInformation AND u.nameOfThePerson = :nameOfThePerson AND u.panOrAnyOtherIdentifier = :panOrAnyOtherIdentifier AND u.auditTrail = :auditTrail AND u.notesIfAny = :notesIfAny")
	UPSI findByAttachmentAndSupplierOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndReceiverOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndAuditTrailAndNotesIfAny(@Param("attachment") String attachment, @Param("supplierOfInformation") String supplierOfInformation, @Param("nameOfThePerson") String nameOfThePerson, @Param("panOrAnyOtherIdentifier") String panOrAnyOtherIdentifier, @Param("receiverOfInformation") String receiverOfInformation, @Param("nameOfThePerson") String nameOfThePerson, @Param("panOrAnyOtherIdentifier") String panOrAnyOtherIdentifier, @Param("auditTrail") String auditTrail, @Param("notesIfAny") String notesIfAny);

	@Query("SELECT u FROM UPSI u WHERE u.dateOfSharingUPSIWithTimeStamp = :dateOfSharingUPSIWithTimeStamp")
	UPSI findByDateOfSharingUPSIWithTimeStamp(@Param("dateOfSharingUPSIWithTimeStamp") Date dateOfSharingUPSIWithTimeStamp);
	
	@Query("SELECT u FROM UPSI u WHERE u.personsSharedWith = :personsSharedWith")
	UPSI findByPersonsSharedWith(@Param("personsSharedWith") String personsSharedWith);

	@Query("SELECT u FROM UPSI u WHERE u.natureOfUPSI = :natureOfUPSI")
	UPSI findByNatureOfUPSI(@Param("natureOfUPSI") String natureOfUPSI);
	
	@Query("SELECT u FROM UPSI u WHERE u.detailsOfUPSI = :detailsOfUPSI")
	UPSI findByDetailsOfUPSI(@Param("detailsOfUPSI") String detailsOfUPSI);
	
	@Query("SELECT u FROM UPSI u WHERE u.legitimatePurposeOfSharingUPSI = :legitimatePurposeOfSharingUPSI")
	UPSI findByLegitimatePurposeOfSharingUPSI(@Param("legitimatePurposeOfSharingUPSI") String legitimatePurposeOfSharingUPSI);

}