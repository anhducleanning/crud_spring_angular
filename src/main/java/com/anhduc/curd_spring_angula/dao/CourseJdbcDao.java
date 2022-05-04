package com.anhduc.curd_spring_angula.dao;

import com.anhduc.curd_spring_angula.model.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CourseJdbcDao implements DAO<Course>  {

    //cho phép chúng ta tạo và nắm bắt các thông báo và file nhật ký thông qua trình ghi nhật ký
    private  static final Logger log = LoggerFactory.getLogger(CourseJdbcDao.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Course> rowMapper = (rs, rowNum) -> {
        Course course = new Course();
        course.setCorseId(rs.getInt("course_id"));
        course.setTitle(rs.getString("title"));
        course.setDescription(rs.getString("description"));
        course.setLink(rs.getString("link"));
        return course;
    };


    public CourseJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List list() {
        //course_id
        String sql = "select course_id,  title, description, link from course";
        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public void create(Course course) {
        String sql = "insert into course(title, description, link) values (?,?,?)";

          int insert =  jdbcTemplate.update(sql,course.getTitle(),course.getDescription(),course.getLink());
          if(insert == 1){
              log.info("Tao khoa hoc thanh cong: " + course.getTitle());
          }
    }


    @Override
    public Optional get(int id) {
        String sql = "select course_id,  title, description, link from course where course_id = ?";
        Course course = null;
        try {
            course = jdbcTemplate.queryForObject(sql, new Object[]{id},rowMapper);
        }catch (DataAccessException ex){
            log.info("Khoa hoc khong ton tai "+ id);
        }
        return Optional.ofNullable(course);
    }

    @Override
    public void update(Course course, int id) {
        String sql = "update course set title = ? , description = ?, link = ? where course_id = ? ";
        int update = jdbcTemplate.update(sql, course.getTitle(), course.getDescription(), course.getLink(),id);
        if(update == 1){
            log.info("Khoa hoc cap nhat :" + course.getTitle());
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from course where course_id = ?";
        int delete = jdbcTemplate.update(sql,id);
        if(delete == 1) {
            log.info("Course Deleted: " + id);
        }
    }
}
