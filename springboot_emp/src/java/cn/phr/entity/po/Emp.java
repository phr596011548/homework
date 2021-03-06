package cn.phr.entity.po;

import cn.phr.comm.Excel;
import cn.phr.comm.ExcleHeard;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("ssm_emp")
@ExcleHeard(title = "员工管理")
public class Emp {
    /*ssm_emp.id,
    ssm_emp.jobid,
    ssm_emp.salary,
    ssm_emp.entrytime,
    ssm_emp.deptid*/
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @Excel(name = "名字")
    private String name;
    private String jobid;
    private String salary;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entrytime;
    private String deptid;
    private String leadername;

    private String jobname;
    private String deptname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getLeadername() {
        return leadername;
    }

    public void setLeadername(String leadername) {
        this.leadername = leadername;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}