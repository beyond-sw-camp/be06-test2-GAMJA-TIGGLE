package org.example.springdb.tiggle.user.model.response;

import jakarta.servlet.http.HttpSession;

public class SignInResponse {
   String sessionId;
   String userid;

   public SignInResponse(String sessionId, String userid) {
      this.sessionId = sessionId;
      this.userid = userid;
   }

   public String getSessionId() {
      return sessionId;
   }

   public void setSessionId(String sessionId) {
      this.sessionId = sessionId;
   }

   public String getUserid() {
      return userid;
   }

   public void setUserid(String userid) {
      this.userid = userid;
   }
}
