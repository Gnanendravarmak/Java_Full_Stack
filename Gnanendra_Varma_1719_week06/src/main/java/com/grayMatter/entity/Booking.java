package com.grayMatter.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @ManyToOne
    @JoinColumn(name = "wallet_Id")
    private Event bookEvent;

    private LocalDate bookingDate;
    private int bookedSeats;
    
    
    @Override
    public String toString() {
        return "Booking{bookId=" + bookId +
               ", bookingDate=" + bookingDate +
               ", bookedSeats=" + bookedSeats + '}';
    }

}

