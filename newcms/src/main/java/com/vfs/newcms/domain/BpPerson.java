package com.vfs.newcms.domain;

import java.sql.Timestamp;
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
 * BpPerson entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bp_person", catalog = "cms")
public class BpPerson implements java.io.Serializable {

	// Fields

	private Integer bp;
	private EducationDic educationDic;
	private IndustrySubtypeDic industrySubtypeDic;
	private ClassificationDic classificationDic;
	private MaritialStatusDic maritialStatusDic;
	private GenderDic genderDic;
	private IndustryTypeDic industryTypeDic;
	private IdTypeDic idTypeDic;
	private BpMaster bpMaster;
	private String name;
	private String nameEn;
	private Timestamp idCardIssueDate;
	private Timestamp idCardExpireDate;
	private String idCardNumber;

	// Constructors

	/** default constructor */
	public BpPerson() {
	}

	/** minimal constructor */
	public BpPerson(ClassificationDic classificationDic, GenderDic genderDic,
			IdTypeDic idTypeDic, BpMaster bpMaster, String idCardNumber) {
		this.classificationDic = classificationDic;
		this.genderDic = genderDic;
		this.idTypeDic = idTypeDic;
		this.bpMaster = bpMaster;
		this.idCardNumber = idCardNumber;
	}

	/** full constructor */
	public BpPerson(EducationDic educationDic,
			IndustrySubtypeDic industrySubtypeDic,
			ClassificationDic classificationDic,
			MaritialStatusDic maritialStatusDic, GenderDic genderDic,
			IndustryTypeDic industryTypeDic, IdTypeDic idTypeDic,
			BpMaster bpMaster, String name, String nameEn,
			Timestamp idCardIssueDate, Timestamp idCardExpireDate,
			String idCardNumber) {
		this.educationDic = educationDic;
		this.industrySubtypeDic = industrySubtypeDic;
		this.classificationDic = classificationDic;
		this.maritialStatusDic = maritialStatusDic;
		this.genderDic = genderDic;
		this.industryTypeDic = industryTypeDic;
		this.idTypeDic = idTypeDic;
		this.bpMaster = bpMaster;
		this.name = name;
		this.nameEn = nameEn;
		this.idCardIssueDate = idCardIssueDate;
		this.idCardExpireDate = idCardExpireDate;
		this.idCardNumber = idCardNumber;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "bp", unique = true, nullable = false)
	public Integer getBp() {
		return this.bp;
	}

	public void setBp(Integer bp) {
		this.bp = bp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "education_id")
	public EducationDic getEducationDic() {
		return this.educationDic;
	}

	public void setEducationDic(EducationDic educationDic) {
		this.educationDic = educationDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "industry_sub_type_id")
	public IndustrySubtypeDic getIndustrySubtypeDic() {
		return this.industrySubtypeDic;
	}

	public void setIndustrySubtypeDic(IndustrySubtypeDic industrySubtypeDic) {
		this.industrySubtypeDic = industrySubtypeDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classification_id", nullable = false)
	public ClassificationDic getClassificationDic() {
		return this.classificationDic;
	}

	public void setClassificationDic(ClassificationDic classificationDic) {
		this.classificationDic = classificationDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maritial_status_id")
	public MaritialStatusDic getMaritialStatusDic() {
		return this.maritialStatusDic;
	}

	public void setMaritialStatusDic(MaritialStatusDic maritialStatusDic) {
		this.maritialStatusDic = maritialStatusDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gender_id", nullable = false)
	public GenderDic getGenderDic() {
		return this.genderDic;
	}

	public void setGenderDic(GenderDic genderDic) {
		this.genderDic = genderDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "industry_type_id")
	public IndustryTypeDic getIndustryTypeDic() {
		return this.industryTypeDic;
	}

	public void setIndustryTypeDic(IndustryTypeDic industryTypeDic) {
		this.industryTypeDic = industryTypeDic;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_card_type_id", nullable = false)
	public IdTypeDic getIdTypeDic() {
		return this.idTypeDic;
	}

	public void setIdTypeDic(IdTypeDic idTypeDic) {
		this.idTypeDic = idTypeDic;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public BpMaster getBpMaster() {
		return this.bpMaster;
	}

	public void setBpMaster(BpMaster bpMaster) {
		this.bpMaster = bpMaster;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name_en", length = 100)
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Column(name = "id_card_issue_date", length = 19)
	public Timestamp getIdCardIssueDate() {
		return this.idCardIssueDate;
	}

	public void setIdCardIssueDate(Timestamp idCardIssueDate) {
		this.idCardIssueDate = idCardIssueDate;
	}

	@Column(name = "id_card_expire_date", length = 19)
	public Timestamp getIdCardExpireDate() {
		return this.idCardExpireDate;
	}

	public void setIdCardExpireDate(Timestamp idCardExpireDate) {
		this.idCardExpireDate = idCardExpireDate;
	}

	@Column(name = "id_card_number", nullable = false, length = 45)
	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

}