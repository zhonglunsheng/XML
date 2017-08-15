# XML
XML学习（小锋教程）

 元素 VS  节点
 --------
节点包括元素节点、属性节点、文本节点；
元素一定是节点，但是节点不一定是元素；

DOM  方式解析 XML  原理
------
基于 DOM（Document Object Model，文档对象模型）解析方式，是把整个 XML 文档加载到内存，转化成
DOM 树，因此应用程序可以随机的访问 DOM 树的任何数据；
优点：灵活性强，速度快；
缺点：消耗资源比较多；

SAX  方式解析 XML 
--------
SAX 的工作原理简单地说就是对文档进行顺序扫描，当扫描到文档（document）开始与结束、元素（element）
开始与结束、文档（document）结束等地方时通知事件处理函数，由事件处理函数做相应动作，然后继续同
样的扫描，直至文档结束。
优点：消耗资源比较少；适合大文件解析；
缺点：只能读取不能修改；开发复杂；

JDOM  引入
---------
JDOM 是一种使用 XML（标准通用标记语言下的一个子集） 的独特 Java 工具包，用于快速开发 XML 应用
程序。
JDOM 官方网站：http://www.jdom.org/

DOM4J  引入
----------
dom4j 是一个 Java 的 XMLAPI，类似于 jdom，用来读写 XML 文件的。dom4j 是一个非常非常优秀的 JavaXML
API，具有性能优异、功能强大和极端易用使用的特点，同时它也是一个开放源代码的软件，可以在 SourceForge
上找到它。在 IBM developerWorks 上面可以找到一篇文章，对主流的 Java XMLAPI 进行的性能、功能和易用性
的评测，dom4j 无论在哪个方面都是非常出色的。如今你可以看到越来越多的 Java 软件都在使用 dom4j 来读写
XML，特别值得一提的是连 Sun 的 JAXM 也在用 dom4j。这是必须使用的 jar 包， Hibernate 用它来读写配置文
件。
DOM4J 官方网站：http://www.dom4j.org/
