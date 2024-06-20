//        pstmt = connection.prepareStatement("SELECT reservation.seatId, reservation.state " +
//                "FROM reservation " +
//                "JOIN seat ON reservation.seatId = seat.seatId " +
//                "WHERE reservation.programId = ? AND reservation.timesId = ? AND seat.section = ? AND reservation.state = 1;");
//
//        pstmt.setInt(1, dto.getProgramId());
//        pstmt.setInt(2, dto.getTimes());
//        pstmt.setString(3, dto.getSection());
//
//    교환 신청
//            pstmt = connection.prepareStatement("INSERT INTO web.member (id, pw, name) VALUES (?, ?, ?)");
//            pstmt.setInt(1, dto.getProgramId());
//            pstmt.setInt(2, dto.getTimes());
//            pstmt.setString(3, dto.getSection());
//            pstmt.setInt(3, dto.getSeatId());
