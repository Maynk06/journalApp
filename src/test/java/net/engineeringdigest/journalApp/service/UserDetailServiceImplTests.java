//package net.engineeringdigest.journalApp.service;
//
//import com.mongodb.assertions.Assertions;
//import net.engineeringdigest.journalApp.repository.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
////import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import net.engineeringdigest.journalApp.entity.User;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.*;
//
//@ActiveProfiles("dev")
//public class UserDetailServiceImplTests {
//
//    @InjectMocks
//    private UserDetailServiceImpl userDetailService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.initMocks(this);
//    }
//    @Test
//    void loadUserByUsernameTest(){
//        when(userRepository.findByUsername(ArgumentMatchers.anyString())).thenReturn(User.builder().username("ram").password("kjaflk").url(String.valueOf(new ArrayList<>())).build());
//        UserDetails user = userDetailService.loadUserByUsername("ram");
//        Assertions.assertNotNull(user);
//    }
//}
