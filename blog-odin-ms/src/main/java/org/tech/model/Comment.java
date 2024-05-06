package org.tech.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Comment {
  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  private String detail;

  public Comment(String detail) {
    this.detail = detail;
  }
}
