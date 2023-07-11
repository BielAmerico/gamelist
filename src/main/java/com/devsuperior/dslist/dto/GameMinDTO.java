package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;


public class GameMinDTO {

	private Long id;
	private String title;
	private Integer yaer;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		yaer = entity.getYaer();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYaer() {
		return yaer;
	}

	public void setYaer(Integer yaer) {
		this.yaer = yaer;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	

}
