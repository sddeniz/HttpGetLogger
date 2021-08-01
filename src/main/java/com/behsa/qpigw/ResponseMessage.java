package com.behsa.qpigw;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_LOG_SERVICE")
@Document(indexName = "response_message")
public class ResponseMessage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_request_test")
    @SequenceGenerator(name = "seq_request_test", sequenceName = "SEQ_REQUEST_TEST")
    @Column(name = "PK_LOG_SERVICE")
    Long id;

    @Column(name = "INS_LEVEL")
    @Field(type = FieldType.Text, name = "level")
    String INS_level;

    @Column(name = "TIME")
    @Field(type = FieldType.Text, name = "time")
    String time;

    @Column(name = "TRACE_ID")
    @Field(type = FieldType.Text, name = "traceId")
    String traceId;

    @Column(name = "SPAN_ID")
    @Field(type = FieldType.Text, name = "spanId")
    String spanId;

    @Column(name = "THREAD")
    @Field(type = FieldType.Text, name = "thread")
    String thread;

    @Column(name = "CLASSS")
    @Field(type = FieldType.Text, name = "classs")
    String classs;

    @Column(name = "MESSAGE")
    @Field(type = FieldType.Text, name = "message")
    String message;


    public ResponseMessage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getINS_level() {
        return INS_level;
    }

    public void setINS_level(String INS_level) {
        this.INS_level = INS_level;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "id=" + id +
                ", INS_level='" + INS_level + '\'' +
                ", time='" + time + '\'' +
                ", traceId='" + traceId + '\'' +
                ", spanId='" + spanId + '\'' +
                ", thread='" + thread + '\'' +
                ", classs='" + classs + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
