# fastjson-test-case

##启动项目访问curl -L -X GET 'http://localhost:8080/test' 
json 序列化异常
因为HttpMessageConverters中包含了SerializerFeature.BrowserCompatible,去掉之后则正常

##错误日志
errorlog 文件夹中