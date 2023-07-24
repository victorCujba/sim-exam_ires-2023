
Scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.


### PARTE 1
Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
* il numero di telefono
  * (OPZIONALE) il numero di telefono deve essere validato e formattato nel seguente pattern: "(+xx) xxx xxxx xxx"
* il credito disponibile in euro 
* la lista delle telefonate effettuate e per ciascuna telefonata deve essere rappresentata la durata in minuti
* un piano telefonico che definisce il costo di una chiamata per minuto

### PARTE 2
Una classe Smarthphone dovrà fornire le seguenti funzionalitá:
* gestire una singola SIM 
* un metodo per l'inizio di una telefonata con i dati forniti dall'utente. 
  * la telefonata viene creata se e solo se non ci sono altre telefonate attive.
* un metodo per chiudere la telefonata
* una funzione per il calcolo dei minuti totali di conversazione effettuate fino ad ora. 
* una funzione per il calcolo delle telefonate effettuate verso un certo numero 
* una procedura per la stampa dei dati contenuti nella SIM e l'elenco delle telefonate.

### PARTE 3 (OPZIONALE)
Definire una classe NetworkDistribution che permetta di fare le seguenti operazioni: 
* permetta di gestire le SIM di un operatore e il loro stato:
  * quando viene effettuata una chiamata telefonica la classe NetworkDistribution deve impostare le due SIM, chiamante e ricevente, nello stato OCCUPATO.
  * non posso chiamare una SIM occupata
  * alla fine di una chiamata le SIM devono essere reimpostate allo stato LIBERO.
* permetta di gestire i piani telefonici

### PARTE 4 (OPZIONALE)
Nella classe PhoneApp inizializzare NetworkOperation e fare in modo che vengano inseriti all'interno dei piani telefonici pronti all'uso.
Creare un metodo, da utilizzare nel metodo main, che permetta di eseguire l'applicazione e farla interagire con l'utente in modo che si possona fare almeno le seguenti operazioni:
* visualizzare i piani telefonici
* creare una nuova sim
* creare uno smartphone
* effettuare le chiamate con lo smarthphone
