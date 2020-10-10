# project1
用于中级实训提交
## 1. Vim编辑器学习

1. Vi是linux系统下的标准编辑器，以字体颜色辨别语法的正确性，方便程序设计。Vim是Vi的升级版本，可以依据文件扩展名或文件内的开头信息，判断文件内容并自动地执行该程序的语法判断式，再以颜色显示程序代码与一般信息。

2. 通过命令``` vim 文件路径文件名```打开文件，如果文件不存在则自动创建一个新的文件。

   ```
   vim /path/filename
   vim +n //打开文件并定位到第n行
   vim +: //打开文件，定位到最后一行
   ```

3. 三种模式：命令模式（默认）；输入模式（输入内容）；末行模式（可输入诸多管理员命令）

4. 三种模式之间的切换：

   命令模式--->输入模式：

   ```
    i：在当前光标所在字符的前面，转为输入模式　　　　
    r：在当前光标所在行的行首转换为输入模式　　　　
    a：在当前光标所在字符的后面，转为输入模式 　　　　
    A：在光标所在行的行尾，转换为输入模式　　　
    o：在当前光标所在行的下方，新建一行，并转为输入模式　　　　
    O：在当前光标所在行的上方，新建一行，并转为输入模式 　　　　
    s：删除光标所在字符` 　　　　
    r：替换光标处字符`
   ```

   输入模式--->命令模式：

   ```
   ESC键
   ```

   命令模式到末行模式：

   ```
   ：
   ```

   末行模式到命令模式：

   ```
   ESC键
   ```

   5. 关闭文件：

   ```
   //在末行模式下
   w 保存
   q 退出
   wq 或 x 保存退出，wq 和 x 都是保存退出
   q！强制退出
   w！强制保存，管理员才有权限
   //命令模式下
   zz 保存并退出
   ```

   6. 移动光标：

      命令模式下：

      ```
      //逐字符移动：
      h 向左
      l 向右
      j 向下
      k 向上
      //以单词为单位移动
      w 移动到下一个单词的词首
      e 跳到当前或下一个单词的词尾
      b 跳到当前或上一个单词的词首
      #w 移动#个单词
      //行内跳转
      0 绝对行首
      ^ 行首的第一个非空白字符
      $ 绝对行尾
      //行间跳转
      G 到最后一行
      ```

         末行模式下：

      ```
      输入行号，回车跳转
      ```

   7. 删除操作：

      命令模式下：

      ```
      x //删除光标所在处的单个字符
      #x //删除光标所在处及向后的共#个字符
      dw //删除当前光标所在位置到下一个单词词首的所有字符
      #dw、#de、#db //与跳转命令组合使用
      dd //删除当前光标所在行
      #dd //删除包含当前光标所在的#行
      ```

      末行模式：

      ```
      start,endd //删除从start到end的所有行
      ```

   8. 复制操作：

      ```
      //命令模式
      yy 复制当前行
      yw、ye、yb y#w等与跳转命令结合，复制当前光标到下个单词的词首/词尾的内容
      //末行模式
      start,endy 复制start到end的所有行
      +3y 复制当前位置向下三行
      ```

   9. 粘贴操作：

      ```
      p 复制的为整行内容，粘贴到光标所在行的下方；非整行的粘贴到所在字符的后面
      P(大写) 整行到所在行上方；非整行到所在行的前面 
      ```

   10. 替换操作：

       ```
       r 替换当前光标所在字符
       R 替换当期光标所在位置的所有数据，直到按下ESC
       :s/old/new/g 替换第一行出现的所有old
       :n,ms/old/new/g 替换n,m之间的所有old
       :%s/old/new/g 替换整个文件中的所有old
       :%s/old/new/gc 替换全局的old
       ```

   11. 撤销编辑操作：（undo）

       ```
       u 撤销前一次编辑操作
       #u 撤销前#次操作
       ctrl+r 撤销最近一次的撤销操作
       ```

   12. 重复前一次编辑操作```.```

   13. 打开多个文件：

       ```
       vim f1 f2 f3
       //末行模式：
       :next 切换到下一个文件
       :prev 切换到上一个文件
       :last 切换到最后一个文件
       :first 切换到第一个文件
       qa 全部退出
       ```

   14. 文件复制操作：

       ```
       r: /目标path/目标file/
       //打开某个文件，进入末行模式
       ```

   ## 2. Java学习报告

   #### 2.1  简单的Java小程序

   ```java
   public class HelloJava {
       // 这里是程序入口
    public static void main(String[] args) {
           // 输出字符串
        System.out.println("hello Java!");
       }
   }
   /*关键字 public 表示访问说明符，表明该类是一个公共类，可以控制其他对象对类成员的访问。
   关键字 class 用于声明一个类，其后所跟的字符串是类的名称。
   关键字 static 表示该方法是一个静态方法，允许调用 main() 方法，无须创建类的实例。
   关键字 void 表示 main() 方法没有返回值。
    main() 方法是所有程序的入口，最先开始执行。*/
   ```

   #### 2.2 基本规范

   严格的大小写区分，关键字全部为小写

   需要直接运行的java类必需要有main方法，并使用public 和static 来修饰，void声明其返回值。

   基本的数据类型与c语言的没有较大的区别。

   自动类型的转换规则：

   ```java
   数值型数据的转换：byte→short→int→long→float→double。
   字符型转换为整型：char→int。
   ```

   强制转换规则：

   ``` java
   (type)variableName
   ```

   string与int的类型转换

   ```java
   //string转Int，string必须为整数
   Integer.parseInt(str)
   Integer.valueOf(str).intValue()
   //int 转 string
   String s = String.valueOf(i);
   String s = Integer.toString(i);
   String s = "" + i;
   ```

   使用“+”可以进行字符串的拼接，可以将其它类型的数据自动转换为string类型

   字符串的大小写转换(提取，分割，拼接，替换字符串的方法都在库中，直接调用即可)

   ```java
   String str="abcdef";
   System.out.println(str.toLowerCase()); 
   System.out.println(str.toUpperCase());
   ```

   字符串的比较：

   ```java
   //比较长度和内容
   str1.equals(str2);
   "Hello".equals(greeting);
   equalsIgnoreCase(); //方法与equals()方法相同，只是不区分大小写
   str.compareTo(String otherstr);//按照字典序比较
   ```

   类的封装、继承、多态与C++相似

   ```java
   修饰符 class class_name extends extend_class {
       // 类的主体
   }
   //super 关键字可以在子类的构造方法中显式地调用父类的构造方法，基本格式如下：
   super(parameter-list);
   //访问父类成员
   super.member
   ```

   对象类型转换

   ```java
   sonClass obj = (sonClass) fatherClass;//向下，可以调用子类类型中所有的成员，不过需要注意的是如果父类引用对象指向的是子类对象，那么在向下转型的过程中是安全的，也就是编译是不会出错误。但是如果父类引用对象是父类本身，那么在向下转型的过程中是不安全的
   fatherClass obj = new sonClass();//向上，可以调用父类类型中的所有成员，不能调用子类类型中特有成员，最终运行效果看子类的具体实现。 
   ```

   方法重载

   ```java
   如果同一个类中包含了两个或两个以上方法名相同的方法，但形参列表不同,根据参数类型调用具体的方法
   ```

   方法重写：

   ```
   子类中如果创建了一个与父类中相同名称、相同返回值类型、相同参数列表的方法，只是方法体中的实现不同，以实现不同于父类的功能。不能重写一个无法继承的方法
   ```

   多态：

   ```
   在父类中定义的属性和方法被子类继承之后，可以具有不同的数据类型或表现出不同的行为。
   其中编译时多态是静态的，主要是指方法的重载，它是根据参数列表的不同来区分不同的方法。通过编译之后会变成两个不同的方法。
   运行时多态是动态的，它是通过动态绑定来实现的，也就是大家通常所说的多态性
   ```

   

   

   ## 3. Ant学习

   #### 1.简单介绍:

   Ant作为一个项目管理工具，与make命令具有相同的功能。不同的是Ant运行是基于XML格式的文件而不是shell命令文件。它由一个project组成，一个project可以分为多个target，这些target之间具有某种依赖关系，一个task又可以分为多个task，每个task由一个实现特定接口的java类实现。

   ```
   ANT命令：
   ant clean  清理
   ant run  运行
   ant compile 编译
   ant build 生成jar包
   ```

   #### 2. 项目结构

   （1） Src存放文件

   （2） class存访编译后的文件

   （3） Lib存放第三方的JAR 包

   （4） dist存放打包、发布后的代码

   #### 3. XML文件的内容

   ##### 3.1 project 标签

   每个构建对应一个项目文件，project标签是构建文件的根标签，可以有多个内在属性，各个属性的含义如下。

   default ：表示默认的运行目标，指定默认的target，该属性是必需的

   basedir：表示项目的基准目录

   name：表示项目名

   description：表示项目的描述

   ##### 3.2 target标签

   一个project标签下可以有多个target标签，一个target标签可以依赖其它的target标签，生成可执行文件之前编译其依赖的文件，各个属性的含义如下。

   name：表示目标名

   depends：表示依赖的的目标

   if ：表示仅当属性设置时才执行

   unless：表示当属性没有设置时才执行

   description：表示项目的描述

   ##### 3.3 mkdir标签

   用于创建一个目录，一个属性dir指定所创建的目录名``` <mkdir dir=''${class.root}"/>```

   ##### 3.4 JAR标签

   用于生成一个JAR文件，属性如下：

   destfile：表示JAR文件名

   basedir：表示被归档的文件名

   includes：表示被归档的文件模式

   excludes：表示被排除的文件模式

   ##### 3.5 javac标签

   用于编译一个或一组java文件，属性如下

   scdir：表示源程序目录

   destdir：表示class文件的输出目录

   include：表示被编译的文件的模式

   excludes：表示被排除的文件的模式

   classpath：表示所使用的类路径

   debug：表示包含的调试信息

   optimize：表示是否使用优化

   verbose：表示提供详细的输出信息

   fileonerror：表示当碰到错误时自动停止

   ##### 3.6 java标签

   classname：表示将执行的类名

   jar：表示包含该类的jAr文件名

   classpath：表示所用到的类路径

   fork：在一个新的虚拟机种运行该类

   failonerror：当错误出现时自动停止

   output：表示输出文件

   append：表示追加或覆盖的默认文件

   ##### 3.7 delete文件

   用于删除一个或一组文件，属性如下

   /file：表示要删除的文件

   dir：表示要删除的目录

   includeEmptyDirs：表示指定是否要删除空目录，默认为删除

   failonerror：表示指定当遇到错误时是否停止，默认为停止

   verbose：表示指定是否列出所删除的文件，默认为不列出

   ##### 3.8 copy标签

   用于文件或文件集合的拷贝，属性如下。

   file：表示源文件

   tofile：表示目标文件

   todir：表示目标目录

   overwrite：表示是否覆盖目标文件，默认为不覆盖

   includeEmptyDirs：表示指定是否要拷贝空目录，默认为拷贝

   failonerror：表示指定当遇到错误时是否停止，默认为停止

   verbose：表示指定是否显示详细信息，默认为不显示

   ### 4. Ant运行

   安装好Ant并且配置好路径之后，在命令行中切换到构建文件的目录，输入Ant命令就可以运行Ant.若没有指定任何参数，Ant会在当前目录下查询 build.xml文件。如果找到了就用该文件作为构建文件。如果使用了 –find 选项，Ant 就会在上级目录中找构建文件，直至到达文件系统得跟目录。如果构建文件的名字不是build.xml ，则Ant运行的时候就可以使用 –buildfile file ,这里file 指定了要使用的构建文件的名称。

   ```
   <?xml version="1.0" encoding="UTF-8" ?> 
   <project name="HelloWorld" default="compile" basedir="." > 
   <property name="src" value="src"/> 
   <property name="dest" value="classes"/> 
   <property name="hello_jar" value="hello.jar" /> 
           
            <target name="junit">
           <available property="junit.present" classname="junit.framework.TestCase" />
       </target>
           
   <target name="init" depends="junit"> 
       <mkdir dir="${dest}"/> 
   </target> 
   
   
   <target name="compile" depends="init"> 
   <javac srcdir="${src}" destdir="${dest}"/> 
   </target> 
   
   
   <!--
           <target name="build" depends="compile"> 
   <jar jarfile="${hello_jar}" basedir="${dest}"/> 
           </target> 
     -->
   
   <target name="run" depends="compile"> 
   <java classname="HelloWorld" classpath="${dest}"/> 
   </target>
           
            <target name="test" depends = "compile">
             <junit printsummary="yes" >
             <formatter type="plain"/>
             <classpath path="${dest}"/>
             <test name = "HelloWorldTest"/>
   </junit>
            </target>
            
   </project>
   ```

   ```java
    public   class   HelloWorld   {
       public String sayHello(){
         return "Hello World";
    }  
       public int getInt(){
         return 5;  
    }
       public static void main(String args[]){   
                   HelloWorld world = new HelloWorld();
                   System.out.println(world.sayHello());
           }   
   } 
    //
    import junit.framework.Test；
             import junit.framework.TestCase;
             import junit.framework.TestSuite;
             public class HelloWorldTest extends TestCase{
      
   public HelloWorldTest(String name){
     super(name);
   }
   public static void main(String args[]){
     junit.textui.TestRunner.run(HelloWorldTest.class); 
   }  
   public void testSayHello(){
      HelloWorld world = new HelloWorld();
      assert (world != null);
      assertEquals("HelloWorld",  world.sayHello() );
   }
   public void testgetInt(){
          HelloWorld world = new HelloWorld();
          assertEquals(6,  world.getInt() );
      }    
   }
   ```

   # 4. Junit学习

   #### 1. 简单介绍

   junit是一个开源的Java单元测试框架，使用接口简化测试用例的编写。当完成一个类之后，在别人使用之前首先要检测是否有bug，因此单元测试是十分必要的。

   #### 2. 单元测试的优点

   在其它程序调用类库保证类库不存在问题。

   在项目开发过程中可以更早地发现并解决问题。

   #### 3. 环境配置

   首先确保主机环境配置好了java环境及环境变量

   下载JAR包 ``` junit 4.12 和 hamcrest-core-1.3.java```，云桌面已有。

   将这两个包放到jdk安装的lib目录下

   之后``` vim ~/.bashrc```进行环境变量的配置，内容如下：

   ```
   export JAVA_HOME=/home/soft/jdk1.8.0_111
   export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/junit-4.12.jar:$JAVA_HOME/lib/hamcrest-core-1.3.jar:$CLASSPATH
   export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:$HOME/bin
   
   ```

   之后``` source ~/.bashrc```使之生效。

   #### 4. 常用方法和断言

   | @Test<br>   void public method()              | 测试注释指示该公共无效方法它所附着可以作为一个测试用例。     |
   | --------------------------------------------- | ------------------------------------------------------------ |
   | @Before<br>  public void method()             | Before注释表示，该方法必须在类中的每个测试之前执行，以便执行测试某些必要的先决条件。 |
   | @BeforeClass<br>  public static void method() | BeforeClass注释指出这是附着在静态方法必须执行一次并在类的所有测试之前。发生这种情况时一般是测试计算共享配置方法(如连接到数据库)。 |
   | @After<br/> public void method()              | After 注释指示，该方法在执行每项测试后执行(如执行每一个测试后重置某些变量，删除临时变量等) |
   | @AfterClass<br/> public static void method()  | 当需要执行所有的测试在JUnit测试用例类后执行，AfterClass注解可以使用以清理建立方法，(从数据库如断开连接)。注意：附有此批注(类似于BeforeClass)的方法必须定义为静态。 |
   | @Ignore<br/> public static void method()      | 当想暂时禁用特定的测试执行可以使用忽略注释。每个被注解为@Ignore的方法将不被执行。 |

   | 断言                                                         | 描述                                                         |
   | ------------------------------------------------------------ | ------------------------------------------------------------ |
   | void assertEquals([String message], expected value, actual value) | 断言两个值相等。值可能是类型有 int, short, long, byte, char or java.lang.Object. 第一个参数是一个可选的字符串消息 |
   | void assertTrue([String message], boolean condition)         | 断言一个条件为真                                             |
   | void assertFalse([String message],boolean condition)         | 断言一个条件为假                                             |
   | void assertNotNull([String message], java.lang.Object object) | 断言一个对象不为空(null)                                     |
   | void assertNull([String message], java.lang.Object object)   | 断言一个对象为空(null)                                       |
   | void assertSame([String message], java.lang.Object expected, java.lang.Object actual) | 断言，两个对象引用相同的对象                                 |
   | void assertNotSame([String message], java.lang.Object unexpected, java.lang.Object actual) | 断言，两个对象不是引用同一个对象                             |
   | void assertArrayEquals([String message], expectedArray, resultArray) | 断言预期数组和结果数组相等。数组的类型可能是 int, long, short, char, byte or java.lang.Object. |

   新建下列java文件

   ```java
   //Calculate.java
   package com.trustie.junitest;
   public class Hello {
       public int sum(int var1, int var2) {
           System.out.println("相加的值是: " + var1 + " + " + var2);
           return var1 + var2;
       }
       public static void main(String[] args) {
           System.out.println("hh");  
       }
   
   }
   
   ```

   ```java
   //CalculateTest.java
   package com.trustie.test;
   import org.junit.Test;
   import static org.junit.Assert.assertEquals;
   import org.junit.Test;
   import com.trustie.junitest.Calculate;
   
   public class CalculateTest {
   
       Calculate calculation = new Calculate();
       int sum = calculation.sum(2, 5);
       int testSum = 7;
   
       @Test
       public void testSum() {
           System.out.println("@Test sum(): " + sum + " = " + testSum);
           assertEquals(sum, testSum);
       }
   
   }
   
   ```

   运行：

   ```
   javac -d . Calculate.java
   javac -d . CalculateTest.java
   java org.junit.runner.JUnitCore com.trustie.test.CalculateTest
   
   ```

   

   

   

   

   
