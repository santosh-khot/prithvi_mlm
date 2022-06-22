package com.prithivi.mlm.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue
	private int id;
    
    @Column(name="user_name",nullable = false,length=20)
	private String userName;
    
    @Column(name="email",nullable=false,length=30)
	private String email;
    
    @Column(name="password",nullable=false,length=40)
	private String password;
    
    @Column(name="about",nullable =false,length=200)
	private String about;
	
    @Column(name = "color_code", length = 10, nullable = true, updatable = true, insertable = true)
	private String colorCode;
    
    @Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="modified_by")
	private String modifiedBy;
		
	@Column(name="modified_at")
	private Date modifiedAt;
}