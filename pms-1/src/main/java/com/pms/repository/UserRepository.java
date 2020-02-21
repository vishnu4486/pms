package com.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pms.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
//	findByCourseIdAndModuleIdIn
	
	
//	List<User> findByUserNameInAndPasswordIn(String userName, String password);
	
		@Query("SELECT u FROM User u WHERE u.userName= :userName AND u.password = :password")
	    public List<User> findByuserNameAndpassword(@Param("userName") String userName,@Param("password") String password);

//		public String delete(Integer id);
		
//		 @Query("select u from User u where u.username= :username AND u.password= :password")
//		  public User getLoginUser(@Param("username") String username,@Param("password") String password);
	  
	
}
