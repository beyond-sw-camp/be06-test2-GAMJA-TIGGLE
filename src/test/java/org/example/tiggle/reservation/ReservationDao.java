//            pstmt = connection.prepareStatement("select " +
//                    "seat.seatNumber, seat.section, times.date, times.round, program.programName, reservation.state" +
//                    " from seat\n" +
//                    "left join reservation on reservation.seatId = seat.seatId \n" +
//                    "left join program on program.programId = reservation.programId\n" +
//                    "left join times on reservation.timesId = times.timesId \n" +
//                    "where times.timesid = ? AND program.programId = ?");
//            pstmt.setInt(1, dto.getTimesId());
//            pstmt.setInt(2, dto.getProgramId());

//
//            while (rs.next()) {
//                EmptySeatResponse res
//                        = new EmptySeatResponse(rs.getInt("seatNumber")
//                        , rs.getString("section")
//                        , rs.getDate("date")
//                        , rs.getString("round")
//                        , rs.getString("programName")
//                        , rs.getBoolean("state"));
