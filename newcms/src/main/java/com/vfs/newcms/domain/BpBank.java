package com.vfs.newcms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * BpBank entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bp_bank", catalog = "cms")
public class BpBank implements java.io.Serializable {

	// Fields

	private Integer bpId;
	private BpMaster bpMasterById;
	private BpMaster bpMasterByMajorBankId;
	private RelationshipDic relationshipDic;
	private BpMaster bpMasterByMinorBankId;
	private String accountName;
	private String accountNameEn;

	// Constructors

	/** default constructor */
	public BpBank() {
	}

	/** minimal constructor */
	public BpBank(BpMaster bpMasterById, BpMaster bpMasterByMajorBankId,
			RelationshipDic relationshipDic, BpMaster bpMasterByMinorBankId) {
		this.bpMasterById = bpMasterById;
		this.bpMasterByMajorBankId = bpMasterByMajorBankId;
		this.relationshipDic = relationshipDic;
		this.bpMasterByMinorBankId = bpMasterByMinorBankId;
	}

	/** full constructor */
	public BpBank(BpMaster bpMasterById, BpMaster bpMasterByMajorBankId,
			RelationshipDic relationshipDic, BpMaster bpMasterByMinorBankId,
			String accountName, String accountNameEn) {
		this.bpMasterById = bpMasterById;
		this.bpMasterByMajorBankId = bpMasterByMajorBankId;
		this.relationshipDic = relationshipDic;
		this.bpMasterByMinorBankId = bpMasterByMinorBankId;
		this.accountName = accountName;
		this.accountNameEn = accountNameEn;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "bp_id", unique = true, nullable = false)
	public Integer getBpId() {
		return this.bpId;
	}

	public void setBpId(Integer bpId) {
		this.bpId = bpId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public BpMaster getBpMasterById() {
		return this.bpMasterById;
	}

	public void setBpMasterById(BpMaster bpMasterById) {
		this.bpMasterById = bpMasterById;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "major_bank_id", nullable = false)
	public BpMaster getBpMasterByMajorBankId() {
		return this.bpMasterByMajorBankId;
	}

	public void setBpMasterByMajorBankId(BpMaster bpMasterByMajorBankId) {
		this.bpMasterByMajorBankId = bpMasterByMajorBankId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relationship_id", nullable = false)
	public RelationshipDic getRelationshipDic() {
		return this.relationshipDic;
	}

	public void setRelationshipDic(RelationshipDic relationshipDic) {
		this.relationshipDic = relationshipDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "minor_bank_id", nullable = false)
	public BpMaster getBpMasterByMinorBankId() {
		return this.bpMasterByMinorBankId;
	}

	public void setBpMasterByMinorBankId(BpMaster bpMasterByMinorBankId) {
		this.bpMasterByMinorBankId = bpMasterByMinorBankId;
	}

	@Column(name = "account_name", length = 200)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "account_name_en", length = 100)
	public String getAccountNameEn() {
		return this.accountNameEn;
	}

	public void setAccountNameEn(String accountNameEn) {
		this.accountNameEn = accountNameEn;
	}

}