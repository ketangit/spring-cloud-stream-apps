package com.mycompany.samplesource.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Table
@Entity
public class DataEvents {
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "EventID")
    private long eventId;

    @Size(max = 255)
    @Basic
    @Column(name = "SourceKey")
    private String sourceKey;

    @Size(max = 255)
    @Basic
    @Column(name = "SourceGroup")
    private String sourceGroup;

    @Column(name = "ActionCode")
    private char actionCode;

    @Column(name = "StatusCode")
    private int statusCode;

    @Column(name = "EventTimeStamp")
    private LocalDateTime eventTimeStamp;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getSourceKey() {
        return sourceKey;
    }

    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    public String getSourceGroup() {
        return sourceGroup;
    }

    public void setSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    public char getActionCode() {
        return actionCode;
    }

    public void setActionCode(char actionCode) {
        this.actionCode = actionCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public LocalDateTime getEventTimeStamp() {
        return eventTimeStamp;
    }

    public void setEventTimeStamp(LocalDateTime eventTimeStamp) {
        this.eventTimeStamp = eventTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataEvents that = (DataEvents) o;

        if (eventId != that.eventId) return false;
        if (actionCode != that.actionCode) return false;
        if (statusCode != that.statusCode) return false;
        if (sourceKey != null ? !sourceKey.equals(that.sourceKey) : that.sourceKey != null) return false;
        if (sourceGroup != null ? !sourceGroup.equals(that.sourceGroup) : that.sourceGroup != null) return false;
        return eventTimeStamp != null ? eventTimeStamp.equals(that.eventTimeStamp) : that.eventTimeStamp == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (eventId ^ (eventId >>> 32));
        result = 31 * result + (sourceKey != null ? sourceKey.hashCode() : 0);
        result = 31 * result + (sourceGroup != null ? sourceGroup.hashCode() : 0);
        result = 31 * result + (int) actionCode;
        result = 31 * result + statusCode;
        result = 31 * result + (eventTimeStamp != null ? eventTimeStamp.hashCode() : 0);
        return result;
    }
}
