package com.behsa.qpigw;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_request_test")
//@NamedQuery(name="request.findAll", query="SELECT c FROM request c")
public class ResponseMessage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_request_test")
    @SequenceGenerator(name = "seq_request_test", sequenceName = "SEQ_REQUEST_TEST")
    @Column(name = "PK_REQUEST_TEST")
    Long Id;
    @Column(name = "source_address")


    String sourceAddress;
    @Column(name = "destination_address")


    String destinationAddress;
    @Column(name = "http_head")


    String httpHead;
    @Column(name = "http_body")


    String httpBody;

    public ResponseMessage() {
    }

    public ResponseMessage(String sourceAddress, String destinationAddress, String httpHead, String httpBody) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.httpHead = httpHead;
        this.httpBody = httpBody;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getHttpHead() {
        return httpHead;
    }

    public void setHttpHead(String httpHead) {
        this.httpHead = httpHead;
    }

    public String getHttpBody() {
        return httpBody;
    }

    public void setHttpBody(String httpBody) {
        this.httpBody = httpBody;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "Id=" + Id +
                ", sourceAddress='" + sourceAddress + '\'' +
                ", destination_address='" + destinationAddress + '\'' +
                ", http_head='" + httpHead + '\'' +
                ", http_body='" + httpBody + '\'' +
                '}';
    }
}
