package pl.mm.notesKeeper.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Request<T> {

    private T request;

}
