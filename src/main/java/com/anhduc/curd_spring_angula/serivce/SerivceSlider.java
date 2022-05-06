package com.anhduc.curd_spring_angula.serivce;

import com.anhduc.curd_spring_angula.model.Slider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SerivceSlider {

    //cho phép chúng ta tạo và nắm bắt các thông báo và file nhật ký thông qua trình ghi nhật ký
    private  static final Logger log = LoggerFactory.getLogger(SerivceCource.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Slider> rowMapper = (rs, rowNum) -> {
        Slider slider = new Slider();
        slider.setId(rs.getInt("id"));
        slider.setImage(rs.getString("image"));
        slider.setThumbImage(rs.getString("thumbImage"));
        slider.setTitle(rs.getString("title"));

        return slider;
    };

    public SerivceSlider(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Slider> getSlider() {
        String sql = "select id, image,thumbImage, title from slider";
        return jdbcTemplate.query(sql,rowMapper);
    }

}
