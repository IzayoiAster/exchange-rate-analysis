package com.aster.data.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName per1m
 */
@TableName(value ="per1m")
@Data
public class Per1m implements Serializable {
    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String endTime;

    /**
     * 
     */
    private Double startRate;

    /**
     * 
     */
    private Double endRate;

    /**
     * 
     */
    private Double maxRate;

    /**
     * 
     */
    private Double minRate;

    /**
     * 
     */
    private Double aveRate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Per1m other = (Per1m) that;
        return (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getStartRate() == null ? other.getStartRate() == null : this.getStartRate().equals(other.getStartRate()))
            && (this.getEndRate() == null ? other.getEndRate() == null : this.getEndRate().equals(other.getEndRate()))
            && (this.getMaxRate() == null ? other.getMaxRate() == null : this.getMaxRate().equals(other.getMaxRate()))
            && (this.getMinRate() == null ? other.getMinRate() == null : this.getMinRate().equals(other.getMinRate()))
            && (this.getAveRate() == null ? other.getAveRate() == null : this.getAveRate().equals(other.getAveRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getStartRate() == null) ? 0 : getStartRate().hashCode());
        result = prime * result + ((getEndRate() == null) ? 0 : getEndRate().hashCode());
        result = prime * result + ((getMaxRate() == null) ? 0 : getMaxRate().hashCode());
        result = prime * result + ((getMinRate() == null) ? 0 : getMinRate().hashCode());
        result = prime * result + ((getAveRate() == null) ? 0 : getAveRate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", startRate=").append(startRate);
        sb.append(", endRate=").append(endRate);
        sb.append(", maxRate=").append(maxRate);
        sb.append(", minRate=").append(minRate);
        sb.append(", aveRate=").append(aveRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}