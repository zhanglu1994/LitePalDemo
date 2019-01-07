# LitePalDemo

#基于郭霖大神的LitePal实现
效果如图：
![LitePalDemo](https://github.com/zhanglu1994/LitePalDemo/blob/master/litepalDemo.jpg)
具体实现步骤：
在build.gradle文件中添加 
```
    implementation 'org.litepal.android:java:3.0.0'
```
在Application中添加初始化操作：

 ```
 
 public class MyApplication extends Application{
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        LitePal.initialize(this);
        
    }
    
}

 ```

定义一个User类extend LitePalSupport类
```
public class User extends LitePalSupport{
    private int id;
    private String name;
    private String sex;
    private String age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}

```


具体的insertData操作为：
```
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        deleteData
        
        user.save();
```
deleteData操作为：
```
 LitePal.deleteAll(User.class, "name = ? ", name);
 LitePal.deleteAll(User.class, "sex = ? ", sex);
 LitePal.deleteAll(User.class, "age = ? ", age);
```
updateData操作为：
```
        User user = LitePal.find(User.class, Integer.valueOf(id));
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        user.update(Integer.valueOf(id));
```

selectData操作为：

```
List<User> allUsers = LitePal.findAll(User.class);
```

```
StringBuilder sql = new StringBuilder(" 1 = 1 ");
sql.append(" and sex like '%").append(sex).append("%'");
LitePal.where(sql.toString()).find(User.class)

```



