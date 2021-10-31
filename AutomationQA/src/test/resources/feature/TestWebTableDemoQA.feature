# new feature
# Tags: optional

Feature: Pruebas demoQA
  Como Usuario
  Quiero validar el Web Table  de la aplicacion demo qa
  Para verificar la funcionalidad


  @WebTableAdd
  Scenario Outline:  Registar Web Table
    Given que el usuario se encuentra en el DemoQA webta Table
    When se clickea en el boton add
    Then se ingresa lo datos "<sName>"  "<sLastName>" "<sEmail>" "<sAge>" "<sSalary>" "<sDepartment>"
    And  se clickea en el boton submit
    Examples:
      | sName  | sLastName | sEmail           | sAge | sSalary | sDepartment |
      | breysi | jara      | breysi@gmail.com | 1    | 3000    | Lima        |

  @WebTableEdit
  Scenario Outline:  Editar Web Table
    Given que el usuario se encuentra en el DemoQA webta Table
    When se busca el nombre "<sNameBuscar>"
    And se clickea en el span edit
    Then se ingresa lo datos para editar "<sName>"  "<sLastName>" "<sEmail>" "<sAge>" "<sSalary>" "<sDepartment>"
    And  se clickea en el boton enviar
    Examples:
      | sNameBuscar | sName | sLastName | sEmail        | sAge | sSalary | sDepartment |
      | Alden  | SARI  | jara      | Ana@gmail.com | 1    | 3000    | Lima        |

  @WebTableDelete
  Scenario Outline:  Delete Web Table
    Given que el usuario se encuentra en el DemoQA webta Table
    When se busca el nombre "<sNameBuscar>"
    Then se clickea en el boton delete
    Examples:
      | sNameBuscar |
      | Alden       |


