# fastjson-test-case

## 启动项目访问curl -L -X GET 'http://localhost:8080/test'
 
json 序列化异常
因为HttpMessageConverters中包含了SerializerFeature.BrowserCompatible,去掉之后则正常

## 错误日志
*.log 文件

## 环境
``fastjson:1.2.58
``java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
