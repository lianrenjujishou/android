对于简单的导航来说需要注意的有以下几项:
1.在module-level的gradle.kts中添加配置:
   a.android{}内底部追加:
       buildFeatures{ dataBinding true }   //注意dataBinding中的B要大写
   b.dependencies{}中追加依赖项:
       implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
       implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'
2.如果想要在代码中使用布局中的view其中一个方法就是进行数据绑定,即将布局封装好后赋给一个变量,最后我们可以在代码文件中使用这个变量对布局中的view进行操作:
   a.将布局根元素设置为layout   //即形如<layout><linearlayout>...</linearlayout></layout>
   b.在代码文件中获得相应的变量: val binding: FragmentAboutBinding = DataBindingUtil.flate(flater, R.layout.framgment_about, container, false)
                             binding.aboutButton.setOnClickListener{view -> view.findNavController().navigate(R.id.action_xxx_to_yyy)} //中间可添加一些事件
                             return binding
3.再就是要新建一个navigation.xml,该文件负责组织所有的fragments,配置Action等.
4.activity_main.xml的配置,只留一个fragment,相应配置如下:
    <fragment
              android:id="@+id/myNavHost"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:name="androidx.navigation.fragment.NavHostFragment"
              app:navGraph="@navigation/navigation"
              app:defaultNavHost="true" />
5.最重要的是思想上的东西:
android加载页面的基本单位是activity, 而fragment从概念上来说可以是组成activity的部分,所以不管怎么说MainActivity.kt这个类还有相对应的activity_main.xml这两个文件要有, 因为MainActivity.kt是入口点, 而我们现在想用navigation来组织所有的fragments,因此activity_main.xml中加载的就是"androidx.navigation.fragment.NavHostFragment",而它用的是res/navigation/navigation.xml这个文件,因此后面所有的布局就都放在navigation.xml这个文件中进行了.
