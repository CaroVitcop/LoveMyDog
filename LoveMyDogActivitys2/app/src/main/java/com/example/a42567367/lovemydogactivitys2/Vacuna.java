package com.example.a42567367.lovemydogactivitys2;

import static android.R.attr.id;

/**
 * Created by Tomas Winicki on 22/9/2017.
 */

public class Vacuna {

        String Usuario;
        String V1;
        String V2;
        String V3;
        String V4;
        String V5;

        Vacuna(String nombre,String Vac1,String Vac2,String Vac3,String Vac4,String Vac5) {
                this.Usuario = nombre;
                this.V1 = Vac1;
                this.V2= Vac2;
                this.V3= Vac3;
                this.V4= Vac4;
                this.V5= Vac5;
        }

        public String getUsuario() {
            return Usuario;
        }

        /*public String getV1(){return V1;}
        public String getV2(){return V2;}
        public String getV3(){return V3;}
        public String getV4(){return V4;}
        public String getV5(){return V5;}
        */

    }


