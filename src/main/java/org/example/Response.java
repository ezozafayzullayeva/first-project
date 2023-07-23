package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Current;
import org.example.Location;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    Location location;
    Current current;
}
