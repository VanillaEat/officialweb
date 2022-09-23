package cn.pccpa.officialweb.bean;

import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Package:com.example.springboot01.bean 包名
 * @ClassName:FirstPage 主类名
 * @Author:Vanilla 作者
 * @Date:2022/3/21 11:01 创建时间
 * @Description: 此文件描述信息，文件创建后手动添加信息
 */
@Repository
public class FirstPage {
    private int id;//以dbref的id为准,?
    private String db_displayname;//项目名称dbref
    private String db_realname;//数据库真实名字dbref
    private String db_host;//数据库所在服务器，配合db_realname连接数据库dbref
    private Date db_expired;//数据库应该删除日期dbref
    private Date db_createdate;//数据库创建日期dbref
    private Timestamp task_begintime;//接任务时间dbref
    private Timestamp task_endtime;//完成任务时间dbref
    private byte is_finished;//默认false未处理完0 attfile
    private String attfile_path;//审计人员提交的数据文件存放路径，完整路径 attfile

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDb_displayname() {
        return db_displayname;
    }

    public void setDb_displayname(String db_displayname) {
        this.db_displayname = db_displayname;
    }

    public String getDb_realname() {
        return db_realname;
    }

    public void setDb_realname(String db_realname) {
        this.db_realname = db_realname;
    }

    public String getDb_host() {
        return db_host;
    }

    public void setDb_host(String db_host) {
        this.db_host = db_host;
    }

    public Date getDb_expired() {
        return db_expired;
    }

    public void setDb_expired(Date db_expired) {
        this.db_expired = db_expired;
    }

    public Date getDb_createdate() {
        return db_createdate;
    }

    public void setDb_createdate(Date db_createdate) {
        this.db_createdate = db_createdate;
    }

    public Timestamp getTask_begintime() {
        return task_begintime;
    }

    public void setTask_begintime(Timestamp task_begintime) {
        this.task_begintime = task_begintime;
    }

    public Timestamp getTask_endtime() {
        return task_endtime;
    }

    public void setTask_endtime(Timestamp task_endtime) {
        this.task_endtime = task_endtime;
    }

    public byte getIs_finished() {
        return is_finished;
    }

    public void setIs_finished(byte is_finished) {
        this.is_finished = is_finished;
    }

    public String getAttfile_path() {
        return attfile_path;
    }

    public void setAttfile_path(String attfile_path) {
        this.attfile_path = attfile_path;
    }
}
