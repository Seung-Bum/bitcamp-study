package com.eomcs.mylist.dao;

import org.apache.ibatis.annotations.Mapper;
import com.eomcs.mylist.domain.Member;

@Mapper  
public interface MemberDao {

  int insert(Member member);

  //  List<Member> findAll();
  //
  //  Member findByNo(int no);
  //
  //  int update(Member member);
  //
  //  int delete(int no);

}











