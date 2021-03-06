package com.newrdev.tagphoto;

public class Photo {
	private String _description;
	private String _title;
	private String _path;
	private long _id;
	
	public Photo(String title, String desc, String path) {
		this._title = (title == null ? "" : title);
		this._description = (desc == null ? "" : desc);
		this._path = (path == null ? "" : path);
	}

	public Photo() {
	}

	public long getId(){
		return _id;
	}
	
	public void setId(long id){
		this._id = id;
	}
	
	public String getTitle(){
		return _title;
	}
	
	public void setTitle(String title){
		this._title = title;
	}
	
	public String getDescription(){
		return _description;
	}
	
	public void setDescription(String description){
		this._description = description;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String path) {
		this._path = path;
	}
	
	@Override
	public String toString(){
		return "Id: " + _id + ", Title: " + _title + ", Description: " + _description + ", Path: " + _path;
	}
}
