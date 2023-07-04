package com.cg.sales.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    @NotNull(message = "Channel Id may not be null")
    private int channelId;

    @Column(name="channel_desc",columnDefinition = "varchar(20)")
    @NotNull(message = "Channel Description may not be null")
    private String channelDesc;

    @Column(name="channel_class",columnDefinition = "varchar(20)")
    @NotNull(message = "Channel Class may not be null")
    private String channelClass;

    @Column(name="channel_class_id")
    @NotNull(message = "Channel Class Id may not be null")
    private int channelClassId;

    @Column(name="channel_total",columnDefinition = "varchar(13)")
    @NotEmpty(message = "Channel Total may not be null")
    private String channelTotal;

    @Column(name="channel_total_id")
    @NotNull(message = "Channel Total Id may not be null")
    private int channelTotalId;
    
    @ManyToMany
	@JoinTable(name="costs",
			joinColumns = {@JoinColumn(name = "channelId")},
            inverseJoinColumns = {@JoinColumn(name = "prodId")})
	private List<Product> products;
	
	@ManyToMany
	@JoinTable(name="costs",
			joinColumns = {@JoinColumn(name = "channelId")},
            inverseJoinColumns = {@JoinColumn(name = "timeId")})
	private List<Time> time;
	
	@ManyToMany
	@JoinTable(name="costs",
			joinColumns = {@JoinColumn(name = "channelId")},
            inverseJoinColumns = {@JoinColumn(name = "promoId")})
	private List<Promotion> promotions;
    

}