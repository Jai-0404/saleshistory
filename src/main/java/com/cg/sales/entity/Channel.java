package com.cg.sales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="channels")
public class Channel {
    @Id
    private int channelId;

    @Column(name="channel_desc")
    private String channelDesc;

    @Column(name="channel_class")
    private String channelClass;

    @Column(name="channel_class_id")
    private int channelClassId;

    @Column(name="channel_total")
    private String channelTotal;

    @Column(name="channel_total_id")
    private int channelTotalId;

}