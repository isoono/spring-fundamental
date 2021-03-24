package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.*;

@Configuration
public class AppConf2 {

  @Autowired
  private MemberDao memberDao;

  @Autowired
  private MemberPrinter memberPrinter;

  @Bean
  public ChangePasswordService changePwdSvc() {
    ChangePasswordService pwdSvc = new ChangePasswordService();
    pwdSvc.setMemberDao(memberDao);
    return pwdSvc;
  }

  @Bean
  public MemberPrinter memberPrinter() {
    return new MemberPrinter();
  }

  @Bean
  public MemberListPrinter memberListPrinter() {
    return new MemberListPrinter(memberDao, memberPrinter);
  }

  @Bean
  public MemberInfoPrinter memberInfoPrinter() {
    MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
    infoPrinter.setMemberDao(memberDao);
    infoPrinter.setPrinter(memberPrinter);
    return infoPrinter;
  }

  @Bean
  public VersionPrinter versionPrinter() {
    VersionPrinter versionPrinter = new VersionPrinter();
    versionPrinter.setMajorVersion(5);
    versionPrinter.setMinorVersion(0);
    return versionPrinter;
  }
}
