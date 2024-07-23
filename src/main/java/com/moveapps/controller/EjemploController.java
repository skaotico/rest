package com.moveapps.controller;

import com.moveapps.model.User;
import com.moveapps.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Saludo", description = "Endpoints para obtener saludos")
public class EjemploController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Obtiene un saludo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Saludo exitoso"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping("/saludar")
    public String getAllUsers() {
        return userService.saludar();
    }

    @Operation(summary = "Agrega un nuevo usuario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario agregado exitosamente"),
            @ApiResponse(responseCode = "400", description = "Solicitud incorrecta"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
