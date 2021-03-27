
package pruebas_so;

/**
 * Luis Herrera 27.877.087
 */

import java.io.File;
import java.util.Map;
import javazoom.jlgui.basicplayer.*;


public class Reproductor implements BasicPlayerListener{

static BasicPlayer player = new BasicPlayer(); //Reproductor de musica
BasicController control = (BasicController) player; //Controlador del reproductor

int tamañobytes; //tamaño de la cancion
int progressNow; //progreso de la cancion
    

public void Play() throws Exception {
  control.play(); //play al reproductor
}

public void AbrirFichero(String ruta) throws Exception {
    player.addBasicPlayerListener(this); //agregar controlador al reproductor
    control.open(new File(ruta)); //abir archivo
}

public void Pausa() throws Exception {
  control.pause(); //pausar
}

public void Continuar() throws Exception {
  control.resume(); //reanudar reproduccion
}

public void Stop() throws Exception {
  control.stop(); //detener reproduccion
}

public void mover(int pos) throws Exception {
  control.seek(pos); //adelantar cancion
}

public void volumen(double vol) throws Exception {
  control.setGain(vol); //subir o bajar volumen
}

public int estado(){
    return player.getStatus(); //estado del reproductor
}

    public void opened(Object o, Map map) { //actualizar el tamaño de la cancion
        if(map.containsKey("audio.length.bytes")){
             tamañobytes = (int)Double.parseDouble(map.get("audio.length.bytes").toString()); 
        }
          
    }

    public void progress(int bytes, long microseg, byte[] pcmdata, Map map) {
        float progressUpdate =(float)(bytes*1.0f/tamañobytes*1.0f);
        progressNow=(int)(tamañobytes*progressUpdate); //actualizar el progreso de la cancion
        
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {

    }

    @Override
    public void setController(BasicController bc) {
        bc = (BasicController) player;
    }
}
        
      
    


