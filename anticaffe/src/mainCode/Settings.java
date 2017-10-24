package mainCode;

import javafx.beans.property.IntegerProperty;

public class Settings {

	private Boolean checkK;
	private Boolean checkT;
	private Boolean checkV;
	private Boolean check;
	private IntegerProperty priceHard;
	private IntegerProperty priceNormal;
	private IntegerProperty priceLight;
	private IntegerProperty priceForTea;
	private IntegerProperty priceOfMinUn;
	private IntegerProperty priceOfMinTo;
	private IntegerProperty priceOfVipUn;
	private IntegerProperty priceOfVipTo;
	private IntegerProperty peoplsVIPUn;
	private IntegerProperty peoplsVIPTo;
	private IntegerProperty priceOfNonTimeWik;
	private IntegerProperty priceOfNonTimeNW;
	private IntegerProperty priceStopCheck;
	
	public Settings(Boolean checkK, Boolean checkT, Boolean checkV, Boolean check) {
		this.checkK = checkK;
		this.checkT = checkT;
		this.checkV = checkV;
		this.check = check;
	}
	
	
	/**
	 * @return the checkK
	 */
	public Boolean getCheckK() {
		return checkK;
	}
	/**
	 * @param checkK the checkK to set
	 */
	public void setCheckK(Boolean checkK) {
		this.checkK = checkK;
	}
	/**
	 * @return the checkT
	 */
	public Boolean getCheckT() {
		return checkT;
	}
	/**
	 * @param checkT the checkT to set
	 */
	public void setCheckT(Boolean checkT) {
		this.checkT = checkT;
	}
	/**
	 * @return the checkV
	 */
	public Boolean getCheckV() {
		return checkV;
	}
	/**
	 * @param checkV the checkV to set
	 */
	public void setCheckV(Boolean checkV) {
		this.checkV = checkV;
	}
	/**
	 * @return the check
	 */
	public Boolean getCheck() {
		return check;
	}
	/**
	 * @param check the check to set
	 */
	public void setCheck(Boolean check) {
		this.check = check;
	}
	/**
	 * @return the priceHard
	 */
	public IntegerProperty getPriceHard() {
		return priceHard;
	}
	/**
	 * @param priceHard the priceHard to set
	 */
	public void setPriceHard(IntegerProperty priceHard) {
		this.priceHard = priceHard;
	}
	/**
	 * @return the priceNormal
	 */
	public IntegerProperty getPriceNormal() {
		return priceNormal;
	}
	/**
	 * @param priceNormal the priceNormal to set
	 */
	public void setPriceNormal(IntegerProperty priceNormal) {
		this.priceNormal = priceNormal;
	}
	/**
	 * @return the priceLight
	 */
	public IntegerProperty getPriceLight() {
		return priceLight;
	}
	/**
	 * @param priceLight the priceLight to set
	 */
	public void setPriceLight(IntegerProperty priceLight) {
		this.priceLight = priceLight;
	}
	/**
	 * @return the priceForTea
	 */
	public IntegerProperty getPriceForTea() {
		return priceForTea;
	}
	/**
	 * @param priceForTea the priceForTea to set
	 */
	public void setPriceForTea(IntegerProperty priceForTea) {
		this.priceForTea = priceForTea;
	}
	/**
	 * @return the priceOfMinUn
	 */
	public IntegerProperty getPriceOfMinUn() {
		return priceOfMinUn;
	}
	/**
	 * @param priceOfMinUn the priceOfMinUn to set
	 */
	public void setPriceOfMinUn(IntegerProperty priceOfMinUn) {
		this.priceOfMinUn = priceOfMinUn;
	}
	/**
	 * @return the priceOfMinTo
	 */
	public IntegerProperty getPriceOfMinTo() {
		return priceOfMinTo;
	}
	/**
	 * @param priceOfMinTo the priceOfMinTo to set
	 */
	public void setPriceOfMinTo(IntegerProperty priceOfMinTo) {
		this.priceOfMinTo = priceOfMinTo;
	}
	/**
	 * @return the priceOfVipUn
	 */
	public IntegerProperty getPriceOfVipUn() {
		return priceOfVipUn;
	}
	/**
	 * @param priceOfVipUn the priceOfVipUn to set
	 */
	public void setPriceOfVipUn(IntegerProperty priceOfVipUn) {
		this.priceOfVipUn = priceOfVipUn;
	}
	/**
	 * @return the priceOfVipTo
	 */
	public IntegerProperty getPriceOfVipTo() {
		return priceOfVipTo;
	}
	/**
	 * @param priceOfVipTo the priceOfVipTo to set
	 */
	public void setPriceOfVipTo(IntegerProperty priceOfVipTo) {
		this.priceOfVipTo = priceOfVipTo;
	}
	/**
	 * @return the peoplsVIPUn
	 */
	public IntegerProperty getPeoplsVIPUn() {
		return peoplsVIPUn;
	}
	/**
	 * @param peoplsVIPUn the peoplsVIPUn to set
	 */
	public void setPeoplsVIPUn(IntegerProperty peoplsVIPUn) {
		this.peoplsVIPUn = peoplsVIPUn;
	}
	/**
	 * @return the peoplsVIPTo
	 */
	public IntegerProperty getPeoplsVIPTo() {
		return peoplsVIPTo;
	}
	/**
	 * @param peoplsVIPTo the peoplsVIPTo to set
	 */
	public void setPeoplsVIPTo(IntegerProperty peoplsVIPTo) {
		this.peoplsVIPTo = peoplsVIPTo;
	}
	/**
	 * @return the priceOfNonTimeWik
	 */
	public IntegerProperty getPriceOfNonTimeWik() {
		return priceOfNonTimeWik;
	}
	/**
	 * @param priceOfNonTimeWik the priceOfNonTimeWik to set
	 */
	public void setPriceOfNonTimeWik(IntegerProperty priceOfNonTimeWik) {
		this.priceOfNonTimeWik = priceOfNonTimeWik;
	}
	/**
	 * @return the priceOfNonTimeNW
	 */
	public IntegerProperty getPriceOfNonTimeNW() {
		return priceOfNonTimeNW;
	}
	/**
	 * @param priceOfNonTimeNW the priceOfNonTimeNW to set
	 */
	public void setPriceOfNonTimeNW(IntegerProperty priceOfNonTimeNW) {
		this.priceOfNonTimeNW = priceOfNonTimeNW;
	}
	/**
	 * @return the priceStopCheck
	 */
	public IntegerProperty getPriceStopCheck() {
		return priceStopCheck;
	}
	/**
	 * @param priceStopCheck the priceStopCheck to set
	 */
	public void setPriceStopCheck(IntegerProperty priceStopCheck) {
		this.priceStopCheck = priceStopCheck;
	}
}
