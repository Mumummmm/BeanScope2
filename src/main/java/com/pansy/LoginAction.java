package com.pansy;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

//@RequestScope注解能用来指定一个组件的作用域为request
@RequestScope
@Component
public class LoginAction {
}
