package com.TEST12345.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TEST12345.entity.UPSI;
import com.TEST12345.repository.UPSIRepository;

@Service
public class UPSIService {
	
	@Autowired
	UPSIRepository upsiRepository;

	public UPSI findByDateOfSharingUPSIAndPersonsSharedWithAndNatureOfUPSIAndDetailsOfUPSIAndLegitimatePurposeOfSharingUPSI(Date dateOfSharingUPSI, String personsSharedWith, String natureOfUPSI, String detailsOfUPSI,
			String legitimatePurposeOfSharingUPSI) {
		return upsiRepository.findByDateOfSharingUPSIAndPersonsSharedWithAndNatureOfUPSIAndDetailsOfUPSIAndLegitimatePurposeOfSharingUPSI(dateOfSharingUPSI, personsSharedWith, natureOfUPSI, detailsOfUPSI, legitimatePurposeOfSharingUPSI);
	}
	
	public UPSI findByAttachmentAndSupplierOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndReceiverOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndAuditTrailAndNotesIfAny(String attachment, String supplierOfInformation,
			String nameOfThePerson, String panOrAnyOtherIdentifier, String receiverOfInformation, String nameOfThePerson, String panOrAnyOtherIdentifier, String auditTrail, String notesIfAny) {
		return upsiRepository.findByAttachmentAndSupplierOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndReceiverOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndAuditTrailAndNotesIfAny(attachment, supplierOfInformation, nameOfThePerson, panOrAnyOtherIdentifier, receiverOfInformation, nameOfThePerson, panOrAnyOtherIdentifier, auditTrail, notesIfAny);
	}
	
	public UPSI findByDateOfSharingUPSIWithTimeStamp(Date dateOfSharingUPSIWithTimeStamp) {
		return upsiRepository.findByDateOfSharingUPSIWithTimeStamp(dateOfSharingUPSIWithTimeStamp);
	}
	
	public UPSI findByPersonsSharedWith(String personsSharedWith) {
		return upsiRepository.findByPersonsSharedWith(personsSharedWith);
	}
	
	public UPSI findByNatureOfUPSI(String natureOfUPSI) {
		return upsiRepository.findByNatureOfUPSI(natureOfUPSI);
	}
	
	public UPSI findByDetailsOfUPSI(String detailsOfUPSI) {
		return upsiRepository.findByDetailsOfUPSI(detailsOfUPSI);
	}
	
	public UPSI findByLegitimatePurposeOfSharingUPSI(String legitimatePurposeOfSharingUPSI) {
		return upsiRepository.findByLegitimatePurposeOfSharingUPSI(legitimatePurposeOfSharingUPSI);
	}

}