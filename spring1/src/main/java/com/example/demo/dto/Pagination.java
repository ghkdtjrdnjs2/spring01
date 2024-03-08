package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

// Entity : 데이터베이스 테이블을 담당하는 클래스(db작업 클래스) 저장하는 클래스
// DTO : Date Transfer Object. 화면 입출력을 담당하는 클래스

@Data
@AllArgsConstructor
public class Pagination {
	private Long prev;
	private Long start;
	private Long end;	
	private Long next;
	private Long pageno;
}
