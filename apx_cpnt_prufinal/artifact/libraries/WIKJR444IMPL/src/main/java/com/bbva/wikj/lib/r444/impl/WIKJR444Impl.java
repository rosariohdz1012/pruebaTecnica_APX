package com.bbva.wikj.lib.r444.impl;

import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR444Impl extends WIKJR444Abstract {

    private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR444Impl.class);

    @Override
    public DtoOut execute(DtoIn dtoIn) {
        DtoOut dtoOut = new DtoOut();
        Map<String, Object> args = new HashMap<>();
        args.put("id", dtoIn.getId());
        args.put("nuip", dtoIn.getNuip());
        args.put("full_name", dtoIn.getFullname());
        args.put("phone", dtoIn.getPhone());
        args.put("address", dtoIn.getAddress());


        Map<String, Object> result = null;
        try {
            result = this.wikjR449.executeSelect(String.valueOf(dtoIn.getNuip()));
            if (result == null) {      //si es 1 significa que si existe
                int resultRespon = this.wikjR449.executeInsert(args);
                if (resultRespon == 1) {      //si es 1 significa que si existe
                    result = this.wikjR449.executeSelect(String.valueOf(dtoIn.getNuip()));
                    map(dtoOut, result);
                }
            }
        } catch (Exception ex) {
            return null;
        }
            return dtoOut;
        }


        public DtoOut map (DtoOut dtoOut, Map < String, Object > response){

            dtoOut.setId((response.get("id").toString()));
            dtoOut.setNuip((response.get("nuip").toString()));
            dtoOut.setFullname(response.get("full_name").toString());
            dtoOut.setPhone(response.get("phone").toString());
            dtoOut.setAddress(response.get("address").toString());
        //modifique y puse el paseo en ambas
        return dtoOut;
    }//IZ DEVUELVE DER ENTRA
}