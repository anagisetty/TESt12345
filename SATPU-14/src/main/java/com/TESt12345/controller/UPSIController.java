package com.TEST12345.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TEST12345.entity.UPSI;
import com.TEST12345.service.UPSIService;

@RestController
@RequestMapping("/upsi")
public class UPSIController {
	
	@Autowired
	UPSIService upsiService;

	@GetMapping("/findByDateOfSharingUPSIAndPersonsSharedWithAndNatureOfUPSIAndDetailsOfUPSIAndLegitimatePurposeOfSharingUPSI")
	public UPSI findByDateOfSharingUPSIAndPersonsSharedWithAndNatureOfUPSIAndDetailsOfUPSIAndLegitimatePurposeOfSharingUPSI(Date dateOfSharingUPSI, String personsSharedWith, String natureOfUPSI, String detailsOfUPSI,
			String legitimatePurposeOfSharingUPSI) {
		return upsiService.findByDateOfSharingUPSIAndPersonsSharedWithAndNatureOfUPSIAndDetailsOfUPSIAndLegitimatePurposeOfSharingUPSI(dateOfSharingUPSI, personsSharedWith, natureOfUPSI, detailsOfUPSI, legitimatePurposeOfSharingUPSI);
	}
	
	@GetMapping("/findByAttachmentAndSupplierOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndReceiverOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndAuditTrailAndNotesIfAny")
	public UPSI findByAttachmentAndSupplierOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndReceiverOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndAuditTrailAndNotesIfAny(String attachment, String supplierOfInformation,
			String nameOfThePerson, String panOrAnyOtherIdentifier, String receiverOfInformation, String nameOfThePerson, String panOrAnyOtherIdentifier, String auditTrail, String notesIfAny) {
		return upsiService.findByAttachmentAndSupplierOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndReceiverOfInformationAndNameOfThePersonAndPanOrAnyOtherIdentifierAndAuditTrailAndNotesIfAny(attachment, supplierOfInformation, nameOfThePerson, panOrAnyOtherIdentifier, receiverOfInformation, nameOfThePerson, panOrAnyOtherIdentifier, auditTrail, notesIfAny);
	}
	
	@GetMapping("/findByDateOfSharingUPSIWithTimeStamp")
	public UPSI findByDateOfSharingUPSIWithTimeStamp(Date dateOfSharingUPSIWithTimeStamp) {
		return upsiService.findByDateOfSharingUPSIWithTimeStamp(dateOfSharingUPSIWithTimeStamp);
	}
	
	@GetMapping("/findByPersonsSharedWith")
	public UPSI findByPersonsSharedWith(String personsSharedWith) {
		return upsiService.findByPersonsSharedWith(personsSharedWith);
	}
	
	@GetMapping("/findByNatureOfUPSI")
	public UPSI findByNatureOfUPSI(String natureOfUPSI) {
		return upsiService.findByNatureOfUPSI(natureOfUPSI);
	}
	
	@GetMapping("/findByDetailsOfUPSI")
	public UPSI findByDetailsOfUPSI(String detailsOfUPSI) {
		return upsiService.findByDetailsOfUPSI(detailsOfUPSI);
	}
	
	@GetMapping("/findByLegitimatePurposeOfSharingUPSI")
	public UPSI findByLegitimatePurposeOfSharingUPSI(String legitimatePurposeOfSharingUPSI) {
		return upsiService.findByLegitimatePurposeOfSharingUPSI(legitimatePurposeOfSh