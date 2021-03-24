package spring;

import java.time.LocalDateTime;

public class Member {
  private Long id;
  private String email;
  private String password;
  private String name;
  private LocalDateTime registerDateTime;

  public Member(String email, String password,
                String name, LocalDateTime registerDateTime) {
    this.email = email;
    this.password = password;
    this.name = name;
    this.registerDateTime = registerDateTime;
  }

  void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public LocalDateTime getRegisterDateTime() {
    return registerDateTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void changePassword(String oldPassword, String newPassword) {
    if (!password.equals(oldPassword)) {
      throw new WrongIdPasswordException();
    }
    this.password = newPassword;
  }
  
}
