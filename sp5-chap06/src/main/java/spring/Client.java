//스프링 컨테이너가 bean 객체를 생성하고 소멸할시 사용하는
// InitializingBean 인터페이스와 DisposableBean 인터페이스를 구현한
//간단한 클래스를 통해, 실제로 초기화 메서드와 소멸 메서드가 언제 실행되는지 확인

package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {

  private String host;

  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Client.afterPropertiesSet() 실행");
  }

  public void send() {
    System.out.println("Client.send() to " + host);
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Client.destroy() 실행");
  }

}
