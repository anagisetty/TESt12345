package com.TEST12345.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "upsi")
public class UPSI {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "date_of_sharing_upsi")
	private Date dateOfSharingUPSI;
	
	@Column(name = "persons_shared_with")
	private String personsSharedWith;
	
	@Column(name = "nature_of_upsi")
	private String natureOfUPSI;
	
	@Column(name = "details_of_upsi")
	private String detailsOfUPSI;
	
	@Column(name = "legitimate_purpose_of_sharing_upsi")
	private String legitimatePurposeOfSharingUPSI;
	
	@Column(name = "attachment")
	private String attachment;
	
	@Column(name = "supplier_of_information")
	private String supplierOfInformation;
	
	@Column(name = "name_of_the_person")
	private String nameOfThePerson;
	
	@Column(name = "pan_or_any_other_identifier")
	private String panOrAnyOtherIdentifier;
	
	@Column(name = "receiver_of_information")
	private String receiverOfInformation;
	
	@Column(name = "audit_trail")
	private String auditTrail;
	
	@Column(name = "notes_if_any")
	private String notesIfAny;
	
	@Column(name = "date_of_sharing_upsi_with_timestamp")
	private Date dateOfSharingUPSIWithTimeStamp;
	
	public UPSI() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOfSharingUPSI() {
		return dateOfSharingUPSI;
	}

	public void setDateOfSharingUPSI(Date dateOfSharingUPSI) {
		this.dateOfSharingUPSI = dateOfSharingUPSI;
	}

	public String getPersonsSharedWith() {
		return personsSharedWith;
	}

	public void setPersonsSharedWith(String personsSharedWith) {
		this.personsSharedWith = personsSharedWith;
	}

	public String getNatureOfUPSI() {
		return natureOfUPSI;
	}

	public void setNatureOfUPSI(String natureOfUPSI) {
		this.natureOfUPSI = natureOfUPSI;
	}

	public String getDetailsOfUPSI() {
		return detailsOfUPSI;
	}

	public void setDetailsOfUPSI(String detailsOfUPSI) {
		this.detailsOfUPSI = detailsOfUPSI;
	}

	public String getLegitimatePurposeOfSharingUPSI() {
		return legitimatePurposeOfSharingUPSI;
	}

	public void setLegitimatePurposeOfSharingUPSI(String legitimatePurposeOfSharingUPSI) {
		this.legitimatePurposeOfSharingUPSI = legitimatePurposeOfSharingUPSI;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getSupplierOfInformation() {
		return supplierOfInformation;
	}

	public void setSupplierOfInformation(String supplierOfInformation) {
		this.supplierOfInformation = supplierOfInformation;
	}

	