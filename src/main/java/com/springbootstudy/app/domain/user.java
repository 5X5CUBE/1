package com.springbootstudy.app.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class user {
	private String userId, username, password, address, phone,gender,nickname;
	private LocalDate birthday,rdate;

}
