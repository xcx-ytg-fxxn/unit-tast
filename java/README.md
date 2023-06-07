# java多模块覆盖率采集

支持的两种方式：
1、增加一个模块依赖所有的业务模块并且 加入 jacoco-maven-plugin report-aggregate 指令，可以看到多模块合并的覆盖率报告。
2、使用 jacococli 命令行的方式，聚合多个模块的覆盖率文件产出聚合报告（需提前完成项目打包 mvn clean install）。


指令例子：

jacococli report dao-module/target/jacoco.exec service-module/target/jacoco.exec --classfiles dao-module/target/classes --classfiles service-module/target/classes --sourcefiles dao-module/src/main/java --sourcefiles service-module/src/main/java --html target/jacoco/html --xml target/jacoco/coverage.xml --csv target/jacoco/coverage.csv


JacocoCli：
1、下载：https://repo1.maven.org/maven2/org/jacoco/jacoco/0.8.8/jacoco-0.8.8.zip
2、解压到软件目录
3、定义别名

$ type jacococli
jacococli is aliased to `java -jar /Users/leran.xm/Software/jacoco/jacoco-0.8.8/lib/jacococli.jar '