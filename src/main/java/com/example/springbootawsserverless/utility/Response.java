package com.example.springbootawsserverless.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class Response {

	private static final long serialVersionUID = 7223454510433790889L;

	private int status = 200;
	private String statusMessage;
	public List data;
	private String stringData;
	private List<String> dataArr;
	private String link;
	private Double totalCost;
	private Integer sessionCount;
	private Double avgCost;
	private Integer unrostedSlot;
	private boolean isWeb = false;
	private Integer noOfErrors;
	private Integer totalRecords;
	private String recordsInvalid;
	private String errorList;
	private Boolean isCustomerWidget;

	public Boolean getIsCustomerWidget() {
		return isCustomerWidget;
	}

	public void setIsCustomerWidget(Boolean isCustomerWidget) {
		this.isCustomerWidget = isCustomerWidget;
	}

	public String getErrorList() {
		return errorList;
	}

	public void setErrorList(String errorList) {
		this.errorList = errorList;
	}

	public String getRecordsInvalid() {
		return recordsInvalid;
	}

	public void setRecordsInvalid(String recordsInvalid) {
		this.recordsInvalid = recordsInvalid;
	}

	public boolean isWeb() {
		return isWeb;
	}

	public Integer getNoOfErrors() {
		return noOfErrors;
	}

	public void setNoOfErrors(Integer noOfErrors) {
		this.noOfErrors = noOfErrors;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public void setWeb(boolean isWeb) {
		this.isWeb = isWeb;
	}

	public Integer getUnrostedSlot() {
		return unrostedSlot;
	}

	public void setUnrostedSlot(Integer unrostedSlot) {
		this.unrostedSlot = unrostedSlot;
	}

	public Integer getSessionCount() {
		return sessionCount;
	}

	public Double getAvgCost() {
		return avgCost;
	}

	public void setAvgCost(Double avgCost) {
		this.avgCost = avgCost;
	}

	public void setSessionCount(Integer sessionCount) {
		this.sessionCount = sessionCount;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<String> getDataArr() {
		return dataArr;
	}

	public void setDataArr(List<String> dataArr) {
		this.dataArr = dataArr;
	}

	public Response() {
		super();
		this.data = new ArrayList<>();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStringData() {
		return stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public boolean addData(Object object) {
		return data.add(object);
	}

	public void setData(Set data) {
		this.data.add(data);
	}

}
