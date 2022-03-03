package com.zixuan.mybatisPlus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zixuan.mybatisPlus.entity.Employee;
import com.zixuan.mybatisPlus.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Resource
    private EmployeeMapper employeeMapper;

    @Test
    public void testSelect() {
        Employee employee = employeeMapper.selectOne(new QueryWrapper<Employee>()
                .eq("id", 1));
        System.out.println(employee);
        
        List<Employee> employeeList = employeeMapper.selectList(new QueryWrapper<Employee>()
                .eq("last_name", "yjb"));
        employeeList.forEach(employee1 -> 
                System.out.println(employee1)
        );
    }
    
    @Test
    public void selectPage(){
        IPage<Employee> page = employeeMapper.selectPage(new Page<>(3,2),
                null);
        List<Employee> records = page.getRecords();
        records.forEach(employee -> System.out.println(employee));
        System.out.println(page.getTotal());
    }
    @Test
    public void selectPage2(){
        Page<Employee> page1 = new Page<>(1, 2);
        page1.setSearchCount(true);
        IPage<Employee> page = employeeMapper.selctPageVo(page1,
                "yjb");

        List<Employee> records = page.getRecords();
        records.forEach(employee -> System.out.println(employee));
        System.out.println(page.getTotal());
    }

    @Test
    public void testInsert(){
        for(int i=0;i<10;i++){
            Employee employee = new Employee(null, "yjb", "yjb@163.com", 1, 31);
            int result = employeeMapper.insert(employee);
            System.out.println(result);
            System.out.println("insert后，id自动维护，为："+employee.getId());
        }
    }
    @Test
    public void testInsert2(){
        Employee employee = new Employee();
        employee.setLastName("yjb");
        employee.setEmail("yjb@163.com");
        //没有设置属性的，插入null
        int result = employeeMapper.insert(employee);
        System.out.println(result);
    }

    @Test
    public void testUpdate(){
        Employee employee = new Employee(5, "gaokun", "gaokun@163.com", 1, 31);
        int result = employeeMapper.updateById(employee);
        System.out.println(result);
        System.out.println(employee);
    }

    @Test
    public void testUpdate2(){
        Employee employee = new Employee();
        employee.setLastName("cys");
        employee.setEmail("cys@qq.com");
        int result = employeeMapper.update(employee,
                        new UpdateWrapper<Employee>()
                        .eq("last_name","yjb")
                        .eq("gender",0));
        System.out.println(result);
    }

    @Test
    public void testUpdate3(){
        Employee employee = new Employee();
        employee.setLastName("gss");
        employee.setEmail("gss@qq.com");
//        employee.setGender(9);
//        employee.setAge(10);
        //updateStrategy = FieldStrategy.IGNORED    不管有没有有设置属性，所有的字段都会设置到insert语句中
        int result = employeeMapper.update(employee,new UpdateWrapper<Employee>()
            .in("id",29));
        System.out.println(result);
    }

    @Test
    public void testDelete(){
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("last_name","yjb");
        int delete = employeeMapper.delete(queryWrapper);
        System.out.println(delete);
    }
    @Test
    public void testDelete2(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("last_name","yjb");
        hashMap.put("age",311);
        int delete = employeeMapper.deleteByMap(hashMap);
        System.out.println(delete);
    }
}
