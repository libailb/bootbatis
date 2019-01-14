package libai.sm.bootbatis.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Proxy {
    @NotBlank(message = "BUKEWEIKONG")
    @Pattern(regexp = "^(1|2|3|4|5)$", message = "格式不正确")
    private String level;
    @NotBlank
    private String objectId;
    @DateTimeFormat
    private String startDate;
    private String endDate;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "level='" + level + '\'' +
                ", objectId='" + objectId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
