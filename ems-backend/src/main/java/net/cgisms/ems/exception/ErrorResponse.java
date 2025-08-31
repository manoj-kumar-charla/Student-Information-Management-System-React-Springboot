package net.cgisms.ems.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
  private String message;

  public ErrorResponse(String m) {
    this.message = m;
  }

}
