package com.develop.blog.host.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 김현재
 * @since 2020.04.04
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class LoginDTO {
	private String id;
	private String password;
}
