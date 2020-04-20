/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Convertes;

import com.project.project.Enums.Tipo;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 *
 * @author felly
 */
@Component
public class TipoConvertes implements Converter<String, Tipo> {

    @Override
    public Tipo convert(String s) {
        try {
            return Tipo.valueOf(s.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
