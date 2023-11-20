#Autor: Cristian Gualtero
 #language: es
@HistoriaDeUsuario
Característica:  Se intenta relizar una regresion de los servicios exitosos de registro, login y compra de un producto


  @casoregistro
  Esquema del escenario: Registro
    Dado que cristian gualtero ingresa a la app
    Cuando se registra llenando los campos de registro
      | user   | pass   |
      | <user> | <pass> |
    Entonces el registro es exitoso

    Ejemplos:
      | user         | pass         |
      | cristian1298111 | cristian1298 |
      | cristian1774111 | cristian1774 |


  @casoingreso
  Esquema del escenario: Verificar ingreso correcto
    Dado que cristian gualteros ingresa a la app
    Cuando Cristian ba al modulo de login Y digita sus credenciales
      | user   | pass   |
      | <user> | <pass> |
    Entonces verifica que pudo ingresar correctamente y ve su nombre en el homepage

    Ejemplos:
      | user  | pass     |
      | cristian555555555 | cristian1290 |



  @casocompra
  Esquema del escenario:  comprar productos
    Dado que un usuario  se encuentra en  el  home page
    Cuando Se dirige al modulo phones y escoge un producto para comprar
      | name   | country   | city    | card    | month   | year   |
      | <name> | <country>  | <city>  | <card>  | <month> | <year> |
    Entonces realiza la compra

    Ejemplos:
      | name  | country  | city   | card  | month | year |
      | Camilo | peru  | lima | 101514545| 08 | 1990 |




























