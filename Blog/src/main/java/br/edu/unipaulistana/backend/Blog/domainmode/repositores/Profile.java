package br.edu.unipaulistana.backend.Blog.domainmode.repositores;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Profile {
    private @Getter @Setter Long id;
    private @Getter @Setter String bio;
    private @Getter @Setter String pictureUrl;
    private @Getter @Setter User user;
}
