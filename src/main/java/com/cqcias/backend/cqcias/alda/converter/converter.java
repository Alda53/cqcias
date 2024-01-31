// package com.cqcias.backend.cqcias.alda.converter;

// import jakarta.persistence.AttributeConverter;
// import java.sql.Timestamp;
// import java.time.ZoneId;
// import java.time.ZonedDateTime;

// public class converter implements AttributeConverter<ZonedDateTime, Timestamp> {
//     @Override
//     public Timestamp convertToDatabaseColumn(ZonedDateTime attribute) {
//         return (attribute == null) ? null : Timestamp.valueOf(attribute.toLocalDateTime());
//     }

//     @Override
//     public ZonedDateTime convertToEntityAttribute(Timestamp dbData) {
//         return (dbData == null) ? null : dbData.toLocalDateTime().atZone(ZoneId.systemDefault());
//     }
// }
