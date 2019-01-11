package spring_step3.ems.member.configration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MemberConfig1.class, MemberConfig2.class, MemberConfig3.class})
public class MemberConfigImport {

}
