# Spring MVC에 대해

![mvcmodel](https://user-images.githubusercontent.com/61649201/107956704-e1695200-6fe2-11eb-9465-54924427e93c.png)

1. DispatcherServlet이 클라이언트(브라우저)로부터 들어오는 모든 요청을 받는다.
2. DispatcherServlet은 HandlerMapping Bean객체에게 어떤 컨트롤러에게 요청을 위임하면 좋을지 물어본다. (이때 HandlerMapping은 xml에서 @Controller로 등록한 것들을 스캔해서 찾아놨기 때문에 어느 컨트롤러를 사용해야하는지 알고있다.)
3. DispatcherServlet은 검색된 Controller를 실행하여 클라이언트의 요청을 처리한다.
4. Controller에서는 해당 요청을 처리할 service를 주입(DI)받아 비즈니스 로직을 service에 위임한다. 수행 결과로 얻어낸 Model 정보와 Model을 보여줄 View정보(jsp파일)를 ModelAndView 객체에 저장하여 DispatcherServlet에게 보낸다.
5. DispatcherServlet은 전달받은 결과를 보여줄 view를 찾기위해 ViewResolver Bean객체를 사용한다. ViewResolver는 ModelAndView 객체 내부에 있는 view를 찾아서 jsp를 만드는 등 결과물을 구현해서 DispatcherServlet에게 다시 리턴한다.
6. 마지막으로, DispatcherServlet은 클라이언트에게 렌더링된 view를 응답한다.
