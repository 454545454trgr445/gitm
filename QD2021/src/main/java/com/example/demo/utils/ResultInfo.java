package com.example.demo.utils;

import java.util.List;

public class ResultInfo {
private int status;
private Object data;




public ResultInfo(int status) {
	super();
	this.status = status;
}

public ResultInfo(int status, Object data) {
	super();
	this.status = status;
	this.data = data;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

public Object getData() {
	return data;
}

public void setData(Object data) {
	this.data = data;
}

}
