package model;

// Generated 2015/1/12 �U�� 12:51:08 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * StoreInformation generated by hbm2java
 */
public class StoreInformation implements java.io.Serializable {

	private int storeId;
	private StoreMember storeMember;
	private String storeName;
	private String storeAddress;
	private String imgFileName;
	private byte[] storeImage;
	private String storeTel;
	private Double rentAreaCost;
	private Integer groupUpperLimit;
	private Set<StoreInformation_Image> storeInformationImages = new HashSet<StoreInformation_Image>(
			0);
	private Set<StoreScore> storeScores = new HashSet<StoreScore>(0);
	private RentalTime rentalTime;
	private Set<BoardGames> boardGameses = new HashSet<BoardGames>(0);

	public StoreInformation() {
	}

	public StoreInformation(int storeId, StoreMember storeMember) {
		this.storeId = storeId;
		this.storeMember = storeMember;
	}

	public StoreInformation(int storeId, StoreMember storeMember,
			String storeName, String storeAddress, String imgFileName,
			byte[] storeImage, String storeTel, Double rentAreaCost,
			Integer groupUpperLimit,
			Set<StoreInformation_Image> storeInformationImages,
			Set<StoreScore> storeScores, RentalTime rentalTime,
			Set<BoardGames> boardGameses) {
		this.storeId = storeId;
		this.storeMember = storeMember;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.imgFileName = imgFileName;
		this.storeImage = storeImage;
		this.storeTel = storeTel;
		this.rentAreaCost = rentAreaCost;
		this.groupUpperLimit = groupUpperLimit;
		this.storeInformationImages = storeInformationImages;
		this.storeScores = storeScores;
		this.rentalTime = rentalTime;
		this.boardGameses = boardGameses;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public StoreMember getStoreMember() {
		return this.storeMember;
	}

	public void setStoreMember(StoreMember storeMember) {
		this.storeMember = storeMember;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getStoreImage() {
		return this.storeImage;
	}

	public void setStoreImage(byte[] storeImage) {
		this.storeImage = storeImage;
	}

	public String getStoreTel() {
		return this.storeTel;
	}

	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

	public Double getRentAreaCost() {
		return this.rentAreaCost;
	}

	public void setRentAreaCost(Double rentAreaCost) {
		this.rentAreaCost = rentAreaCost;
	}

	public Integer getGroupUpperLimit() {
		return this.groupUpperLimit;
	}

	public void setGroupUpperLimit(Integer groupUpperLimit) {
		this.groupUpperLimit = groupUpperLimit;
	}

	public Set<StoreInformation_Image> getStoreInformationImages() {
		return this.storeInformationImages;
	}

	public void setStoreInformationImages(
			Set<StoreInformation_Image> storeInformationImages) {
		this.storeInformationImages = storeInformationImages;
	}

	public Set<StoreScore> getStoreScores() {
		return this.storeScores;
	}

	public void setStoreScores(Set<StoreScore> storeScores) {
		this.storeScores = storeScores;
	}

	public RentalTime getRentalTime() {
		return this.rentalTime;
	}

	public void setRentalTime(RentalTime rentalTime) {
		this.rentalTime = rentalTime;
	}

	public Set<BoardGames> getBoardGameses() {
		return this.boardGameses;
	}

	public void setBoardGameses(Set<BoardGames> boardGameses) {
		this.boardGameses = boardGameses;
	}

}
