# WebPOS

![](demo.gif)

## MVC architecture

- Model: 数据层（biz, db）定义数据，并实现业务逻辑和数据操作：存储，验证，计算。
- Controller：控制器层（web）处理来自 View 层的用户请求，为 Model 选择合适的 View，为 View 选择合适的 Model，从而连接 Model 和 View 层，将数据展示和数据操作解耦。
- View：数据展示层（templates），实现前端界面，展示数据，进行用户交互。

## Description

The demo shows a simple POS system in MVC architecture, which replaces the shell interface in aw02 with a pos web ui (https://github.com/bshbsh404/simple-pos-ui
).

![](screenshot.png)

To run

```shell
mvn clean spring-boot:run
```

Currently, it just lists the products for sale with a cart with one item (just for demonstration). 

Please read the tutorial at  https://www.baeldung.com/spring-boot-crud-thymeleaf and make the POS system robust and fully functional. You can also refer to other articles, for instance https://www.baeldung.com/tag/thymeleaf/ .



And please elaborate your understanding in MVC architecture via this homework in your README.md.

